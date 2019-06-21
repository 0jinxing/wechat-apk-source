package com.facebook.login;

import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginFragment$1
  implements LoginClient.OnCompletedListener
{
  LoginFragment$1(LoginFragment paramLoginFragment)
  {
  }

  public void onCompleted(LoginClient.Result paramResult)
  {
    AppMethodBeat.i(96843);
    LoginFragment.access$000(this.this$0, paramResult);
    AppMethodBeat.o(96843);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginFragment.1
 * JD-Core Version:    0.6.2
 */