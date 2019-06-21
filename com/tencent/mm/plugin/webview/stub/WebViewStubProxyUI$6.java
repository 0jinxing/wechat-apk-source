package com.tencent.mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubProxyUI$6
  implements DialogInterface.OnDismissListener
{
  WebViewStubProxyUI$6(WebViewStubProxyUI paramWebViewStubProxyUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7095);
    if (!this.uqn.isFinishing())
      this.uqn.finish();
    AppMethodBeat.o(7095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.6
 * JD-Core Version:    0.6.2
 */