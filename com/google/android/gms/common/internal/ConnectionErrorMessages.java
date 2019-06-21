package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.f.m;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.concurrent.GuardedBy;

public final class ConnectionErrorMessages
{

  @GuardedBy("sCache")
  private static final m<String, String> zzse;

  static
  {
    AppMethodBeat.i(61333);
    zzse = new m();
    AppMethodBeat.o(61333);
  }

  public static String getAppName(Context paramContext)
  {
    AppMethodBeat.i(61329);
    String str1 = paramContext.getPackageName();
    try
    {
      String str2 = Wrappers.packageManager(paramContext).getApplicationLabel(str1).toString();
      paramContext = str2;
      AppMethodBeat.o(61329);
      return paramContext;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
      {
        paramContext = paramContext.getApplicationInfo().name;
        if (TextUtils.isEmpty(paramContext))
        {
          AppMethodBeat.o(61329);
          paramContext = str1;
        }
        else
        {
          AppMethodBeat.o(61329);
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label34: break label34;
    }
  }

  public static String getDefaultNotificationChannelName(Context paramContext)
  {
    AppMethodBeat.i(61332);
    paramContext = paramContext.getResources().getString(2131296280);
    AppMethodBeat.o(61332);
    return paramContext;
  }

  public static String getErrorDialogButtonMessage(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(61328);
    paramContext = paramContext.getResources();
    switch (paramInt)
    {
    default:
      paramContext = paramContext.getString(17039370);
      AppMethodBeat.o(61328);
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131296277);
      AppMethodBeat.o(61328);
      continue;
      paramContext = paramContext.getString(2131296274);
      AppMethodBeat.o(61328);
      continue;
      paramContext = paramContext.getString(2131296284);
      AppMethodBeat.o(61328);
    }
  }

  public static String getErrorMessage(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(61326);
    Resources localResources = paramContext.getResources();
    String str = getAppName(paramContext);
    switch (paramInt)
    {
    case 4:
    case 6:
    case 8:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 19:
    default:
      paramContext = localResources.getString(2131296282, new Object[] { str });
      AppMethodBeat.o(61326);
    case 1:
    case 3:
    case 18:
    case 2:
    case 9:
    case 7:
    case 5:
    case 16:
    case 17:
    case 20:
    }
    while (true)
    {
      return paramContext;
      paramContext = localResources.getString(2131296278, new Object[] { str });
      AppMethodBeat.o(61326);
      continue;
      paramContext = localResources.getString(2131296275, new Object[] { str });
      AppMethodBeat.o(61326);
      continue;
      paramContext = localResources.getString(2131296287, new Object[] { str });
      AppMethodBeat.o(61326);
      continue;
      if (DeviceProperties.isWearableWithoutPlayStore(paramContext))
      {
        paramContext = localResources.getString(2131296288);
        AppMethodBeat.o(61326);
      }
      else
      {
        paramContext = localResources.getString(2131296285, new Object[] { str });
        AppMethodBeat.o(61326);
        continue;
        paramContext = localResources.getString(2131296283, new Object[] { str });
        AppMethodBeat.o(61326);
        continue;
        paramContext = zza(paramContext, "common_google_play_services_network_error_text", str);
        AppMethodBeat.o(61326);
        continue;
        paramContext = zza(paramContext, "common_google_play_services_invalid_account_text", str);
        AppMethodBeat.o(61326);
        continue;
        paramContext = zza(paramContext, "common_google_play_services_api_unavailable_text", str);
        AppMethodBeat.o(61326);
        continue;
        paramContext = zza(paramContext, "common_google_play_services_sign_in_failed_text", str);
        AppMethodBeat.o(61326);
        continue;
        paramContext = zza(paramContext, "common_google_play_services_restricted_profile_text", str);
        AppMethodBeat.o(61326);
      }
    }
  }

  public static String getErrorNotificationMessage(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(61327);
    if (paramInt == 6)
    {
      paramContext = zza(paramContext, "common_google_play_services_resolution_required_text", getAppName(paramContext));
      AppMethodBeat.o(61327);
    }
    while (true)
    {
      return paramContext;
      paramContext = getErrorMessage(paramContext, paramInt);
      AppMethodBeat.o(61327);
    }
  }

  public static String getErrorNotificationTitle(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(61325);
    if (paramInt == 6);
    for (String str1 = zzb(paramContext, "common_google_play_services_resolution_required_title"); ; str1 = getErrorTitle(paramContext, paramInt))
    {
      String str2 = str1;
      if (str1 == null)
        str2 = paramContext.getResources().getString(2131296281);
      AppMethodBeat.o(61325);
      return str2;
    }
  }

  public static String getErrorTitle(Context paramContext, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(61324);
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    case 12:
    case 13:
    case 14:
    case 15:
    case 19:
    default:
      new StringBuilder(33).append("Unexpected error code ").append(paramInt);
      AppMethodBeat.o(61324);
      paramContext = localObject;
    case 4:
    case 6:
    case 18:
    case 1:
    case 3:
    case 2:
    case 9:
    case 7:
    case 8:
    case 10:
    case 5:
    case 11:
    case 16:
    case 17:
    case 20:
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(61324);
      paramContext = localObject;
      continue;
      paramContext = localResources.getString(2131296279);
      AppMethodBeat.o(61324);
      continue;
      paramContext = localResources.getString(2131296276);
      AppMethodBeat.o(61324);
      continue;
      paramContext = localResources.getString(2131296286);
      AppMethodBeat.o(61324);
      continue;
      AppMethodBeat.o(61324);
      paramContext = localObject;
      continue;
      paramContext = zzb(paramContext, "common_google_play_services_network_error_title");
      AppMethodBeat.o(61324);
      continue;
      AppMethodBeat.o(61324);
      paramContext = localObject;
      continue;
      AppMethodBeat.o(61324);
      paramContext = localObject;
      continue;
      paramContext = zzb(paramContext, "common_google_play_services_invalid_account_title");
      AppMethodBeat.o(61324);
      continue;
      AppMethodBeat.o(61324);
      paramContext = localObject;
      continue;
      AppMethodBeat.o(61324);
      paramContext = localObject;
      continue;
      paramContext = zzb(paramContext, "common_google_play_services_sign_in_failed_title");
      AppMethodBeat.o(61324);
      continue;
      paramContext = zzb(paramContext, "common_google_play_services_restricted_profile_title");
      AppMethodBeat.o(61324);
    }
  }

