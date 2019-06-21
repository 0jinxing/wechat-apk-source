package com.tencent.mm.plugin.webview.fts.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.32;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.40;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.41;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.43;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.45;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.xweb.WebView;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements r
{
  private WebView uhI;
  public d uhz;

  public a(WebView paramWebView)
  {
    this.uhI = paramWebView;
  }

  public final void a(String paramString1, boolean paramBoolean, String paramString2, String paramString3)
  {
    AppMethodBeat.i(5970);
    this.uhz.a(paramString1, paramBoolean, paramString2, paramString3);
    AppMethodBeat.o(5970);
  }

  public final void adG(String paramString)
  {
    AppMethodBeat.i(5967);
    d locald = this.uhz;
    if (!locald.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadData fail, not ready");
      AppMethodBeat.o(5967);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadData success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("widgetId", paramString);
      al.d(new d.41(locald, i.a.b("onSearchWAWidgetReloadData", localHashMap, locald.uFv, locald.uFw)));
      AppMethodBeat.o(5967);
    }
  }

  public final void addView(View paramView)
  {
    AppMethodBeat.i(5963);
    ViewGroup localViewGroup = this.uhI.getTopView();
    if ((localViewGroup != null) && ((localViewGroup instanceof AbsoluteLayout)))
    {
      localViewGroup.addView(paramView);
      AppMethodBeat.o(5963);
    }
    while (true)
    {
      return;
      ab.e("WebViewWidgetWrap", "webview invalid viewgroup ".concat(String.valueOf(localViewGroup)));
      AppMethodBeat.o(5963);
    }
  }

  public final void cUV()
  {
  }

  public final void dw(String paramString, int paramInt)
  {
    AppMethodBeat.i(5965);
    d locald = this.uhz;
    if (!locald.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetStateChange fail, not ready");
      AppMethodBeat.o(5965);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchWAWidgetStateChange success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("widgetId", paramString);
      localHashMap.put("state", Integer.valueOf(paramInt));
      al.d(new d.43(locald, i.a.b("onSearchWAWidgetStateChange", localHashMap, locald.uFv, locald.uFw)));
      AppMethodBeat.o(5965);
    }
  }

  public final void dx(String paramString, int paramInt)
  {
    AppMethodBeat.i(5971);
    d locald = this.uhz;
    if (!locald.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetAttrChanged fail, not ready");
      AppMethodBeat.o(5971);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchWAWidgetAttrChanged success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("widgetId", paramString);
      localHashMap.put("height", Integer.valueOf(paramInt));
      al.d(new d.32(locald, i.a.b("onSearchWAWidgetAttrChanged", localHashMap, locald.uFv, locald.uFw)));
      AppMethodBeat.o(5971);
    }
  }

  public final void g(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(5969);
    d locald = this.uhz;
    if (!locald.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetOpenApp fail, not ready");
      AppMethodBeat.o(5969);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchWAWidgetOpenApp success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("widgetId", paramString1);
      localHashMap.put("path", paramString2);
      localHashMap.put("username", paramString3);
      localHashMap.put("debugMode", Integer.valueOf(paramInt));
      al.d(new d.40(locald, i.a.b("onSearchWAWidgetOpenApp", localHashMap, locald.uFv, locald.uFw)));
      AppMethodBeat.o(5969);
    }
  }

  public final void g(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(5966);
    this.uhz.a(paramString1, paramBoolean, "", paramString2);
    AppMethodBeat.o(5966);
  }

  public final void gS(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5968);
    d locald = this.uhz;
    if (!locald.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetDataPush fail, not ready");
      AppMethodBeat.o(5968);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchWAWidgetDataPush success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("widgetId", paramString1);
      localHashMap.put("data", paramString2);
      al.d(new d.45(locald, i.a.b("onSearchWAWidgetDataPush", localHashMap, locald.uFv, locald.uFw)));
      AppMethodBeat.o(5968);
    }
  }

  public final void removeView(View paramView)
  {
    AppMethodBeat.i(5964);
    ViewGroup localViewGroup = this.uhI.getTopView();
    if ((localViewGroup != null) && ((localViewGroup instanceof AbsoluteLayout)))
      localViewGroup.removeView(paramView);
    AppMethodBeat.o(5964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.d.a
 * JD-Core Version:    0.6.2
 */