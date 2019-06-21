package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ListViewInScrollView;

final class RechargeUI$7
  implements View.OnClickListener
{
  RechargeUI$7(RechargeUI paramRechargeUI, View paramView1, TextView paramTextView1, int paramInt1, ListViewInScrollView paramListViewInScrollView1, View paramView2, TextView paramTextView2, int paramInt2, ListViewInScrollView paramListViewInScrollView2, TextView paramTextView3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44312);
    this.pHW.setVisibility(0);
    this.pHX.setTextColor(this.pHY);
    this.pHZ.setVisibility(0);
    this.pIa.setVisibility(8);
    this.pIb.setTextColor(this.pIc);
    this.pId.setVisibility(8);
    if (RechargeUI.f(this.pHV).getCount() == 0)
    {
      this.pIe.setVisibility(0);
      AppMethodBeat.o(44312);
    }
    while (true)
    {
      return;
      this.pIe.setVisibility(8);
      AppMethodBeat.o(44312);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.7
 * JD-Core Version:    0.6.2
 */