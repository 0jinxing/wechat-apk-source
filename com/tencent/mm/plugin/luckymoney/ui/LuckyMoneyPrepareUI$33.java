package com.tencent.mm.plugin.luckymoney.ui;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.j.a;
import com.tencent.mm.wallet_core.ui.e;

final class LuckyMoneyPrepareUI$33
  implements j.a
{
  LuckyMoneyPrepareUI$33(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, SpannableString paramSpannableString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42980);
    int i = LuckyMoneyPrepareUI.b(this.ohI).getInput();
    double d = LuckyMoneyPrepareUI.c(this.ohI).getInput();
    LuckyMoneyPrepareUI.a(this.ohI, 0);
    LuckyMoneyPrepareUI.c(this.ohI).setType(LuckyMoneyPrepareUI.d(this.ohI));
    LuckyMoneyPrepareUI.c(this.ohI).setShowGroupIcon(false);
    LuckyMoneyPrepareUI.c(this.ohI).setTitle(this.ohI.getString(2131301212));
    if ((d > 0.0D) && (i > 0))
      LuckyMoneyPrepareUI.c(this.ohI).setAmount(e.F(d / i));
    LuckyMoneyPrepareUI.c(this.ohI).setMaxAmount(LuckyMoneyPrepareUI.e(this.ohI).nRP);
    LuckyMoneyPrepareUI.f(this.ohI).setText(this.nTt);
    h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.g(this.ohI)), Integer.valueOf(3) });
    AppMethodBeat.o(42980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.33
 * JD-Core Version:    0.6.2
 */