package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SimpleLoginUI$7
  implements DialogInterface.OnDismissListener
{
  SimpleLoginUI$7(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125603);
    SimpleLoginUI.i(this.gIp);
    AppMethodBeat.o(125603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.7
 * JD-Core Version:    0.6.2
 */