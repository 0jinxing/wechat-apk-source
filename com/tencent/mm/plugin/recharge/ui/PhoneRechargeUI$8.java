package com.tencent.mm.plugin.recharge.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class PhoneRechargeUI$8
  implements DialogInterface.OnClickListener
{
  PhoneRechargeUI$8(PhoneRechargeUI paramPhoneRechargeUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44259);
    paramDialogInterface = PhoneRechargeUI.b(this.pHs, this.val$url);
    ab.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramDialogInterface });
    PhoneRechargeUI.c(this.pHs, paramDialogInterface);
    AppMethodBeat.o(44259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.8
 * JD-Core Version:    0.6.2
 */