package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.MMEditText;

final class QrRewardMainUI$17
  implements a.a
{
  QrRewardMainUI$17(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41101);
    ab.e("MicroMsg.QrRewardMainUI", "net error: %s", new Object[] { paramm });
    QrRewardMainUI.a(this.kEC, (String)g.RP().Ry().get(ac.a.xTx, ""));
    QrRewardMainUI.c(this.kEC, QrRewardMainUI.l(this.kEC));
    QrRewardMainUI.m(this.kEC).setText("");
    QrRewardMainUI.j(this.kEC);
    AppMethodBeat.o(41101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.17
 * JD-Core Version:    0.6.2
 */