package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyPrepareUI$31
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$31(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42978);
    h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.g(this.ohI)), Integer.valueOf(6) });
    x.a(this.ohI, LuckyMoneyPrepareUI.d(this.ohI), LuckyMoneyPrepareUI.D(this.ohI), true);
    LuckyMoneyPrepareUI.E(this.ohI).postDelayed(new LuckyMoneyPrepareUI.31.1(this), 100L);
    AppMethodBeat.o(42978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.31
 * JD-Core Version:    0.6.2
 */