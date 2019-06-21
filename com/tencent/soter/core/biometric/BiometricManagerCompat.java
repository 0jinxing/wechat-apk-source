package com.tencent.soter.core.biometric;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.a;
import com.tencent.soter.core.c.d;
import java.util.HashMap;
import java.util.Map;

public class BiometricManagerCompat
{
  static final Map<Integer, BiometricManagerCompat.IBiometricManager> IMPL_PROVIDER;
  private static final String TAG = "Soter.BiometricManagerCompat";
  private Integer mBiometricType;
  private Context mContext;

  static
  {
    AppMethodBeat.i(72934);
    IMPL_PROVIDER = new HashMap();
    if (a.dQN());
    for (Object localObject = new BiometricManagerCompat.FingerprintManagerImpl(); ; localObject = new BiometricManagerCompat.LegacyFingerprintManagerImpl())
    {
      IMPL_PROVIDER.put(Integer.valueOf(1), localObject);
      if ((a.dQN()) && (isNativeSupportFaceid()))
        IMPL_PROVIDER.put(Integer.valueOf(2), new FaceidManagerImpl());
      AppMethodBeat.o(72934);
      return;
    }
  }

  private BiometricManagerCompat(Context paramContext, Integer paramInteger)
  {
    this.mContext = paramContext;
    this.mBiometricType = paramInteger;
  }

  public static BiometricManagerCompat from(Context paramContext, Integer paramInteger)
  {
    AppMethodBeat.i(72926);
    paramContext = new BiometricManagerCompat(paramContext, paramInteger);
    AppMethodBeat.o(72926);
    return paramContext;
  }

