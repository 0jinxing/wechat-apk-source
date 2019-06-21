package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.d;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AccessTokenManager
{
  public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
  public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
  public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
  private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
  public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
  public static final String TAG = "AccessTokenManager";
  private static final String TOKEN_EXTEND_GRAPH_PATH = "oauth/access_token";
  private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
  private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
  private static volatile AccessTokenManager instance;
  private final AccessTokenCache accessTokenCache;
  private AccessToken currentAccessToken;
  private Date lastAttemptedTokenExtendDate;
  private final d localBroadcastManager;
  private AtomicBoolean tokenRefreshInProgress;

  AccessTokenManager(d paramd, AccessTokenCache paramAccessTokenCache)
  {
    AppMethodBeat.i(71554);
    this.tokenRefreshInProgress = new AtomicBoolean(false);
    this.lastAttemptedTokenExtendDate = new Date(0L);
    Validate.notNull(paramd, "localBroadcastManager");
    Validate.notNull(paramAccessTokenCache, "accessTokenCache");
    this.localBroadcastManager = paramd;
    this.accessTokenCache = paramAccessTokenCache;
    AppMethodBeat.o(71554);
  }

  private static GraphRequest createExtendAccessTokenRequest(AccessToken paramAccessToken, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71565);
    Bundle localBundle = new Bundle();
    localBundle.putString("grant_type", "fb_extend_sso_token");
    paramAccessToken = new GraphRequest(paramAccessToken, "oauth/access_token", localBundle, HttpMethod.GET, paramCallback);
    AppMethodBeat.o(71565);
    return paramAccessToken;
  }

  private static GraphRequest createGrantedPermissionsRequest(AccessToken paramAccessToken, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71564);
    paramAccessToken = new GraphRequest(paramAccessToken, "me/permissions", new Bundle(), HttpMethod.GET, paramCallback);
    AppMethodBeat.o(71564);
    return paramAccessToken;
  }

  static AccessTokenManager getInstance()
  {
    AppMethodBeat.i(71555);
    if (instance == null);
    try
    {
      if (instance == null)
      {
        d locald = d.S(FacebookSdk.getApplicationContext());
        AccessTokenCache localAccessTokenCache = new com/facebook/AccessTokenCache;
        localAccessTokenCache.<init>();
        localAccessTokenManager = new com/facebook/AccessTokenManager;
        localAccessTokenManager.<init>(locald, localAccessTokenCache);
        instance = localAccessTokenManager;
      }
      AccessTokenManager localAccessTokenManager = instance;
      AppMethodBeat.o(71555);
      return localAccessTokenManager;
    }
    finally
    {
      AppMethodBeat.o(71555);
    }
  }

  private void refreshCurrentAccessTokenImpl(AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback)
  {
    AppMethodBeat.i(71567);
    AccessToken localAccessToken = this.currentAccessToken;
    if (localAccessToken == null)
    {
      if (paramAccessTokenRefreshCallback != null)
        paramAccessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
      AppMethodBeat.o(71567);
    }
    while (true)
    {
      return;
      if (!this.tokenRefreshInProgress.compareAndSet(false, true))
      {
        if (paramAccessTokenRefreshCallback != null)
          paramAccessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
        AppMethodBeat.o(71567);
      }
      else
      {
        this.lastAttemptedTokenExtendDate = new Date();
        final HashSet localHashSet1 = new HashSet();
        final HashSet localHashSet2 = new HashSet();
        final AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
        AccessTokenManager.RefreshResult localRefreshResult = new AccessTokenManager.RefreshResult(null);
        GraphRequestBatch localGraphRequestBatch = new GraphRequestBatch(new GraphRequest[] { createGrantedPermissionsRequest(localAccessToken, new GraphRequest.Callback()
        {
          public void onCompleted(GraphResponse paramAnonymousGraphResponse)
          {
            AppMethodBeat.i(71551);
            paramAnonymousGraphResponse = paramAnonymousGraphResponse.getJSONObject();
            if (paramAnonymousGraphResponse == null)
              AppMethodBeat.o(71551);
            while (true)
            {
              return;
              JSONArray localJSONArray = paramAnonymousGraphResponse.optJSONArray("data");
              if (localJSONArray == null)
              {
                AppMethodBeat.o(71551);
              }
              else
              {
                localAtomicBoolean.set(true);
                int i = 0;
                if (i < localJSONArray.length())
                {
                  Object localObject = localJSONArray.optJSONObject(i);
                  if (localObject != null)
                  {
                    paramAnonymousGraphResponse = ((JSONObject)localObject).optString("permission");
                    localObject = ((JSONObject)localObject).optString("status");
                    if ((!Utility.isNullOrEmpty(paramAnonymousGraphResponse)) && (!Utility.isNullOrEmpty((String)localObject)))
                    {
                      localObject = ((String)localObject).toLowerCase(Locale.US);
                      if (!((String)localObject).equals("granted"))
                        break label138;
                      localHashSet1.add(paramAnonymousGraphResponse);
                    }
                  }
                  while (true)
                  {
                    i++;
                    break;
                    label138: if (((String)localObject).equals("declined"))
                      localHashSet2.add(paramAnonymousGraphResponse);
                  }
                }
                AppMethodBeat.o(71551);
              }
            }
          }
        }), createExtendAccessTokenRequest(localAccessToken, new AccessTokenManager.3(this, localRefreshResult)) });
        localGraphRequestBatch.addCallback(new AccessTokenManager.4(this, localAccessToken, paramAccessTokenRefreshCallback, localAtomicBoolean, localRefreshResult, localHashSet1, localHashSet2));
        localGraphRequestBatch.executeAsync();
        AppMethodBeat.o(71567);
      }
    }
  }

  private void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken paramAccessToken1, AccessToken paramAccessToken2)
  {
    AppMethodBeat.i(71560);
    Intent localIntent = new Intent(FacebookSdk.getApplicationContext(), CurrentAccessTokenExpirationBroadcastReceiver.class);
    localIntent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", paramAccessToken1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", paramAccessToken2);
    this.localBroadcastManager.c(localIntent);
    AppMethodBeat.o(71560);
  }

  private void setCurrentAccessToken(AccessToken paramAccessToken, boolean paramBoolean)
  {
    AppMethodBeat.i(71558);
    AccessToken localAccessToken = this.currentAccessToken;
    this.currentAccessToken = paramAccessToken;
    this.tokenRefreshInProgress.set(false);
    this.lastAttemptedTokenExtendDate = new Date(0L);
    if (paramBoolean)
    {
      if (paramAccessToken == null)
        break label75;
      this.accessTokenCache.save(paramAccessToken);
    }
    while (true)
    {
      if (!Utility.areObjectsEqual(localAccessToken, paramAccessToken))
      {
        sendCurrentAccessTokenChangedBroadcastIntent(localAccessToken, paramAccessToken);
        setTokenExpirationBroadcastAlarm();
      }
      AppMethodBeat.o(71558);
      return;
      label75: this.accessTokenCache.clear();
      Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
    }
  }

  private void setTokenExpirationBroadcastAlarm()
  {
    AppMethodBeat.i(71561);
    Context localContext = FacebookSdk.getApplicationContext();
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    AlarmManager localAlarmManager = (AlarmManager)localContext.getSystemService("alarm");
    if ((!AccessToken.isCurrentAccessTokenActive()) || (localAccessToken.getExpires() == null) || (localAlarmManager == null))
      AppMethodBeat.o(71561);
    while (true)
    {
      return;
      Object localObject = new Intent(localContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
      ((Intent)localObject).setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
      localObject = PendingIntent.getBroadcast(localContext, 0, (Intent)localObject, 0);
      localAlarmManager.set(1, localAccessToken.getExpires().getTime(), (PendingIntent)localObject);
      AppMethodBeat.o(71561);
    }
  }

  private boolean shouldExtendAccessToken()
  {
    boolean bool = false;
    AppMethodBeat.i(71563);
    if (this.currentAccessToken == null)
      AppMethodBeat.o(71563);
    while (true)
    {
      return bool;
      Long localLong = Long.valueOf(new Date().getTime());
      if ((this.currentAccessToken.getSource().canExtendToken()) && (localLong.longValue() - this.lastAttemptedTokenExtendDate.getTime() > 3600000L) && (localLong.longValue() - this.currentAccessToken.getLastRefresh().getTime() > 86400000L))
      {
        bool = true;
        AppMethodBeat.o(71563);
      }
      else
      {
        AppMethodBeat.o(71563);
      }
    }
  }

  final void currentAccessTokenChanged()
  {
    AppMethodBeat.i(71559);
    sendCurrentAccessTokenChangedBroadcastIntent(this.currentAccessToken, this.currentAccessToken);
    AppMethodBeat.o(71559);
  }

  final void extendAccessTokenIfNeeded()
  {
    AppMethodBeat.i(71562);
    if (!shouldExtendAccessToken())
      AppMethodBeat.o(71562);
    while (true)
    {
      return;
      refreshCurrentAccessToken(null);
      AppMethodBeat.o(71562);
    }
  }

  final AccessToken getCurrentAccessToken()
  {
    return this.currentAccessToken;
  }

  final boolean loadCurrentAccessToken()
  {
    boolean bool = false;
    AppMethodBeat.i(71556);
    AccessToken localAccessToken = this.accessTokenCache.load();
    if (localAccessToken != null)
    {
      setCurrentAccessToken(localAccessToken, false);
      bool = true;
      AppMethodBeat.o(71556);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(71556);
    }
  }

  final void refreshCurrentAccessToken(AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback)
  {
    AppMethodBeat.i(71566);
    if (Looper.getMainLooper().equals(Looper.myLooper()))
    {
      refreshCurrentAccessTokenImpl(paramAccessTokenRefreshCallback);
      AppMethodBeat.o(71566);
    }
    while (true)
    {
      return;
      new Handler(Looper.getMainLooper()).post(new AccessTokenManager.1(this, paramAccessTokenRefreshCallback));
      AppMethodBeat.o(71566);
    }
  }

  final void setCurrentAccessToken(AccessToken paramAccessToken)
  {
    AppMethodBeat.i(71557);
    setCurrentAccessToken(paramAccessToken, true);
    AppMethodBeat.o(71557);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.AccessTokenManager
 * JD-Core Version:    0.6.2
 */