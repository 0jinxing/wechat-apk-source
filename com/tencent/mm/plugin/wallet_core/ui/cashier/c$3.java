package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$3
  implements View.OnClickListener
{
  c$3(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47826);
    ab.i("MicroMsg.WcPayCashierFingerprintDialog", "click back icon");
    this.tMM.cancel();
    AppMethodBeat.o(47826);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.c.3
 * JD-Core Version:    0.6.2
 */