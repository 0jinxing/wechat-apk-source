package com.tencent.mm.plugin.collect.reward.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.f;
import com.tencent.mm.protocal.protobuf.pr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class QrRewardSelectMoneyUI$4
  implements a.a
{
  QrRewardSelectMoneyUI$4(QrRewardSelectMoneyUI paramQrRewardSelectMoneyUI, f paramf)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41135);
    ab.e("MicroMsg.QrRewardSelectMoneyUI", "scan response error");
    if (!bo.isNullOrNil(this.kEV.kDz.kCm))
      Toast.makeText(this.kEU, this.kEV.kDz.kCm, 1).show();
    this.kEU.finish();
    AppMethodBeat.o(41135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI.4
 * JD-Core Version:    0.6.2
 */