package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.MMEditText;

final class QrRewardMainUI$3
  implements a.a
{
  QrRewardMainUI$3(QrRewardMainUI paramQrRewardMainUI, h paramh)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41085);
    ab.i("MicroMsg.QrRewardMainUI", "set succ: %s, %s", new Object[] { this.kED.jMS, QrRewardMainUI.m(this.kEC).getText() });
    if (this.kED.jMS.equals(QrRewardMainUI.n(this.kEC)))
    {
      g.RP().Ry().set(ac.a.xTx, QrRewardMainUI.n(this.kEC));
      QrRewardMainUI.j(this.kEC);
    }
    AppMethodBeat.o(41085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.3
 * JD-Core Version:    0.6.2
 */