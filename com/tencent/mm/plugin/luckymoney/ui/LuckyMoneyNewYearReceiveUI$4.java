package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyNewYearReceiveUI$4
  implements View.OnClickListener
{
  LuckyMoneyNewYearReceiveUI$4(LuckyMoneyNewYearReceiveUI paramLuckyMoneyNewYearReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42787);
    this.ofE.finish();
    h.pYm.e(13079, new Object[] { Integer.valueOf(6), Integer.valueOf(2) });
    AppMethodBeat.o(42787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.4
 * JD-Core Version:    0.6.2
 */