package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;

final class SettingsModifyEmailAddrUI$19
  implements DialogInterface.OnClickListener
{
  SettingsModifyEmailAddrUI$19(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127283);
    paramDialogInterface = new Intent(this.qnP, RegByMobileSetPwdUI.class);
    paramDialogInterface.putExtra("kintent_hint", this.qnP.getString(2131303325));
    paramDialogInterface.putExtra("from_unbind", true);
    this.qnP.startActivityForResult(paramDialogInterface, 1);
    AppMethodBeat.o(127283);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI.19
 * JD-Core Version:    0.6.2
 */