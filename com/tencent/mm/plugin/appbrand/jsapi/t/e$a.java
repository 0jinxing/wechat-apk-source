package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l.a;

final class e$a extends i
{
  e$a(e parame, MMWebViewWithJsApi paramMMWebViewWithJsApi)
  {
    super(paramMMWebViewWithJsApi);
  }

  private void a(ValueCallback<Uri> paramValueCallback, ValueCallback<Uri[]> paramValueCallback1, String paramString1, String paramString2)
  {
    AppMethodBeat.i(17041);
    if (!(e.d(this.icM).getContext() instanceof MMActivity))
      AppMethodBeat.o(17041);
    while (true)
    {
      return;
      MMActivity localMMActivity = (MMActivity)e.d(this.icM).getContext();
      localMMActivity.ifE = new e.a.1(this, localMMActivity);
      e.e(this.icM).a(localMMActivity, e.f(this.icM), paramValueCallback, paramValueCallback1, paramString1, paramString2);
      AppMethodBeat.o(17041);
    }
  }

  public final boolean a(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, l.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(17040);
    if (parama.getMode() == 0)
      if ((parama.getAcceptTypes() == null) || (parama.getAcceptTypes().length <= 0))
      {
        ab.i("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
        AppMethodBeat.o(17040);
        bool = true;
      }
    while (true)
    {
      return bool;
      String str1 = parama.getAcceptTypes()[0];
      String str2 = "*";
      paramWebView = str2;
      if (parama.isCaptureEnabled())
      {
        if (!"image/*".equalsIgnoreCase(str1))
          break label106;
        paramWebView = "camera";
      }
      while (true)
      {
        a(null, paramValueCallback, str1, paramWebView);
        AppMethodBeat.o(17040);
        bool = true;
        break;
        label106: paramWebView = str2;
        if ("video/*".equalsIgnoreCase(str1))
          paramWebView = "camcorder";
      }
      AppMethodBeat.o(17040);
    }
  }

  public final void d(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(17037);
    super.d(paramWebView, paramString);
    e.b(this.icM).BV(paramString);
    AppMethodBeat.o(17037);
  }

  public final void onClose()
  {
    AppMethodBeat.i(17038);
    e.b(this.icM).aGp();
    AppMethodBeat.o(17038);
  }

  public final void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(17039);
    a(paramValueCallback, null, paramString1, paramString2);
    AppMethodBeat.o(17039);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.a
 * JD-Core Version:    0.6.2
 */