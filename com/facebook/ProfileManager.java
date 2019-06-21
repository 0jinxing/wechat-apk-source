package com.facebook;

import android.content.Intent;
import android.support.v4.content.d;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ProfileManager
{
  public static final String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
  public static final String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";
  public static final String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
  private static volatile ProfileManager instance;
  private Profile currentProfile;
  private final d localBroadcastManager;
  private final ProfileCache profileCache;

  ProfileManager(d paramd, ProfileCache paramProfileCache)
  {
    AppMethodBeat.i(71825);
    Validate.notNull(paramd, "localBroadcastManager");
    Validate.notNull(paramProfileCache, "profileCache");
    this.localBroadcastManager = paramd;
    this.profileCache = paramProfileCache;
    AppMethodBeat.o(71825);
  }

  static ProfileManager getInstance()
  {
    AppMethodBeat.i(71826);
    if (instance == null);
    try
    {
      if (instance == null)
      {
        localObject1 = d.S(FacebookSdk.getApplicationContext());
        ProfileManager localProfileManager = new com/facebook/ProfileManager;
        ProfileCache localProfileCache = new com/facebook/ProfileCache;
        localProfileCache.<init>();
        localProfileManager.<init>((d)localObject1, localProfileCache);
        instance = localProfileManager;
      }
      Object localObject1 = instance;
      AppMethodBeat.o(71826);
      return localObject1;
    }
    finally
    {
      AppMethodBeat.o(71826);
    }
  }

  private void sendCurrentProfileChangedBroadcast(Profile paramProfile1, Profile paramProfile2)
  {
    AppMethodBeat.i(71830);
    Intent localIntent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", paramProfile1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", paramProfile2);
    this.localBroadcastManager.c(localIntent);
    AppMethodBeat.o(71830);
  }

  private void setCurrentProfile(Profile paramProfile, boolean paramBoolean)
  {
    AppMethodBeat.i(71829);
    Profile localProfile = this.currentProfile;
    this.currentProfile = paramProfile;
    if (paramBoolean)
    {
      if (paramProfile == null)
        break label51;
      this.profileCache.save(paramProfile);
    }
    while (true)
    {
      if (!Utility.areObjectsEqual(localProfile, paramProfile))
        sendCurrentProfileChangedBroadcast(localProfile, paramProfile);
      AppMethodBeat.o(71829);
      return;
      label51: this.profileCache.clear();
    }
  }

  final Profile getCurrentProfile()
  {
    return this.currentProfile;
  }

  final boolean loadCurrentProfile()
  {
    boolean bool = false;
    AppMethodBeat.i(71827);
    Profile localProfile = this.profileCache.load();
    if (localProfile != null)
    {
      setCurrentProfile(localProfile, false);
      bool = true;
      AppMethodBeat.o(71827);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(71827);
    }
  }

  final void setCurrentProfile(Profile paramProfile)
  {
    AppMethodBeat.i(71828);
    setCurrentProfile(paramProfile, true);
    AppMethodBeat.o(71828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.ProfileManager
 * JD-Core Version:    0.6.2
 */