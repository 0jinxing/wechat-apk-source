package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.Utility;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler
{
  private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
  private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
  private String e2e;

  WebLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }

  WebLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }

  private static final String getRedirectUri()
  {
    return "fb" + FacebookSdk.getApplicationId() + "://authorize";
  }

  private String loadCookieToken()
  {
    return this.loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
  }

  private void saveCookieToken(String paramString)
  {
    this.loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", paramString).apply();
  }

  protected Bundle addExtraParameters(Bundle paramBundle, LoginClient.Request paramRequest)
  {
    paramBundle.putString("redirect_uri", getRedirectUri());
    paramBundle.putString("client_id", paramRequest.getApplicationId());
    paramBundle.putString("e2e", LoginClient.getE2E());
    paramBundle.putString("response_type", "token,signed_request");
    paramBundle.putString("return_scopes", "true");
    paramBundle.putString("auth_type", paramRequest.getAuthType());
    if (getSSODevice() != null)
      paramBundle.putString("sso", getSSODevice());
    return paramBundle;
  }

  protected Bundle getParameters(LoginClient.Request paramRequest)
  {
    Bundle localBundle = new Bundle();
    if (!Utility.isNullOrEmpty(paramRequest.getPermissions()))
    {
      String str = TextUtils.join(",", paramRequest.getPermissions());
      localBundle.putString("scope", str);
      addLoggingExtra("scope", str);
    }
    localBundle.putString("default_audience", paramRequest.getDefaultAudience().getNativeProtocolAudience());
    localBundle.putString("state", getClientState(paramRequest.getAuthId()));
    paramRequest = AccessToken.getCurrentAccessToken();
    if (paramRequest != null)
    {
      paramRequest = paramRequest.getToken();
      if ((paramRequest == null) || (!paramRequest.equals(loadCookieToken())))
        break label119;
      localBundle.putString("access_token", paramRequest);
      addLoggingExtra("access_token", "1");
    }
    while (true)
    {
      return localBundle;
      paramRequest = null;
      break;
      label119: Utility.clearFacebookCookies(this.loginClient.getActivity());
      addLoggingExtra("access_token", "0");
    }
  }

  protected String getSSODevice()
  {
    return null;
  }

  abstract AccessTokenSource getTokenSource();

  protected void onComplete(LoginClient.Request paramRequest, Bundle paramBundle, FacebookException paramFacebookException)
  {
    this.e2e = null;
    if (paramBundle != null)
      if (paramBundle.containsKey("e2e"))
        this.e2e = paramBundle.getString("e2e");
    while (true)
    {
      try
      {
        paramBundle = createAccessTokenFromWebBundle(paramRequest.getPermissions(), paramBundle, getTokenSource(), paramRequest.getApplicationId());
        paramRequest = LoginClient.Result.createTokenResult(this.loginClient.getPendingRequest(), paramBundle);
        CookieSyncManager.createInstance(this.loginClient.getActivity()).sync();
        saveCookieToken(paramBundle.getToken());
        if (!Utility.isNullOrEmpty(this.e2e))
          logWebLoginCompleted(this.e2e);
        this.loginClient.completeAndValidate(paramRequest);
        return;
      }
      catch (FacebookException paramRequest)
      {
        paramRequest = LoginClient.Result.createErrorResult(this.loginClient.getPendingRequest(), null, paramRequest.getMessage());
        continue;
      }
      if (!(paramFacebookException instanceof FacebookOperationCanceledException))
        break;
      paramRequest = LoginClient.Result.createCancelResult(this.loginClient.getPendingRequest(), "User canceled log in.");
    }
    this.e2e = null;
    paramRequest = paramFacebookException.getMessage();
    if ((paramFacebookException instanceof FacebookServiceException))
    {
      paramRequest = ((FacebookServiceException)paramFacebookException).getRequestError();
      paramBundle = String.format(Locale.ROOT, "%d", new Object[] { Integer.valueOf(paramRequest.getErrorCode()) });
      paramRequest = paramRequest.toString();
    }
    while (true)
    {
      paramRequest = LoginClient.Result.createErrorResult(this.loginClient.getPendingRequest(), null, paramRequest, paramBundle);
      break;
      paramBundle = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.login.WebLoginMethodHandler
 * JD-Core Version:    0.6.2
 */