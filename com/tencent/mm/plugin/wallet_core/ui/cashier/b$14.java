package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$14
  implements View.OnClickListener
{
  b$14(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47779);
    ab.d("MicroMsg.WcPayCashierDialog", "click pay way btn");
    b.l(this.tMC);
    AppMethodBeat.o(47779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.14
 * JD-Core Version:    0.6.2
 */