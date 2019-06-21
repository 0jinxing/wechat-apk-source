package com.facebook.login.widget;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginButton$2 extends AccessTokenTracker
{
  LoginButton$2(LoginButton paramLoginButton)
  {
  }

  public void onCurrentAccessTokenChanged(AccessToken paramAccessToken1, AccessToken paramAccessToken2)
  {
    AppMethodBeat.i(92633);
    LoginButton.access$200(this.this$0);
    AppMethodBeat.o(92633);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.LoginButton.2
 * JD-Core Version:    0.6.2
 */