package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n extends c
{
  private static final int CTRL_INDEX = 331;
  public static final String NAME = "updateCamera";

  public final boolean c(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126256);
    ab.i("MicroMsg.JsApiUpdateCamera", "onUpdateView : cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiUpdateCamera", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      bool1 = false;
      AppMethodBeat.o(126256);
    }
    while (true)
    {
      return bool1;
      paramView = (View)((CoverViewContainer)paramView).ah(View.class);
      if ((paramView != null) && ((paramView instanceof e)))
        break;
      ab.w("MicroMsg.JsApiUpdateCamera", "the camera view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      bool1 = false;
      AppMethodBeat.o(126256);
    }
    paramView = (e)paramView;
    int i = paramJSONObject.optInt("cameraId");
    String str1 = paramJSONObject.optString("devicePosition", "back");
    String str2 = paramJSONObject.optString("flash", "auto");
    boolean bool1 = paramJSONObject.optBoolean("needOutput", false);
    paramView.setAppId(parame.getAppId());
    paramView.ai(str1, false);
    paramView.setFlash(str2);
    paramView.setNeedOutput(bool1);
    parame = paramJSONObject.optJSONObject("position");
    int j = g.a(parame, "width", 0);
    paramInt = g.a(parame, "height", 0);
    ab.d("MicroMsg.JsApiUpdateCamera", "onUpdateView cameraId: %d, devicePosition: %s,flash: %s,width： %d,height： %d", new Object[] { Integer.valueOf(i), str1, str2, Integer.valueOf(j), Integer.valueOf(paramInt) });
    boolean bool2 = false;
    bool1 = bool2;
    if (j != 0)
    {
      bool1 = bool2;
      if (paramInt != 0)
        bool1 = paramView.da(j, paramInt);
    }
    parame = paramJSONObject.optString("mode");
    if (!bo.isNullOrNil(parame))
      paramView.setMode(parame);
    parame = paramJSONObject.optJSONArray("scanArea");
    if ((parame != null) && (parame.length() == 4))
    {
      ab.i("MicroMsg.JsApiUpdateCamera", "scanAreaArray:%s, scanAreaArray.length:%d", new Object[] { parame, Integer.valueOf(parame.length()) });
      paramView.w(g.qb(parame.optInt(0)), g.qb(parame.optInt(1)), g.qb(parame.optInt(2)), g.qb(parame.optInt(3)));
    }
    paramView.setScanFreq(paramJSONObject.optInt("scanFreq"));
    if (bool1)
    {
      paramView.release();
      paramView.initView();
    }
    while (true)
    {
      bool1 = true;
      AppMethodBeat.o(126256);
      break;
      paramView.aDf();
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126255);
    int i = paramJSONObject.optInt("cameraId");
    AppMethodBeat.o(126255);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.n
 * JD-Core Version:    0.6.2
 */