package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.s.b;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.widget.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class e extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 253;
  public static final String NAME = "insertTextView";

  public final View a(com.tencent.mm.plugin.appbrand.jsapi.e parame, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126305);
    parame = parame.getContext();
    parame = new CoverViewContainer(parame, new d(parame));
    AppMethodBeat.o(126305);
    return parame;
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126307);
    ab.d("MicroMsg.JsApiInsertTextView", "onInsertView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    d locald = (d)((CoverViewContainer)paramView).ah(d.class);
    if (locald == null)
    {
      ab.w("MicroMsg.JsApiInsertTextView", "onInsertView(viewId : %d) failed, targetView is null", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126307);
    }
    while (true)
    {
      return;
      boolean bool1 = paramJSONObject.optBoolean("clickable");
      boolean bool2 = paramJSONObject.optBoolean("transEvt");
      boolean bool3 = paramJSONObject.optBoolean("gesture");
      String str1 = paramJSONObject.optString("sendTo", "appservice");
      String str2 = paramJSONObject.optString("data", "");
      b.a(locald, paramJSONObject.optJSONObject("label"));
      com.tencent.mm.plugin.appbrand.jsapi.s.a.a(locald, paramJSONObject);
      com.tencent.mm.plugin.appbrand.jsapi.s.e.b(paramView, paramJSONObject.optJSONObject("style"));
      paramView = parame.aBf().J(paramInt, true);
      paramView.j("data", str2);
      paramView.j("sendTo", str1);
      paramView.j("transEvt", Boolean.valueOf(bool2));
      paramView.j("clickable", Boolean.valueOf(bool1));
      locald.setOnClickListener(new e.1(this, paramView, parame));
      locald.setClickable(bool1);
      ab.i("MicroMsg.JsApiInsertTextView", "clickable:%b, gesture:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
      if ((!bool1) && (bool3))
        locald.setOnTouchListener(new e.2(this, paramView, parame));
      AppMethodBeat.o(126307);
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126306);
    int i = paramJSONObject.getInt("viewId");
    AppMethodBeat.o(126306);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.e
 * JD-Core Version:    0.6.2
 */