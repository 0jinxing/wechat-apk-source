package com.tencent.mm.plugin.collect.reward.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$13
  implements o.a
{
  QrRewardMainUI$13(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41096);
    ab.i("MicroMsg.QrRewardMainUI", "click set code, %s", new Object[] { Boolean.valueOf(QrRewardMainUI.c(this.kEC)) });
    QrRewardMainUI.a(this.kEC, false);
    AppMethodBeat.o(41096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.13
 * JD-Core Version:    0.6.2
 */