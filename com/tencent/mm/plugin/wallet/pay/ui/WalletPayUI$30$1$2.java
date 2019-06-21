package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletPayUI$30$1$2
  implements View.OnClickListener
{
  WalletPayUI$30$1$2(WalletPayUI.30.1 param1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46069);
    ab.i(this.tqp.tqo.tqj.TAG, "Balance amount not meet, after favor selection! payWithNewBankcard");
    this.tqp.tqo.tqj.b(false, 0, "");
    AppMethodBeat.o(46069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.30.1.2
 * JD-Core Version:    0.6.2
 */