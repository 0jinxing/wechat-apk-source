package com.tencent.mm.plugin.collect.reward.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class QrRewardSelectMoneyUI$6
  implements ao.b.a
{
  QrRewardSelectMoneyUI$6(QrRewardSelectMoneyUI paramQrRewardSelectMoneyUI, long paramLong)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(41137);
    if (paramBoolean)
    {
      ab.v("MicroMsg.QrRewardSelectMoneyUI", "getContact suc; cost=" + (bo.anU() - this.kEX) + " ms");
      b.U(paramString, 3);
      o.acv().pZ(paramString);
    }
    while (true)
    {
      a.b.a(QrRewardSelectMoneyUI.c(this.kEU), paramString, 0.03F, false);
      QrRewardSelectMoneyUI.d(this.kEU).setText(j.b(this.kEU.mController.ylL, e.mJ(paramString)));
      AppMethodBeat.o(41137);
      return;
      ab.w("MicroMsg.QrRewardSelectMoneyUI", "getContact failed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI.6
 * JD-Core Version:    0.6.2
 */