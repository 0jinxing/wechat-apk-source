package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ClientLibraryUtils
{
  public static final int GMS_CLIENT_VERSION_UNKNOWN = -1;

  public static int getClientVersion(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90042);
    int i = getClientVersion(getPackageInfo(paramContext, paramString));
    AppMethodBeat.o(90042);
    return i;
  }

  public static int getClientVersion(PackageInfo paramPackageInfo)
  {
    int i = -1;
    AppMethodBeat.i(90043);
    if ((paramPackageInfo == null) || (paramPackageInfo.applicationInfo == null))
      AppMethodBeat.o(90043);
    while (true)
    {
      return i;
      paramPackageInfo = paramPackageInfo.applicationInfo.metaData;
      if (paramPackageInfo == null)
      {
        AppMethodBeat.o(90043);
      }
      else
      {
        i = paramPackageInfo.getInt("com.google.android.gms.version", -1);
        AppMethodBeat.o(90043);
      }
    }
  }

  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90044);
    try
    {
      paramContext = Wrappers.packageManager(paramContext).getPackageInfo(paramString, 128);
      AppMethodBeat.o(90044);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(90044);
      }
    }
  }

  public static boolean isPackageSide()
  {
    return false;
  }

  public static boolean isPackageStopped(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90045);
    "com.google.android.gms".equals(paramString);
    try
    {
      if ((Wrappers.packageManager(paramContext).getApplicationInfo(paramString, 0).flags & 0x200000) != 0)
      {
        bool = true;
        AppMethodBeat.o(90045);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(90045);
        bool = false;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(90045);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.ClientLibraryUtils
 * JD-Core Version:    0.6.2
 */