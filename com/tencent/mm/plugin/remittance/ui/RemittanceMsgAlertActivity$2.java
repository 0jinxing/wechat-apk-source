package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceMsgAlertActivity$2
  implements DialogInterface.OnDismissListener
{
  RemittanceMsgAlertActivity$2(RemittanceMsgAlertActivity paramRemittanceMsgAlertActivity)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(45082);
    this.pWo.finish();
    AppMethodBeat.o(45082);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceMsgAlertActivity.2
 * JD-Core Version:    0.6.2
 */