package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Validate
{
  private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
  private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
  private static final String CUSTOM_TAB_REDIRECT_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is declared incorrectly in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
  private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
  private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
  private static final String TAG;

  static
  {
    AppMethodBeat.i(72593);
    TAG = Validate.class.getName();
    AppMethodBeat.o(72593);
  }

  public static void checkCustomTabRedirectActivity(Context paramContext)
  {
    AppMethodBeat.i(72589);
    checkCustomTabRedirectActivity(paramContext, true);
    AppMethodBeat.o(72589);
  }

  public static void checkCustomTabRedirectActivity(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(72590);
    if ((!hasCustomTabRedirectActivity(paramContext)) && (paramBoolean))
    {
      paramContext = new IllegalStateException("FacebookActivity is declared incorrectly in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
      AppMethodBeat.o(72590);
      throw paramContext;
    }
    AppMethodBeat.o(72590);
  }

  public static void containsNoNullOrEmpty(Collection<String> paramCollection, String paramString)
  {
    AppMethodBeat.i(72572);
    notNull(paramCollection, paramString);
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (String)localIterator.next();
      if (paramCollection == null)
      {
        paramCollection = new NullPointerException("Container '" + paramString + "' cannot contain null values");
        AppMethodBeat.o(72572);
        throw paramCollection;
      }
      if (paramCollection.length() == 0)
      {
        paramCollection = new IllegalArgumentException("Container '" + paramString + "' cannot contain empty values");
        AppMethodBeat.o(72572);
        throw paramCollection;
      }
    }
    AppMethodBeat.o(72572);
  }

  public static <T> void containsNoNulls(Collection<T> paramCollection, String paramString)
  {
    AppMethodBeat.i(72571);
    notNull(paramCollection, paramString);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
      if (paramCollection.next() == null)
      {
        paramCollection = new NullPointerException("Container '" + paramString + "' cannot contain null values");
        AppMethodBeat.o(72571);
        throw paramCollection;
      }
    AppMethodBeat.o(72571);
  }

  public static String hasAppID()
  {
    AppMethodBeat.i(72578);
    Object localObject = FacebookSdk.getApplicationId();
    if (localObject == null)
    {
      localObject = new IllegalStateException("No App ID found, please set the App ID.");
      AppMethodBeat.o(72578);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(72578);
    return localObject;
  }

  public static boolean hasBluetoothPermission(Context paramContext)
  {
    AppMethodBeat.i(72585);
    boolean bool;
    if ((hasPermission(paramContext, "android.permission.BLUETOOTH")) && (hasPermission(paramContext, "android.permission.BLUETOOTH_ADMIN")))
    {
      bool = true;
      AppMethodBeat.o(72585);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72585);
    }
  }

  public static boolean hasChangeWifiStatePermission(Context paramContext)
  {
    AppMethodBeat.i(72583);
    boolean bool = hasPermission(paramContext, "android.permission.CHANGE_WIFI_STATE");
    AppMethodBeat.o(72583);
    return bool;
  }

  public static String hasClientToken()
  {
    AppMethodBeat.i(72579);
    Object localObject = FacebookSdk.getClientToken();
    if (localObject == null)
    {
      localObject = new IllegalStateException("No Client Token found, please set the Client Token.");
      AppMethodBeat.o(72579);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(72579);
    return localObject;
  }

  public static void hasContentProvider(Context paramContext)
  {
    AppMethodBeat.i(72592);
    notNull(paramContext, "context");
    String str = hasAppID();
    paramContext = paramContext.getPackageManager();
    if (paramContext != null)
    {
      str = "com.facebook.app.FacebookContentProvider".concat(String.valueOf(str));
      if (paramContext.resolveContentProvider(str, 0) == null)
      {
        paramContext = new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[] { str }));
        AppMethodBeat.o(72592);
        throw paramContext;
      }
    }
    AppMethodBeat.o(72592);
  }

  public static boolean hasCustomTabRedirectActivity(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(72591);
    notNull(paramContext, "context");
    Object localObject1 = paramContext.getPackageManager();
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject2 = new Intent();
      ((Intent)localObject2).setAction("android.intent.action.VIEW");
      ((Intent)localObject2).addCategory("android.intent.category.DEFAULT");
      ((Intent)localObject2).addCategory("android.intent.category.BROWSABLE");
      ((Intent)localObject2).setData(Uri.parse("fb" + FacebookSdk.getApplicationId() + "://authorize"));
      localObject2 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, 64);
    }
    boolean bool2;
    if (localObject2 != null)
    {
      localObject2 = ((List)localObject2).iterator();
      bool2 = false;
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = ((ResolveInfo)((Iterator)localObject2).next()).activityInfo;
        if ((((ActivityInfo)localObject1).name.equals("com.facebook.CustomTabActivity")) && (((ActivityInfo)localObject1).packageName.equals(paramContext.getPackageName())))
        {
          bool2 = true;
        }
        else
        {
          AppMethodBeat.o(72591);
          bool2 = bool1;
        }
      }
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      AppMethodBeat.o(72591);
    }
  }

  public static void hasFacebookActivity(Context paramContext)
  {
    AppMethodBeat.i(72587);
    hasFacebookActivity(paramContext, true);
    AppMethodBeat.o(72587);
  }

  public static void hasFacebookActivity(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(72588);
    notNull(paramContext, "context");
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localPackageManager != null)
      paramContext = new ComponentName(paramContext, "com.facebook.FacebookActivity");
    try
    {
      localObject2 = localPackageManager.getActivityInfo(paramContext, 1);
      if ((localObject2 == null) && (paramBoolean))
      {
        paramContext = new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        AppMethodBeat.o(72588);
        throw paramContext;
      }
      AppMethodBeat.o(72588);
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
        localObject2 = localObject1;
    }
  }

  public static void hasInternetPermissions(Context paramContext)
  {
    AppMethodBeat.i(72580);
    hasInternetPermissions(paramContext, true);
    AppMethodBeat.o(72580);
  }

  public static void hasInternetPermissions(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(72581);
    notNull(paramContext, "context");
    if ((paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) && (paramBoolean))
    {
      paramContext = new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
      AppMethodBeat.o(72581);
      throw paramContext;
    }
    AppMethodBeat.o(72581);
  }

  public static boolean hasLocationPermission(Context paramContext)
  {
    AppMethodBeat.i(72584);
    boolean bool;
    if ((hasPermission(paramContext, "android.permission.ACCESS_COARSE_LOCATION")) || (hasPermission(paramContext, "android.permission.ACCESS_FINE_LOCATION")))
    {
      bool = true;
      AppMethodBeat.o(72584);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72584);
    }
  }

  public static boolean hasPermission(Context paramContext, String paramString)
  {
    AppMethodBeat.i(72586);
    boolean bool;
    if (paramContext.checkCallingOrSelfPermission(paramString) == 0)
    {
      bool = true;
      AppMethodBeat.o(72586);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72586);
    }
  }

  public static boolean hasWiFiPermission(Context paramContext)
  {
    AppMethodBeat.i(72582);
    boolean bool = hasPermission(paramContext, "android.permission.ACCESS_WIFI_STATE");
    AppMethodBeat.o(72582);
    return bool;
  }

  public static <T> void notEmpty(Collection<T> paramCollection, String paramString)
  {
    AppMethodBeat.i(72570);
    if (paramCollection.isEmpty())
    {
      paramCollection = new IllegalArgumentException("Container '" + paramString + "' cannot be empty");
      AppMethodBeat.o(72570);
      throw paramCollection;
    }
    AppMethodBeat.o(72570);
  }

  public static <T> void notEmptyAndContainsNoNulls(Collection<T> paramCollection, String paramString)
  {
    AppMethodBeat.i(72573);
    containsNoNulls(paramCollection, paramString);
    notEmpty(paramCollection, paramString);
    AppMethodBeat.o(72573);
  }

  public static void notNull(Object paramObject, String paramString)
  {
    AppMethodBeat.i(72569);
    if (paramObject == null)
    {
      paramObject = new NullPointerException("Argument '" + paramString + "' cannot be null");
      AppMethodBeat.o(72569);
      throw paramObject;
    }
    AppMethodBeat.o(72569);
  }

  public static void notNullOrEmpty(String paramString1, String paramString2)
  {
    AppMethodBeat.i(72575);
    if (Utility.isNullOrEmpty(paramString1))
    {
      paramString1 = new IllegalArgumentException("Argument '" + paramString2 + "' cannot be null or empty");
      AppMethodBeat.o(72575);
      throw paramString1;
    }
    AppMethodBeat.o(72575);
  }

  public static void oneOf(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72576);
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramArrayOfObject[j];
      if (localObject != null)
      {
        if (localObject.equals(paramObject))
          AppMethodBeat.o(72576);
      }
      else
        while (true)
        {
          return;
          if (paramObject != null)
            break;
          AppMethodBeat.o(72576);
        }
    }
    paramObject = new IllegalArgumentException("Argument '" + paramString + "' was not one of the allowed values");
    AppMethodBeat.o(72576);
    throw paramObject;
  }

  public static void runningOnUiThread()
  {
    AppMethodBeat.i(72574);
    if (!Looper.getMainLooper().equals(Looper.myLooper()))
    {
      FacebookException localFacebookException = new FacebookException("This method should be called from the UI thread");
      AppMethodBeat.o(72574);
      throw localFacebookException;
    }
    AppMethodBeat.o(72574);
  }

  public static void sdkInitialized()
  {
    AppMethodBeat.i(72577);
    if (!FacebookSdk.isInitialized())
    {
      FacebookSdkNotInitializedException localFacebookSdkNotInitializedException = new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
      AppMethodBeat.o(72577);
      throw localFacebookSdkNotInitializedException;
    }
    AppMethodBeat.o(72577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Validate
 * JD-Core Version:    0.6.2
 */