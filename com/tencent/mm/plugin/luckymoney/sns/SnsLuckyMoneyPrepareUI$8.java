package com.tencent.mm.plugin.luckymoney.sns;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;

final class SnsLuckyMoneyPrepareUI$8
  implements View.OnClickListener
{
  SnsLuckyMoneyPrepareUI$8(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42515);
    h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(this.obN)), Integer.valueOf(6) });
    x.a(this.obN, SnsLuckyMoneyPrepareUI.a(this.obN), SnsLuckyMoneyPrepareUI.m(this.obN), false);
    SnsLuckyMoneyPrepareUI.l(this.obN).postDelayed(new SnsLuckyMoneyPrepareUI.8.1(this), 100L);
    AppMethodBeat.o(42515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.8
 * JD-Core Version:    0.6.2
 */