package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.service.l.a;
import com.tencent.mm.plugin.exdevice.service.p;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import junit.framework.Assert;

public final class l extends l.a
{
  private final long ftT;
  private c lxJ;
  boolean lxK;
  boolean lxL;
  Runnable lxM;

  public l(c paramc)
  {
    AppMethodBeat.i(19749);
    this.lxJ = null;
    this.ftT = 15000L;
    this.lxK = false;
    this.lxL = false;
    this.lxM = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(19745);
        l.a(l.this);
        if (l.b(l.this))
          AppMethodBeat.o(19745);
        while (true)
        {
          return;
          l.c(l.this).a(-1L, -1, -2, "TimeOut", null);
          AppMethodBeat.o(19745);
        }
      }

      public final String toString()
      {
        AppMethodBeat.i(19746);
        String str = super.toString() + "|mAsyncTimeOut";
        AppMethodBeat.o(19746);
        return str;
      }
    };
    Assert.assertNotNull(paramc);
    this.lxJ = paramc;
    AppMethodBeat.o(19749);
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
  {
    AppMethodBeat.i(19750);
    if (this.lxL)
      AppMethodBeat.o(19750);
    while (true)
    {
      return;
      if (this.lxK)
      {
        AppMethodBeat.o(19750);
      }
      else
      {
        aw.RS().doN().removeCallbacks(this.lxM);
        aw.RS().doN().post(new l.2(this, paramLong, paramInt1, paramInt2, paramString, paramp));
        AppMethodBeat.o(19750);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.l
 * JD-Core Version:    0.6.2
 */