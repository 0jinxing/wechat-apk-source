package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.e;
import com.tencent.mm.protocal.protobuf.pp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class QrRewardGrantUI$7
  implements a.a
{
  QrRewardGrantUI$7(QrRewardGrantUI paramQrRewardGrantUI, e parame)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41069);
    QrRewardGrantUI.a(this.kEd, this.kEe.kDy.cBT);
    QrRewardGrantUI.b(this.kEd, this.kEe.kDy.vWI);
    QrRewardGrantUI.c(this.kEd, this.kEe.kDy.vFc);
    QrRewardGrantUI.d(this.kEd, this.kEe.kDy.vWG);
    QrRewardGrantUI.e(this.kEd, this.kEe.kDy.vWF);
    ab.i("MicroMsg.QrRewardGrantUI", "remind str: %s", new Object[] { this.kEe.kDy.vWR });
    if (!bo.isNullOrNil(this.kEe.kDy.vWR))
    {
      h.d(this.kEd.mController.ylL, this.kEe.kDy.vWR, "", this.kEd.getString(2131302383), this.kEd.getString(2131296868), new QrRewardGrantUI.7.1(this), new QrRewardGrantUI.7.2(this));
      AppMethodBeat.o(41069);
    }
    while (true)
    {
      return;
      QrRewardGrantUI.d(this.kEd);
      AppMethodBeat.o(41069);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.7
 * JD-Core Version:    0.6.2
 */