  private static String zza(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(61330);
    Resources localResources = paramContext.getResources();
    paramString1 = zzb(paramContext, paramString1);
    paramContext = paramString1;
    if (paramString1 == null)
      paramContext = localResources.getString(2131296282);
    paramContext = String.format(localResources.getConfiguration().locale, paramContext, new Object[] { paramString2 });
    AppMethodBeat.o(61330);
    return paramContext;
  }

  private static String zzb(Context paramContext, String paramString)
  {
    AppMethodBeat.i(61331);
    while (true)
    {
      int i;
      synchronized (zzse)
      {
        String str = (String)zzse.get(paramString);
        if (str != null)
        {
          AppMethodBeat.o(61331);
          paramContext = str;
          return paramContext;
        }
        paramContext = GooglePlayServicesUtil.getRemoteResource(paramContext);
        if (paramContext == null)
        {
          AppMethodBeat.o(61331);
          paramContext = null;
          continue;
        }
        i = paramContext.getIdentifier(paramString, "string", "com.google.android.gms");
        if (i == 0)
        {
          paramContext = String.valueOf(paramString);
          if (paramContext.length() != 0)
          {
            "Missing resource: ".concat(paramContext);
            AppMethodBeat.o(61331);
            paramContext = null;
            continue;
          }
          new String("Missing resource: ");
        }
      }
      paramContext = paramContext.getString(i);
      if (TextUtils.isEmpty(paramContext))
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0)
          "Got empty resource: ".concat(paramContext);
        while (true)
        {
          AppMethodBeat.o(61331);
          paramContext = null;
          break;
          new String("Got empty resource: ");
        }
      }
      zzse.put(paramString, paramContext);
      AppMethodBeat.o(61331);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ConnectionErrorMessages
 * JD-Core Version:    0.6.2
 */