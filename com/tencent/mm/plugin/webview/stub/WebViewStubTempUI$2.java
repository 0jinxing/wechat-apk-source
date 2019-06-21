package com.tencent.mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubTempUI$2
  implements DialogInterface.OnClickListener
{
  WebViewStubTempUI$2(WebViewStubTempUI paramWebViewStubTempUI, ResultReceiver paramResultReceiver)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7219);
    this.uqN.send(0, null);
    this.uqO.finish();
    AppMethodBeat.o(7219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.2
 * JD-Core Version:    0.6.2
 */