package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ListViewInScrollView;

final class RechargeUI$8
  implements View.OnClickListener
{
  RechargeUI$8(RechargeUI paramRechargeUI, View paramView1, TextView paramTextView1, int paramInt1, ListViewInScrollView paramListViewInScrollView1, View paramView2, TextView paramTextView2, int paramInt2, ListViewInScrollView paramListViewInScrollView2, TextView paramTextView3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44313);
    this.pIa.setVisibility(0);
    this.pIb.setTextColor(this.pHY);
    this.pId.setVisibility(0);
    this.pHW.setVisibility(8);
    this.pHX.setTextColor(this.pIc);
    this.pHZ.setVisibility(8);
    if (RechargeUI.g(this.pHV).getCount() == 0)
    {
      this.pIe.setVisibility(0);
      AppMethodBeat.o(44313);
    }
    while (true)
    {
      return;
      this.pIe.setVisibility(8);
      AppMethodBeat.o(44313);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.8
 * JD-Core Version:    0.6.2
 */