package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.y;
import com.tencent.mm.plugin.emojicapture.api.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class LuckyMoneyDetailUI$13$2
  implements n.d
{
  LuckyMoneyDetailUI$13$2(LuckyMoneyDetailUI.13 param13)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(42661);
    ab.i("MicroMsg.LuckyMoneyDetailUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(42661);
      while (true)
      {
        return;
        c.h(this.oeC.oeA, null, 5);
        LuckyMoneyDetailUI.a(this.oeC.oeA, new y());
        LuckyMoneyDetailUI.w(this.oeC.oeA).cVT = 4L;
        LuckyMoneyDetailUI.w(this.oeC.oeA).ajK();
        LuckyMoneyDetailUI.D(this.oeC.oeA);
        AppMethodBeat.o(42661);
        continue;
        LuckyMoneyDetailUI.C(this.oeC.oeA);
        AppMethodBeat.o(42661);
      }
      LuckyMoneyDetailUI.a(this.oeC.oeA, null);
      LuckyMoneyDetailUI.a(this.oeC.oeA, new y());
      LuckyMoneyDetailUI.w(this.oeC.oeA).cVT = 8L;
      LuckyMoneyDetailUI.w(this.oeC.oeA).ajK();
      LuckyMoneyDetailUI.b(this.oeC.oeA, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.13.2
 * JD-Core Version:    0.6.2
 */