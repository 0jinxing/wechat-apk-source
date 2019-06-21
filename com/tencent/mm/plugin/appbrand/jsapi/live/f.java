package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class f extends b
{
  private static final int CTRL_INDEX = 362;
  public static final String NAME = "removeLivePusher";

  public final boolean b(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96119);
    super.b(parame, paramInt, paramView, paramJSONObject);
    ab.i("MicroMsg.JsApiRemoveLivePusher", "onRemoveView livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiRemoveLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96119);
      bool = false;
    }
    while (true)
    {
      return bool;
      parame = (View)((CoverViewContainer)paramView).ah(View.class);
      if (!(parame instanceof AppBrandLivePusherView))
      {
        ab.e("MicroMsg.JsApiRemoveLivePusher", "targetView not AppBrandLivePusherView");
        AppMethodBeat.o(96119);
        bool = false;
      }
      else
      {
        ((AppBrandLivePusherView)parame).onExit();
        AppMethodBeat.o(96119);
        bool = true;
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96118);
    int i = paramJSONObject.optInt("livePusherId");
    AppMethodBeat.o(96118);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.f
 * JD-Core Version:    0.6.2
 */