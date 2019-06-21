package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.y;
import com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class LuckyMoneyDetailUI$13
  implements View.OnClickListener
{
  LuckyMoneyDetailUI$13(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42662);
    LuckyMoneyDetailUI.a(this.oeA, new y());
    if (bo.gW(paramView.getId(), 2131825476))
    {
      LuckyMoneyDetailUI.w(this.oeA).cVT = 1L;
      LuckyMoneyDetailUI.w(this.oeA).ajK();
    }
    if ((bo.gW(this.oeA.oeb.nXs, 0)) && (bo.C(paramView.getTag(), "nodelete")))
    {
      LuckyMoneyDetailUI.C(this.oeA);
      AppMethodBeat.o(42662);
    }
    while (true)
    {
      return;
      d locald = new d(this.oeA.mController.ylL, 1, false);
      locald.rBl = new LuckyMoneyDetailUI.13.1(this, paramView);
      locald.rBm = new LuckyMoneyDetailUI.13.2(this);
      LuckyMoneyDetailUI.w(this.oeA).cVT = 2L;
      LuckyMoneyDetailUI.w(this.oeA).ajK();
      locald.cpD();
      AppMethodBeat.o(42662);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.13
 * JD-Core Version:    0.6.2
 */