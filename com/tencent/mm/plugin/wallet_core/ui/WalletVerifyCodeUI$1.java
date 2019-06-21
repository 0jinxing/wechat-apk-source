package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

final class WalletVerifyCodeUI$1
  implements View.OnClickListener
{
  WalletVerifyCodeUI$1(WalletVerifyCodeUI paramWalletVerifyCodeUI, Bankcard paramBankcard)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47691);
    paramView = this.tLn.dOD();
    int i;
    if ((WalletVerifyCodeUI.a(this.tLn)) && (!(paramView instanceof b)))
    {
      if (this.tgn == null)
        break label226;
      if (this.tgn.cPc())
        i = 1;
    }
    while (true)
    {
      paramView = new c.a(this.tLn.mController.ylL);
      paramView.PV(2131305397);
      paramView.asE(this.tLn.getString(2131305396, new Object[] { this.tLn.cRU() }));
      paramView.rc(true);
      paramView.Qc(2131305395);
      paramView.Qd(2131305394);
      paramView.a(new WalletVerifyCodeUI.1.1(this, i));
      paramView.b(new WalletVerifyCodeUI.1.2(this, i));
      paramView.aMb().show();
      h.pYm.e(15443, new Object[] { Integer.valueOf(1) });
      WalletVerifyCodeUI.b(this.tLn);
      AppMethodBeat.o(47691);
      while (true)
      {
        return;
        if (this.tgn.cPd())
        {
          i = 3;
          break;
        }
        i = 2;
        break;
        this.tLn.cRV();
        AppMethodBeat.o(47691);
      }
      label226: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.1
 * JD-Core Version:    0.6.2
 */