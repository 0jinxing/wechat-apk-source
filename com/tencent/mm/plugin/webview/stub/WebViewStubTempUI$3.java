package com.tencent.mm.plugin.webview.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubTempUI$3
  implements DialogInterface.OnClickListener
{
  WebViewStubTempUI$3(WebViewStubTempUI paramWebViewStubTempUI, ResultReceiver paramResultReceiver)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7220);
    this.uqN.send(1, null);
    this.uqO.finish();
    AppMethodBeat.o(7220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.3
 * JD-Core Version:    0.6.2
 */