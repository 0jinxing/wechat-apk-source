package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$4
  implements View.OnClickListener
{
  c$4(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47827);
    ab.i("MicroMsg.WcPayCashierFingerprintDialog", "click switch payway");
    this.tMM.dismiss();
    if (c.a(this.tMM) != null)
      c.a(this.tMM).cSt();
    AppMethodBeat.o(47827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.c.4
 * JD-Core Version:    0.6.2
 */