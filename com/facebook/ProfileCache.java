package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

final class ProfileCache
{
  static final String CACHED_PROFILE_KEY = "com.facebook.ProfileManager.CachedProfile";
  static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
  private final SharedPreferences sharedPreferences;

  ProfileCache()
  {
    AppMethodBeat.i(71821);
    this.sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
    AppMethodBeat.o(71821);
  }

  final void clear()
  {
    AppMethodBeat.i(71824);
    this.sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    AppMethodBeat.o(71824);
  }

  final Profile load()
  {
    AppMethodBeat.i(71822);
    Object localObject1 = this.sharedPreferences.getString("com.facebook.ProfileManager.CachedProfile", null);
    if (localObject1 != null);
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>((String)localObject1);
        localObject1 = new com/facebook/Profile;
        ((Profile)localObject1).<init>(localJSONObject);
        AppMethodBeat.o(71822);
        return localObject1;
      }
      catch (JSONException localJSONException)
      {
      }
      AppMethodBeat.o(71822);
      Object localObject2 = null;
    }
  }

  final void save(Profile paramProfile)
  {
    AppMethodBeat.i(71823);
    Validate.notNull(paramProfile, "profile");
    paramProfile = paramProfile.toJSONObject();
    if (paramProfile != null)
      this.sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", paramProfile.toString()).apply();
    AppMethodBeat.o(71823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.ProfileCache
 * JD-Core Version:    0.6.2
 */