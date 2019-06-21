package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.f.b.j;
import a.k.m;
import a.l;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.s;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$tempWebViewClient$1", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI$DefaultWebViewClient;", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;", "canIntercept", "", "url", "", "doUpdateVisitedHistory", "", "view", "Lcom/tencent/xweb/WebView;", "isReload", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldInterceptRequest", "Lcom/tencent/xweb/WebResourceResponse;", "request", "Lcom/tencent/xweb/WebResourceRequest;", "bundle", "Landroid/os/Bundle;", "plugin-brandservice_release"})
public final class TmplWebViewToolUI$f extends WebViewUI.h
{
  TmplWebViewToolUI$f()
  {
    super(localWebViewUI);
  }

  private final boolean Gc(String paramString)
  {
    AppMethodBeat.i(15078);
    boolean bool;
    if ((j.j(paramString, TmplWebViewToolUI.a(this.jVe).jVi)) || (m.jb(paramString, com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.getPrefix())))
    {
      bool = true;
      AppMethodBeat.o(15078);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15078);
    }
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(15080);
    j.p(paramWebView, "view");
    j.p(paramn, "request");
    Object localObject = paramn.getUrl().toString();
    j.o(localObject, "request.url.toString()");
    ab.v(TmplWebViewToolUI.b(this.jVe), "shouldInterceptRequest url:" + (String)localObject + ", isReady:" + TmplWebViewToolUI.a(this.jVe).isReady());
    if (Gc((String)localObject))
    {
      localObject = TmplWebViewToolUI.a(this.jVe).getWebViewClient();
      if (localObject != null)
      {
        paramWebView = ((s)localObject).a(paramWebView, paramn);
        AppMethodBeat.o(15080);
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = null;
      AppMethodBeat.o(15080);
      continue;
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(15080);
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(15081);
    j.p(paramWebView, "view");
    j.p(paramn, "request");
    j.p(paramBundle, "bundle");
    String str = paramn.getUrl().toString();
    j.o(str, "request.url.toString()");
    ab.v(TmplWebViewToolUI.b(this.jVe), "shouldInterceptRequest url:" + str + ", isReady:" + TmplWebViewToolUI.a(this.jVe).isReady());
    if (Gc(str))
    {
      paramBundle = TmplWebViewToolUI.a(this.jVe).getWebViewClient();
      if (paramBundle != null)
      {
        paramWebView = paramBundle.a(paramWebView, paramn);
        AppMethodBeat.o(15081);
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = null;
      AppMethodBeat.o(15081);
      continue;
      paramWebView = super.a(paramWebView, paramn, paramBundle);
      AppMethodBeat.o(15081);
    }
  }

  public final void a(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(15075);
    ab.i(TmplWebViewToolUI.b(this.jVe), "doUpdateVisitedHistory url:" + paramString + ", isReady:" + TmplWebViewToolUI.a(this.jVe).isReady());
    if (j.j(paramString, TmplWebViewToolUI.a(this.jVe).jVi))
      AppMethodBeat.o(15075);
    while (true)
    {
      return;
      if (TmplWebViewToolUI.u(this.jVe))
      {
        TmplWebViewToolUI.v(this.jVe);
        if (paramWebView == null)
          j.dWJ();
        paramWebView.clearHistory();
      }
      super.a(paramWebView, paramString, paramBoolean);
      AppMethodBeat.o(15075);
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(15077);
    ab.i(TmplWebViewToolUI.b(this.jVe), "onPageFinished url:" + paramString + " isReady:" + TmplWebViewToolUI.a(this.jVe).isReady() + " state:" + TmplWebViewToolUI.a(this.jVe).getState());
    if (j.j(paramString, TmplWebViewToolUI.a(this.jVe).jVi))
    {
      s locals = TmplWebViewToolUI.a(this.jVe).getWebViewClient();
      if (locals != null)
      {
        locals.b(paramWebView, paramString);
        AppMethodBeat.o(15077);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(15077);
      continue;
      super.b(paramWebView, paramString);
      AppMethodBeat.o(15077);
    }
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(15076);
    ab.i(TmplWebViewToolUI.b(this.jVe), "onPageStarted url:" + paramString + ", isReady:" + TmplWebViewToolUI.a(this.jVe).isReady());
    if (j.j(paramString, TmplWebViewToolUI.a(this.jVe).jVi))
    {
      s locals = TmplWebViewToolUI.a(this.jVe).getWebViewClient();
      if (locals != null)
      {
        locals.b(paramWebView, paramString, paramBitmap);
        AppMethodBeat.o(15076);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(15076);
      continue;
      if (TmplWebViewToolUI.r(this.jVe) != null)
      {
        TmplWebViewToolUI.r(this.jVe).dcq();
        TmplWebViewToolUI.a(this.jVe, (a)new a.a());
      }
      super.b(paramWebView, paramString, paramBitmap);
      AppMethodBeat.o(15076);
    }
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(15079);
    j.p(paramWebView, "view");
    j.p(paramString, "url");
    if (!TmplWebViewToolUI.h(this.jVe))
    {
      ab.v(TmplWebViewToolUI.b(this.jVe), "shouldInterceptRequest url:" + paramString + ", isReady:" + TmplWebViewToolUI.a(this.jVe).isReady());
      if (Gc(paramString))
      {
        s locals = TmplWebViewToolUI.a(this.jVe).getWebViewClient();
        if (locals != null)
        {
          paramWebView = locals.c(paramWebView, paramString);
          AppMethodBeat.o(15079);
        }
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = null;
      AppMethodBeat.o(15079);
      continue;
      paramWebView = super.c(paramWebView, paramString);
      AppMethodBeat.o(15079);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.f
 * JD-Core Version:    0.6.2
 */