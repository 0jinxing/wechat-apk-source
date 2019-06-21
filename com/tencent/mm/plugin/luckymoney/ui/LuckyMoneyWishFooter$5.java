package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;

final class LuckyMoneyWishFooter$5
  implements View.OnTouchListener
{
  LuckyMoneyWishFooter$5(LuckyMoneyWishFooter paramLuckyMoneyWishFooter)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(43051);
    LuckyMoneyWishFooter.e(this.ois);
    LuckyMoneyWishFooter.a(this.ois).setVisibility(8);
    LuckyMoneyWishFooter.a(this.ois).onPause();
    LuckyMoneyWishFooter.d(this.ois).setImageResource(2130838298);
    if (LuckyMoneyWishFooter.g(this.ois) != null)
      LuckyMoneyWishFooter.g(this.ois);
    LuckyMoneyWishFooter.a(this.ois, 0);
    AppMethodBeat.o(43051);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter.5
 * JD-Core Version:    0.6.2
 */