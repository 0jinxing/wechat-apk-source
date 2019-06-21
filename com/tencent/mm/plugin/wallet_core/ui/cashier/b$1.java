package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements DialogInterface.OnCancelListener
{
  b$1(b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(47757);
    ab.i("MicroMsg.WcPayCashierDialog", "on canceled");
    b.b(this.tMC);
    if (b.c(this.tMC) != null)
      b.c(this.tMC).onCancel();
    AppMethodBeat.o(47757);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.1
 * JD-Core Version:    0.6.2
 */