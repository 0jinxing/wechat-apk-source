package com.tencent.mm.plugin.recharge.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PhoneRechargeUI$9
  implements DialogInterface.OnClickListener
{
  PhoneRechargeUI$9(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44260);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(44260);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.9
 * JD-Core Version:    0.6.2
 */