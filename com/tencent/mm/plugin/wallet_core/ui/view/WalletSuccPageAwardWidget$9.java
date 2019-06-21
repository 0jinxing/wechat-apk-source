package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import d.a.a.c;
import d.a.a.f;

final class WalletSuccPageAwardWidget$9
  implements View.OnClickListener
{
  WalletSuccPageAwardWidget$9(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 2;
    AppMethodBeat.i(47953);
    if ((WalletSuccPageAwardWidget.j(this.tOK) != null) && (WalletSuccPageAwardWidget.j(this.tOK).wey != null))
    {
      WalletSuccPageAwardWidget.a(this.tOK, WalletSuccPageAwardWidget.j(this.tOK).wey);
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, type: %s", new Object[] { Integer.valueOf(WalletSuccPageAwardWidget.k(this.tOK).BTu) });
      if (WalletSuccPageAwardWidget.k(this.tOK).BTu != 1)
        break label241;
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", new Object[] { Integer.valueOf(WalletSuccPageAwardWidget.k(this.tOK).BTu), WalletSuccPageAwardWidget.k(this.tOK).url });
      e.n(WalletSuccPageAwardWidget.l(this.tOK), WalletSuccPageAwardWidget.k(this.tOK).url, false);
      WalletSuccPageAwardWidget.m(this.tOK);
      WalletSuccPageAwardWidget.n(this.tOK);
      WalletSuccPageAwardWidget.o(this.tOK);
      WalletSuccPageAwardWidget.p(this.tOK).postDelayed(new WalletSuccPageAwardWidget.9.1(this), 3000L);
      paramView = h.pYm;
      if (!WalletSuccPageAwardWidget.e(this.tOK))
        break label705;
    }
    while (true)
    {
      paramView.e(15225, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
      AppMethodBeat.o(47953);
      return;
      label241: if (WalletSuccPageAwardWidget.k(this.tOK).BTu == 2)
      {
        paramView = WalletSuccPageAwardWidget.k(this.tOK).BTv;
        if (paramView != null)
        {
          ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, jump tiny app, userName: %s, path: %s, version: %s", new Object[] { paramView.wMk, paramView.wMl, Integer.valueOf(paramView.wMm) });
          se localse = new se();
          localse.cOf.userName = paramView.wMk;
          localse.cOf.cOh = bo.bc(paramView.wMl, "");
          localse.cOf.scene = 1060;
          localse.cOf.cst = WalletSuccPageAwardWidget.q(this.tOK);
          localse.cOf.cOi = 0;
          if (paramView.wMm > 0)
            localse.cOf.axy = paramView.wMm;
          localse.cOf.context = WalletSuccPageAwardWidget.l(this.tOK);
          com.tencent.mm.sdk.b.a.xxA.m(localse);
          WalletSuccPageAwardWidget.m(this.tOK);
          WalletSuccPageAwardWidget.o(this.tOK);
          WalletSuccPageAwardWidget.p(this.tOK).postDelayed(new WalletSuccPageAwardWidget.9.2(this), 3000L);
        }
        WalletSuccPageAwardWidget.n(this.tOK);
        break;
      }
      if (WalletSuccPageAwardWidget.k(this.tOK).BTu == 3)
      {
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do get lottery");
        WalletSuccPageAwardWidget.r(this.tOK);
        WalletSuccPageAwardWidget.n(this.tOK);
        break;
      }
      if (WalletSuccPageAwardWidget.k(this.tOK).BTu == 5)
      {
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do nothing");
        break;
      }
      if (WalletSuccPageAwardWidget.k(this.tOK).BTu == 6)
      {
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, show layer");
        WalletSuccPageAwardWidget.n(this.tOK);
        break;
      }
      if (WalletSuccPageAwardWidget.k(this.tOK).BTu == 7)
      {
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, draw lottery");
        WalletSuccPageAwardWidget.a(this.tOK, 3, true);
        WalletSuccPageAwardWidget.n(this.tOK);
        break;
      }
      if (WalletSuccPageAwardWidget.k(this.tOK).BTu == 8)
      {
        WalletSuccPageAwardWidget.r(this.tOK);
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", new Object[] { Integer.valueOf(WalletSuccPageAwardWidget.k(this.tOK).BTu), WalletSuccPageAwardWidget.k(this.tOK).url });
        WalletSuccPageAwardWidget.n(this.tOK);
        break;
      }
      if (WalletSuccPageAwardWidget.k(this.tOK).BTu != 9)
        break;
      WalletSuccPageAwardWidget.r(this.tOK);
      WalletSuccPageAwardWidget.n(this.tOK);
      break;
      label705: i = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.9
 * JD-Core Version:    0.6.2
 */