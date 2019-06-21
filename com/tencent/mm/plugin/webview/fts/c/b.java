package com.tencent.mm.plugin.webview.fts.c;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.ui.widget.MMWebView;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements e
{
  private Context context;
  com.tencent.mm.plugin.webview.fts.ui.b uhA;
  private bg<FtsWebVideoView> uhB;
  private b.b uhv;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.d uhz;

  public b(Context paramContext, MMWebView paramMMWebView, b.b paramb)
  {
    AppMethodBeat.i(5940);
    this.uhB = new bg(3);
    this.context = paramContext;
    this.uhv = paramb;
    this.uhA = new com.tencent.mm.plugin.webview.fts.ui.b(paramMMWebView, paramb);
    AppMethodBeat.o(5940);
  }

  public final void G(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(5941);
    ab.i("FtsVideoPlayerMgr", "insert player id %d,viewProps %s,videoProps %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    try
    {
      if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      {
        ab.e("FtsVideoPlayerMgr", "insert args invalid");
        AppMethodBeat.o(5941);
      }
      while (true)
      {
        return;
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString1);
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString2);
        paramString1 = (FtsWebVideoView)this.uhB.aA();
        if (paramString1 != null)
          break;
        paramString1 = new com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView;
        paramString1.<init>(this.context, ((JSONObject)localObject2).optBoolean("autoPlay"));
        paramString1.setIsShowBasicControls(true);
        paramString1.setVideoSizeByte(((JSONObject)localObject2).optInt("fileSize"));
        paramString1.setMute(((JSONObject)localObject2).optBoolean("isMute"));
        paramString1.setCover$16da05f7(((JSONObject)localObject2).optString("coverUrl"));
        paramString1.setVideoPlayerId(paramInt);
        paramString1.setAutoPlay(((JSONObject)localObject2).optBoolean("autoPlay"));
        paramString1.bL(c.aL((JSONObject)localObject2), ((JSONObject)localObject2).optInt("durationSec"));
        paramString2 = new com/tencent/mm/plugin/webview/fts/c/b$1;
        paramString2.<init>(this, paramString1);
        localObject2 = new com/tencent/mm/plugin/webview/fts/c/b$2;
        ((b.2)localObject2).<init>(this, paramInt, paramString2);
        paramString1.setFullScreenDelegate((FtsWebVideoView.a)localObject2);
        paramString2 = new com/tencent/mm/plugin/webview/fts/c/b$3;
        paramString2.<init>(this, paramString1);
        paramString1.setUiLifecycleListener(paramString2);
        this.uhv.a(paramString2);
        paramString2 = new com/tencent/mm/plugin/webview/fts/c/d;
        paramString2.<init>(paramString1, this.uhv, this.uhz);
        paramString1.setCallback(paramString2);
        paramString2 = this.uhA;
        localObject2 = c.a((JSONObject)localObject1, this.context);
        int i = c.t((JSONObject)localObject1);
        localObject1 = new com/tencent/mm/plugin/webview/fts/ui/b$1;
        ((com.tencent.mm.plugin.webview.fts.ui.b.1)localObject1).<init>(paramString2, Boolean.FALSE, paramString1, paramInt, (float[])localObject2, i);
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
          break label371;
        ((Boolean)((bj)localObject1).b(null)).booleanValue();
        AppMethodBeat.o(5941);
      }
    }
    catch (JSONException paramString1)
    {
      while (true)
      {
        Object localObject1;
        ab.e("FtsVideoPlayerMgr", "", new Object[] { paramString1 });
        AppMethodBeat.o(5941);
        continue;
        paramString1.stop();
        continue;
        label371: ((Boolean)((bj)localObject1).b(paramString2.mHandler)).booleanValue();
        AppMethodBeat.o(5941);
      }
    }
  }

  public final void H(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(5942);
    ab.i("FtsVideoPlayerMgr", "update player id %d,viewProps %s,videoProps %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    try
    {
      Object localObject;
      com.tencent.mm.plugin.webview.fts.ui.b localb;
      if (!TextUtils.isEmpty(paramString1))
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString1);
        localb = this.uhA;
        paramString1 = c.a((JSONObject)localObject, this.context);
        int i = c.t((JSONObject)localObject);
        localObject = new com/tencent/mm/plugin/webview/fts/ui/b$3;
        ((com.tencent.mm.plugin.webview.fts.ui.b.3)localObject).<init>(localb, Boolean.FALSE, paramInt, paramString1, i);
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
          break label174;
        ((Boolean)((bj)localObject).b(null)).booleanValue();
      }
      while (true)
      {
        if (TextUtils.isEmpty(paramString2))
          break label319;
        paramString1 = new org/json/JSONObject;
        paramString1.<init>(paramString2);
        paramString2 = (FtsWebVideoView)this.uhA.q(paramInt);
        if (paramString2 != null)
          break;
        ab.i("FtsVideoPlayerMgr", "can not find video View by id %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(5942);
        return;
        label174: ((Boolean)((bj)localObject).b(localb.mHandler)).booleanValue();
      }
    }
    catch (JSONException paramString1)
    {
      while (true)
      {
        ab.e("FtsVideoPlayerMgr", "", new Object[] { paramString1 });
        AppMethodBeat.o(5942);
        continue;
        if (paramString1.has("autoPlay"))
          paramString2.setAutoPlay(paramString1.optBoolean("autoPlay"));
        if (paramString1.has("coverUrl"))
          paramString2.setCover$16da05f7(paramString1.optString("coverUrl"));
        if (paramString1.has("durationSec"))
          paramString2.setDuration(paramString1.optInt("durationSec"));
        if (paramString1.has("playUrl"))
          paramString2.bL(c.aL(paramString1), paramString1.optInt("durationSec"));
        if (paramString1.has("isMute"))
          paramString2.setMute(paramString1.optBoolean("isMute"));
        label319: AppMethodBeat.o(5942);
      }
    }
  }

  public final void ID(int paramInt)
  {
    AppMethodBeat.i(5943);
    ab.i("FtsVideoPlayerMgr", "remove palyer id %d", new Object[] { Integer.valueOf(paramInt) });
    FtsWebVideoView localFtsWebVideoView = (FtsWebVideoView)this.uhA.q(paramInt);
    com.tencent.mm.plugin.webview.fts.ui.b localb;
    com.tencent.mm.plugin.webview.fts.ui.b.2 local2;
    if (localFtsWebVideoView != null)
    {
      localFtsWebVideoView.getUiLifecycleListener();
      localb = this.uhA;
      local2 = new com.tencent.mm.plugin.webview.fts.ui.b.2(localb, Boolean.FALSE, paramInt);
      if (Thread.currentThread() != Looper.getMainLooper().getThread())
        break label158;
      ((Boolean)local2.b(null)).booleanValue();
    }
    while (true)
    {
      if (localFtsWebVideoView != null)
      {
        localFtsWebVideoView.stop();
        localFtsWebVideoView.getCallback().clean();
        localFtsWebVideoView.setCallback(null);
        localFtsWebVideoView.setVisibility(0);
        localFtsWebVideoView.setAllowMobileNetPlay(false);
        this.uhB.release(localFtsWebVideoView);
      }
      AppMethodBeat.o(5943);
      return;
      ab.w("FtsVideoPlayerMgr", "can not find player by id %d", new Object[] { Integer.valueOf(paramInt) });
      break;
      label158: ((Boolean)local2.b(localb.mHandler)).booleanValue();
    }
  }

  public final void bC(int paramInt, String paramString)
  {
    AppMethodBeat.i(5944);
    ab.i("FtsVideoPlayerMgr", "op player id %d,type %s", new Object[] { Integer.valueOf(paramInt), paramString });
    FtsWebVideoView localFtsWebVideoView = (FtsWebVideoView)this.uhA.q(paramInt);
    if (localFtsWebVideoView != null)
    {
      paramInt = -1;
      switch (paramString.hashCode())
      {
      default:
        switch (paramInt)
        {
        default:
          ab.i("FtsVideoPlayerMgr", "unknown op type %s", new Object[] { paramString });
          AppMethodBeat.o(5944);
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        }
        break;
      case 3443508:
      case 106440182:
      case 3540994:
      case 1984790939:
      case 640038740:
      }
    }
    while (true)
    {
      return;
      if (!paramString.equals("play"))
        break;
      paramInt = 0;
      break;
      if (!paramString.equals("pause"))
        break;
      paramInt = 1;
      break;
      if (!paramString.equals("stop"))
        break;
      paramInt = 2;
      break;
      if (!paramString.equals("setMute"))
        break;
      paramInt = 3;
      break;
      if (!paramString.equals("setUnMute"))
        break;
      paramInt = 4;
      break;
      localFtsWebVideoView.cg(false);
      AppMethodBeat.o(5944);
      continue;
      localFtsWebVideoView.pause();
      AppMethodBeat.o(5944);
      continue;
      localFtsWebVideoView.stop();
      AppMethodBeat.o(5944);
      continue;
      localFtsWebVideoView.setMute(true);
      AppMethodBeat.o(5944);
      continue;
      localFtsWebVideoView.setMute(false);
      AppMethodBeat.o(5944);
      continue;
      ab.i("FtsVideoPlayerMgr", "can not find player by id %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(5944);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.c.b
 * JD-Core Version:    0.6.2
 */