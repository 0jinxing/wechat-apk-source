package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.protocal.protobuf.bnn;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class HoneyPayReceiveCardUI$9
  implements o.a
{
  HoneyPayReceiveCardUI$9(HoneyPayReceiveCardUI paramHoneyPayReceiveCardUI, bnn parambnn)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41941);
    if (!bo.isNullOrNil(this.nte.wNs))
      e.n(this.ntc.mController.ylL, this.nte.wNs, false);
    h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    AppMethodBeat.o(41941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI.9
 * JD-Core Version:    0.6.2
 */