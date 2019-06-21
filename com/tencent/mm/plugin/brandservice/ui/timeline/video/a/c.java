package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.e;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.af.r;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/BizVideoUtil;", "", "()V", "REQUEST_CODE_APP_MSG", "", "REQUEST_SHARE_TO_TIME_LINE", "TAG", "", "maxVideoPlaySaveTime", "playTimeHashMap", "Ljava/util/HashMap;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/VideoPlayTime;", "Lkotlin/collections/HashMap;", "convertMsgInfo", "Lcom/tencent/mm/message/MPMsgInfo;", "intent", "Landroid/content/Intent;", "mpMsgInfo", "msgInfo", "Lcom/tencent/mm/storage/MsgInfo;", "convertOtherMsgInfo", "msg", "getBizReaderItem", "Lcom/tencent/mm/message/BizReaderItem;", "getBizReaderItemFromAppMsg", "getLastPlayTime", "", "key", "getMPMsgInfo", "getNumStr", "context", "Landroid/content/Context;", "num", "goToWebViewUI", "", "url", "onVideoMsgClick", "msgId", "", "msgSvrId", "msgIndex", "view", "Landroid/view/View;", "bundle", "Landroid/os/Bundle;", "left", "top", "width", "height", "setLastPlayTime", "time", "plugin-brandservice_release"})
public final class c
{
  private static final String TAG = "MicroMsg.BizVideoUtil";
  private static final HashMap<String, h> jYu;
  public static final c jYv;

  static
  {
    AppMethodBeat.i(15324);
    jYv = new c();
    TAG = "MicroMsg.BizVideoUtil";
    jYu = new HashMap();
    AppMethodBeat.o(15324);
  }

  public static final String G(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(15320);
    a.f.b.j.p(paramContext, "context");
    if (paramInt < 10000)
    {
      paramContext = String.valueOf(paramInt);
      AppMethodBeat.o(15320);
    }
    while (true)
    {
      label30: return paramContext;
      String str = aa.dor();
      if (str == null);
      while (true)
        label40: if (paramInt >= 100000)
        {
          paramContext = "100k+";
          AppMethodBeat.o(15320);
          break;
          switch (str.hashCode())
          {
          default:
            break;
          case 115861276:
            if (!str.equals("zh_CN"));
            break;
          case 115861812:
          case 115861428:
            while (true)
            {
              paramContext = paramContext.getString(2131305919);
              if (paramInt < 100000)
                break label176;
              paramContext = "10" + paramContext + '+';
              AppMethodBeat.o(15320);
              break;
              if (!str.equals("zh_TW"))
                break label40;
              continue;
              if (!str.equals("zh_HK"))
                break label40;
            }
            label176: paramContext = paramInt / 10000 + '.' + paramInt % 10000 / 1000 + paramContext;
            AppMethodBeat.o(15320);
            break label30;
          }
        }
      paramContext = paramInt / 1000 + 'k';
      AppMethodBeat.o(15320);
    }
  }

  public static final double Gg(String paramString)
  {
    AppMethodBeat.i(15322);
    a.f.b.j.p(paramString, "key");
    paramString = (h)jYu.get(paramString);
    double d;
    if (paramString == null)
    {
      AppMethodBeat.o(15322);
      d = 0.0D;
    }
    while (true)
    {
      return d;
      if (System.currentTimeMillis() - paramString.jYX > 180000L)
      {
        AppMethodBeat.o(15322);
        d = 0.0D;
      }
      else
      {
        d = paramString.jYY;
        AppMethodBeat.o(15322);
      }
    }
  }

