package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;

final class LuckyMoneyF2FQRCodeUI$9
  implements n.d
{
  LuckyMoneyF2FQRCodeUI$9(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(42183);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(42183);
      while (true)
      {
        return;
        if (LuckyMoneyF2FQRCodeUI.g(this.nVw) <= 0)
          break;
        LuckyMoneyF2FQRCodeUI.h(this.nVw);
        AppMethodBeat.o(42183);
      }
      h.bQ(this.nVw, this.nVw.getString(2131301099));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.9
 * JD-Core Version:    0.6.2
 */