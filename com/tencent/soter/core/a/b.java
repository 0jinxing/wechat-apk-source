package com.tencent.soter.core.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.g;

@SuppressLint({"NewApi"})
final class b
{
  static int checkSelfPermission(Context paramContext, String paramString)
  {
    int i = -1;
    AppMethodBeat.i(72994);
    if (paramContext == null)
    {
      d.e("Soter.FingerprintManagerCompatApi23", "soter: check self permission: context is null", new Object[0]);
      AppMethodBeat.o(72994);
    }
    while (true)
    {
      return i;
      if (g.isNullOrNil(paramString))
      {
        d.e("Soter.FingerprintManagerCompatApi23", "soter: requested permission is null or nil", new Object[0]);
        AppMethodBeat.o(72994);
      }
      else if (Build.VERSION.SDK_INT < 23)
      {
        d.d("Soter.FingerprintManagerCompatApi23", "soter: below 23. directly return.", new Object[0]);
        AppMethodBeat.o(72994);
        i = 0;
      }
      else
      {
        i = paramContext.checkSelfPermission(paramString);
        AppMethodBeat.o(72994);
      }
    }
  }

  static FingerprintManager getFingerprintManager(Context paramContext)
  {
    AppMethodBeat.i(72992);
    paramContext = (FingerprintManager)paramContext.getSystemService("fingerprint");
    AppMethodBeat.o(72992);
    return paramContext;
  }

  public static boolean hasEnrolledFingerprints(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(72993);
    boolean bool2;
    if (checkSelfPermission(paramContext, "android.permission.USE_FINGERPRINT") != 0)
    {
      d.e("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: hasEnrolledFingerprints", new Object[0]);
      AppMethodBeat.o(72993);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        paramContext = getFingerprintManager(paramContext);
        if (paramContext != null)
        {
          bool2 = paramContext.hasEnrolledFingerprints();
          AppMethodBeat.o(72993);
        }
        else
        {
          d.e("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in hasEnrolledFingerprints! Should never happen", new Object[0]);
          AppMethodBeat.o(72993);
          bool2 = bool1;
        }
      }
      catch (SecurityException paramContext)
      {
        d.e("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in hasEnrolledFingerprints! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72993);
        bool2 = bool1;
      }
    }
  }

  public static boolean isHardwareDetected(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(72995);
    boolean bool2;
    if (checkSelfPermission(paramContext, "android.permission.USE_FINGERPRINT") != 0)
    {
      d.e("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: isHardwareDetected", new Object[0]);
      AppMethodBeat.o(72995);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        paramContext = getFingerprintManager(paramContext);
        if (paramContext != null)
        {
          bool2 = paramContext.isHardwareDetected();
          AppMethodBeat.o(72995);
        }
        else
        {
          d.e("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new Object[0]);
          AppMethodBeat.o(72995);
          bool2 = bool1;
        }
      }
      catch (SecurityException paramContext)
      {
        d.e("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72995);
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.a.b
 * JD-Core Version:    0.6.2
 */