package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class d extends a
{
  private static final int CTRL_INDEX = 446;
  public static final String NAME = "insertScrollView";

  public final View a(com.tencent.mm.plugin.appbrand.jsapi.e parame, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126300);
    parame = new WxaScrollView(parame.getContext());
    AppMethodBeat.o(126300);
    return parame;
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126302);
    ab.d("MicroMsg.JsApiInsertScrollView", "onInsertView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    WxaScrollView localWxaScrollView = (WxaScrollView)paramView;
    boolean bool = paramJSONObject.optBoolean("needScrollEvent");
    String str = paramJSONObject.optString("data", "");
    com.tencent.mm.plugin.appbrand.jsapi.s.e.b(paramView, paramJSONObject.optJSONObject("style"));
    parame.aBf().J(paramInt, true).j("data", str);
    if (bool)
      localWxaScrollView.setOnScrollChangedListener(new d.1(this, parame, paramInt));
    paramJSONObject.optInt("scrollLeft", 0);
    if (paramJSONObject.has("scrollX"))
    {
      bool = paramJSONObject.optBoolean("scrollX", true);
      ab.i("MicroMsg.JsApiInsertScrollView", "scrollHorizontal:%b", new Object[] { Boolean.valueOf(bool) });
      localWxaScrollView.setScrollHorizontal(bool);
    }
    if (paramJSONObject.has("scrollY"))
    {
      bool = paramJSONObject.optBoolean("scrollY", true);
      ab.i("MicroMsg.JsApiInsertScrollView", "scrollVertical:%b", new Object[] { Boolean.valueOf(bool) });
      localWxaScrollView.setScrollVertical(bool);
    }
    if (paramJSONObject.has("scrollTop"))
    {
      paramInt = g.a(paramJSONObject, "scrollTop", localWxaScrollView.getScrollY());
      ab.i("MicroMsg.JsApiInsertScrollView", "scrollTop:%d", new Object[] { Integer.valueOf(paramInt) });
      localWxaScrollView.postDelayed(new d.2(this, localWxaScrollView, paramInt), 100L);
    }
    AppMethodBeat.o(126302);
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126301);
    int i = paramJSONObject.getInt("viewId");
    AppMethodBeat.o(126301);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.d
 * JD-Core Version:    0.6.2
 */