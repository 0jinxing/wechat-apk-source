package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$14
  implements a.a
{
  QrRewardMainUI$14(QrRewardMainUI paramQrRewardMainUI, b paramb)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41097);
    ab.e("MicroMsg.QrRewardMainUI", "net error: %s", new Object[] { paramm });
    if (!this.kEH.kDv)
      QrRewardMainUI.a(this.kEC, false);
    AppMethodBeat.o(41097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.14
 * JD-Core Version:    0.6.2
 */