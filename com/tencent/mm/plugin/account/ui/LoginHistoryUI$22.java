package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class LoginHistoryUI$22
  implements DialogInterface.OnClickListener
{
  LoginHistoryUI$22(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124929);
    ab.i("MicroMsg.LoginHistoryUI", "db dangerous and auto logout");
    LoginHistoryUI.a(this.gCv);
    AppMethodBeat.o(124929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.22
 * JD-Core Version:    0.6.2
 */