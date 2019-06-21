package com.tencent.mm.plugin.wallet.balance.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletBalanceSaveUI$1 extends s
{
  WalletBalanceSaveUI$1(WalletBalanceSaveUI paramWalletBalanceSaveUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(45469);
    this.thL.pQV = bo.getDouble(this.thL.kGa.getText(), 0.0D);
    if ((this.thL.pQV > 0.0D) && (this.thL.kGa.asa()))
    {
      this.thL.cNd();
      AppMethodBeat.o(45469);
    }
    while (true)
    {
      return;
      t.makeText(this.thL.mController.ylL, 2131304579, 0).show();
      AppMethodBeat.o(45469);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.1
 * JD-Core Version:    0.6.2
 */