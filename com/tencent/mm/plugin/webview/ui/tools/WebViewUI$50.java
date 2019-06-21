package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$50
  implements DialogInterface.OnClickListener
{
  WebViewUI$50(WebViewUI paramWebViewUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7879);
    this.uxp.uwA = true;
    m.uuj.close();
    this.uxp.finish();
    AppMethodBeat.o(7879);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.50
 * JD-Core Version:    0.6.2
 */