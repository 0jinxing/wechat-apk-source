package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$8
  implements DialogInterface.OnDismissListener
{
  b$8(b paramb)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(47773);
    ab.i("MicroMsg.WcPayCashierDialog", "on dismissed");
    b.b(this.tMC);
    b.d(this.tMC);
    AppMethodBeat.o(47773);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.8
 * JD-Core Version:    0.6.2
 */