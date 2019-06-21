package com.tencent.mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewStubProxyUI$3
  implements DialogInterface.OnCancelListener
{
  WebViewStubProxyUI$3(WebViewStubProxyUI paramWebViewStubProxyUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7070);
    ab.i("MicroMsg.WebViewStubProxyUI", "addshortcut, user cancel");
    this.uqn.finish();
    AppMethodBeat.o(7070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.3
 * JD-Core Version:    0.6.2
 */