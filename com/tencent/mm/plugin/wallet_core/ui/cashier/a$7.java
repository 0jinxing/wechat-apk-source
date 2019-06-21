package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$7
  implements View.OnClickListener
{
  a$7(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47742);
    ab.d("MicroMsg.WcPayCashierBankcardDialog", "click bind new card");
    this.tLI.dismiss();
    if (a.a(this.tLI) != null)
      a.a(this.tLI).cMN();
    AppMethodBeat.o(47742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.a.7
 * JD-Core Version:    0.6.2
 */