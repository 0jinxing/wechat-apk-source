package com.facebook.login.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.login.LoginManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LoginButton$LoginClickListener
  implements View.OnClickListener
{
  protected LoginButton$LoginClickListener(LoginButton paramLoginButton)
  {
  }

  protected LoginManager getLoginManager()
  {
    AppMethodBeat.i(92642);
    LoginManager localLoginManager = LoginManager.getInstance();
    localLoginManager.setDefaultAudience(this.this$0.getDefaultAudience());
    localLoginManager.setLoginBehavior(this.this$0.getLoginBehavior());
    localLoginManager.setAuthType(this.this$0.getAuthType());
    AppMethodBeat.o(92642);
    return localLoginManager;
  }

  public void onClick(View paramView)
  {
    int i = 1;
    AppMethodBeat.i(92639);
    LoginButton.access$300(this.this$0, paramView);
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    Bundle localBundle;
    if (AccessToken.isCurrentAccessTokenActive())
    {
      performLogout(this.this$0.getContext());
      paramView = AppEventsLogger.newLogger(this.this$0.getContext());
      localBundle = new Bundle();
      if (localAccessToken == null)
        break label117;
      j = 0;
      label63: localBundle.putInt("logging_in", j);
      if (!AccessToken.isCurrentAccessTokenActive())
        break label123;
    }
    label117: label123: for (int j = i; ; j = 0)
    {
      localBundle.putInt("access_token_expired", j);
      paramView.logSdkEvent(LoginButton.access$400(this.this$0), null, localBundle);
      AppMethodBeat.o(92639);
      return;
      performLogin();
      break;
      j = 1;
      break label63;
    }
  }

  protected void performLogin()
  {
    AppMethodBeat.i(92640);
    LoginManager localLoginManager = getLoginManager();
    if (LoginAuthorizationType.PUBLISH.equals(LoginButton.LoginButtonProperties.access$600(LoginButton.access$500(this.this$0))))
      if (this.this$0.getFragment() != null)
      {
        localLoginManager.logInWithPublishPermissions(this.this$0.getFragment(), LoginButton.LoginButtonProperties.access$700(LoginButton.access$500(this.this$0)));
        AppMethodBeat.o(92640);
      }
    while (true)
    {
      return;
      if (this.this$0.getNativeFragment() != null)
      {
        localLoginManager.logInWithPublishPermissions(this.this$0.getNativeFragment(), LoginButton.LoginButtonProperties.access$700(LoginButton.access$500(this.this$0)));
        AppMethodBeat.o(92640);
      }
      else
      {
        localLoginManager.logInWithPublishPermissions(LoginButton.access$800(this.this$0), LoginButton.LoginButtonProperties.access$700(LoginButton.access$500(this.this$0)));
        AppMethodBeat.o(92640);
        continue;
        if (this.this$0.getFragment() != null)
        {
          localLoginManager.logInWithReadPermissions(this.this$0.getFragment(), LoginButton.LoginButtonProperties.access$700(LoginButton.access$500(this.this$0)));
          AppMethodBeat.o(92640);
        }
        else if (this.this$0.getNativeFragment() != null)
        {
          localLoginManager.logInWithReadPermissions(this.this$0.getNativeFragment(), LoginButton.LoginButtonProperties.access$700(LoginButton.access$500(this.this$0)));
          AppMethodBeat.o(92640);
        }
        else
        {
          localLoginManager.logInWithReadPermissions(LoginButton.access$900(this.this$0), LoginButton.LoginButtonProperties.access$700(LoginButton.access$500(this.this$0)));
          AppMethodBeat.o(92640);
        }
      }
    }
  }

  protected void performLogout(Context paramContext)
  {
    AppMethodBeat.i(92641);
    LoginManager localLoginManager = getLoginManager();
    Object localObject;
    if (LoginButton.access$1000(this.this$0))
    {
      String str1 = this.this$0.getResources().getString(2131296306);
      String str2 = this.this$0.getResources().getString(2131296302);
      localObject = Profile.getCurrentProfile();
      if ((localObject != null) && (((Profile)localObject).getName() != null))
      {
        localObject = String.format(this.this$0.getResources().getString(2131296308), new Object[] { ((Profile)localObject).getName() });
        paramContext = new AlertDialog.Builder(paramContext);
        paramContext.setMessage((CharSequence)localObject).setCancelable(true).setPositiveButton(str1, new LoginButton.LoginClickListener.1(this, localLoginManager)).setNegativeButton(str2, null);
        paramContext.create().show();
        AppMethodBeat.o(92641);
      }
    }
    while (true)
    {
      return;
      localObject = this.this$0.getResources().getString(2131296309);
      break;
      localLoginManager.logOut();
      AppMethodBeat.o(92641);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.LoginButton.LoginClickListener
 * JD-Core Version:    0.6.2
 */