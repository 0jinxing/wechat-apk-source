package com.tencent.mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubProxyUI$4$1
  implements DialogInterface.OnClickListener
{
  WebViewStubProxyUI$4$1(WebViewStubProxyUI.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7071);
    this.uqo.uqn.finish();
    AppMethodBeat.o(7071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.4.1
 * JD-Core Version:    0.6.2
 */