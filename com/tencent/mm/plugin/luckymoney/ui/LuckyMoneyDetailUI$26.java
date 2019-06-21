package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.q;

final class LuckyMoneyDetailUI$26
  implements Runnable
{
  LuckyMoneyDetailUI$26(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42676);
    if ((LuckyMoneyDetailUI.S(this.oeA).getVisibility() == 8) && (LuckyMoneyDetailUI.T(this.oeA).getVisibility() == 8) && (LuckyMoneyDetailUI.U(this.oeA).getVisibility() == 8))
    {
      LuckyMoneyDetailUI.V(this.oeA).removeFooterView(LuckyMoneyDetailUI.Q(this.oeA));
      AppMethodBeat.o(42676);
      return;
    }
    int i = a.ge(this.oeA.mController.ylL);
    int j = i - ak.hF(this.oeA) - f.de(this.oeA);
    int k = LuckyMoneyDetailUI.V(this.oeA).getMeasuredHeight();
    int m = a.fromDPToPix(this.oeA.mController.ylL, 29);
    int n = a.fromDPToPix(this.oeA.mController.ylL, 16);
    if (k < j)
      LuckyMoneyDetailUI.Q(this.oeA).setPadding(0, m + (j - LuckyMoneyDetailUI.V(this.oeA).getMeasuredHeight()), 0, n);
    while (true)
    {
      ab.d("MicroMsg.LuckyMoneyDetailUI", "winHeight:%s showHeight:%s recordHeight:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      AppMethodBeat.o(42676);
      break;
      LuckyMoneyDetailUI.Q(this.oeA).setPadding(0, m, 0, n);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.26
 * JD-Core Version:    0.6.2
 */