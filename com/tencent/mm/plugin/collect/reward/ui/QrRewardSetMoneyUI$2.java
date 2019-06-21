package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardSetMoneyUI$2
  implements a.a
{
  QrRewardSetMoneyUI$2(QrRewardSetMoneyUI paramQrRewardSetMoneyUI)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41150);
    ab.e("MicroMsg.QrRewardSetMoneyUI", "net error: %s", new Object[] { paramm });
    AppMethodBeat.o(41150);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.2
 * JD-Core Version:    0.6.2
 */