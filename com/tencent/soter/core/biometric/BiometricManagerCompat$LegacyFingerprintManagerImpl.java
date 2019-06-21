package com.tencent.soter.core.biometric;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;

class BiometricManagerCompat$LegacyFingerprintManagerImpl
  implements BiometricManagerCompat.IBiometricManager
{
  public void authenticate(Context paramContext, BiometricManagerCompat.CryptoObject paramCryptoObject, int paramInt, CancellationSignal paramCancellationSignal, BiometricManagerCompat.AuthenticationCallback paramAuthenticationCallback, Handler paramHandler)
  {
  }

  public String getBiometricName(Context paramContext)
  {
    return null;
  }

  public boolean hasEnrolledBiometric(Context paramContext)
  {
    return false;
  }

  public boolean isHardwareDetected(Context paramContext)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.BiometricManagerCompat.LegacyFingerprintManagerImpl
 * JD-Core Version:    0.6.2
 */