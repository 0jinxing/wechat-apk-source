package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$7
  implements View.OnSystemUiVisibilityChangeListener
{
  WebViewUI$7(WebViewUI paramWebViewUI, View paramView)
  {
  }

  public final void onSystemUiVisibilityChange(int paramInt)
  {
    AppMethodBeat.i(7814);
    if (((paramInt & 0x4) == 0) && (this.uxp.uvf))
      WebViewUI.eq(this.uxq);
    AppMethodBeat.o(7814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.7
 * JD-Core Version:    0.6.2
 */