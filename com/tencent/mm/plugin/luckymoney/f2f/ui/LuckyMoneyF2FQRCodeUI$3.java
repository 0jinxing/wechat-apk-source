package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class LuckyMoneyF2FQRCodeUI$3
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyF2FQRCodeUI$3(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42172);
    LuckyMoneyF2FQRCodeUI.a(this.nVw, new d(this.nVw, 1, false));
    LuckyMoneyF2FQRCodeUI.y(this.nVw).rBl = LuckyMoneyF2FQRCodeUI.x(this.nVw);
    LuckyMoneyF2FQRCodeUI.y(this.nVw).rBm = LuckyMoneyF2FQRCodeUI.z(this.nVw);
    LuckyMoneyF2FQRCodeUI.y(this.nVw).cpD();
    AppMethodBeat.o(42172);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.3
 * JD-Core Version:    0.6.2
 */