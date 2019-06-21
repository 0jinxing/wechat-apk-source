package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$3
  implements View.OnClickListener
{
  b$3(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47761);
    ab.d("MicroMsg.WcPayCashierDialog", "click bankcard item");
    b.s(this.tMC);
    AppMethodBeat.o(47761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.3
 * JD-Core Version:    0.6.2
 */