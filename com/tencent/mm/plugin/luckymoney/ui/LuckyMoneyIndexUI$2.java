package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyIndexUI$2
  implements View.OnClickListener
{
  LuckyMoneyIndexUI$2(LuckyMoneyIndexUI paramLuckyMoneyIndexUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42722);
    h.pYm.e(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
    LuckyMoneyIndexUI.a(this.oeJ, 0);
    AppMethodBeat.o(42722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.2
 * JD-Core Version:    0.6.2
 */