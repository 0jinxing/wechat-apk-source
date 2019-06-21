package com.tencent.mm.plugin.luckymoney.ui;

import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.j;
import com.tencent.mm.ui.a.a;
import com.tencent.mm.ui.a.a.a;

final class LuckyMoneyPrepareUI$39
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$39(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, SpannableString paramSpannableString, j paramj1, j paramj2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42989);
    if (!a.a.dzk().dzj())
      AppMethodBeat.o(42989);
    while (true)
    {
      return;
      if (LuckyMoneyPrepareUI.f(this.ohI).getText().toString().equals(this.nTu.toString()))
      {
        this.ohS.onClick(paramView);
        AppMethodBeat.o(42989);
      }
      else
      {
        this.ohT.onClick(paramView);
        AppMethodBeat.o(42989);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.39
 * JD-Core Version:    0.6.2
 */