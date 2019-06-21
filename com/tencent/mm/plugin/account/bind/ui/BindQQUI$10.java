package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class BindQQUI$10
  implements DialogInterface.OnClickListener
{
  BindQQUI$10(BindQQUI paramBindQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13553);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("kintent_hint", this.gsw.getString(2131303325));
    paramDialogInterface.putExtra("from_unbind", true);
    d.b(this.gsw, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", paramDialogInterface, 1);
    AppMethodBeat.o(13553);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindQQUI.10
 * JD-Core Version:    0.6.2
 */