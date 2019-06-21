package com.tencent.soter.core.biometric;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;

class BiometricManagerCompat$FingerprintManagerImpl
  implements BiometricManagerCompat.IBiometricManager
{
  private static final String TAG = "Soter.BiometricManagerCompat.Fingerprint";

  private static void informTooManyTrial(FingerprintManagerProxy.AuthenticationCallback paramAuthenticationCallback)
  {
    AppMethodBeat.i(72922);
    d.w("Soter.BiometricManagerCompat.Fingerprint", "soter: too many fail fingerprint callback. inform it.", new Object[0]);
    paramAuthenticationCallback.onAuthenticationError(10308, "Too many failed times");
    AppMethodBeat.o(72922);
  }

  private static boolean shouldInformTooManyTrial(FingerprintManagerProxy.AuthenticationCallback paramAuthenticationCallback, Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(72921);
    if (SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce())
    {
      d.v("Soter.BiometricManagerCompat.Fingerprint", "soter: using system anti brute force strategy", new Object[0]);
      AppMethodBeat.o(72921);
    }
    while (true)
    {
      return bool;
      if (SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(paramContext))
      {
        if (!SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(paramContext))
        {
          d.v("Soter.BiometricManagerCompat.Fingerprint", "soter: unfreeze former frozen status", new Object[0]);
          SoterBiometricAntiBruteForceStrategy.unFreeze(paramContext);
        }
        AppMethodBeat.o(72921);
      }
      else if (SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(paramContext))
      {
        d.v("Soter.BiometricManagerCompat.Fingerprint", "soter: failure time available", new Object[0]);
        AppMethodBeat.o(72921);
      }
      else
      {
        informTooManyTrial(paramAuthenticationCallback);
        bool = true;
        AppMethodBeat.o(72921);
      }
    }
  }

  private static BiometricManagerCompat.CryptoObject unwrapCryptoObject(FingerprintManagerProxy.CryptoObject paramCryptoObject)
  {
    Object localObject = null;
    AppMethodBeat.i(72919);
    if (paramCryptoObject == null)
    {
      AppMethodBeat.o(72919);
      paramCryptoObject = localObject;
    }
    while (true)
    {
      return paramCryptoObject;
      if (paramCryptoObject.getCipher() != null)
      {
        paramCryptoObject = new BiometricManagerCompat.CryptoObject(paramCryptoObject.getCipher());
        AppMethodBeat.o(72919);
      }
      else if (paramCryptoObject.getSignature() != null)
      {
        paramCryptoObject = new BiometricManagerCompat.CryptoObject(paramCryptoObject.getSignature());
        AppMethodBeat.o(72919);
      }
      else if (paramCryptoObject.getMac() != null)
      {
        paramCryptoObject = new BiometricManagerCompat.CryptoObject(paramCryptoObject.getMac());
        AppMethodBeat.o(72919);
      }
      else
      {
        AppMethodBeat.o(72919);
        paramCryptoObject = localObject;
      }
    }
  }

  private static FingerprintManagerProxy.AuthenticationCallback wrapCallback(Context paramContext, BiometricManagerCompat.AuthenticationCallback paramAuthenticationCallback)
  {
    AppMethodBeat.i(72920);
    paramContext = new BiometricManagerCompat.FingerprintManagerImpl.1(paramAuthenticationCallback, paramContext);
    AppMethodBeat.o(72920);
    return paramContext;
  }

  private static FingerprintManagerProxy.CryptoObject wrapCryptoObject(BiometricManagerCompat.CryptoObject paramCryptoObject)
  {
    Object localObject = null;
    AppMethodBeat.i(72918);
    if (paramCryptoObject == null)
    {
      AppMethodBeat.o(72918);
      paramCryptoObject = localObject;
    }
    while (true)
    {
      return paramCryptoObject;
      if (paramCryptoObject.getCipher() != null)
      {
        paramCryptoObject = new FingerprintManagerProxy.CryptoObject(paramCryptoObject.getCipher());
        AppMethodBeat.o(72918);
      }
      else if (paramCryptoObject.getSignature() != null)
      {
        paramCryptoObject = new FingerprintManagerProxy.CryptoObject(paramCryptoObject.getSignature());
        AppMethodBeat.o(72918);
      }
      else if (paramCryptoObject.getMac() != null)
      {
        paramCryptoObject = new FingerprintManagerProxy.CryptoObject(paramCryptoObject.getMac());
        AppMethodBeat.o(72918);
      }
      else
      {
        AppMethodBeat.o(72918);
        paramCryptoObject = localObject;
      }
    }
  }

  public void authenticate(Context paramContext, BiometricManagerCompat.CryptoObject paramCryptoObject, int paramInt, CancellationSignal paramCancellationSignal, BiometricManagerCompat.AuthenticationCallback paramAuthenticationCallback, Handler paramHandler)
  {
    AppMethodBeat.i(72917);
    FingerprintManagerProxy.authenticate(paramContext, wrapCryptoObject(paramCryptoObject), paramInt, paramCancellationSignal, wrapCallback(paramContext, paramAuthenticationCallback), paramHandler);
    AppMethodBeat.o(72917);
  }

  public String getBiometricName(Context paramContext)
  {
    return "fingerprint";
  }

  public boolean hasEnrolledBiometric(Context paramContext)
  {
    AppMethodBeat.i(72915);
    boolean bool = FingerprintManagerProxy.hasEnrolledFingerprints(paramContext);
    AppMethodBeat.o(72915);
    return bool;
  }

  public boolean isHardwareDetected(Context paramContext)
  {
    AppMethodBeat.i(72916);
    boolean bool = FingerprintManagerProxy.isHardwareDetected(paramContext);
    AppMethodBeat.o(72916);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl
 * JD-Core Version:    0.6.2
 */