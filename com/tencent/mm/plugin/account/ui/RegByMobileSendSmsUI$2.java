package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileSendSmsUI$2
  implements DialogInterface.OnDismissListener
{
  RegByMobileSendSmsUI$2(RegByMobileSendSmsUI paramRegByMobileSendSmsUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125399);
    RegByMobileSendSmsUI.o(this.gGq);
    AppMethodBeat.o(125399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.2
 * JD-Core Version:    0.6.2
 */