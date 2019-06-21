package com.tencent.mm.plugin.appbrand.ipc;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandProcessProxyUI$a
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener
{
  private boolean hvk = false;

  private AppBrandProcessProxyUI$a(AppBrandProcessProxyUI paramAppBrandProcessProxyUI)
  {
  }

  private void nX(int paramInt)
  {
    AppMethodBeat.i(73131);
    if (this.hvk)
      AppMethodBeat.o(73131);
    while (true)
    {
      return;
      this.hvk = true;
      ResultReceiver localResultReceiver = (ResultReceiver)this.hvi.getIntent().getParcelableExtra("key_result_receiver");
      if (localResultReceiver != null)
        localResultReceiver.send(paramInt, null);
      AppMethodBeat.o(73131);
    }
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(73129);
    nX(paramInt);
    AppMethodBeat.o(73129);
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(73130);
    nX(-2);
    this.hvi.a(null);
    AppMethodBeat.o(73130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.a
 * JD-Core Version:    0.6.2
 */