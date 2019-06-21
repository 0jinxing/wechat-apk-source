package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyBusiDetailUI$5
  implements View.OnClickListener
{
  LuckyMoneyBusiDetailUI$5(LuckyMoneyBusiDetailUI paramLuckyMoneyBusiDetailUI, k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42587);
    h.pYm.e(11701, new Object[] { Integer.valueOf(LuckyMoneyBusiDetailUI.xX(this.ocT.nXi)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
    x.a(this.ocR, 1, false);
    AppMethodBeat.o(42587);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.5
 * JD-Core Version:    0.6.2
 */