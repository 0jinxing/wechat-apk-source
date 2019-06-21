package com.facebook.login.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.login.LoginManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginButton$LoginClickListener$1
  implements DialogInterface.OnClickListener
{
  LoginButton$LoginClickListener$1(LoginButton.LoginClickListener paramLoginClickListener, LoginManager paramLoginManager)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(92638);
    this.val$loginManager.logOut();
    AppMethodBeat.o(92638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.LoginButton.LoginClickListener.1
 * JD-Core Version:    0.6.2
 */