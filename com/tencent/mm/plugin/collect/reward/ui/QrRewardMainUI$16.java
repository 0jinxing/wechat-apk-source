package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.b;
import com.tencent.mm.protocal.protobuf.pe;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$16
  implements a.a
{
  QrRewardMainUI$16(QrRewardMainUI paramQrRewardMainUI, b paramb)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41100);
    QrRewardMainUI.a(this.kEC, this.kEH.kDu.jMS);
    QrRewardMainUI.a(this.kEC, this.kEH.kDu.vWw);
    QrRewardMainUI.b(this.kEC, this.kEH.kDu.vWs);
    QrRewardMainUI.b(this.kEC, this.kEH.kDu.desc);
    QrRewardMainUI.c(this.kEC, this.kEH.kDu.twd);
    paramm = this.kEC;
    boolean bool;
    if (!this.kEH.kDu.vWq)
    {
      bool = true;
      QrRewardMainUI.b(paramm, bool);
      QrRewardMainUI.d(this.kEC, this.kEH.kDu.kdE);
      QrRewardMainUI.e(this.kEC, this.kEH.kDu.vWu);
      QrRewardMainUI.e(this.kEC);
      QrRewardMainUI.f(this.kEC);
      if (QrRewardMainUI.g(this.kEC))
        break label242;
      QrRewardMainUI.h(this.kEC);
    }
    while (true)
    {
      QrRewardMainUI.f(this.kEC, this.kEH.kDu.pOy);
      QrRewardMainUI.bhe();
      ab.d("MicroMsg.QrRewardMainUI", "url: %s", new Object[] { QrRewardMainUI.k(this.kEC) });
      AppMethodBeat.o(41100);
      return;
      bool = false;
      break;
      label242: QrRewardMainUI.a(this.kEC, this.kEH.kDu.pOy, this.kEH.kDu.vWr);
      QrRewardMainUI.i(this.kEC);
      QrRewardMainUI.j(this.kEC);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.16
 * JD-Core Version:    0.6.2
 */