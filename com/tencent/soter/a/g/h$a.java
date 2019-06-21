package com.tencent.soter.a.g;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.a.a.b;
import com.tencent.soter.core.c.d;
import java.security.Signature;

final class h$a extends a.b
{
  long AvH;
  Signature AwM = null;

  private h$a(h paramh, Signature paramSignature)
  {
    this.AwM = paramSignature;
  }

  static String ao(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(10506);
    if (paramCharSequence == null)
    {
      paramCharSequence = "unknown error";
      AppMethodBeat.o(10506);
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = paramCharSequence.toString();
      AppMethodBeat.o(10506);
    }
  }

  @SuppressLint({"NewApi"})
  private void dRt()
  {
    AppMethodBeat.i(10512);
    if (this.AwL.AwJ)
    {
      this.AwL.AwE.rr(false);
      this.AwL.AwK = true;
    }
    AppMethodBeat.o(10512);
  }

  public final void cvW()
  {
    AppMethodBeat.i(10509);
    d.i("Soter.TaskAuthentication", "soter: authentication succeed. start sign and upload upload signature", new Object[0]);
    g.dRq().R(new h.a.3(this));
    g.dRq().d(new h.a.4(this));
    dRt();
    AppMethodBeat.o(10509);
  }

  public final void onAuthenticationCancelled()
  {
    AppMethodBeat.i(10511);
    d.i("Soter.TaskAuthentication", "soter: called onAuthenticationCancelled", new Object[0]);
    if (this.AwL.AwK)
    {
      d.v("Soter.TaskAuthentication", "soter: during ignore cancel period", new Object[0]);
      AppMethodBeat.o(10511);
    }
    while (true)
    {
      return;
      super.onAuthenticationCancelled();
      g.dRq().d(new h.a.6(this));
      this.AwL.b(new com.tencent.soter.a.b.a(24, "user cancelled authentication"));
      dRt();
      AppMethodBeat.o(10511);
    }
  }

  public final void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(10507);
    d.e("Soter.TaskAuthentication", "soter: on authentication fatal error: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    if (paramInt != 10308)
    {
      g.dRq().d(new h.a.1(this, paramInt, paramCharSequence));
      this.AwL.b(new com.tencent.soter.a.b.a(21, ao(paramCharSequence)));
    }
    while (true)
    {
      dRt();
      AppMethodBeat.o(10507);
      return;
      this.AwL.b(new com.tencent.soter.a.b.a(25, ao(paramCharSequence)));
    }
  }

  public final void onAuthenticationFailed()
  {
    AppMethodBeat.i(10510);
    super.onAuthenticationFailed();
    d.w("Soter.TaskAuthentication", "soter: authentication failed once", new Object[0]);
    g.dRq().d(new h.a.5(this));
    if (this.AwL.AwI)
    {
      d.i("Soter.TaskAuthentication", "soter: should compat lower android version logic.", new Object[0]);
      this.AwL.AwE.rr(false);
      g.dRq().R(new h.a.7(this));
      g.dRq().s(new h.a.8(this), 1000L);
    }
    AppMethodBeat.o(10510);
  }

  public final void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(10508);
    d.w("Soter.TaskAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    g.dRq().d(new h.a.2(this, paramInt, paramCharSequence));
    AppMethodBeat.o(10508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.h.a
 * JD-Core Version:    0.6.2
 */