package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends c<com.tencent.mm.plugin.appbrand.jsapi.e>
{
  public static final int CTRL_INDEX = 69;
  public static final String NAME = "drawCanvas";

  public final boolean aCE()
  {
    return true;
  }

  public final boolean b(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject, final g paramg)
  {
    AppMethodBeat.i(103852);
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of CoverViewContainer.(%s)", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(103852);
    }
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      localObject = (View)((CoverViewContainer)paramView).ah(View.class);
      ab.d("MicroMsg.JsApiDrawCanvas", "drawCanvas(id : %s)", new Object[] { Integer.valueOf(paramInt) });
      if ((localObject instanceof a))
        break;
      ab.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of AppBrandDrawableView.(%s)", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(103852);
    }
    long l = System.currentTimeMillis();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("actions");
    bool = paramJSONObject.optBoolean("reserve");
    Object localObject = (a)localObject;
    if (bool)
      ((a)localObject).b(localJSONArray, new a.a()
      {
        public final void a(DrawCanvasArg paramAnonymousDrawCanvasArg)
        {
          AppMethodBeat.i(103849);
          paramg.AR(e.this.j("ok", null));
          AppMethodBeat.o(103849);
        }
      });
    while (true)
    {
      ((a)localObject).ayc();
      ab.v("MicroMsg.JsApiDrawCanvas", "post drawCanvas cost : %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      bool = super.b(parame, paramInt, paramView, paramJSONObject, paramg);
      AppMethodBeat.o(103852);
      break;
      ((a)localObject).a(localJSONArray, new e.2(this, paramg));
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103851);
    int i = paramJSONObject.getInt("canvasId");
    AppMethodBeat.o(103851);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.e
 * JD-Core Version:    0.6.2
 */