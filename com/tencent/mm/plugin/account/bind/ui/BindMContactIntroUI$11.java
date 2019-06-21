package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class BindMContactIntroUI$11
  implements DialogInterface.OnClickListener
{
  BindMContactIntroUI$11(BindMContactIntroUI paramBindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13425);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("kintent_hint", this.grt.getString(2131303325));
    paramDialogInterface.putExtra("from_unbind", true);
    d.b(this.grt, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", paramDialogInterface, 1);
    AppMethodBeat.o(13425);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.11
 * JD-Core Version:    0.6.2
 */