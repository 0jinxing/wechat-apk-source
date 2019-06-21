package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.b;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.an;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 364;
  public static final String NAME = "insertLivePlayer";

  public final View a(e parame, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96083);
    paramJSONObject = new AppBrandLivePlayerView(parame.getContext());
    parame = new CoverViewContainer(parame.getContext(), paramJSONObject);
    parame.setBackgroundColor(-16777216);
    AppMethodBeat.o(96083);
    return parame;
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(96081);
    j.aDJ();
    if (paramJSONObject.optInt("mode", 0) == 2)
      if (!(paramc.getContext() instanceof Activity))
      {
        ab.w("MicroMsg.JsApiInsertLivePlayer", "invokeAfterRequestPermission pageContext not activity");
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(96081);
      }
    while (true)
    {
      return;
      Activity localActivity = (Activity)paramc.getContext();
      try
      {
        int i = b.checkSelfPermission(localActivity, "android.permission.RECORD_AUDIO");
        if (i != 0)
          break label136;
        super.a(paramc, paramJSONObject, paramInt);
        AppMethodBeat.o(96081);
      }
      catch (Exception paramJSONObject)
      {
        ab.e("MicroMsg.JsApiInsertLivePlayer", "check mpermission exception:%s.", new Object[] { paramJSONObject });
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(96081);
      }
      continue;
      label136: paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramc.M(paramInt, j("fail:system permission denied", paramJSONObject));
      AppMethodBeat.o(96081);
      continue;
      super.a(paramc, paramJSONObject, paramInt);
      AppMethodBeat.o(96081);
    }
  }

  public final void a(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96084);
    ab.i("MicroMsg.JsApiInsertLivePlayer", "onInsertView livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiInsertLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96084);
      return;
    }
    TXLiveBase.setAppVersion(String.format("weixin_%s", new Object[] { parame.getAppId() }));
    AppBrandLivePlayerView localAppBrandLivePlayerView = (AppBrandLivePlayerView)((CoverViewContainer)paramView).ah(AppBrandLivePlayerView.class);
    Object localObject = new a.1(this, localAppBrandLivePlayerView);
    a.2 local2 = new a.2(this, localAppBrandLivePlayerView);
    a.3 local3 = new a.3(this, parame, localAppBrandLivePlayerView);
    a.4 local4 = new a.4(this, localAppBrandLivePlayerView, parame);
    parame.a(local2);
    parame.a(local3);
    parame.a(local4);
    localAppBrandLivePlayerView.setFullScreenDelegate(new a.5(this, parame, paramInt, (an)localObject));
    localAppBrandLivePlayerView.setExitListener(new a.6(this, parame, local3, local2));
    localAppBrandLivePlayerView.setNeedEvent(paramJSONObject.optBoolean("needEvent", false));
    localAppBrandLivePlayerView.setOnFullScreenChangeListener(new a.7(this, paramInt, parame));
    localObject = new Bundle();
    ((Bundle)localObject).putString("playUrl", paramJSONObject.optString("playUrl"));
    ((Bundle)localObject).putInt("mode", paramJSONObject.optInt("mode", 0));
    ((Bundle)localObject).putBoolean("autoplay", paramJSONObject.optBoolean("autoplay", false));
    ((Bundle)localObject).putBoolean("muted", paramJSONObject.optBoolean("muted", false));
    ((Bundle)localObject).putString("orientation", paramJSONObject.optString("orientation"));
    ((Bundle)localObject).putString("objectFit", paramJSONObject.optString("objectFit"));
    ((Bundle)localObject).putBoolean("backgroundMute", paramJSONObject.optBoolean("backgroundMute", true));
    ((Bundle)localObject).putFloat("minCache", BigDecimal.valueOf(paramJSONObject.optDouble("minCache", 1.0D)).floatValue());
    ((Bundle)localObject).putFloat("maxCache", BigDecimal.valueOf(paramJSONObject.optDouble("maxCache", 3.0D)).floatValue());
    ((Bundle)localObject).putBoolean("needEvent", paramJSONObject.optBoolean("needEvent", false));
    ((Bundle)localObject).putBoolean("debug", paramJSONObject.optBoolean("debug", false));
    ((Bundle)localObject).putString("soundMode", paramJSONObject.optString("soundMode", "speaker"));
    ((Bundle)localObject).putBoolean("autoPauseIfNavigate", paramJSONObject.optBoolean("autoPauseIfNavigate", true));
    ((Bundle)localObject).putBoolean("autoPauseIfOpenNative", paramJSONObject.optBoolean("autoPauseIfOpenNative", true));
    ab.i("MicroMsg.JsApiInsertLivePlayer", "convertParams playUrl:%s", new Object[] { paramJSONObject.optString("playUrl") });
    paramJSONObject = localAppBrandLivePlayerView.hLb;
    k.l("initLivePlayer", (Bundle)localObject);
    paramJSONObject.hLH = localAppBrandLivePlayerView;
    paramJSONObject.hLH.disableLog(false);
    paramJSONObject.hLJ.setPlayerView(localAppBrandLivePlayerView);
    paramJSONObject.hLM = ((Bundle)localObject).getString("playUrl", paramJSONObject.hLM);
    paramJSONObject.hLN = paramJSONObject.z((Bundle)localObject);
    paramJSONObject.A((Bundle)localObject);
    paramJSONObject.mAutoPlay = ((Bundle)localObject).getBoolean("autoplay", paramJSONObject.mAutoPlay);
    if ((paramJSONObject.mAutoPlay) && (paramJSONObject.hLM != null) && (!paramJSONObject.hLM.isEmpty()))
    {
      ab.i("TXLivePlayerJSAdapter", "initLivePlayer: startPlay");
      paramJSONObject.Be(paramJSONObject.hLM);
      paramJSONObject.hLJ.startPlay(paramJSONObject.hLM, paramJSONObject.hLN);
    }
    paramJSONObject.mInited = true;
    paramJSONObject = new i();
    ab.i("MicroMsg.AppBrandLivePlayerView", "onInsert code:%d info:%s", new Object[] { Integer.valueOf(paramJSONObject.errorCode), paramJSONObject.hLF });
    localAppBrandLivePlayerView.setPlayEventListener(new a.8(this, paramInt, parame));
    if (((Bundle)localObject).getInt("mode", 0) == 5);
    for (parame = paramView.getContext().getString(2131296537); ; parame = paramView.getContext().getString(2131296536))
    {
      localAppBrandLivePlayerView.setContentDescription(parame);
      AppMethodBeat.o(96084);
      break;
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96082);
    int i = paramJSONObject.getInt("livePlayerId");
    AppMethodBeat.o(96082);
    return i;
  }

  static final class a extends ah
  {
    private static final int CTRL_INDEX = 371;
    private static final String NAME = "onLivePlayerFullScreenChange";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a
 * JD-Core Version:    0.6.2
 */