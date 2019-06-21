package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

class AccessTokenCache
{
  static final String CACHED_ACCESS_TOKEN_KEY = "com.facebook.AccessTokenManager.CachedAccessToken";
  private final SharedPreferences sharedPreferences;
  private LegacyTokenHelper tokenCachingStrategy;
  private final AccessTokenCache.SharedPreferencesTokenCachingStrategyFactory tokenCachingStrategyFactory;

  public AccessTokenCache()
  {
    this(FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new AccessTokenCache.SharedPreferencesTokenCachingStrategyFactory());
    AppMethodBeat.i(71541);
    AppMethodBeat.o(71541);
  }

  AccessTokenCache(SharedPreferences paramSharedPreferences, AccessTokenCache.SharedPreferencesTokenCachingStrategyFactory paramSharedPreferencesTokenCachingStrategyFactory)
  {
    this.sharedPreferences = paramSharedPreferences;
    this.tokenCachingStrategyFactory = paramSharedPreferencesTokenCachingStrategyFactory;
  }

  private AccessToken getCachedAccessToken()
  {
    Object localObject1 = null;
    AppMethodBeat.i(71546);
    String str = this.sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
    if (str != null);
    while (true)
    {
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(str);
        localObject2 = AccessToken.createFromJSONObject((JSONObject)localObject2);
        localObject1 = localObject2;
        AppMethodBeat.o(71546);
        return localObject1;
      }
      catch (JSONException localJSONException)
      {
        AppMethodBeat.o(71546);
        continue;
      }
      AppMethodBeat.o(71546);
    }
  }

  private AccessToken getLegacyAccessToken()
  {
    AppMethodBeat.i(71548);
    Object localObject1 = null;
    Bundle localBundle = getTokenCachingStrategy().load();
    Object localObject2 = localObject1;
    if (localBundle != null)
    {
      localObject2 = localObject1;
      if (LegacyTokenHelper.hasTokenInformation(localBundle))
        localObject2 = AccessToken.createFromLegacyCache(localBundle);
    }
    AppMethodBeat.o(71548);
    return localObject2;
  }

  private LegacyTokenHelper getTokenCachingStrategy()
  {
    AppMethodBeat.i(71549);
    if (this.tokenCachingStrategy == null);
    try
    {
      if (this.tokenCachingStrategy == null)
        this.tokenCachingStrategy = this.tokenCachingStrategyFactory.create();
      LegacyTokenHelper localLegacyTokenHelper = this.tokenCachingStrategy;
      AppMethodBeat.o(71549);
      return localLegacyTokenHelper;
    }
    finally
    {
      AppMethodBeat.o(71549);
    }
  }

  private boolean hasCachedAccessToken()
  {
    AppMethodBeat.i(71545);
    boolean bool = this.sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    AppMethodBeat.o(71545);
    return bool;
  }

  private boolean shouldCheckLegacyToken()
  {
    AppMethodBeat.i(71547);
    boolean bool = FacebookSdk.isLegacyTokenUpgradeSupported();
    AppMethodBeat.o(71547);
    return bool;
  }

  public void clear()
  {
    AppMethodBeat.i(71544);
    this.sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
    if (shouldCheckLegacyToken())
      getTokenCachingStrategy().clear();
    AppMethodBeat.o(71544);
  }

  public AccessToken load()
  {
    AppMethodBeat.i(71542);
    Object localObject = null;
    if (hasCachedAccessToken())
      localObject = getCachedAccessToken();
    while (true)
    {
      AppMethodBeat.o(71542);
      return localObject;
      if (shouldCheckLegacyToken())
      {
        AccessToken localAccessToken = getLegacyAccessToken();
        localObject = localAccessToken;
        if (localAccessToken != null)
        {
          save(localAccessToken);
          getTokenCachingStrategy().clear();
          localObject = localAccessToken;
        }
      }
    }
  }

  public void save(AccessToken paramAccessToken)
  {
    AppMethodBeat.i(71543);
    Validate.notNull(paramAccessToken, "accessToken");
    try
    {
      paramAccessToken = paramAccessToken.toJSONObject();
      this.sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", paramAccessToken.toString()).apply();
      AppMethodBeat.o(71543);
      return;
    }
    catch (JSONException paramAccessToken)
    {
      while (true)
        AppMethodBeat.o(71543);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.AccessTokenCache
 * JD-Core Version:    0.6.2
 */