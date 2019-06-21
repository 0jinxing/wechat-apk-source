package com.facebook.login.widget;

import android.app.Activity;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LoginButton$1
  implements Runnable
{
  LoginButton$1(LoginButton paramLoginButton, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(92632);
    FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.queryAppSettings(this.val$appId, false);
    LoginButton.access$100(this.this$0).runOnUiThread(new LoginButton.1.1(this, localFetchedAppSettings));
    AppMethodBeat.o(92632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.LoginButton.1
 * JD-Core Version:    0.6.2
 */