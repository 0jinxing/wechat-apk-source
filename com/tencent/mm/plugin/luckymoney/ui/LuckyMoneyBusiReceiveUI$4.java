package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.ad;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyBusiReceiveUI$4
  implements View.OnClickListener
{
  LuckyMoneyBusiReceiveUI$4(LuckyMoneyBusiReceiveUI paramLuckyMoneyBusiReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42619);
    h.pYm.e(11701, new Object[] { Integer.valueOf(10), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
    if (LuckyMoneyBusiReceiveUI.f(this.odj).isChecked())
      h.pYm.e(13050, new Object[] { Integer.valueOf(LuckyMoneyBusiReceiveUI.g(this.odj)), Integer.valueOf(2), LuckyMoneyBusiReceiveUI.h(this.odj).nYl });
    while (true)
    {
      LuckyMoneyBusiReceiveUI.i(this.odj);
      AppMethodBeat.o(42619);
      return;
      h.pYm.e(13050, new Object[] { Integer.valueOf(LuckyMoneyBusiReceiveUI.g(this.odj)), Integer.valueOf(2), "" });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.4
 * JD-Core Version:    0.6.2
 */