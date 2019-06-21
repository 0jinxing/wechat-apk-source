package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.b.c.a;
import com.tencent.mm.ui.widget.MMEditText;

final class WebViewInputFooter$4$1
  implements c.a
{
  WebViewInputFooter$4$1(WebViewInputFooter.4 param4)
  {
  }

  public final void JW()
  {
  }

  public final void JX()
  {
    AppMethodBeat.i(10080);
    if (WebViewInputFooter.b(this.uKy.uKx) != null)
      Toast.makeText(WebViewInputFooter.b(this.uKy.uKx), "exceed max-length", 0).show();
    AppMethodBeat.o(10080);
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(10079);
    if (WebViewInputFooter.k(this.uKy.uKx) != null)
      WebViewInputFooter.k(this.uKy.uKx).aee(WebViewInputFooter.d(this.uKy.uKx).getText().toString());
    paramString = this.uKy.uKx;
    paramString.uKt.clearComposingText();
    paramString.uKt.setText("");
    AppMethodBeat.o(10079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.4.1
 * JD-Core Version:    0.6.2
 */