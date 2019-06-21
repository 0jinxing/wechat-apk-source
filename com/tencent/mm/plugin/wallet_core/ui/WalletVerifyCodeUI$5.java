package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletVerifyCodeUI$5
  implements View.OnClickListener
{
  WalletVerifyCodeUI$5(WalletVerifyCodeUI paramWalletVerifyCodeUI, Bankcard paramBankcard)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(47693);
    ab.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
    ab.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess and finish!");
    paramView = this.tLn.mBundle;
    paramView.putInt("key_err_code", 417);
    paramView.putBoolean("key_need_show_switch_phone", true);
    this.tLn.mBundle.putBoolean("key_block_bind_new_card", true);
    boolean bool2 = bool1;
    if (this.tgn != null)
      if (!this.tgn.cPc())
        break label107;
    label107: for (bool2 = bool1; ; bool2 = false)
    {
      paramView.putBoolean("key_isbalance", bool2);
      a.j(this.tLn, paramView);
      this.tLn.finish();
      AppMethodBeat.o(47693);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.5
 * JD-Core Version:    0.6.2
 */