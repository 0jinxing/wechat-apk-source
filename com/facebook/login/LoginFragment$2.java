package com.facebook.login;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginFragment$2
  implements LoginClient.BackgroundProcessingListener
{
  LoginFragment$2(LoginFragment paramLoginFragment, View paramView)
  {
  }

  public void onBackgroundProcessingStarted()
  {
    AppMethodBeat.i(96844);
    this.val$progressBar.setVisibility(0);
    AppMethodBeat.o(96844);
  }

  public void onBackgroundProcessingStopped()
  {
    AppMethodBeat.i(96845);
    this.val$progressBar.setVisibility(8);
    AppMethodBeat.o(96845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.login.LoginFragment.2
 * JD-Core Version:    0.6.2
 */