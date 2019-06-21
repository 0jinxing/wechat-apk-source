package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.s;

final class QrRewardSetMoneyUI$1 extends s
{
  QrRewardSetMoneyUI$1(QrRewardSetMoneyUI paramQrRewardSetMoneyUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(41149);
    if (!QrRewardSetMoneyUI.a(this.kFj))
      QrRewardSetMoneyUI.b(this.kFj);
    while (true)
    {
      h.pYm.e(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
      AppMethodBeat.o(41149);
      return;
      ab.i("MicroMsg.QrRewardSetMoneyUI", "amt error!");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.1
 * JD-Core Version:    0.6.2
 */