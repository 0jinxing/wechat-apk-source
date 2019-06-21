package com.tencent.soter.core.a;

import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;

final class b$1 extends FingerprintManager.AuthenticationCallback
{
  b$1(b.a parama)
  {
  }

  public final void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(72988);
    d.d("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationError", new Object[0]);
    this.AuK.onAuthenticationError(paramInt, paramCharSequence);
    AppMethodBeat.o(72988);
  }

  public final void onAuthenticationFailed()
  {
    AppMethodBeat.i(72991);
    d.d("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationFailed", new Object[0]);
    this.AuK.onAuthenticationFailed();
    AppMethodBeat.o(72991);
  }

  public final void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(72989);
    d.d("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationHelp", new Object[0]);
    this.AuK.onAuthenticationHelp(paramInt, paramCharSequence);
    AppMethodBeat.o(72989);
  }

  public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult paramAuthenticationResult)
  {
    AppMethodBeat.i(72990);
    d.d("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationSucceeded", new Object[0]);
    b.a locala = this.AuK;
    paramAuthenticationResult = paramAuthenticationResult.getCryptoObject();
    if (paramAuthenticationResult != null)
      if (paramAuthenticationResult.getCipher() != null)
        paramAuthenticationResult = new b.c(paramAuthenticationResult.getCipher());
    while (true)
    {
      locala.a(new b.b(paramAuthenticationResult));
      AppMethodBeat.o(72990);
      return;
      if (paramAuthenticationResult.getSignature() != null)
        paramAuthenticationResult = new b.c(paramAuthenticationResult.getSignature());
      else if (paramAuthenticationResult.getMac() != null)
        paramAuthenticationResult = new b.c(paramAuthenticationResult.getMac());
      else
        paramAuthenticationResult = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.a.b.1
 * JD-Core Version:    0.6.2
 */