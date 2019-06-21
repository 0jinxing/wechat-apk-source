package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.f;
import com.tencent.mm.protocal.protobuf.pr;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class QrRewardSelectMoneyUI$5
  implements a.a
{
  QrRewardSelectMoneyUI$5(QrRewardSelectMoneyUI paramQrRewardSelectMoneyUI, f paramf)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41136);
    ab.d("MicroMsg.QrRewardSelectMoneyUI", "callback succ");
    QrRewardSelectMoneyUI.a(this.kEU, this.kEV.kDz.vWJ);
    QrRewardSelectMoneyUI.b(this.kEU, this.kEV.kDz.pPw);
    QrRewardSelectMoneyUI.a(this.kEU, this.kEV.kDz.vWv);
    QrRewardSelectMoneyUI.c(this.kEU, this.kEV.kDz.vWG);
    QrRewardSelectMoneyUI.d(this.kEU, this.kEV.kDz.desc);
    QrRewardSelectMoneyUI.e(this.kEU, this.kEV.kDz.vWO);
    QrRewardSelectMoneyUI.f(this.kEU, this.kEV.kDz.vWP);
    QrRewardSelectMoneyUI.g(this.kEU, this.kEV.kDz.vWM);
    QrRewardSelectMoneyUI.h(this.kEU, this.kEV.kDz.vWS);
    QrRewardSelectMoneyUI.a(this.kEU, this.kEV.kDz.vWt);
    if (QrRewardSelectMoneyUI.a(this.kEU) == null)
    {
      ab.i("MicroMsg.QrRewardSelectMoneyUI", "amt_list is null");
      QrRewardSelectMoneyUI.a(this.kEU, new LinkedList());
    }
    QrRewardSelectMoneyUI.b(this.kEU);
    AppMethodBeat.o(41136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI.5
 * JD-Core Version:    0.6.2
 */