package com.tencent.mm.plugin.webview.luggage.ipc;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IpcProxyUI$1
  implements a
{
  IpcProxyUI$1(IpcProxyUI paramIpcProxyUI)
  {
  }

  public final void l(Bundle paramBundle)
  {
    AppMethodBeat.i(6249);
    Intent localIntent = new Intent();
    localIntent.putExtra("input_data", paramBundle);
    this.ujI.setResult(-1, localIntent);
    this.ujI.finish();
    AppMethodBeat.o(6249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI.1
 * JD-Core Version:    0.6.2
 */