package com.tencent.soter.a.d;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.g.g;
import com.tencent.soter.core.c.d;
import junit.framework.Assert;

public final class a
{
  public CancellationSignal zZp;

  public a()
  {
    AppMethodBeat.i(10470);
    this.zZp = null;
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      dRd();
      AppMethodBeat.o(10470);
      return;
    }
  }

  @SuppressLint({"NewApi"})
  public final void dRd()
  {
    AppMethodBeat.i(10472);
    this.zZp = new CancellationSignal();
    AppMethodBeat.o(10472);
  }

  @SuppressLint({"NewApi"})
  public final boolean rr(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(10471);
    d.v("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!this.zZp.isCanceled())
      if (Build.VERSION.SDK_INT < 23)
      {
        g.dRq().R(new a.1(this, paramBoolean));
        AppMethodBeat.o(10471);
      }
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      return paramBoolean;
      g.dRq().R(new a.2(this));
      g.dRq().s(new a.3(this), 350L);
      break;
      d.i("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new Object[0]);
      AppMethodBeat.o(10471);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.d.a
 * JD-Core Version:    0.6.2
 */