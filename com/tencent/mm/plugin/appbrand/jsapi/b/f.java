package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.AppBrandDrawableView;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import org.json.JSONObject;

public final class f extends a
{
  public static final int CTRL_INDEX = 67;
  public static final String NAME = "insertCanvas";

  public final View a(com.tencent.mm.plugin.appbrand.jsapi.e parame, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103853);
    Context localContext = parame.getContext();
    paramJSONObject = new AppBrandDrawableView(localContext);
    paramJSONObject.getDrawContext().hcK = ((com.tencent.mm.plugin.appbrand.canvas.e)parame.B(com.tencent.mm.plugin.appbrand.canvas.e.class));
    paramJSONObject.getDrawContext().hcM = parame;
    paramJSONObject.setContentDescription(localContext.getString(2131296534));
    parame = new CoverViewContainer(localContext, paramJSONObject);
    AppMethodBeat.o(103853);
    return parame;
  }

  public final boolean aCF()
  {
    return true;
  }

  public final boolean aCG()
  {
    return true;
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103854);
    int i = paramJSONObject.getInt("canvasId");
    AppMethodBeat.o(103854);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.f
 * JD-Core Version:    0.6.2
 */