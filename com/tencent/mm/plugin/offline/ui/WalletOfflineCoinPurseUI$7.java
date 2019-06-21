package com.tencent.mm.plugin.offline.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.id_verify.model.f;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;

final class WalletOfflineCoinPurseUI$7
  implements View.OnClickListener
{
  WalletOfflineCoinPurseUI$7(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, ImageView paramImageView1, TextView paramTextView, ImageView paramImageView2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43511);
    if (c.PK().b(ac.a.xTL, ac.a.xSL))
    {
      c.PK().c(ac.a.xTL, ac.a.xSL);
      this.paB.setVisibility(8);
      this.paC.setVisibility(8);
      this.paD.setVisibility(8);
      g.RQ();
      g.RP().Ry().set(ac.a.xTb, "");
      h.pYm.e(14396, new Object[] { Integer.valueOf(3) });
    }
    if (r.cPI().cQg())
    {
      WalletOfflineCoinPurseUI.m(this.pav);
      AppMethodBeat.o(43511);
    }
    while (true)
    {
      return;
      r.cPD();
      paramView = this.pav;
      i locali = WalletOfflineCoinPurseUI.n(this.pav);
      new WalletOfflineCoinPurseUI.7.1(this);
      if (!r.b(paramView, locali))
      {
        paramView = new f("collect");
        this.pav.a(paramView, true, false);
      }
      AppMethodBeat.o(43511);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.7
 * JD-Core Version:    0.6.2
 */