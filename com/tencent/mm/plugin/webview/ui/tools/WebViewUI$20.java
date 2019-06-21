package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.h;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$20
  implements DialogInterface.OnCancelListener
{
  WebViewUI$20(WebViewUI paramWebViewUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7840);
    if ((this.uxp.uwH.icE != null) && (this.uxp.icy != null));
    while (true)
    {
      try
      {
        this.uxp.icy.afo(this.uxp.uwH.icE.upr);
        this.uxp.uwH.icE.cYK();
        AppMethodBeat.o(7840);
        return;
      }
      catch (Exception paramDialogInterface)
      {
        ab.e("MicroMsg.WebViewUI", "cancel capture failed");
      }
      AppMethodBeat.o(7840);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.20
 * JD-Core Version:    0.6.2
 */