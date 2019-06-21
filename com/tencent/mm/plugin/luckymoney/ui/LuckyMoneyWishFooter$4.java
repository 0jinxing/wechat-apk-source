package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyWishFooter$4
  implements View.OnClickListener
{
  LuckyMoneyWishFooter$4(LuckyMoneyWishFooter paramLuckyMoneyWishFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43050);
    ab.i("MicroMsg.SnsCommentFooter", "state onClick" + LuckyMoneyWishFooter.c(this.ois));
    if (LuckyMoneyWishFooter.c(this.ois) == 0)
    {
      this.ois.setModeClick(true);
      LuckyMoneyWishFooter.d(this.ois).setImageResource(2131231459);
      LuckyMoneyWishFooter.a(this.ois, 1);
      LuckyMoneyWishFooter.e(this.ois);
    }
    while (true)
    {
      LuckyMoneyWishFooter.f(this.ois);
      AppMethodBeat.o(43050);
      return;
      this.ois.setModeClick(false);
      LuckyMoneyWishFooter.e(this.ois);
      LuckyMoneyWishFooter.d(this.ois).setImageResource(2131231459);
      LuckyMoneyWishFooter.a(this.ois, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter.4
 * JD-Core Version:    0.6.2
 */