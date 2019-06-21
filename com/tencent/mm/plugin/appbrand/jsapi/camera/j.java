package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 329;
  public static final String NAME = "insertCamera";
  static j.a hHa;

  public final View a(com.tencent.mm.plugin.appbrand.jsapi.e parame, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126243);
    Context localContext = parame.getContext();
    e locale = hHa.cI(localContext);
    int i = paramJSONObject.optInt("cameraId");
    String str1 = paramJSONObject.optString("mode", "normal");
    String str2 = paramJSONObject.optString("devicePosition", "back");
    String str3 = paramJSONObject.optString("flash", "auto");
    String str4 = paramJSONObject.optString("size");
    int j = 720;
    int k = -1;
    switch (str4.hashCode())
    {
    default:
      switch (k)
      {
      default:
        k = j;
        label148: boolean bool = paramJSONObject.optBoolean("needOutput", false);
        locale.setAppId(parame.getAppId());
        locale.setPage(parame);
        locale.setCameraId(i);
        locale.setMode(str1);
        locale.ai(str2, true);
        locale.setFlash(str3);
        locale.setFrameLimitSize(k);
        locale.setNeedOutput(bool);
        parame = paramJSONObject.optJSONObject("position");
        k = com.tencent.mm.plugin.appbrand.r.g.a(parame, "width", 0);
        j = com.tencent.mm.plugin.appbrand.r.g.a(parame, "height", 0);
        if ((k != 0) && (j != 0))
          locale.da(k, j);
        parame = paramJSONObject.optJSONArray("scanArea");
        if ((parame != null) && (parame.length() == 4))
        {
          ab.i("MicroMsg.JsApiInsertCamera", "scanAreaArray:%s, scanAreaArray.length:%d", new Object[] { parame, Integer.valueOf(parame.length()) });
          locale.w(com.tencent.mm.plugin.appbrand.r.g.qb(parame.optInt(0)), com.tencent.mm.plugin.appbrand.r.g.qb(parame.optInt(1)), com.tencent.mm.plugin.appbrand.r.g.qb(parame.optInt(2)), com.tencent.mm.plugin.appbrand.r.g.qb(parame.optInt(3)));
          label363: locale.setScanFreq(paramJSONObject.optInt("scanFreq"));
          ab.d("MicroMsg.JsApiInsertCamera", "inflateView cameraId: %d,devicePosition: %s,flash: %s,width: %d,height: %d", new Object[] { Integer.valueOf(i), str2, str3, Integer.valueOf(k), Integer.valueOf(j) });
          paramJSONObject = locale.getView();
          if (!"normal".equals(str1))
            break label560;
        }
        break;
      case 0:
      case 1:
      case 2:
      }
      break;
    case 109548807:
    case -1078030475:
    case 102742843:
    }
    label560: for (parame = localContext.getString(2131296532); ; parame = localContext.getString(2131296533))
    {
      paramJSONObject.setContentDescription(parame);
      parame = new CoverViewContainer(localContext, (View)locale);
      AppMethodBeat.o(126243);
      return parame;
      if (!str4.equals("small"))
        break;
      k = 0;
      break;
      if (!str4.equals("medium"))
        break;
      k = 1;
      break;
      if (!str4.equals("large"))
        break;
      k = 2;
      break;
      k = 288;
      break label148;
      k = 480;
      break label148;
      k = 720;
      break label148;
      locale.w(0, 0, k, j);
      break label363;
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject, com.tencent.mm.plugin.appbrand.jsapi.base.g paramg)
  {
    AppMethodBeat.i(138256);
    ab.i("MicroMsg.JsApiInsertCamera", "onInsertView cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    paramg.AR(j("ok", null));
    paramView = (e)((CoverViewContainer)paramView).ah(View.class);
    if (paramView == null)
    {
      ab.w("MicroMsg.JsApiInsertCamera", "onInsertView(viewId : %d) failed, cameraView is null", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(138256);
    }
    while (true)
    {
      return;
      a(parame, paramView);
      paramJSONObject = a.a.aDb();
      int i = paramView.getCameraId();
      paramJSONObject.hGk.put(Integer.valueOf(i), paramView);
      parame.a(paramView);
      parame.a(paramView);
      parame.a(paramView);
      com.tencent.mm.plugin.appbrand.g.a(parame.getAppId(), new j.1(this, parame, paramView, paramInt));
      paramView.setOutPutCallBack(new j.2(this));
      AppMethodBeat.o(138256);
    }
  }

  final boolean a(c paramc, e parame)
  {
    AppMethodBeat.i(126246);
    n.b(String.valueOf(paramc.getAppId()), new j.3(this, paramc, parame));
    Activity localActivity = (Activity)paramc.getContext();
    boolean bool;
    if (localActivity == null)
    {
      AppMethodBeat.o(126246);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = com.tencent.luggage.g.g.a(localActivity, "android.permission.CAMERA", 16, "", "");
      a.a.aDb().hGi = bool;
      if (!bool)
      {
        AppMethodBeat.o(126246);
        bool = false;
      }
      else
      {
        bool = com.tencent.luggage.g.g.a(localActivity, "android.permission.RECORD_AUDIO", 18, "", "");
        a.a.aDb().hGj = bool;
        if (!bool)
        {
          AppMethodBeat.o(126246);
          bool = false;
        }
        else
        {
          n.Dr(paramc.getAppId());
          parame.initView();
          bool = true;
          AppMethodBeat.o(126246);
        }
      }
    }
  }

  public final boolean aCE()
  {
    return true;
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126244);
    int i = paramJSONObject.optInt("cameraId");
    AppMethodBeat.o(126244);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.j
 * JD-Core Version:    0.6.2
 */