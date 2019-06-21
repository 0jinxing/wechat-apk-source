package com.tencent.mm.plugin.recharge.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class RechargeUI$3
  implements DialogInterface.OnCancelListener
{
  RechargeUI$3(RechargeUI paramRechargeUI, m paramm)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(44309);
    g.RQ();
    g.RO().eJo.c(this.crb);
    AppMethodBeat.o(44309);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.3
 * JD-Core Version:    0.6.2
 */