package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyBusiDetailUI$6
  implements View.OnClickListener
{
  LuckyMoneyBusiDetailUI$6(LuckyMoneyBusiDetailUI paramLuckyMoneyBusiDetailUI, k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42588);
    h.pYm.e(11701, new Object[] { Integer.valueOf(LuckyMoneyBusiDetailUI.xX(this.ocT.nXi)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
    paramView = new Intent();
    paramView.setClass(this.ocR.mController.ylL, LuckyMoneyMyRecordUI.class);
    paramView.putExtra("key_type", 2);
    this.ocR.startActivity(paramView);
    AppMethodBeat.o(42588);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.6
 * JD-Core Version:    0.6.2
 */