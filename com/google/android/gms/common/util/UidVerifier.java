package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class UidVerifier
{
  public static boolean isGooglePlayServicesUid(Context paramContext, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(90276);
    if (!uidHasPackageName(paramContext, paramInt, "com.google.android.gms"))
      AppMethodBeat.o(90276);
    while (true)
    {
      return bool;
      Object localObject = paramContext.getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getPackageInfo("com.google.android.gms", 64);
        bool = GoogleSignatureVerifier.getInstance(paramContext).isGooglePublicSignedPackage((PackageInfo)localObject);
        AppMethodBeat.o(90276);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.isLoggable("UidVerifier", 3);
        AppMethodBeat.o(90276);
      }
    }
  }

  @TargetApi(19)
  public static boolean uidHasPackageName(Context paramContext, int paramInt, String paramString)
  {
    AppMethodBeat.i(90277);
    boolean bool = Wrappers.packageManager(paramContext).uidHasPackageName(paramInt, paramString);
    AppMethodBeat.o(90277);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.UidVerifier
 * JD-Core Version:    0.6.2
 */