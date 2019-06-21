package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyPrepareUI$28
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$28(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42973);
    h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.g(this.ohI)), Integer.valueOf(9) });
    paramView = new Intent();
    paramView.setClass(this.ohI.mController.ylL, LuckyMoneyCanShareListUI.class);
    this.ohI.startActivity(paramView);
    AppMethodBeat.o(42973);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.28
 * JD-Core Version:    0.6.2
 */