package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.bp.d;
import com.tencent.mm.ci.f;
import com.tencent.mm.plugin.wallet.balance.a.a.l;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.g;

final class WalletBalanceManagerUI$4
  implements View.OnClickListener
{
  WalletBalanceManagerUI$4(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final void onClick(final View paramView)
  {
    AppMethodBeat.i(45431);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletBalanceManagerUI", "click action entry");
    if (WalletBalanceManagerUI.e(this.thC).type == 1)
      if (bo.isNullOrNil(WalletBalanceManagerUI.e(this.thC).txZ))
        AppMethodBeat.o(45431);
    while (true)
    {
      return;
      if (WalletBalanceManagerUI.e(this.thC).txZ.startsWith("weixin://wcpay/lqt/detail"))
      {
        com.tencent.mm.plugin.wallet.balance.a.a.ab.parseUrl(WalletBalanceManagerUI.e(this.thC).txZ);
        paramView = new Intent();
        paramView.putExtra("key_account_type", 1);
        d.b(this.thC.mController.ylL, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", paramView);
        AppMethodBeat.o(45431);
      }
      else if (WalletBalanceManagerUI.e(this.thC).txZ.startsWith("weixin://wcpay/lqt/save"))
      {
        com.tencent.mm.plugin.wallet.balance.a.a.ab.parseUrl(WalletBalanceManagerUI.e(this.thC).txZ);
        final String str = com.tencent.mm.plugin.wallet.balance.a.a.ab.aci(WalletBalanceManagerUI.e(this.thC).txZ);
        paramView = g.b(this.thC.mController.ylL, false, null);
        new l().acy().b(new a()
        {
        });
        AppMethodBeat.o(45431);
        continue;
        if (WalletBalanceManagerUI.e(this.thC).type == 2)
        {
          e.n(this.thC.mController.ylL, WalletBalanceManagerUI.e(this.thC).kLE, true);
          AppMethodBeat.o(45431);
        }
        else if (WalletBalanceManagerUI.e(this.thC).type == 3)
        {
          e.p(WalletBalanceManagerUI.e(this.thC).tya, WalletBalanceManagerUI.e(this.thC).tyb, 0, 1061);
          AppMethodBeat.o(45431);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.WalletBalanceManagerUI", "unknown type: %s", new Object[] { Integer.valueOf(WalletBalanceManagerUI.e(this.thC).type) });
        }
      }
      else
      {
        AppMethodBeat.o(45431);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.4
 * JD-Core Version:    0.6.2
 */