package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.math.BigDecimal;
import org.json.JSONObject;

public final class b extends a
{
  private static final int CTRL_INDEX = 360;
  public static final String NAME = "insertLivePusher";
  private int hLw;

  private void a(Activity paramActivity, c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(96107);
    int i = this.hLw;
    this.hLw = (i + 1);
    if (i > 5)
    {
      ab.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, avoid dead loop");
      AppMethodBeat.o(96107);
    }
    while (true)
    {
      return;
      n.b(paramc.getAppId(), new b.3(this, paramActivity, paramc, paramJSONObject, paramInt));
      if (!com.tencent.luggage.g.g.a(paramActivity, "android.permission.CAMERA", 117, "", ""))
      {
        ab.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retCameraPermission");
        AppMethodBeat.o(96107);
      }
      else if (!com.tencent.luggage.g.g.a(paramActivity, "android.permission.RECORD_AUDIO", 118, "", ""))
      {
        ab.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retMicrophonePermission");
        AppMethodBeat.o(96107);
      }
      else
      {
        ab.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
        super.a(paramc, paramJSONObject, paramInt);
        AppMethodBeat.o(96107);
      }
    }
  }

  public final View a(e parame, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96104);
    paramJSONObject = new AppBrandLivePusherView(parame.getContext());
    parame = new CoverViewContainer(parame.getContext(), paramJSONObject);
    AppMethodBeat.o(96104);
    return parame;
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(96103);
    j.aDJ();
    if (!(paramc.getContext() instanceof Activity))
    {
      ab.w("MicroMsg.JsApiInsertLivePusher", "invokeAfterRequestPermission pageContext not activity");
      paramc.M(paramInt, j("fail", null));
      n.Dr(paramc.getAppId());
      AppMethodBeat.o(96103);
    }
    while (true)
    {
      return;
      this.hLw = 0;
      a((Activity)paramc.getContext(), paramc, paramJSONObject, paramInt);
      AppMethodBeat.o(96103);
    }
  }

  public final void a(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96106);
    ab.i("MicroMsg.JsApiInsertLivePusher", "onInsertView livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiInsertLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96106);
    }
    AppBrandLivePusherView localAppBrandLivePusherView;
    while (true)
    {
      return;
      TXLiveBase.setAppVersion(String.format("weixin_%s", new Object[] { parame.getAppId() }));
      localAppBrandLivePusherView = (AppBrandLivePusherView)((CoverViewContainer)paramView).ah(AppBrandLivePusherView.class);
      if (localAppBrandLivePusherView != null)
        break;
      ab.e("MicroMsg.JsApiInsertLivePusher", "pusherView null");
      AppMethodBeat.o(96106);
    }
    b.1 local1 = new b.1(this, localAppBrandLivePusherView);
    Object localObject1 = new b.4(this, localAppBrandLivePusherView);
    b.5 local5 = new b.5(this, localAppBrandLivePusherView, parame);
    Object localObject2 = new b.6(this, localAppBrandLivePusherView, parame, local5);
    parame.a(local1);
    parame.a((f.b)localObject1);
    parame.a((f.c)localObject2);
    localAppBrandLivePusherView.setOnExitListener(new b.7(this, parame, local1, (f.b)localObject1));
    com.tencent.mm.plugin.appbrand.g.a(parame.getAppId(), local5);
    localAppBrandLivePusherView.setOnPushEventListener(new b.8(this, paramInt, parame));
    localAppBrandLivePusherView.setBGMNotifyListener(new b.9(this, paramInt, parame));
    localAppBrandLivePusherView.setOnErrorListener(new b.10(this, paramInt, parame));
    localObject1 = new Bundle();
    ((Bundle)localObject1).putString("pushUrl", paramJSONObject.optString("pushUrl"));
    ((Bundle)localObject1).putInt("mode", paramJSONObject.optInt("mode", 0));
    ((Bundle)localObject1).putBoolean("autopush", paramJSONObject.optBoolean("autopush", false));
    ((Bundle)localObject1).putBoolean("muted", paramJSONObject.optBoolean("muted", false));
    ((Bundle)localObject1).putBoolean("enableCamera", paramJSONObject.optBoolean("enableCamera", true));
    ((Bundle)localObject1).putInt("focusMode", paramJSONObject.optInt("focusMode", 0));
    ((Bundle)localObject1).putString("orientation", paramJSONObject.optString("orientation"));
    ((Bundle)localObject1).putInt("beauty", paramJSONObject.optInt("beauty", 0));
    ((Bundle)localObject1).putInt("whiteness", paramJSONObject.optInt("whiteness", 0));
    ((Bundle)localObject1).putString("audioQuality", paramJSONObject.optString("audioQuality", "high"));
    ((Bundle)localObject1).putInt("aspect", paramJSONObject.optInt("aspect", 0));
    ((Bundle)localObject1).putInt("minBitrate", paramJSONObject.optInt("minBitrate", 0));
    ((Bundle)localObject1).putInt("maxBitrate", paramJSONObject.optInt("maxBitrate", 0));
    ((Bundle)localObject1).putBoolean("backgroundMute", paramJSONObject.optBoolean("backgroundMute", false));
    ((Bundle)localObject1).putBoolean("zoom", paramJSONObject.optBoolean("zoom", true));
    ((Bundle)localObject1).putBoolean("needEvent", paramJSONObject.optBoolean("needEvent", false));
    ((Bundle)localObject1).putBoolean("debug", paramJSONObject.optBoolean("debug", false));
    ((Bundle)localObject1).putBoolean("mirror", paramJSONObject.optBoolean("mirror", false));
    ((Bundle)localObject1).putFloat("watermarkLeft", BigDecimal.valueOf(paramJSONObject.optDouble("watermarkLeft", 0.0D)).floatValue());
    ((Bundle)localObject1).putFloat("watermarkTop", BigDecimal.valueOf(paramJSONObject.optDouble("watermarkTop", 0.0D)).floatValue());
    ((Bundle)localObject1).putFloat("watermarkWidth", BigDecimal.valueOf(paramJSONObject.optDouble("watermarkWidth", 0.1D)).floatValue());
    ((Bundle)localObject1).putString("devicePosition", paramJSONObject.optString("devicePosition", "front"));
    ((Bundle)localObject1).putBoolean("needBGMEvent", paramJSONObject.optBoolean("needBGMEvent", false));
    ab.i("MicroMsg.JsApiInsertLivePusher", "convertParams pushUrl:%s", new Object[] { paramJSONObject.optString("pushUrl") });
    localObject2 = localAppBrandLivePusherView.hLk;
    l.l("InitLivePusher", (Bundle)localObject1);
    ((l)localObject2).hLH = localAppBrandLivePusherView;
    ((l)localObject2).hLH.disableLog(false);
    ((l)localObject2).hMc = ((Bundle)localObject1).getString("pushUrl", "");
    ((l)localObject2).c((Bundle)localObject1, true);
    ((l)localObject2).hMk = ((Bundle)localObject1).getBoolean("autopush", ((l)localObject2).hMk);
    if ((((l)localObject2).hMk) && (((l)localObject2).hMc != null) && (!((l)localObject2).hMc.isEmpty()) && (!((l)localObject2).hMa.isPushing()))
    {
      ab.i("TXLivePusherJSAdapter", "initLivePusher: startPusher");
      ((l)localObject2).ea(((l)localObject2).hMp);
      ((l)localObject2).hMa.startPusher(((l)localObject2).hMc);
    }
    ((l)localObject2).mInited = true;
    localObject2 = new i();
    ab.i("MicroMsg.AppBrandLivePusherView", "onInsert code:%d info:%s", new Object[] { Integer.valueOf(((i)localObject2).errorCode), ((i)localObject2).hLF });
    localObject2 = paramJSONObject.optString("backgroundImage");
    localObject1 = paramJSONObject.optString("backgroundMD5");
    if (bo.isNullOrNil((String)localObject2))
    {
      ab.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, url is null");
      label926: localObject2 = paramJSONObject.optString("watermarkImage");
      paramJSONObject = paramJSONObject.optString("watermarkMD5");
      if (!bo.isNullOrNil((String)localObject2))
        break label1008;
      ab.i("MicroMsg.JsApiInsertLivePusher", "convertWatermarkImageToLocalPath, url is null");
    }
    while (true)
    {
      localAppBrandLivePusherView.setContentDescription(paramView.getContext().getString(2131296538));
      AppMethodBeat.o(96106);
      break;
      com.tencent.mm.plugin.appbrand.s.b.a(parame, (String)localObject2, (String)localObject1, new b.11(this, localAppBrandLivePusherView, (String)localObject2));
      break label926;
      label1008: com.tencent.mm.plugin.appbrand.s.b.a(parame, (String)localObject2, paramJSONObject, new b.2(this, localAppBrandLivePusherView));
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96105);
    int i = paramJSONObject.getInt("livePusherId");
    AppMethodBeat.o(96105);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b
 * JD-Core Version:    0.6.2
 */