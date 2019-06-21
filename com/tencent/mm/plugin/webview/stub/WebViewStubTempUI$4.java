package com.tencent.mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubTempUI$4
  implements DialogInterface.OnCancelListener
{
  WebViewStubTempUI$4(WebViewStubTempUI paramWebViewStubTempUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7221);
    this.uqO.finish();
    AppMethodBeat.o(7221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.4
 * JD-Core Version:    0.6.2
 */