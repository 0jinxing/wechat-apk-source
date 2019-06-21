package com.tencent.mm.plugin.collect.reward.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.g;
import com.tencent.mm.protocal.protobuf.pv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class QrRewardSetMoneyUI$3
  implements a.a
{
  QrRewardSetMoneyUI$3(QrRewardSetMoneyUI paramQrRewardSetMoneyUI, g paramg)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41151);
    ab.e("MicroMsg.QrRewardSetMoneyUI", "set code error: %s, %s", new Object[] { Integer.valueOf(this.kFk.kDA.kCl), this.kFk.kDA.kCm });
    if (!bo.isNullOrNil(this.kFk.kDA.kCm))
    {
      Toast.makeText(this.kFj, this.kFk.kDA.kCm, 1).show();
      AppMethodBeat.o(41151);
    }
    while (true)
    {
      return;
      Toast.makeText(this.kFj, 2131302078, 1).show();
      AppMethodBeat.o(41151);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.3
 * JD-Core Version:    0.6.2
 */