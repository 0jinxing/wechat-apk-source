package com.tencent.soter.core.biometric;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;

abstract interface BiometricManagerCompat$IBiometricManager
{
  public abstract void authenticate(Context paramContext, BiometricManagerCompat.CryptoObject paramCryptoObject, int paramInt, CancellationSignal paramCancellationSignal, BiometricManagerCompat.AuthenticationCallback paramAuthenticationCallback, Handler paramHandler);

  public abstract String getBiometricName(Context paramContext);

  public abstract boolean hasEnrolledBiometric(Context paramContext);

  public abstract boolean isHardwareDetected(Context paramContext);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
 * JD-Core Version:    0.6.2
 */