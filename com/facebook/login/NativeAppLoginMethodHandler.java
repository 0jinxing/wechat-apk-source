package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import java.util.Collection;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler
{
  NativeAppLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }

  NativeAppLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }

  private String getError(Bundle paramBundle)
  {
    String str1 = paramBundle.getString("error");
    String str2 = str1;
    if (str1 == null)
      str2 = paramBundle.getString("error_type");
    return str2;
  }

  private String getErrorMessage(Bundle paramBundle)
  {
    String str1 = paramBundle.getString("error_message");
    String str2 = str1;
    if (str1 == null)
      str2 = paramBundle.getString("error_description");
    return str2;
  }

  private LoginClient.Result handleResultCancel(LoginClient.Request paramRequest, Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    String str = getError(localBundle);
    if (localBundle.get("error_code") != null)
    {
      paramIntent = localBundle.get("error_code").toString();
      if (!"CONNECTION_FAILURE".equals(paramIntent))
        break label60;
    }
    label60: for (paramRequest = LoginClient.Result.createErrorResult(paramRequest, str, getErrorMessage(localBundle), paramIntent); ; paramRequest = LoginClient.Result.createCancelResult(paramRequest, str))
    {
      return paramRequest;
      paramIntent = null;
      break;
    }
  }

  private LoginClient.Result handleResultOk(LoginClient.Request paramRequest, Intent paramIntent)
  {
    Object localObject = null;
    paramIntent = paramIntent.getExtras();
    String str1 = getError(paramIntent);
    String str2;
    String str3;
    if (paramIntent.get("error_code") != null)
    {
      str2 = paramIntent.get("error_code").toString();
      str3 = getErrorMessage(paramIntent);
      String str4 = paramIntent.getString("e2e");
      if (!Utility.isNullOrEmpty(str4))
        logWebLoginCompleted(str4);
      if ((str1 != null) || (str2 != null) || (str3 != null))
        break label120;
    }
    while (true)
    {
      try
      {
        paramIntent = LoginClient.Result.createTokenResult(paramRequest, createAccessTokenFromWebBundle(paramRequest.getPermissions(), paramIntent, AccessTokenSource.FACEBOOK_APPLICATION_WEB, paramRequest.getApplicationId()));
        return paramIntent;
        str2 = null;
      }
      catch (FacebookException paramIntent)
      {
        paramIntent = LoginClient.Result.createErrorResult(paramRequest, null, paramIntent.getMessage());
        continue;
      }
      label120: paramIntent = localObject;
      if (!ServerProtocol.errorsProxyAuthDisabled.contains(str1))
        if (ServerProtocol.errorsUserCanceled.contains(str1))
          paramIntent = LoginClient.Result.createCancelResult(paramRequest, null);
        else
          paramIntent = LoginClient.Result.createErrorResult(paramRequest, str1, str3, str2);
    }
  }

  boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    LoginClient.Request localRequest = this.loginClient.getPendingRequest();
    if (paramIntent == null)
    {
      paramIntent = LoginClient.Result.createCancelResult(localRequest, "Operation canceled");
      if (paramIntent == null)
        break label78;
      this.loginClient.completeAndValidate(paramIntent);
    }
    while (true)
    {
      return true;
      if (paramInt2 == 0)
      {
        paramIntent = handleResultCancel(localRequest, paramIntent);
        break;
      }
      if (paramInt2 != -1)
      {
        paramIntent = LoginClient.Result.createErrorResult(localRequest, "Unexpected resultCode from authorization.", null);
        break;
      }
      paramIntent = handleResultOk(localRequest, paramIntent);
      break;
      label78: this.loginClient.tryNextHandler();
    }
  }

  abstract boolean tryAuthorize(LoginClient.Request paramRequest);

  protected boolean tryIntent(Intent paramIntent, int paramInt)
  {
    boolean bool = false;
    if (paramIntent == null);
    while (true)
    {
      return bool;
      try
      {
        this.loginClient.getFragment().startActivityForResult(paramIntent, paramInt);
        bool = true;
      }
      catch (ActivityNotFoundException paramIntent)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.login.NativeAppLoginMethodHandler
 * JD-Core Version:    0.6.2
 */