package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$j
  implements FontChooserView.a
{
  private WebViewUI$j(WebViewUI paramWebViewUI)
  {
  }

  public final void Cl(int paramInt)
  {
    int i = 2;
    AppMethodBeat.i(7948);
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 1:
    case 0:
    case 2:
    case 3:
    }
    while (true)
    {
      WebViewUI.c(this.uxp, j);
      try
      {
        if (this.uxp.icy.cZd())
        {
          this.uxp.icy.gx(16384, j);
          this.uxp.icy.gx(16388, j);
        }
        AppMethodBeat.o(7948);
        return;
        j = 1;
        continue;
        j = 3;
        continue;
        j = 4;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.w("MicroMsg.WebViewUI", "onCheckedChanged, ex = " + localException.getMessage());
          AppMethodBeat.o(7948);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.j
 * JD-Core Version:    0.6.2
 */