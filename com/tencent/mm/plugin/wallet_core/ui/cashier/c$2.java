package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements DialogInterface.OnDismissListener
{
  c$2(c paramc)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(47825);
    ab.i("MicroMsg.WcPayCashierFingerprintDialog", "dialog dismiss");
    paramDialogInterface = c.b(this.tMM);
    ab.i("MicroMsg.WcPayCashierFingerprintDialog", "release fingerprint");
    paramDialogInterface.mrm.bxk();
    c.c(this.tMM);
    AppMethodBeat.o(47825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.c.2
 * JD-Core Version:    0.6.2
 */