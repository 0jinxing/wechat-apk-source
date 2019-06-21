package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.ac;
import com.tencent.mm.plugin.luckymoney.model.e;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.bo;

final class LuckyMoneyBusiReceiveUI$7
  implements View.OnClickListener
{
  LuckyMoneyBusiReceiveUI$7(LuckyMoneyBusiReceiveUI paramLuckyMoneyBusiReceiveUI, ac paramac)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42624);
    LuckyMoneyBusiReceiveUI.k(this.odj).setVisibility(4);
    LuckyMoneyBusiReceiveUI.l(this.odj).setVisibility(8);
    LuckyMoneyBusiReceiveUI.m(this.odj).setVisibility(8);
    if ((this.odl.nXd != null) && (!bo.isNullOrNil(this.odl.nXd.nWz)));
    for (paramView = this.odl.nXd.nWz; ; paramView = this.odj.getString(2131301199))
    {
      LuckyMoneyBusiReceiveUI.n(this.odj).setText(paramView);
      LuckyMoneyBusiReceiveUI.o(this.odj).setText(this.odl.nYg);
      LuckyMoneyBusiReceiveUI.p(this.odj).setVisibility(0);
      LuckyMoneyBusiReceiveUI.n(this.odj).setOnClickListener(new LuckyMoneyBusiReceiveUI.7.1(this));
      x.a(LuckyMoneyBusiReceiveUI.k(this.odj), new LuckyMoneyBusiReceiveUI.7.2(this));
      AppMethodBeat.o(42624);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.7
 * JD-Core Version:    0.6.2
 */