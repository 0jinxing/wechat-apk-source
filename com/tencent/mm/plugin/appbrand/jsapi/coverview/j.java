package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends c
{
  private static final int CTRL_INDEX = 447;
  public static final String NAME = "updateScrollView";

  public final boolean c(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126318);
    ab.d("MicroMsg.JsApiUpdateScrollView", "onUpdateView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    boolean bool;
    if (!(paramView instanceof WxaScrollView))
    {
      ab.w("MicroMsg.JsApiUpdateScrollView", "the view(%s) is not a instance of WxaScrollView", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126318);
      bool = false;
    }
    while (true)
    {
      return bool;
      WxaScrollView localWxaScrollView = (WxaScrollView)paramView;
      com.tencent.mm.plugin.appbrand.jsapi.s.e.b(paramView, paramJSONObject.optJSONObject("style"));
      try
      {
        if (paramJSONObject.getBoolean("needScrollEvent"))
        {
          m local1 = new com/tencent/mm/plugin/appbrand/jsapi/coverview/j$1;
          local1.<init>(this, parame, paramInt);
          localWxaScrollView.setOnScrollChangedListener(local1);
        }
        while (true)
        {
          label111: paramJSONObject.optInt("scrollLeft", 0);
          if (paramJSONObject.has("scrollX"))
          {
            bool = paramJSONObject.optBoolean("scrollX", true);
            ab.i("MicroMsg.JsApiUpdateScrollView", "scrollHorizontal:%b", new Object[] { Boolean.valueOf(bool) });
            localWxaScrollView.setScrollHorizontal(bool);
          }
          if (paramJSONObject.has("scrollY"))
          {
            bool = paramJSONObject.optBoolean("scrollY", true);
            ab.i("MicroMsg.JsApiUpdateScrollView", "scrollVertical:%b", new Object[] { Boolean.valueOf(bool) });
            localWxaScrollView.setScrollVertical(bool);
          }
          if (paramJSONObject.has("scrollTop"))
          {
            int i = g.a(paramJSONObject, "scrollTop", localWxaScrollView.getScrollY());
            ab.i("MicroMsg.JsApiUpdateScrollView", "scrollTop:%d", new Object[] { Integer.valueOf(i) });
            localWxaScrollView.scrollTo(localWxaScrollView.getScrollX(), i);
          }
          bool = super.c(parame, paramInt, paramView, paramJSONObject);
          AppMethodBeat.o(126318);
          break;
          localWxaScrollView.setOnScrollChangedListener(null);
        }
      }
      catch (JSONException localJSONException)
      {
        break label111;
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126317);
    int i = paramJSONObject.getInt("viewId");
    AppMethodBeat.o(126317);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.j
 * JD-Core Version:    0.6.2
 */