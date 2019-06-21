package com.tencent.mm.plugin.offline.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;

final class WalletOfflineCoinPurseUI$25
  implements View.OnClickListener
{
  WalletOfflineCoinPurseUI$25(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43532);
    a.f(this.pav, WalletOfflineCoinPurseUI.c(this.pav));
    this.pav.finish();
    AppMethodBeat.o(43532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.25
 * JD-Core Version:    0.6.2
 */