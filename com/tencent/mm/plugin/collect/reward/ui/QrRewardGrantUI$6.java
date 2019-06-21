package com.tencent.mm.plugin.collect.reward.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.e;
import com.tencent.mm.protocal.protobuf.pp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class QrRewardGrantUI$6
  implements a.a
{
  QrRewardGrantUI$6(QrRewardGrantUI paramQrRewardGrantUI, e parame)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41067);
    ab.e("MicroMsg.QrRewardGrantUI", "place order error: %s, %s", new Object[] { Integer.valueOf(this.kEe.kDy.kCl), this.kEe.kDy.kCm });
    if (!bo.isNullOrNil(this.kEe.kDy.kCm))
      Toast.makeText(this.kEd, this.kEe.kDy.kCm, 0).show();
    AppMethodBeat.o(41067);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.6
 * JD-Core Version:    0.6.2
 */