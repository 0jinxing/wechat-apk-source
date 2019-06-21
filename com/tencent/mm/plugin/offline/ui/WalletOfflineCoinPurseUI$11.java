package com.tencent.mm.plugin.offline.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;

final class WalletOfflineCoinPurseUI$11
  implements View.OnClickListener
{
  WalletOfflineCoinPurseUI$11(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, ImageView paramImageView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43516);
    d.H(this.pav.mController.ylL, "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
    if (c.PK().b(ac.a.xTO, ac.a.xSL))
    {
      c.PK().c(ac.a.xTO, ac.a.xSL);
      this.paJ.setVisibility(8);
    }
    AppMethodBeat.o(43516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.11
 * JD-Core Version:    0.6.2
 */