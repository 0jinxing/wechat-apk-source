package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.TXLivePusher.ITXSnapshotListener;
import com.tencent.rtmp.TXLivePusher.OnBGMNotify;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.HashMap;
import org.json.JSONObject;

public class AppBrandLivePusherView extends TXCloudVideoView
{
  t hLh;
  public int hLi;
  private AppBrandLivePusherView.a hLj;
  l hLk;
  private ITXLivePushListener hLl;
  private AppBrandLivePusherView.c hLm;
  private AppBrandLivePusherView.b hLn;
  private Handler mHandler;

  public AppBrandLivePusherView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(96059);
    this.mHandler = new Handler(getContext().getMainLooper());
    this.hLi = 0;
    this.hLj = new AppBrandLivePusherView.a(this);
    init(paramContext);
    AppMethodBeat.o(96059);
  }

  public AppBrandLivePusherView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(96060);
    this.mHandler = new Handler(getContext().getMainLooper());
    this.hLi = 0;
    this.hLj = new AppBrandLivePusherView.a(this);
    init(paramContext);
    AppMethodBeat.o(96060);
  }

  private int getRotationAngle()
  {
    AppMethodBeat.i(96062);
    int i = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getRotation();
    AppMethodBeat.o(96062);
    return i;
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(96061);
    this.hLk = new l(paramContext);
    setBackgroundColor(-16777216);
    this.hLh = new t(getContext(), new AppBrandLivePusherView.1(this));
    this.hLh.enable();
    oo(getRotationAngle());
    AppMethodBeat.o(96061);
  }

  private boolean oo(int paramInt)
  {
    AppMethodBeat.i(96063);
    boolean bool;
    if (paramInt != this.hLi)
    {
      this.hLi = paramInt;
      ab.i("MicroMsg.AppBrandLivePusherView", "orientation changed senorAngle = ".concat(String.valueOf(paramInt)));
      this.hLk.op(paramInt);
      bool = true;
      AppMethodBeat.o(96063);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(96063);
    }
  }

  public final void a(int paramInt, String paramString, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(96067);
    ab.w("MicroMsg.AppBrandLivePusherView", "onError code:%d msg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (this.hLn != null)
      this.hLn.a(paramInt, paramString, paramHashMap);
    AppMethodBeat.o(96067);
  }

  public final boolean b(String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    AppMethodBeat.i(96065);
    paramString = this.hLk.c(paramString, paramJSONObject);
    ab.i("MicroMsg.AppBrandLivePusherView", "onOperate code:%d info:%s", new Object[] { Integer.valueOf(paramString.errorCode), paramString.hLF });
    if (paramString.errorCode == 0)
      AppMethodBeat.o(96065);
    while (true)
    {
      return bool;
      AppMethodBeat.o(96065);
      bool = false;
    }
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(96058);
    super.onConfigurationChanged(paramConfiguration);
    oo(getRotationAngle());
    AppMethodBeat.o(96058);
  }

  public final void onExit()
  {
    AppMethodBeat.i(96066);
    Object localObject = this.hLk;
    if (!((l)localObject).mInited);
    for (localObject = new i(-3, "uninited livePusher"); ; localObject = new i())
    {
      ab.i("MicroMsg.AppBrandLivePusherView", "onDestroy code:%d info:%s", new Object[] { Integer.valueOf(((i)localObject).errorCode), ((i)localObject).hLF });
      if (this.hLm != null)
        this.hLm.aDH();
      AppMethodBeat.o(96066);
      return;
      ((l)localObject).hMa.stopBGM();
      ((l)localObject).stopPreview();
      ((l)localObject).hMa.stopPusher();
      ((l)localObject).hMa.setPushListener(null);
      ((l)localObject).mInited = false;
    }
  }

  public void setBGMNotifyListener(TXLivePusher.OnBGMNotify paramOnBGMNotify)
  {
    this.hLk.hMh = paramOnBGMNotify;
  }

  public void setOnErrorListener(AppBrandLivePusherView.b paramb)
  {
    this.hLn = paramb;
  }

  public void setOnExitListener(AppBrandLivePusherView.c paramc)
  {
    this.hLm = paramc;
  }

  public void setOnPushEventListener(ITXLivePushListener paramITXLivePushListener)
  {
    this.hLl = paramITXLivePushListener;
    this.hLk.hMb = this.hLl;
  }

  public void setSnapshotListener(TXLivePusher.ITXSnapshotListener paramITXSnapshotListener)
  {
    this.hLk.hMg = paramITXSnapshotListener;
  }

  public final void y(Bundle paramBundle)
  {
    AppMethodBeat.i(96064);
    l locall = this.hLk;
    if (paramBundle == null)
      paramBundle = new i(-1, "invalid params");
    while (true)
    {
      ab.i("MicroMsg.AppBrandLivePusherView", "onUpdate code:%d info:%s", new Object[] { Integer.valueOf(paramBundle.errorCode), paramBundle.hLF });
      AppMethodBeat.o(96064);
      return;
      l.l("updateLivePusher", paramBundle);
      if (!locall.mInited)
      {
        paramBundle = new i(-3, "uninited livePusher");
      }
      else
      {
        locall.c(paramBundle, false);
        String str = paramBundle.getString("pushUrl", locall.hMc);
        if ((str != null) && (!str.isEmpty()) && (locall.hMc != null) && (!locall.hMc.equalsIgnoreCase(str)) && (locall.hMa.isPushing()))
        {
          ab.i("TXLivePusherJSAdapter", "updateLivePusher: stopPusher");
          locall.stopPreview();
          locall.hMa.stopPusher();
        }
        locall.hMc = str;
        locall.hMk = paramBundle.getBoolean("autopush", locall.hMk);
        if ((locall.hMk) && (locall.hMc != null) && (!locall.hMc.isEmpty()) && (!locall.hMa.isPushing()))
        {
          ab.i("TXLivePusherJSAdapter", "updateLivePusher: startPusher");
          locall.ea(locall.hMp);
          locall.hMa.startPusher(locall.hMc);
        }
        paramBundle = new i();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView
 * JD-Core Version:    0.6.2
 */