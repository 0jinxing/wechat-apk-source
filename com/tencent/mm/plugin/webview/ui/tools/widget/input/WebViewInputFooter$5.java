package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class WebViewInputFooter$5
  implements TextWatcher
{
  WebViewInputFooter$5(WebViewInputFooter paramWebViewInputFooter)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(10082);
    if (WebViewInputFooter.d(this.uKx).getText() == null)
    {
      AppMethodBeat.o(10082);
      return;
    }
    WebViewInputFooter.d(this.uKx).requestFocus();
    if ((paramEditable.length() > 0) && (paramEditable.toString().trim().length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      WebViewInputFooter.a(this.uKx, bool);
      AppMethodBeat.o(10082);
      break;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.5
 * JD-Core Version:    0.6.2
 */