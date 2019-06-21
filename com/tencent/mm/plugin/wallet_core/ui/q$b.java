package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$b
  implements DialogInterface.OnCancelListener
{
  private DialogInterface.OnCancelListener tKx = null;

  private q$b(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.tKx = paramOnCancelListener;
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(47604);
    q.np(false);
    if (this.tKx != null)
      this.tKx.onCancel(paramDialogInterface);
    AppMethodBeat.o(47604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.b
 * JD-Core Version:    0.6.2
 */