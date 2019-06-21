package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

class AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory
{
  public LegacyTokenHelper create()
  {
    AppMethodBeat.i(71540);
    LegacyTokenHelper localLegacyTokenHelper = new LegacyTokenHelper(FacebookSdk.getApplicationContext());
    AppMethodBeat.o(71540);
    return localLegacyTokenHelper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.AccessTokenCache.SharedPreferencesTokenCachingStrategyFactory
 * JD-Core Version:    0.6.2
 */