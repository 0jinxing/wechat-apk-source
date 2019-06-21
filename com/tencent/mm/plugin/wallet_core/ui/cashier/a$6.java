package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;

final class a$6
  implements View.OnClickListener
{
  a$6(a parama, Bankcard paramBankcard)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47741);
    ab.d("MicroMsg.WcPayCashierBankcardDialog", "click bankcard: %s", new Object[] { this.tgn.field_bindSerial });
    a.a(this.tLI, paramView);
    this.tLI.dismiss();
    if (a.a(this.tLI) != null)
      a.a(this.tLI).i(this.tgn);
    AppMethodBeat.o(47741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.a.6
 * JD-Core Version:    0.6.2
 */