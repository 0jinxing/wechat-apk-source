package com.tencent.mm.plugin.offline.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;

final class WalletOfflineCoinPurseUI$9
  implements View.OnClickListener
{
  WalletOfflineCoinPurseUI$9(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, ImageView paramImageView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43513);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "click f2f lucky");
    h.pYm.e(14021, new Object[] { Integer.valueOf(4), Integer.valueOf(WalletOfflineCoinPurseUI.p(this.pav)) });
    d.H(this.pav.mController.ylL, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
    if (c.PK().b(ac.a.xTM, ac.a.xSL))
    {
      c.PK().c(ac.a.xTM, ac.a.xSL);
      this.paG.setVisibility(8);
      h.pYm.e(14396, new Object[] { Integer.valueOf(5) });
    }
    AppMethodBeat.o(43513);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.9
 * JD-Core Version:    0.6.2
 */