package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyNewYearReceiveUI$3
  implements View.OnClickListener
{
  LuckyMoneyNewYearReceiveUI$3(LuckyMoneyNewYearReceiveUI paramLuckyMoneyNewYearReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42786);
    this.ofE.finish();
    h.pYm.e(13079, new Object[] { Integer.valueOf(6), Integer.valueOf(2) });
    AppMethodBeat.o(42786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.3
 * JD-Core Version:    0.6.2
 */