  public static final r R(Intent paramIntent)
  {
    AppMethodBeat.i(15319);
    a.f.b.j.p(paramIntent, "intent");
    r localr = new r();
    localr.fjS = paramIntent.getStringExtra("KPublisherId");
    localr.cwT = paramIntent.getStringExtra("sns_local_id");
    localr.cvx = paramIntent.getLongExtra("biz_video_msg_id", -1L);
    Object localObject1;
    bi localbi;
    Object localObject2;
    if (localr.cvx > -1L)
    {
      localObject1 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject1, "MMKernel.service<IMessen…engerStorage::class.java)");
      localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject1).bOr().jf(localr.cvx);
      a.f.b.j.o(localbi, "msgInfo");
      if ((localbi.drC()) || (localbi.bAA()))
      {
        a.f.b.j.p(paramIntent, "intent");
        a.f.b.j.p(localr, "mpMsgInfo");
        a.f.b.j.p(localbi, "msgInfo");
        localr.cKK = paramIntent.getLongExtra("biz_video_msg_svr_index", 0L);
        localr.fjQ = paramIntent.getIntExtra("biz_video_msg_index", 0);
        localr.userName = localbi.HE();
        a.f.b.j.p(localbi, "msgInfo");
        a.f.b.j.p(localr, "mpMsgInfo");
        if ((!localbi.drC()) && (localbi.bAA()))
        {
          a.f.b.j.p(localbi, "msgInfo");
          a.f.b.j.p(localr, "mpMsgInfo");
          localObject2 = j.b.me(localbi.getContent());
          if (localObject2 == null)
          {
            ab.w(TAG, "parse content fail");
            localObject1 = null;
            localr.fjT = ((p)localObject1);
            localr.type = localbi.getType();
          }
        }
      }
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        a.f.b.j.p(paramIntent, "intent");
        a.f.b.j.p(localr, "msg");
        localr.cwG = paramIntent.getStringExtra("srcUsername");
        localr.fjR = paramIntent.getStringExtra("srcDisplayname");
        localr.fjT.url = paramIntent.getStringExtra("rawUrl");
        localr.fjT.title = paramIntent.getStringExtra("biz_video_title");
        localr.fjT.fjz = paramIntent.getStringExtra("biz_video_desc");
        localr.fjT.fjx = paramIntent.getStringExtra("biz_video_icon_url");
        localr.fjT.type = paramIntent.getIntExtra("biz_video_item_show_type", -1);
        localr.fjT.time = paramIntent.getLongExtra("biz_video_pub_time", 0L);
        localr.fjT.fjB = paramIntent.getIntExtra("biz_video_duration", 0);
        localr.fjT.videoWidth = paramIntent.getIntExtra("biz_video_width", 0);
        localr.fjT.videoHeight = paramIntent.getIntExtra("biz_video_height", 0);
        localr.fjT.fgd = paramIntent.getStringExtra("biz_video_vid");
        localr.fgc = paramIntent.getIntExtra("biz_video_func_flag", 0);
      }
      AppMethodBeat.o(15319);
      return localr;
      localObject1 = new p();
      localr.cwG = ((j.b)localObject2).cMg;
      localr.fjR = ((j.b)localObject2).cMh;
      ((p)localObject1).url = ((j.b)localObject2).url;
      ((p)localObject1).title = ((j.b)localObject2).title;
      ((p)localObject1).fjz = ((j.b)localObject2).description;
      ((p)localObject1).fjx = ((j.b)localObject2).thumburl;
      localObject2 = (e)((j.b)localObject2).X(e.class);
      if (localObject2 == null)
      {
        ab.w(TAG, "piece content fail");
        localObject1 = null;
        break;
      }
      ((p)localObject1).fgd = ((e)localObject2).fgd;
      ((p)localObject1).time = ((e)localObject2).fga;
      ((p)localObject1).type = ((e)localObject2).ffZ;
      ((p)localObject1).fjB = ((e)localObject2).duration;
      ((p)localObject1).videoWidth = ((e)localObject2).videoWidth;
      ((p)localObject1).videoHeight = ((e)localObject2).videoHeight;
      localr.fgc = ((e)localObject2).fgc;
      break;
      localObject1 = ((a)g.K(a.class)).b(localbi.HA(), localbi.getContent());
      if ((localObject1 == null) || (bo.ek((List)((o)localObject1).fjr)))
      {
        ab.w(TAG, "getBizReaderItem reader is null");
        localObject1 = null;
        break;
      }
      if (localr.fjQ >= ((o)localObject1).fjr.size())
      {
        localObject1 = (p)((o)localObject1).fjr.get(0);
        break;
      }
      localObject1 = (p)((o)localObject1).fjr.get(localr.fjQ);
      break;
    }
  }

  public static final void a(Context paramContext, long paramLong1, long paramLong2, int paramInt, View paramView, Bundle paramBundle)
  {
    AppMethodBeat.i(15318);
    a.f.b.j.p(paramContext, "context");
    a.f.b.j.p(paramView, "view");
    a.f.b.j.p(paramBundle, "bundle");
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = paramView.getWidth();
    int m = paramView.getHeight();
    paramView = new Intent(paramContext, BizVideoDetailUI.class);
    paramView.putExtra("img_gallery_width", k);
    paramView.putExtra("img_gallery_height", m);
    paramView.putExtra("img_gallery_left", i);
    paramView.putExtra("img_gallery_top", j);
    ab.d(TAG, "onVideoMsgClick left %d, top %d, w %d, h %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
    paramView.putExtra("biz_video_msg_id", paramLong1);
    paramView.putExtra("biz_video_msg_svr_index", paramLong2);
    paramView.putExtra("KPublisherId", "msg_".concat(String.valueOf(paramLong2)));
    paramView.putExtra("biz_video_msg_index", paramInt);
    paramView.putExtras(paramBundle);
    paramView.addFlags(268435456);
    paramContext.startActivity(paramView);
    AppMethodBeat.o(15318);
  }

  public static final void a(Context paramContext, r paramr, String paramString)
  {
    AppMethodBeat.i(15321);
    a.f.b.j.p(paramContext, "context");
    a.f.b.j.p(paramr, "msgInfo");
    a.f.b.j.p(paramString, "url");
    Intent localIntent = new Intent();
    localIntent.putExtra("KPublisherId", paramr.fjS);
    localIntent.putExtra("pre_username", paramr.HE());
    localIntent.putExtra("preUsername", paramr.HE());
    localIntent.putExtra("preChatName", paramr.HE());
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("geta8key_username", paramr.HE());
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(15321);
  }

  public static final void e(String paramString, double paramDouble)
  {
    AppMethodBeat.i(15323);
    a.f.b.j.p(paramString, "key");
    ((Map)jYu).put(paramString, new h(System.currentTimeMillis(), paramDouble));
    AppMethodBeat.o(15323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c
 * JD-Core Version:    0.6.2
 */