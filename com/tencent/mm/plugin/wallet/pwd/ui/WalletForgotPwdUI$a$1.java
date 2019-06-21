package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

final class WalletForgotPwdUI$a$1
  implements View.OnClickListener
{
  WalletForgotPwdUI$a$1(WalletForgotPwdUI.a parama, Bankcard paramBankcard)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46283);
    if ((this.tgn != null) && (this.tgn.field_bankcardState == 1))
    {
      paramView = new c.a(WalletForgotPwdUI.a.a(this.trH));
      paramView.PZ(2131304814);
      paramView.Qc(2131304815).a(new WalletForgotPwdUI.a.1.1(this));
      paramView.Qd(2131296955);
      paramView.rc(false);
      paramView.aMb().show();
      AppMethodBeat.o(46283);
    }
    while (true)
    {
      return;
      WalletForgotPwdUI.a(this.trH.trG, this.tgn);
      WalletForgotPwdUI.a(this.trH.trG, false);
      WalletForgotPwdUI.a(this.trH.trG);
      AppMethodBeat.o(46283);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.a.1
 * JD-Core Version:    0.6.2
 */