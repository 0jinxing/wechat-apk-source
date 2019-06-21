package com.tencent.soter.core.biometric;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;

final class FaceidManagerProxy$1 extends FaceManager.AuthenticationCallback
{
  FaceidManagerProxy$1(FaceidManagerProxy.AuthenticationCallback paramAuthenticationCallback)
  {
  }

  public final void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(72935);
    d.d("Soter.FaceidManagerProxy", "hy: lowest level return onAuthenticationError", new Object[0]);
    this.val$callback.onAuthenticationError(paramInt, paramCharSequence);
    AppMethodBeat.o(72935);
  }

  public final void onAuthenticationFailed()
  {
    AppMethodBeat.i(72938);
    d.d("Soter.FaceidManagerProxy", "hy: lowest level return onAuthenticationFailed", new Object[0]);
    this.val$callback.onAuthenticationFailed();
    AppMethodBeat.o(72938);
  }

  public final void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(72936);
    d.d("Soter.FaceidManagerProxy", "hy: lowest level return onAuthenticationHelp", new Object[0]);
    this.val$callback.onAuthenticationHelp(paramInt, paramCharSequence);
    AppMethodBeat.o(72936);
  }

  public final void onAuthenticationSucceeded(FaceManager.AuthenticationResult paramAuthenticationResult)
  {
    AppMethodBeat.i(72937);
    d.d("Soter.FaceidManagerProxy", "hy: lowest level return onAuthenticationSucceeded", new Object[0]);
    this.val$callback.onAuthenticationSucceeded(new FaceidManagerProxy.AuthenticationResult(FaceidManagerProxy.access$000(paramAuthenticationResult.getCryptoObject())));
    AppMethodBeat.o(72937);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.biometric.FaceidManagerProxy.1
 * JD-Core Version:    0.6.2
 */