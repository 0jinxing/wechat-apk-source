package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.c;
import com.tencent.mm.plugin.luckymoney.model.f;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyPrepareUI$6
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$6(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42947);
    ab.d("MicroMsg.LuckyMoneyPrepareUI", "click envelope layout");
    paramView = x.er(this.ohI.mController.ylL);
    f localf = f.bLp();
    localf.b(new c(""));
    localf.a(new LuckyMoneyPrepareUI.6.1(this, paramView));
    h.pYm.e(16822, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(42947);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.6
 * JD-Core Version:    0.6.2
 */