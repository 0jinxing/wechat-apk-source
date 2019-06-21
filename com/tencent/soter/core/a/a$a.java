package com.tencent.soter.core.a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;

final class a$a
  implements a.e
{
  static void a(b.a parama)
  {
    AppMethodBeat.i(72981);
    d.w("Soter.FingerprintManagerCompat", "soter: too many fail fingerprint callback. inform it.", new Object[0]);
    parama.onAuthenticationError(10308, "Too many failed times");
    AppMethodBeat.o(72981);
  }

  public final void a(Context paramContext, a.d paramd, CancellationSignal paramCancellationSignal, a.b paramb)
  {
    AppMethodBeat.i(72980);
    if (paramd != null)
      if (paramd.mCipher != null)
      {
        paramd = new b.c(paramd.mCipher);
        paramb = new a.a.1(paramb, paramContext);
        if (b.checkSelfPermission(paramContext, "android.permission.USE_FINGERPRINT") == 0)
          break label115;
        d.e("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: authenticate", new Object[0]);
        AppMethodBeat.o(72980);
      }
    while (true)
    {
      return;
      if (paramd.mSignature != null)
      {
        paramd = new b.c(paramd.mSignature);
        break;
      }
      if (paramd.mMac != null)
      {
        paramd = new b.c(paramd.mMac);
        break;
      }
      paramd = null;
      break;
      while (true)
      {
        try
        {
          label115: FingerprintManager localFingerprintManager = b.getFingerprintManager(paramContext);
          if (localFingerprintManager == null)
            break label251;
          if (paramd == null)
            break label246;
          if (paramd.mCipher == null)
            break label202;
          paramContext = new android/hardware/fingerprint/FingerprintManager$CryptoObject;
          paramContext.<init>(paramd.mCipher);
          paramCancellationSignal = (CancellationSignal)paramCancellationSignal;
          paramd = new com/tencent/soter/core/a/b$1;
          paramd.<init>(paramb);
          localFingerprintManager.authenticate(paramContext, paramCancellationSignal, 0, paramd, null);
          AppMethodBeat.o(72980);
        }
        catch (SecurityException paramContext)
        {
          d.e("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
          AppMethodBeat.o(72980);
        }
        break;
        label202: if (paramd.mSignature != null)
          paramContext = new FingerprintManager.CryptoObject(paramd.mSignature);
        else if (paramd.mMac != null)
          paramContext = new FingerprintManager.CryptoObject(paramd.mMac);
        else
          label246: paramContext = null;
      }
      label251: d.e("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in authenticate! Should never happen", new Object[0]);
      AppMethodBeat.o(72980);
    }
  }

  public final boolean hasEnrolledFingerprints(Context paramContext)
  {
    AppMethodBeat.i(72978);
    boolean bool = b.hasEnrolledFingerprints(paramContext);
    AppMethodBeat.o(72978);
    return bool;
  }

  public final boolean isHardwareDetected(Context paramContext)
  {
    AppMethodBeat.i(72979);
    boolean bool = b.isHardwareDetected(paramContext);
    AppMethodBeat.o(72979);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.a.a.a
 * JD-Core Version:    0.6.2
 */