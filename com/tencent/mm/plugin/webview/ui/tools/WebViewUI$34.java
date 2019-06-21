package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$34
  implements KeyboardLinearLayout.a
{
  WebViewUI$34(WebViewUI paramWebViewUI, WebViewKeyboardLinearLayout paramWebViewKeyboardLinearLayout)
  {
  }

  public final void sD(int paramInt)
  {
    AppMethodBeat.i(7857);
    ab.i("MicroMsg.WebViewUI", "onKeyBoardStateChange, state = ".concat(String.valueOf(paramInt)));
    WebViewUI.a(this.uxp, this.uxt, paramInt);
    if (paramInt == -3)
    {
      this.uxp.ulI.cXX().unt = 1;
      int i = this.uxt.getKeyBoardHeight();
      if (i > 0)
      {
        WebViewUI.b(this.uxp, i);
        WebViewUI.a(this.uxp, i);
      }
      if ((this.uxp.pzf.getIsX5Kernel()) || (Build.VERSION.SDK_INT >= 19))
        WebViewUI.l(this.uxp).post(new WebViewUI.34.1(this, i));
      if (WebViewUI.m(this.uxp))
        WebViewUI.n(this.uxp).dda();
    }
    while (true)
    {
      this.uxp.Ju(paramInt);
      this.uxp.jYe = paramInt;
      AppMethodBeat.o(7857);
      return;
      WebViewUI.b(this.uxp, 0);
      WebViewUI.a(this.uxp, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.34
 * JD-Core Version:    0.6.2
 */