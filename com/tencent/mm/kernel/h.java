package com.tencent.mm.kernel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.a.a;
import com.tencent.mm.vending.g.d.b;
import com.tencent.mm.vending.g.f;
import junit.framework.Assert;

public final class h<_Profile extends com.tencent.mm.kernel.b.g>
{
  private static h eKy;
  private d<_Profile> eKA;
  byte[] eKB;
  public volatile boolean eKC;
  public long eKD;
  a eKE;
  private c eKz;

  private h(_Profile param_Profile)
  {
    AppMethodBeat.i(123258);
    this.eKB = new byte[0];
    this.eKC = false;
    this.eKE = new a();
    this.eKz = new c();
    this.eKA = new d(param_Profile);
    AppMethodBeat.o(123258);
  }

  public static <_Profile extends com.tencent.mm.kernel.b.g> h<_Profile> RT()
  {
    AppMethodBeat.i(123261);
    Assert.assertNotNull("Skeleton not initialized!", eKy);
    h localh = eKy;
    AppMethodBeat.o(123261);
    return localh;
  }

  public static <_Profile extends com.tencent.mm.kernel.b.g> h<_Profile> c(_Profile param_Profile)
  {
    try
    {
      AppMethodBeat.i(123264);
      if (eKy != null)
      {
        j.i("MicroMsg.MMSkeleton", "Kernel not null, has initialized.", new Object[0]);
        param_Profile = eKy;
        AppMethodBeat.o(123264);
      }
      while (true)
      {
        return param_Profile;
        j.i("MicroMsg.MMSkeleton", "Initialize skeleton, create whole world.", new Object[0]);
        h localh = new com/tencent/mm/kernel/h;
        localh.<init>(param_Profile);
        eKy = localh;
        AppMethodBeat.o(123264);
        param_Profile = localh;
      }
    }
    finally
    {
    }
    throw param_Profile;
  }

  public final c RL()
  {
    AppMethodBeat.i(123259);
    Assert.assertNotNull("mCorePlugins not initialized!", this.eKz);
    c localc = this.eKz;
    AppMethodBeat.o(123259);
    return localc;
  }

  public final d<_Profile> RM()
  {
    AppMethodBeat.i(123260);
    Assert.assertNotNull("mCoreProcess not initialized!", this.eKA);
    d locald = this.eKA;
    AppMethodBeat.o(123260);
    return locald;
  }

  public final void a(com.tencent.mm.kernel.api.g paramg)
  {
    AppMethodBeat.i(123262);
    int i = 0;
    while (true)
    {
      synchronized (this.eKB)
      {
        if (this.eKC)
          i = 1;
        if (i != 0)
        {
          paramg.BR();
          AppMethodBeat.o(123262);
          return;
        }
      }
      this.eKE.aD(paramg);
      AppMethodBeat.o(123262);
    }
  }

  public final void a(com.tencent.mm.vending.h.d paramd)
  {
    AppMethodBeat.i(123265);
    j.jD("startup");
    synchronized (this.eKB)
    {
      if (this.eKC)
      {
        com.tencent.mm.kernel.a.a.k("warning, mmskeleton has started up already.", new Object[0]);
        AppMethodBeat.o(123265);
        return;
      }
      final com.tencent.mm.kernel.b.g localg = RM().Rn();
      final long l = System.currentTimeMillis();
      com.tencent.mm.kernel.a.a.k("mmskeleton boot startup for process [%s]...", new Object[] { localg.eHT });
      final com.tencent.mm.kernel.a.a locala = localg.eJE;
      locala.RX();
      ??? = f.dMn().rg(true);
      localg.eMp.eMr = System.currentTimeMillis();
      locala.Bd();
      localg.eMp.eMs = System.currentTimeMillis();
      locala.Be();
      j.jD("installPlugins");
      localg.eMp.eMt = System.currentTimeMillis();
      locala.RY();
      localg.eMp.eMu = System.currentTimeMillis();
      locala.a(localg);
      if (paramd != null)
        ((com.tencent.mm.vending.g.c)???).b(paramd);
      localg.eMp.eMv = System.currentTimeMillis();
      ((com.tencent.mm.vending.g.c)???).c(new com.tencent.mm.vending.c.a()
      {
      });
      localg.eMp.eMw = System.currentTimeMillis();
      ((com.tencent.mm.vending.g.c)???).c(new com.tencent.mm.vending.c.a()
      {
      });
      localg.eMp.eMx = System.currentTimeMillis();
      ((com.tencent.mm.vending.g.c)???).a(com.tencent.mm.vending.h.d.zYp, new d.b()
      {
        public final void az(Object arg1)
        {
          AppMethodBeat.i(123253);
          j.jD("executeBootExtension");
          synchronized (h.this.eKB)
          {
            h.this.eKC = true;
            com.tencent.mm.kernel.a.a.k("summerboot mmskeleton boot startup finished in [%s]!", new Object[] { com.tencent.mm.kernel.a.a.fd(l) });
            h.this.eKE.BR();
            j.jD("onStartupDone");
            h.this.eKD = System.currentTimeMillis();
            this.cen.eMp.eMy = h.this.eKD;
            AppMethodBeat.o(123253);
            return;
          }
        }
      });
      AppMethodBeat.o(123265);
    }
  }

  public final void b(com.tencent.mm.kernel.api.g paramg)
  {
    AppMethodBeat.i(123263);
    this.eKE.remove(paramg);
    AppMethodBeat.o(123263);
  }

  static final class a extends com.tencent.mm.ci.a<com.tencent.mm.kernel.api.g>
    implements com.tencent.mm.kernel.api.g
  {
    public a()
    {
      super();
    }

    public final void BR()
    {
      AppMethodBeat.i(123256);
      a(new a.a()
      {
      });
      AppMethodBeat.o(123256);
    }

    public final void bi(final boolean paramBoolean)
    {
      AppMethodBeat.i(123257);
      a(new a.a()
      {
      });
      AppMethodBeat.o(123257);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.h
 * JD-Core Version:    0.6.2
 */