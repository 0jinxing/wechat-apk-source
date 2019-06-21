package com.tencent.soter.core.biometric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;
import java.lang.reflect.Method;

@SuppressLint({"NewApi"})
final class FaceidManagerProxy
{
  public static final String FACEMANAGER_FACTORY_CLASS_NAME = "com.tencent.soter.core.biometric.SoterFaceManagerFactory";
  private static final String TAG = "Soter.FaceidManagerProxy";

  public static void authenticate(Context paramContext, FaceidManagerProxy.CryptoObject paramCryptoObject, int paramInt, Object paramObject, FaceidManagerProxy.AuthenticationCallback paramAuthenticationCallback, Handler paramHandler)
  {
    AppMethodBeat.i(72942);
    try
    {
      paramContext = getFaceManager(paramContext);
      if (paramContext != null)
      {
        paramContext.authenticate(wrapCryptoObject(paramCryptoObject), (CancellationSignal)paramObject, paramInt, wrapCallback(paramAuthenticationCallback), paramHandler);
        AppMethodBeat.o(72942);
      }
      while (true)
      {
        return;
        d.e("Soter.FaceidManagerProxy", "soter: facemanager is null in authenticate! Should never happen", new Object[0]);
        AppMethodBeat.o(72942);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        d.e("Soter.FaceidManagerProxy", "soter: triggered SecurityException in authenticate! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72942);
      }
    }
  }

  public static String getBiometricName(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(72946);
    try
    {
      FaceManager localFaceManager = getFaceManager(paramContext);
      if (localFaceManager != null)
      {
        paramContext = localFaceManager.getBiometricName(paramContext);
        AppMethodBeat.o(72946);
      }
      while (true)
      {
        return paramContext;
        d.e("Soter.FaceidManagerProxy", "soter: faceid manager is null! no biometric name returned.", new Object[0]);
        AppMethodBeat.o(72946);
        paramContext = localObject;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        d.e("Soter.FaceidManagerProxy", "soter: triggered SecurityException in getBiometricName! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72946);
        paramContext = localObject;
      }
    }
  }

  private static FaceManager getFaceManager(Context paramContext)
  {
    AppMethodBeat.i(72939);
    try
    {
      paramContext = (FaceManager)Class.forName("com.tencent.soter.core.biometric.SoterFaceManagerFactory").getDeclaredMethod("getFaceManager", new Class[] { Context.class }).invoke(null, new Object[] { paramContext });
      AppMethodBeat.o(72939);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        d.e("Soter.FaceidManagerProxy", "soter: FaceManager init failed, maybe not support." + paramContext.toString(), new Object[0]);
        paramContext = null;
      }
    }
  }

  public static boolean hasEnrolledFaceids(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(72940);
    try
    {
      paramContext = getFaceManager(paramContext);
      if (paramContext != null)
      {
        boolean bool2 = paramContext.hasEnrolledFaces();
        bool1 = bool2;
        AppMethodBeat.o(72940);
      }
      while (true)
      {
        return bool1;
        d.e("Soter.FaceidManagerProxy", "soter: facemanager is null in hasEnrolledBiometric! Should never happen", new Object[0]);
        AppMethodBeat.o(72940);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        d.e("Soter.FaceidManagerProxy", "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72940);
      }
    }
  }

  public static boolean isHardwareDetected(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(72941);
    try
    {
      paramContext = getFaceManager(paramContext);
      if (paramContext != null)
      {
        bool2 = paramContext.isHardwareDetected();
        AppMethodBeat.o(72941);
      }
      while (true)
      {
        return bool2;
        d.e("Soter.FaceidManagerProxy", "soter: facemanager is null in isHardwareDetected! Should never happen", new Object[0]);
        AppMethodBeat.o(72941);
        bool2 = bool1;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        d.e("Soter.FaceidManagerProxy", "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FACEID in AndroidManifest.xml", new Object[0]);
        AppMethodBeat.o(72941);
        boolean bool2 = bool1;
      }
    }
  }

  private static FaceidManagerProxy.CryptoObject unwrapCryptoObject(FaceManager.CryptoObject paramCryptoObject)
  {
    Object localObject = null;
    AppMethodBeat.i(72944);
    if (paramCryptoObject == null)
    {
      AppMethodBeat.o(72944);
      paramCryptoObject = localObject;
    }
    while (true)
    {
      return paramCryptoObject;
      if (paramCryptoObject.getCipher() != null)
      {
        paramCryptoObject = new FaceidManagerProxy.CryptoObject(paramCryptoObject.getCipher());
        AppMethodBeat.o(72944);
      }
      else if (paramCryptoObject.getSignature() != null)
      {
        paramCryptoObject = new FaceidManagerProxy.CryptoObject(paramCryptoObject.getSignature());
        AppMethodBeat.o(72944);
      }
      else if (paramCryptoObject.getMac() != null)
      {
        paramCryptoObject = new FaceidManagerProxy.CryptoObject(paramCryptoObject.getMac());
        AppMethodBeat.o(72944);
      }
      else
      {
        AppMethodBeat.o(72944);
        paramCryptoObject = localObject;
      }
    }
  }

  private static FaceManager.AuthenticationCallback wrapCallback(FaceidManagerProxy.AuthenticationCallback paramAuthenticationCallback)
  {
    AppMethodBeat.i(72945);
    paramAuthenticationCallback = new FaceidManagerProxy.1(paramAuthenticationCallback);
    AppMethodBeat.o(72945);
    return paramAuthenticationCallback;
  }

  private static FaceManager.CryptoObject wrapCryptoObject(FaceidManagerProxy.CryptoObject paramCryptoObject)
  {
    Object localObject = null;
    AppMethodBeat.i(72943);
    if (paramCryptoObject == null)
    {
      AppMethodBeat.o(72943);
      paramCryptoObject = localObject;
    }
    while (true)
    {
      return paramCryptoObject;
      if (paramCryptoObject.getCipher() != null)
      {
        paramCryptoObject = new FaceManager.CryptoObject(paramCryptoObject.getCipher());
        AppMethodBeat.o(72943);
      }
      else if (paramCryptoObject.getSignature() != null)
      {
        paramCryptoObject = new FaceManager.CryptoObject(paramCryptoObject.getSignature());
        AppMethodBeat.o(72943);
      }
      else if (paramCryptoObject.getMac() != null)
      {
        paramCryptoObject = new FaceManager.CryptoObject(paramCryptoObject.getMac());
        AppMethodBeat.o(72943);
      }
      else
      {
        AppMethodBeat.o(72943);
        paramCryptoObject = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.FaceidManagerProxy
 * JD-Core Version:    0.6.2
 */