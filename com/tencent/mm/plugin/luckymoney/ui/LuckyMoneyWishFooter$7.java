package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class LuckyMoneyWishFooter$7
  implements View.OnClickListener
{
  LuckyMoneyWishFooter$7(LuckyMoneyWishFooter paramLuckyMoneyWishFooter, LuckyMoneyWishFooter.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43054);
    this.oit.Qm(LuckyMoneyWishFooter.b(this.ois).getText().toString());
    LuckyMoneyWishFooter.b(this.ois).setText("");
    AppMethodBeat.o(43054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter.7
 * JD-Core Version:    0.6.2
 */