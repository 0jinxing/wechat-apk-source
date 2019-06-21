package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyDetailUI$24
  implements View.OnClickListener
{
  LuckyMoneyDetailUI$24(LuckyMoneyDetailUI paramLuckyMoneyDetailUI, k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42674);
    h.pYm.e(11701, new Object[] { Integer.valueOf(LuckyMoneyDetailUI.ya(this.ocT.nXi)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
    x.a(this.oeA, 1, false);
    AppMethodBeat.o(42674);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.24
 * JD-Core Version:    0.6.2
 */