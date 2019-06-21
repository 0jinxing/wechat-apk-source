package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RechargeUI$12
  implements View.OnClickListener
{
  RechargeUI$12(RechargeUI paramRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44318);
    if ((RechargeUI.b(this.pHV)) && (RechargeUI.c(this.pHV)))
      RechargeUI.d(this.pHV);
    AppMethodBeat.o(44318);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.12
 * JD-Core Version:    0.6.2
 */