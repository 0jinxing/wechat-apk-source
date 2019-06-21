package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 253;
  public static final String NAME = "insertImageView";

  public final View a(com.tencent.mm.plugin.appbrand.jsapi.e parame, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126295);
    Context localContext = parame.getContext();
    parame = null;
    if (com.tencent.luggage.a.e.B(com.tencent.mm.plugin.appbrand.widget.c.b.class) != null)
      parame = ((com.tencent.mm.plugin.appbrand.widget.c.b)com.tencent.luggage.a.e.B(com.tencent.mm.plugin.appbrand.widget.c.b.class)).cU(localContext);
    paramJSONObject = parame;
    if (parame == null)
    {
      ab.e("MicroMsg.JsApiInsertImageView", "view is null, may not support IGifCoverViewFactory.");
      paramJSONObject = new com.tencent.mm.plugin.appbrand.widget.c.e(localContext);
    }
    paramJSONObject.setScaleType(ImageView.ScaleType.FIT_XY);
    parame = new CoverViewContainer(localContext, paramJSONObject.getView());
    AppMethodBeat.o(126295);
    return parame;
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126297);
    ab.d("MicroMsg.JsApiInsertImageView", "onInsertView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    com.tencent.mm.plugin.appbrand.widget.c.a locala = (com.tencent.mm.plugin.appbrand.widget.c.a)((CoverViewContainer)paramView).ah(com.tencent.mm.plugin.appbrand.widget.c.a.class);
    if (locala == null)
    {
      ab.w("MicroMsg.JsApiInsertImageView", "onInsertView(viewId : %d) failed, targetView is null", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126297);
    }
    while (true)
    {
      return;
      boolean bool1 = paramJSONObject.optBoolean("clickable");
      boolean bool2 = paramJSONObject.optBoolean("gesture");
      boolean bool3 = paramJSONObject.optBoolean("transEvt");
      String str1 = paramJSONObject.optString("sendTo", "appservice");
      String str2 = paramJSONObject.optString("data", "");
      com.tencent.mm.plugin.appbrand.jsapi.s.e.b(paramView, paramJSONObject.optJSONObject("style"));
      com.tencent.mm.plugin.appbrand.jsapi.s.b.a(parame, locala, paramJSONObject);
      com.tencent.mm.plugin.appbrand.jsapi.s.a.a(locala.getView(), paramJSONObject);
      paramView = parame.aBf().J(paramInt, true);
      paramView.j("data", str2);
      paramView.j("sendTo", str1);
      paramView.j("transEvt", Boolean.valueOf(bool3));
      paramView.j("clickable", Boolean.valueOf(bool1));
      locala.getView().setOnClickListener(new c.1(this, paramView, parame));
      locala.getView().setClickable(bool1);
      ab.i("MicroMsg.JsApiInsertImageView", "clickable:%b, gesture:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) && (bool2))
        locala.getView().setOnTouchListener(new c.2(this, paramView, parame));
      AppMethodBeat.o(126297);
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126296);
    int i = paramJSONObject.getInt("viewId");
    AppMethodBeat.o(126296);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.c
 * JD-Core Version:    0.6.2
 */