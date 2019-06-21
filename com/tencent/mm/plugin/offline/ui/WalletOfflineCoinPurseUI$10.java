package com.tencent.mm.plugin.offline.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.id_verify.model.f;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;

final class WalletOfflineCoinPurseUI$10
  implements View.OnClickListener
{
  WalletOfflineCoinPurseUI$10(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, ImageView paramImageView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43515);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "click qr reward");
    h.pYm.e(14021, new Object[] { Integer.valueOf(5), Integer.valueOf(WalletOfflineCoinPurseUI.p(this.pav)) });
    if (c.PK().b(ac.a.xTN, ac.a.xSL))
    {
      c.PK().c(ac.a.xTN, ac.a.xSL);
      this.paH.setVisibility(8);
    }
    if (r.cPI().cQg())
    {
      d.H(this.pav.mController.ylL, "collect", ".reward.ui.QrRewardMainUI");
      AppMethodBeat.o(43515);
    }
    while (true)
    {
      return;
      r.cPD();
      WalletOfflineCoinPurseUI localWalletOfflineCoinPurseUI = this.pav;
      paramView = WalletOfflineCoinPurseUI.q(this.pav);
      new WalletOfflineCoinPurseUI.10.1(this);
      if (!r.b(localWalletOfflineCoinPurseUI, paramView))
      {
        paramView = new f("reward");
        this.pav.a(paramView, true, false);
      }
      AppMethodBeat.o(43515);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.10
 * JD-Core Version:    0.6.2
 */