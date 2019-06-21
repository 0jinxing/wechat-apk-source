package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallFeedbackDialogUI$1
  implements DialogInterface.OnDismissListener
{
  IPCallFeedbackDialogUI$1(IPCallFeedbackDialogUI paramIPCallFeedbackDialogUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(22173);
    this.nDe.finish();
    AppMethodBeat.o(22173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackDialogUI.1
 * JD-Core Version:    0.6.2
 */