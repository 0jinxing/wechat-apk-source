package com.tencent.soter.a.g;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback;
import com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationResult;
import com.tencent.soter.core.c.d;
import java.security.Signature;

final class i$a extends BiometricManagerCompat.AuthenticationCallback
{
  private long AvH;
  private Signature AwM = null;

  private i$a(i parami, Signature paramSignature)
  {
    this.AwM = paramSignature;
  }

  private static String ao(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(10533);
    if (paramCharSequence == null)
    {
      paramCharSequence = "unknown error";
      AppMethodBeat.o(10533);
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = paramCharSequence.toString();
      AppMethodBeat.o(10533);
    }
  }

  @SuppressLint({"NewApi"})
  private void dRu()
  {
    AppMethodBeat.i(10539);
    if ((this.AwV.AwJ) || (this.AwV.Awh == 2))
    {
      this.AwV.AwS.rp(false);
      this.AwV.AwK = true;
    }
    AppMethodBeat.o(10539);
  }

  public final void onAuthenticationCancelled()
  {
    AppMethodBeat.i(10538);
    d.i("Soter.TaskBiometricAuthentication", "soter: called onAuthenticationCancelled", new Object[0]);
    if (this.AwV.AwK)
    {
      d.v("Soter.TaskBiometricAuthentication", "soter: during ignore cancel period", new Object[0]);
      AppMethodBeat.o(10538);
    }
    while (true)
    {
      return;
      g.dRq().d(new i.a.6(this));
      this.AwV.b(new com.tencent.soter.a.b.a(24, "user cancelled authentication"));
      dRu();
      AppMethodBeat.o(10538);
    }
  }

  public final void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(10534);
    d.e("Soter.TaskBiometricAuthentication", "soter: on authentication fatal error: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    g.dRq().d(new i.a.1(this, paramInt, paramCharSequence));
    if (paramInt == 10308)
      this.AwV.b(new com.tencent.soter.a.b.a(25, ao(paramCharSequence)));
    while (true)
    {
      dRu();
      AppMethodBeat.o(10534);
      return;
      this.AwV.b(new com.tencent.soter.a.b.a(21, ao(paramCharSequence)));
    }
  }

  public final void onAuthenticationFailed()
  {
    AppMethodBeat.i(10537);
    d.w("Soter.TaskBiometricAuthentication", "soter: authentication failed once", new Object[0]);
    g.dRq().d(new i.a.5(this));
    if (this.AwV.AwI)
    {
      d.i("Soter.TaskBiometricAuthentication", "soter: should compat lower android version logic.", new Object[0]);
      this.AwV.AwS.rp(false);
      g.dRq().R(new i.a.7(this));
      g.dRq().s(new i.a.8(this), 1000L);
    }
    if (this.AwV.Awh == 2)
    {
      d.i("Soter.TaskBiometricAuthentication", "soter: should compat faceid logic.", new Object[0]);
      this.AwV.b(new com.tencent.soter.a.b.a(21, "faceid not match"));
    }
    AppMethodBeat.o(10537);
  }

  public final void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(10535);
    d.w("Soter.TaskBiometricAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    g.dRq().d(new i.a.2(this, paramInt, paramCharSequence));
    AppMethodBeat.o(10535);
  }

  public final void onAuthenticationSucceeded(BiometricManagerCompat.AuthenticationResult paramAuthenticationResult)
  {
    AppMethodBeat.i(10536);
    d.i("Soter.TaskBiometricAuthentication", "soter: authentication succeed. start sign and upload upload signature", new Object[0]);
    g.dRq().d(new i.a.3(this));
    g.dRq().R(new i.a.4(this));
    dRu();
    AppMethodBeat.o(10536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.i.a
 * JD-Core Version:    0.6.2
 */