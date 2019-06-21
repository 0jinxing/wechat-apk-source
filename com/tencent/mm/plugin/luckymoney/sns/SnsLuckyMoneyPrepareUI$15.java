package com.tencent.mm.plugin.luckymoney.sns;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.j.a;
import com.tencent.mm.wallet_core.ui.e;

final class SnsLuckyMoneyPrepareUI$15
  implements j.a
{
  SnsLuckyMoneyPrepareUI$15(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI, SpannableString paramSpannableString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42524);
    int i = this.obN.nTd.getInput();
    double d = this.obN.obC.getInput();
    SnsLuckyMoneyPrepareUI.a(this.obN, 1);
    this.obN.obC.setType(SnsLuckyMoneyPrepareUI.a(this.obN));
    this.obN.obC.setTitle(this.obN.getString(2131301211));
    this.obN.obC.setShowGroupIcon(true);
    if ((d > 0.0D) && (i > 0))
      this.obN.obC.setAmount(e.F(d * i));
    this.obN.obC.setMaxAmount(SnsLuckyMoneyPrepareUI.b(this.obN).nRR);
    SnsLuckyMoneyPrepareUI.c(this.obN).setText(this.nTu);
    h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(this.obN)), Integer.valueOf(2) });
    AppMethodBeat.o(42524);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.15
 * JD-Core Version:    0.6.2
 */