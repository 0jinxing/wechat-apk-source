package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class WebViewInputFooter$3
  implements WebViewSmileyPanel.a
{
  WebViewInputFooter$3(WebViewInputFooter paramWebViewInputFooter)
  {
  }

  public final void aRg()
  {
    AppMethodBeat.i(10078);
    if ((WebViewInputFooter.c(this.uKx)) && (WebViewInputFooter.j(this.uKx) != null))
    {
      WebViewInputFooter.j(this.uKx).EH("[DELETE_EMOTION]");
      AppMethodBeat.o(10078);
    }
    while (true)
    {
      return;
      if (WebViewInputFooter.d(this.uKx) != null)
      {
        MMEditText localMMEditText = WebViewInputFooter.d(this.uKx);
        if (localMMEditText.getInputConnection() != null)
        {
          localMMEditText.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
          localMMEditText.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
          AppMethodBeat.o(10078);
        }
        else
        {
          localMMEditText.dispatchKeyEvent(new KeyEvent(0, 67));
          localMMEditText.dispatchKeyEvent(new KeyEvent(1, 67));
        }
      }
      else
      {
        AppMethodBeat.o(10078);
      }
    }
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(10077);
    try
    {
      if (WebViewInputFooter.c(this.uKx))
      {
        WebViewInputFooter.j(this.uKx).EH(paramString);
        AppMethodBeat.o(10077);
      }
      while (true)
      {
        return;
        this.uKx.uKt.asB(paramString);
        AppMethodBeat.o(10077);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", new Object[] { paramString });
        AppMethodBeat.o(10077);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.3
 * JD-Core Version:    0.6.2
 */