package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;

class SourceApplicationInfo
{
  private static final String CALL_APPLICATION_PACKAGE_KEY = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
  private static final String OPENED_BY_APP_LINK_KEY = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";
  private static final String SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT = "_fbSourceApplicationHasBeenSet";
  private String callingApplicationPackage;
  private boolean openedByAppLink;

  private SourceApplicationInfo(String paramString, boolean paramBoolean)
  {
    this.callingApplicationPackage = paramString;
    this.openedByAppLink = paramBoolean;
  }

  public static void clearSavedSourceApplicationInfoFromDisk()
  {
    AppMethodBeat.i(72226);
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
    localEditor.apply();
    AppMethodBeat.o(72226);
  }

  public static SourceApplicationInfo getStoredSourceApplicatioInfo()
  {
    SourceApplicationInfo localSourceApplicationInfo = null;
    AppMethodBeat.i(72225);
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
    if (!localSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage"))
      AppMethodBeat.o(72225);
    while (true)
    {
      return localSourceApplicationInfo;
      localSourceApplicationInfo = new SourceApplicationInfo(localSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), localSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
      AppMethodBeat.o(72225);
    }
  }

  public String getCallingApplicationPackage()
  {
    return this.callingApplicationPackage;
  }

  public boolean isOpenedByAppLink()
  {
    return this.openedByAppLink;
  }

  public String toString()
  {
    AppMethodBeat.i(72227);
    String str = "Unclassified";
    if (this.openedByAppLink)
      str = "Applink";
    if (this.callingApplicationPackage != null)
    {
      str = str + "(" + this.callingApplicationPackage + ")";
      AppMethodBeat.o(72227);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(72227);
    }
  }

  public void writeSourceApplicationInfoToDisk()
  {
    AppMethodBeat.i(72228);
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    localEditor.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.callingApplicationPackage);
    localEditor.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.openedByAppLink);
    localEditor.apply();
    AppMethodBeat.o(72228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.SourceApplicationInfo
 * JD-Core Version:    0.6.2
 */