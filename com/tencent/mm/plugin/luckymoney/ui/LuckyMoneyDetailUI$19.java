package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyDetailUI$19
  implements Runnable
{
  LuckyMoneyDetailUI$19(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42668);
    int i = BackwardSupportUtil.b.b(this.oeA.mController.ylL, 526.0F) + LuckyMoneyDetailUI.L(this.oeA);
    ab.d("MicroMsg.LuckyMoneyDetailUI", "header height: %s", new Object[] { Integer.valueOf(i) });
    ViewGroup.LayoutParams localLayoutParams = LuckyMoneyDetailUI.M(this.oeA).getLayoutParams();
    localLayoutParams.height = i;
    LuckyMoneyDetailUI.M(this.oeA).setLayoutParams(localLayoutParams);
    AppMethodBeat.o(42668);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.19
 * JD-Core Version:    0.6.2
 */