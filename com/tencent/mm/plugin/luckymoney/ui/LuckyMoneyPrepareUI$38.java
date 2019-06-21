package com.tencent.mm.plugin.luckymoney.ui;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.j.a;
import com.tencent.mm.wallet_core.ui.e;

final class LuckyMoneyPrepareUI$38
  implements j.a
{
  LuckyMoneyPrepareUI$38(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, SpannableString paramSpannableString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42988);
    int i = LuckyMoneyPrepareUI.b(this.ohI).getInput();
    double d = LuckyMoneyPrepareUI.c(this.ohI).getInput();
    LuckyMoneyPrepareUI.a(this.ohI, 1);
    LuckyMoneyPrepareUI.c(this.ohI).setType(LuckyMoneyPrepareUI.d(this.ohI));
    LuckyMoneyPrepareUI.c(this.ohI).setMaxAmount(LuckyMoneyPrepareUI.e(this.ohI).nRR);
    LuckyMoneyPrepareUI.c(this.ohI).setTitle(this.ohI.getString(2131301211));
    LuckyMoneyPrepareUI.c(this.ohI).setShowGroupIcon(true);
    if ((d > 0.0D) && (i > 0))
      LuckyMoneyPrepareUI.c(this.ohI).setAmount(e.F(d * i));
    LuckyMoneyPrepareUI.f(this.ohI).setText(this.nTu);
    h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.g(this.ohI)), Integer.valueOf(2) });
    AppMethodBeat.o(42988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.38
 * JD-Core Version:    0.6.2
 */