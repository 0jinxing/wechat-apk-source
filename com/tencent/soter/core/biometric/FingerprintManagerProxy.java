package com.tencent.soter.core.biometric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.g;

@SuppressLint({"NewApi"})
final class FingerprintManagerProxy
{
  public static final String FINGERPRINT_SERVICE = "fingerprint";
  private static final String TAG = "Soter.FingerprintManagerProxy";

  public static void authenticate(Context paramContext, FingerprintManagerProxy.CryptoObject paramCryptoObject, int paramInt, Object paramObject, FingerprintManagerProxy.AuthenticationCallback paramAuthenticationCallback, Handler paramHandler)
  {
    AppMethodBeat.i(72956);
    if (checkSelfPermission(paramContext, "android.permission.USE_FINGERPRINT") != 0)
    {
      d.e("Soter.FingerprintManagerProxy", "soter: permission check failed: authenticate", new Object[0]);
      AppMethodBeat.o(72956);
    }
    while (true)
    {
      return;
      try
      {
        paramContext = getFingerprintManager(paramContext);
        if (paramContext == null)
          break label88;
        paramContext.authenticate(wrapCryptoObject(paramCryptoObject), (CancellationSignal)paramObject, paramInt, wrapCallback(paramAuthenticationCallback), paramHandler);
        AppMethodBeat.o(72956);
      }
      catch (SecurityException paramContext)
      {
        d.e("Soter.FingerprintManagerProxy", "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72956);
      }
      continue;
      label88: d.e("Soter.FingerprintManagerProxy", "soter: fingerprint manager is null in authenticate! Should never happen", new Object[0]);
      AppMethodBeat.o(72956);
    }
  }

  private static int checkSelfPermission(Context paramContext, String paramString)
  {
    int i = -1;
    AppMethodBeat.i(72954);
    if (paramContext == null)
    {
      d.e("Soter.FingerprintManagerProxy", "soter: check self permission: context is null", new Object[0]);
      AppMethodBeat.o(72954);
    }
    while (true)
    {
      return i;
      if (g.isNullOrNil(paramString))
      {
        d.e("Soter.FingerprintManagerProxy", "soter: requested permission is null or nil", new Object[0]);
        AppMethodBeat.o(72954);
      }
      else if (Build.VERSION.SDK_INT < 23)
      {
        d.d("Soter.FingerprintManagerProxy", "soter: below 23. directly return.", new Object[0]);
        AppMethodBeat.o(72954);
        i = 0;
      }
      else
      {
        i = paramContext.checkSelfPermission(paramString);
        AppMethodBeat.o(72954);
      }
    }
  }

  private static FingerprintManager getFingerprintManager(Context paramContext)
  {
    AppMethodBeat.i(72952);
    paramContext = (FingerprintManager)paramContext.getSystemService("fingerprint");
    AppMethodBeat.o(72952);
    return paramContext;
  }

  public static boolean hasEnrolledFingerprints(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(72953);
    if (checkSelfPermission(paramContext, "android.permission.USE_FINGERPRINT") != 0)
    {
      d.e("Soter.FingerprintManagerProxy", "soter: permission check failed: hasEnrolledBiometric", new Object[0]);
      AppMethodBeat.o(72953);
    }
    while (true)
    {
      return bool1;
      try
      {
        paramContext = getFingerprintManager(paramContext);
        if (paramContext != null)
        {
          boolean bool2 = paramContext.hasEnrolledFingerprints();
          bool1 = bool2;
          AppMethodBeat.o(72953);
        }
        else
        {
          d.e("Soter.FingerprintManagerProxy", "soter: fingerprint manager is null in hasEnrolledBiometric! Should never happen", new Object[0]);
          AppMethodBeat.o(72953);
        }
      }
      catch (SecurityException paramContext)
      {
        d.e("Soter.FingerprintManagerProxy", "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72953);
      }
    }
  }

  public static boolean isHardwareDetected(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(72955);
    boolean bool2;
    if (checkSelfPermission(paramContext, "android.permission.USE_FINGERPRINT") != 0)
    {
      d.e("Soter.FingerprintManagerProxy", "soter: permission check failed: isHardwareDetected", new Object[0]);
      AppMethodBeat.o(72955);
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
          AppMethodBeat.o(72955);
        }
        else
        {
          d.e("Soter.FingerprintManagerProxy", "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new Object[0]);
          AppMethodBeat.o(72955);
          bool2 = bool1;
        }
      }
      catch (SecurityException paramContext)
      {
        d.e("Soter.FingerprintManagerProxy", "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72955);
        bool2 = bool1;
      }
    }
  }

  private static FingerprintManagerProxy.CryptoObject unwrapCryptoObject(FingerprintManager.CryptoObject paramCryptoObject)
  {
    Object localObject = null;
    AppMethodBeat.i(72958);
    if (paramCryptoObject == null)
    {
      AppMethodBeat.o(72958);
      paramCryptoObject = localObject;
    }
    while (true)
    {
      return paramCryptoObject;
      if (paramCryptoObject.getCipher() != null)
      {
        paramCryptoObject = new FingerprintManagerProxy.CryptoObject(paramCryptoObject.getCipher());
        AppMethodBeat.o(72958);
      }
      else if (paramCryptoObject.getSignature() != null)
      {
        paramCryptoObject = new FingerprintManagerProxy.CryptoObject(paramCryptoObject.getSignature());
        AppMethodBeat.o(72958);
      }
      else if (paramCryptoObject.getMac() != null)
      {
        paramCryptoObject = new FingerprintManagerProxy.CryptoObject(paramCryptoObject.getMac());
        AppMethodBeat.o(72958);
      }
      else
      {
        AppMethodBeat.o(72958);
        paramCryptoObject = localObject;
      }
    }
  }

  private static FingerprintManager.AuthenticationCallback wrapCallback(FingerprintManagerProxy.AuthenticationCallback paramAuthenticationCallback)
  {
    AppMethodBeat.i(72959);
    paramAuthenticationCallback = new FingerprintManagerProxy.1(paramAuthenticationCallback);
    AppMethodBeat.o(72959);
    return paramAuthenticationCallback;
  }

  private static FingerprintManager.CryptoObject wrapCryptoObject(FingerprintManagerProxy.CryptoObject paramCryptoObject)
  {
    Object localObject = null;
    AppMethodBeat.i(72957);
    if (paramCryptoObject == null)
    {
      AppMethodBeat.o(72957);
      paramCryptoObject = localObject;
    }
    while (true)
    {
      return paramCryptoObject;
      if (paramCryptoObject.getCipher() != null)
      {
        paramCryptoObject = new FingerprintManager.CryptoObject(paramCryptoObject.getCipher());
        AppMethodBeat.o(72957);
      }
      else if (paramCryptoObject.getSignature() != null)
      {
        paramCryptoObject = new FingerprintManager.CryptoObject(paramCryptoObject.getSignature());
        AppMethodBeat.o(72957);
      }
      else if (paramCryptoObject.getMac() != null)
      {
        paramCryptoObject = new FingerprintManager.CryptoObject(paramCryptoObject.getMac());
        AppMethodBeat.o(72957);
      }
      else
      {
        AppMethodBeat.o(72957);
        paramCryptoObject = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.FingerprintManagerProxy
 * JD-Core Version:    0.6.2
 */