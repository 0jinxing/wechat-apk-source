package com.tencent.mm.kernel.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.kernel.j;
import junit.framework.Assert;

public final class a
{
  public static long eKO;
  public static long eKP;
  public static long eKQ;
  public com.tencent.mm.kernel.a.a.b eKM;
  public b eKN;
  private volatile boolean mConfigured = false;

  public static String fd(long paramLong)
  {
    AppMethodBeat.i(123280);
    String str = System.currentTimeMillis() - paramLong + "ms";
    AppMethodBeat.o(123280);
    return str;
  }

  public static final void k(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(123279);
    if (paramArrayOfObject.length == 0)
    {
      j.i("MMSkeleton.Boot", paramString, new Object[0]);
      AppMethodBeat.o(123279);
    }
    while (true)
    {
      return;
      j.i("MMSkeleton.Boot", paramString, paramArrayOfObject);
      AppMethodBeat.o(123279);
    }
  }

  public final void Bd()
  {
    AppMethodBeat.i(123275);
    eKQ = SystemClock.elapsedRealtime();
    k("hello WeChat.", new Object[0]);
    this.eKN.Bd();
    AppMethodBeat.o(123275);
  }

  public final void Be()
  {
    AppMethodBeat.i(123276);
    long l = System.currentTimeMillis();
    k("boot install plugins...", new Object[0]);
    this.eKN.Be();
    this.mConfigured = true;
    k("boot all installed plugins : %s...", new Object[] { h.RT().RL().Rm() });
    k("boot install plugins done in [%s].", new Object[] { fd(l) });
    AppMethodBeat.o(123276);
  }

  public final void RX()
  {
    AppMethodBeat.i(123274);
    Assert.assertNotNull("You must call whichBootStep(BootStep defaultOne, BootStep ... bootSteps) to specify your BootStep instance first!", this.eKN);
    AppMethodBeat.o(123274);
  }

  public final void RY()
  {
    AppMethodBeat.i(123277);
    long l = System.currentTimeMillis();
    k("boot make dependency of plugins...", new Object[0]);
    this.eKN.RY();
    k("boot make dependency of done in [%s].", new Object[] { fd(l) });
    AppMethodBeat.o(123277);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(123273);
    Assert.assertNotNull(paramb);
    h.RT().RM();
    this.eKN = paramb;
    AppMethodBeat.o(123273);
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(123278);
    long l = System.currentTimeMillis();
    k("boot configure plugins...", new Object[0]);
    this.eKN.a(paramg);
    k("boot configure plugins done in [%s].", new Object[] { fd(l) });
    AppMethodBeat.o(123278);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.a
 * JD-Core Version:    0.6.2
 */