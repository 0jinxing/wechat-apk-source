package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileSetPwdUI$1$2
  implements DialogInterface.OnClickListener
{
  RegByMobileSetPwdUI$1$2(RegByMobileSetPwdUI.1 param1, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125437);
    paramDialogInterface = new Intent(this.gGL.gGK, MobileVerifyUI.class);
    paramDialogInterface.putExtra("bindmcontact_mobile", this.grz);
    paramDialogInterface.putExtra("mobile_verify_purpose", 5);
    this.gGL.gGK.startActivityForResult(paramDialogInterface, 10001);
    AppMethodBeat.o(125437);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.1.2
 * JD-Core Version:    0.6.2
 */