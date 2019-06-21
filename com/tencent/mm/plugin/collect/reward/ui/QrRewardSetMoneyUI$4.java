package com.tencent.mm.plugin.collect.reward.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.g;
import com.tencent.mm.protocal.protobuf.pv;

final class QrRewardSetMoneyUI$4
  implements a.a
{
  QrRewardSetMoneyUI$4(QrRewardSetMoneyUI paramQrRewardSetMoneyUI, g paramg)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41152);
    QrRewardSetMoneyUI.a(this.kFj, this.kFk.kDA.pOy);
    QrRewardSetMoneyUI.b(this.kFj, this.kFk.kDA.desc);
    paramm = new Intent();
    paramm.putExtra("key_desc", this.kFk.kDA.desc);
    paramm.putExtra("key_photo_url", this.kFk.kDA.pOy);
    paramm.putExtra("key_photo_aeskey", this.kFk.kDA.vWr);
    paramm.putExtra("key_photo_width", this.kFk.kDA.vWw);
    paramm.putExtra("key_icon_width", this.kFk.kDA.vWs);
    paramm.putExtra("key_return_from_first", QrRewardSetMoneyUI.c(this.kFj));
    this.kFj.setResult(-1, paramm);
    this.kFj.finish();
    AppMethodBeat.o(41152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.4
 * JD-Core Version:    0.6.2
 */