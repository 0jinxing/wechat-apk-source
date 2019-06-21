package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.aa;
import com.tencent.mm.plugin.luckymoney.model.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.d;

final class LuckyMoneyPrepareUI$26
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$26(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, ag paramag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42971);
    LuckyMoneyPrepareUI.a(this.ohI, new aa());
    LuckyMoneyPrepareUI.h(this.ohI).cVT = 2L;
    LuckyMoneyPrepareUI.h(this.ohI).ajK();
    boolean bool = bo.C(paramView.getTag(), "delete");
    if ((!bool) && (!bo.gW(this.obO.nYN, 1)))
    {
      LuckyMoneyPrepareUI.b(this.ohI, 2);
      LuckyMoneyPrepareUI.y(this.ohI);
      AppMethodBeat.o(42971);
    }
    while (true)
    {
      return;
      paramView = new d(this.ohI.mController.ylL, 1, false);
      paramView.rBl = new LuckyMoneyPrepareUI.26.1(this, bool);
      paramView.rBm = new LuckyMoneyPrepareUI.26.2(this);
      paramView.cpD();
      AppMethodBeat.o(42971);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.26
 * JD-Core Version:    0.6.2
 */