  public static boolean isNativeSupportFaceid()
  {
    AppMethodBeat.i(72927);
    try
    {
      Class.forName("com.tencent.soter.core.biometric.SoterFaceManagerFactory");
      bool = true;
      AppMethodBeat.o(72927);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(72927);
      }
    }
  }

  public void authenticate(BiometricManagerCompat.CryptoObject paramCryptoObject, int paramInt, CancellationSignal paramCancellationSignal, BiometricManagerCompat.AuthenticationCallback paramAuthenticationCallback, Handler paramHandler)
  {
    AppMethodBeat.i(72933);
    BiometricManagerCompat.IBiometricManager localIBiometricManager = (BiometricManagerCompat.IBiometricManager)IMPL_PROVIDER.get(this.mBiometricType);
    if (localIBiometricManager == null)
    {
      d.i("Soter.BiometricManagerCompat", "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new Object[0]);
      paramAuthenticationCallback.onAuthenticationCancelled();
    }
    localIBiometricManager.authenticate(this.mContext, paramCryptoObject, paramInt, paramCancellationSignal, paramAuthenticationCallback, paramHandler);
    AppMethodBeat.o(72933);
  }

  public String getBiometricName()
  {
    AppMethodBeat.i(72929);
    Object localObject = (BiometricManagerCompat.IBiometricManager)IMPL_PROVIDER.get(this.mBiometricType);
    if (localObject == null)
    {
      d.i("Soter.BiometricManagerCompat", "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new Object[0]);
      localObject = null;
      AppMethodBeat.o(72929);
    }
    while (true)
    {
      return localObject;
      localObject = ((BiometricManagerCompat.IBiometricManager)localObject).getBiometricName(this.mContext);
      AppMethodBeat.o(72929);
    }
  }

  public boolean hasEnrolledBiometric()
  {
    AppMethodBeat.i(72928);
    BiometricManagerCompat.IBiometricManager localIBiometricManager = (BiometricManagerCompat.IBiometricManager)IMPL_PROVIDER.get(this.mBiometricType);
    boolean bool;
    if (localIBiometricManager == null)
    {
      d.i("Soter.BiometricManagerCompat", "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new Object[0]);
      AppMethodBeat.o(72928);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = localIBiometricManager.hasEnrolledBiometric(this.mContext);
      AppMethodBeat.o(72928);
    }
  }

  public boolean isCurrentFailTimeAvailable()
  {
    AppMethodBeat.i(72931);
    boolean bool = SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(this.mContext);
    AppMethodBeat.o(72931);
    return bool;
  }

  public boolean isCurrentTweenTimeAvailable(Context paramContext)
  {
    AppMethodBeat.i(72932);
    boolean bool = SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(this.mContext);
    AppMethodBeat.o(72932);
    return bool;
  }

  public boolean isHardwareDetected()
  {
    AppMethodBeat.i(72930);
    BiometricManagerCompat.IBiometricManager localIBiometricManager = (BiometricManagerCompat.IBiometricManager)IMPL_PROVIDER.get(this.mBiometricType);
    boolean bool;
    if (localIBiometricManager == null)
    {
      d.i("Soter.BiometricManagerCompat", "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new Object[0]);
      AppMethodBeat.o(72930);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = localIBiometricManager.isHardwareDetected(this.mContext);
      AppMethodBeat.o(72930);
    }
  }

  static class FaceidManagerImpl
    implements BiometricManagerCompat.IBiometricManager
  {
    private static final String TAG = "Soter.BiometricManagerCompat.Faceid";

    private static void informTooManyTrial(FaceidManagerProxy.AuthenticationCallback paramAuthenticationCallback)
    {
      AppMethodBeat.i(72907);
      d.w("Soter.BiometricManagerCompat.Faceid", "soter: too many fail callback. inform it.", new Object[0]);
      paramAuthenticationCallback.onAuthenticationError(10308, "Too many failed times");
      AppMethodBeat.o(72907);
    }

    private static boolean shouldInformTooManyTrial(FaceidManagerProxy.AuthenticationCallback paramAuthenticationCallback, Context paramContext)
    {
      boolean bool = false;
      AppMethodBeat.i(72906);
      if (SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce())
      {
        d.v("Soter.BiometricManagerCompat.Faceid", "soter: using system anti brute force strategy", new Object[0]);
        AppMethodBeat.o(72906);
      }
      while (true)
      {
        return bool;
        if (SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(paramContext))
        {
          if (!SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(paramContext))
          {
            d.v("Soter.BiometricManagerCompat.Faceid", "soter: unfreeze former frozen status", new Object[0]);
            SoterBiometricAntiBruteForceStrategy.unFreeze(paramContext);
          }
          AppMethodBeat.o(72906);
        }
        else if (SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(paramContext))
        {
          d.v("Soter.BiometricManagerCompat.Faceid", "soter: failure time available", new Object[0]);
          AppMethodBeat.o(72906);
        }
        else
        {
          informTooManyTrial(paramAuthenticationCallback);
          bool = true;
          AppMethodBeat.o(72906);
        }
      }
    }

    private static BiometricManagerCompat.CryptoObject unwrapCryptoObject(FaceidManagerProxy.CryptoObject paramCryptoObject)
    {
      Object localObject = null;
      AppMethodBeat.i(72904);
      if (paramCryptoObject == null)
      {
        AppMethodBeat.o(72904);
        paramCryptoObject = localObject;
      }
      while (true)
      {
        return paramCryptoObject;
        if (paramCryptoObject.getCipher() != null)
        {
          paramCryptoObject = new BiometricManagerCompat.CryptoObject(paramCryptoObject.getCipher());
          AppMethodBeat.o(72904);
        }
        else if (paramCryptoObject.getSignature() != null)
        {
          paramCryptoObject = new BiometricManagerCompat.CryptoObject(paramCryptoObject.getSignature());
          AppMethodBeat.o(72904);
        }
        else if (paramCryptoObject.getMac() != null)
        {
          paramCryptoObject = new BiometricManagerCompat.CryptoObject(paramCryptoObject.getMac());
          AppMethodBeat.o(72904);
        }
        else
        {
          AppMethodBeat.o(72904);
          paramCryptoObject = localObject;
        }
      }
    }

    private static FaceidManagerProxy.AuthenticationCallback wrapCallback(Context paramContext, BiometricManagerCompat.AuthenticationCallback paramAuthenticationCallback)
    {
      AppMethodBeat.i(72905);
      paramContext = new BiometricManagerCompat.FaceidManagerImpl.1(paramAuthenticationCallback, paramContext);
      AppMethodBeat.o(72905);
      return paramContext;
    }

    private static FaceidManagerProxy.CryptoObject wrapCryptoObject(BiometricManagerCompat.CryptoObject paramCryptoObject)
    {
      Object localObject = null;
      AppMethodBeat.i(72903);
      if (paramCryptoObject == null)
      {
        AppMethodBeat.o(72903);
        paramCryptoObject = localObject;
      }
      while (true)
      {
        return paramCryptoObject;
        if (paramCryptoObject.getCipher() != null)
        {
          paramCryptoObject = new FaceidManagerProxy.CryptoObject(paramCryptoObject.getCipher());
          AppMethodBeat.o(72903);
        }
        else if (paramCryptoObject.getSignature() != null)
        {
          paramCryptoObject = new FaceidManagerProxy.CryptoObject(paramCryptoObject.getSignature());
          AppMethodBeat.o(72903);
        }
        else if (paramCryptoObject.getMac() != null)
        {
          paramCryptoObject = new FaceidManagerProxy.CryptoObject(paramCryptoObject.getMac());
          AppMethodBeat.o(72903);
        }
        else
        {
          AppMethodBeat.o(72903);
          paramCryptoObject = localObject;
        }
      }
    }

    public void authenticate(Context paramContext, BiometricManagerCompat.CryptoObject paramCryptoObject, int paramInt, CancellationSignal paramCancellationSignal, BiometricManagerCompat.AuthenticationCallback paramAuthenticationCallback, Handler paramHandler)
    {
      AppMethodBeat.i(72902);
      FaceidManagerProxy.authenticate(paramContext, wrapCryptoObject(paramCryptoObject), paramInt, paramCancellationSignal, wrapCallback(paramContext, paramAuthenticationCallback), paramHandler);
      AppMethodBeat.o(72902);
    }

    public String getBiometricName(Context paramContext)
    {
      AppMethodBeat.i(72901);
      paramContext = FaceidManagerProxy.getBiometricName(paramContext);
      AppMethodBeat.o(72901);
      return paramContext;
    }

    public boolean hasEnrolledBiometric(Context paramContext)
    {
      AppMethodBeat.i(72899);
      boolean bool = FaceidManagerProxy.hasEnrolledFaceids(paramContext);
      AppMethodBeat.o(72899);
      return bool;
    }

    public boolean isHardwareDetected(Context paramContext)
    {
      AppMethodBeat.i(72900);
      boolean bool = FaceidManagerProxy.isHardwareDetected(paramContext);
      AppMethodBeat.o(72900);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.BiometricManagerCompat
 * JD-Core Version:    0.6.2
 */