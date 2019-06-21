package com.tencent.mm.plugin.mall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.a;

final class MallIndexBaseUI$3
  implements h.d
{
  MallIndexBaseUI$3(MallIndexBaseUI paramMallIndexBaseUI)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43168);
    switch (paramInt2)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(43168);
      while (true)
      {
        return;
        com.tencent.mm.plugin.report.service.h.pYm.e(11458, new Object[] { Integer.valueOf(2) });
        if (r.YM())
        {
          a.b(this.omG.mController.ylL, "PayURemittanceProcess", null);
          AppMethodBeat.o(43168);
        }
        else
        {
          a.b(this.omG.mController.ylL, "RemittanceProcess", null);
          AppMethodBeat.o(43168);
        }
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(11458, new Object[] { Integer.valueOf(3) });
      com.tencent.mm.pluginsdk.wallet.h.ai(this.omG, 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexBaseUI.3
 * JD-Core Version:    0.6.2
 */