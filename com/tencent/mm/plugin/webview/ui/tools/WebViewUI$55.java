package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$55
  implements View.OnApplyWindowInsetsListener
{
  WebViewUI$55(WebViewUI paramWebViewUI, ViewGroup paramViewGroup)
  {
  }

  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    AppMethodBeat.i(7884);
    this.uxp.a(this.uxz, paramWindowInsets);
    WebViewUI.c(this.uxp);
    paramView = paramWindowInsets.consumeSystemWindowInsets();
    AppMethodBeat.o(7884);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.55
 * JD-Core Version:    0.6.2
 */