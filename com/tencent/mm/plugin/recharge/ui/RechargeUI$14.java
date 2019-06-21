package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RechargeUI$14
  implements View.OnClickListener
{
  RechargeUI$14(RechargeUI paramRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44320);
    if (((RechargeUI.f(this.pHV) != null) && (RechargeUI.f(this.pHV).getCount() > 0)) || ((RechargeUI.g(this.pHV) != null) && (RechargeUI.g(this.pHV).getCount() > 0)))
      this.pHV.showDialog(1);
    AppMethodBeat.o(44320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.14
 * JD-Core Version:    0.6.2
 */