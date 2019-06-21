package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$15
  implements DialogInterface.OnShowListener
{
  b$15(b paramb)
  {
  }

  public final void onShow(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(47780);
    b.m(this.tMC);
    this.tMC.setOnShowListener(null);
    AppMethodBeat.o(47780);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.15
 * JD-Core Version:    0.6.2
 */