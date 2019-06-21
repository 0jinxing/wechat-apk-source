package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.l;
import com.tencent.mm.plugin.emojicapture.api.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class LuckyMoneyNewYearSendUI$9
  implements n.d
{
  LuckyMoneyNewYearSendUI$9(LuckyMoneyNewYearSendUI paramLuckyMoneyNewYearSendUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(42817);
    ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(42817);
      while (true)
      {
        return;
        LuckyMoneyNewYearSendUI.l(this.ogn);
        c.h(this.ogn, null, 3);
        LuckyMoneyNewYearSendUI.m(this.ogn);
        LuckyMoneyNewYearSendUI.a(this.ogn, new l());
        LuckyMoneyNewYearSendUI.c(this.ogn).cVT = 9L;
        LuckyMoneyNewYearSendUI.c(this.ogn).ajK();
        AppMethodBeat.o(42817);
      }
      LuckyMoneyNewYearSendUI.n(this.ogn);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.9
 * JD-Core Version:    0.6.2
 */