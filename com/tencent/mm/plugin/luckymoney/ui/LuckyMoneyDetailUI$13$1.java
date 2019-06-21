package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;

final class LuckyMoneyDetailUI$13$1
  implements n.c
{
  LuckyMoneyDetailUI$13$1(LuckyMoneyDetailUI.13 param13, View paramView)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(42660);
    String str = this.oeC.oeA.getString(2131301185);
    if (!bo.gW(this.oeC.oeA.oeb.nXs, 0))
      paraml.hi(1, 2131301147);
    while (true)
    {
      paraml.e(2, str);
      if (!bo.C(this.mqd.getTag(), "nodelete"))
        paraml.a(3, this.oeC.oeA.getResources().getColor(2131690250), this.oeC.oeA.mController.ylL.getString(2131301091));
      AppMethodBeat.o(42660);
      return;
      str = this.oeC.oeA.getString(2131301097);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.13.1
 * JD-Core Version:    0.6.2
 */