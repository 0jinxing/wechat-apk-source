package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class m extends b
{
  private static final int CTRL_INDEX = 330;
  public static final String NAME = "removeCamera";

  public final boolean b(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126254);
    super.b(parame, paramInt, paramView, paramJSONObject);
    ab.i("MicroMsg.JsApiRemoveCamera", "onRemoveView cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiRemoveCamera", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126254);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramView = (View)((CoverViewContainer)paramView).ah(View.class);
      if ((paramView == null) || (!(paramView instanceof e)))
      {
        ab.w("MicroMsg.JsApiRemoveCamera", "the camera view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(126254);
        bool = false;
      }
      else
      {
        paramView = (e)paramView;
        parame.b(paramView);
        parame.b(paramView);
        parame.b(paramView);
        paramView.release();
        AppMethodBeat.o(126254);
        bool = true;
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126253);
    int i = paramJSONObject.optInt("cameraId", 0);
    AppMethodBeat.o(126253);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.m
 * JD-Core Version:    0.6.2
 */