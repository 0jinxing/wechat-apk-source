package com.tencent.mm.kernel;

import android.app.Application;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p.a;
import com.tencent.mm.ai.y;
import com.tencent.mm.ci.a.a;
import com.tencent.mm.kernel.a.c.b;
import com.tencent.mm.kernel.a.c.c;
import com.tencent.mm.kernel.a.c.d;
import com.tencent.mm.model.cc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.b;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class g
{
  private static g eKh;
  public final b.a eJn;
  public h<com.tencent.mm.kernel.b.h> eKi;
  al eKj;
  private cc eKk;
  public e eKl;
  public a eKm;
  public b eKn;
  public com.tencent.mm.cc.b eKo;
  public final a eKp;
  private final boolean eKq;
  private ConcurrentHashMap eKr;
  public volatile boolean eKs;

  private g(final com.tencent.mm.kernel.b.h paramh)
  {
    AppMethodBeat.i(57995);
    this.eKk = null;
    this.eKp = new a((byte)0);
    this.eJn = new b.a();
    this.eKr = new ConcurrentHashMap();
    this.eKs = false;
    this.eKi = h.c(paramh);
    this.eKq = ((com.tencent.mm.kernel.b.h)this.eKi.RM().Rn()).SG();
    if (this.eKq)
    {
      this.eKk = new cc();
      this.eKj = com.tencent.mm.sdk.g.c.c.dqp();
      com.tencent.mm.sdk.g.d.xDC = false;
      com.tencent.mm.sdk.g.d.xDH.a(new com.tencent.mm.sdk.g.a.c.a()
      {
      });
      this.eKj.aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(57979);
          at.gI(ah.getContext());
          AppMethodBeat.o(57979);
        }
      });
    }
    this.eKi.RL().eJC = new c.a()
    {
      public final void b(com.tencent.mm.kernel.b.f paramAnonymousf)
      {
        AppMethodBeat.i(57980);
        g.this.a(paramh, paramAnonymousf);
        AppMethodBeat.o(57980);
      }

      public final void b(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        AppMethodBeat.i(57981);
        g.this.a(paramh, paramAnonymousa);
        com.tencent.mm.kernel.a.c.Sa().aA(paramAnonymousa);
        AppMethodBeat.o(57981);
      }

      public final void c(com.tencent.mm.kernel.b.f paramAnonymousf)
      {
        AppMethodBeat.i(57983);
        com.tencent.mm.kernel.a.c localc = com.tencent.mm.kernel.a.c.Sa();
        if (paramAnonymousf != null)
          localc.aB(paramAnonymousf);
        AppMethodBeat.o(57983);
      }

      public final void c(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        AppMethodBeat.i(57982);
        g localg = g.this;
        com.tencent.mm.kernel.b.h localh = paramh;
        Object localObject = com.tencent.mm.kernel.a.c.Sa();
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.c))
          ((com.tencent.mm.kernel.a.c)localObject).eKV.remove((com.tencent.mm.kernel.api.c)paramAnonymousa);
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.e))
          ((com.tencent.mm.kernel.a.c)localObject).eKW.remove((com.tencent.mm.kernel.api.e)paramAnonymousa);
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.b))
          ((com.tencent.mm.kernel.a.c)localObject).eKX.remove((com.tencent.mm.kernel.api.b)paramAnonymousa);
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.f))
          ((com.tencent.mm.kernel.a.c)localObject).eKY.remove((com.tencent.mm.kernel.api.f)paramAnonymousa);
        if ((paramAnonymousa instanceof ApplicationLifeCycle))
        {
          localObject = (ApplicationLifeCycle)paramAnonymousa;
          localh.eMA.remove(localObject);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.d))
          localg.eJn.remove((com.tencent.mm.kernel.api.d)paramAnonymousa);
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.g))
          localg.eKi.b((com.tencent.mm.kernel.api.g)paramAnonymousa);
        AppMethodBeat.o(57982);
      }

      public final void d(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        AppMethodBeat.i(57984);
        com.tencent.mm.kernel.a.c localc = com.tencent.mm.kernel.a.c.Sa();
        if (paramAnonymousa != null)
          localc.aB(paramAnonymousa);
        AppMethodBeat.o(57984);
      }
    };
    AppMethodBeat.o(57995);
  }

  public static <T extends com.tencent.mm.kernel.c.a> T K(Class<T> paramClass)
  {
    AppMethodBeat.i(58007);
    RQ();
    paramClass = RL().K(paramClass);
    AppMethodBeat.o(58007);
    return paramClass;
  }

  public static void L(Class<? extends com.tencent.mm.kernel.c.a> paramClass)
  {
    AppMethodBeat.i(58010);
    RQ();
    RL().L(paramClass);
    AppMethodBeat.o(58010);
  }

  public static <T extends com.tencent.mm.kernel.b.a> T M(Class<T> paramClass)
  {
    AppMethodBeat.i(58006);
    RQ();
    paramClass = RL().M(paramClass);
    AppMethodBeat.o(58006);
    return paramClass;
  }

  public static boolean RK()
  {
    AppMethodBeat.i(57999);
    a locala = RQ().eKm;
    boolean bool;
    if ((locala != null) && (locala.QY()))
    {
      bool = true;
      AppMethodBeat.o(57999);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(57999);
    }
  }

  public static c RL()
  {
    AppMethodBeat.i(58000);
    Assert.assertNotNull("mCorePlugins not initialized!", RQ().eKi.RL());
    c localc = RQ().eKi.RL();
    AppMethodBeat.o(58000);
    return localc;
  }

  public static d<com.tencent.mm.kernel.b.h> RM()
  {
    AppMethodBeat.i(58001);
    Assert.assertNotNull("mCoreProcess not initialized!", RQ().eKi.RM());
    d locald = RQ().eKi.RM();
    AppMethodBeat.o(58001);
    return locald;
  }

  public static a RN()
  {
    AppMethodBeat.i(58002);
    Assert.assertNotNull("mCoreAccount not initialized!", RQ().eKm);
    a locala = RQ().eKm;
    AppMethodBeat.o(58002);
    return locala;
  }

  public static b RO()
  {
    AppMethodBeat.i(58003);
    Assert.assertNotNull("mCoreNetwork not initialized!", RQ().eKn);
    b localb = RQ().eKn;
    AppMethodBeat.o(58003);
    return localb;
  }

  public static e RP()
  {
    AppMethodBeat.i(58004);
    Assert.assertNotNull("mCoreStorage not initialized!", RQ().eKl);
    e locale = RQ().eKl;
    AppMethodBeat.o(58004);
    return locale;
  }

  public static g RQ()
  {
    AppMethodBeat.i(58005);
    Assert.assertNotNull("Kernel not initialized by MMApplication!", eKh);
    g localg = eKh;
    AppMethodBeat.o(58005);
    return localg;
  }

  public static cc RR()
  {
    AppMethodBeat.i(58012);
    Assert.assertTrue(RQ().eKq);
    cc localcc = RQ().eKk;
    AppMethodBeat.o(58012);
    return localcc;
  }

  @Deprecated
  public static al RS()
  {
    AppMethodBeat.i(58013);
    Assert.assertTrue(RQ().eKq);
    al localal = RQ().eKj;
    AppMethodBeat.o(58013);
    return localal;
  }

  public static com.tencent.mm.ai.p Rg()
  {
    AppMethodBeat.i(58011);
    RQ();
    com.tencent.mm.ai.p localp = RO().eJo;
    AppMethodBeat.o(58011);
    return localp;
  }

  public static void a(com.tencent.mm.kernel.b.h paramh)
  {
    try
    {
      AppMethodBeat.i(58014);
      Object localObject;
      if (eKh != null)
      {
        localObject = (com.tencent.mm.kernel.b.h)eKh.eKi.RM().Rn();
        Application localApplication = paramh.cc;
        ((com.tencent.mm.kernel.b.h)localObject).eMz = paramh.eMz;
        ((com.tencent.mm.kernel.b.g)localObject).cc = localApplication;
        ab.i("MicroMsg.MMKernel", "Kernel not null, has initialized.");
        AppMethodBeat.o(58014);
      }
      while (true)
      {
        return;
        localObject = new com/tencent/mm/kernel/g$4;
        ((4)localObject).<init>();
        j.a((j.a)localObject);
        ab.i("MicroMsg.MMKernel", "Initialize kernel, create whole WeChat world.");
        localObject = new com/tencent/mm/kernel/g;
        ((g)localObject).<init>(paramh);
        eKh = (g)localObject;
        AppMethodBeat.o(58014);
      }
    }
    finally
    {
    }
    throw paramh;
  }

  public static <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, N paramN)
  {
    AppMethodBeat.i(58008);
    RQ();
    RL().a(paramClass, new com.tencent.mm.kernel.c.e(paramN));
    AppMethodBeat.o(58008);
  }

  public static <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, com.tencent.mm.kernel.c.c<N> paramc)
  {
    AppMethodBeat.i(58009);
    RQ();
    RL().a(paramClass, paramc);
    AppMethodBeat.o(58009);
  }

  public static void jR(int paramInt)
  {
    AppMethodBeat.i(58015);
    a locala = RN();
    if ((a.jN(paramInt)) && (a.b.a(a.eIM) == paramInt) && (locala.QY()))
    {
      ab.w("MMKernel.CoreAccount", "loginUin, uin not changed, return :%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(58015);
    }
    while (true)
    {
      return;
      synchronized (locala.eIL)
      {
        a.b.a(a.eIM, paramInt);
        locala.QO();
        locala.eIZ = SystemClock.elapsedRealtime();
        locala.cl(true);
        AppMethodBeat.o(58015);
      }
    }
  }

  public final boolean RJ()
  {
    return this.eKs;
  }

  public final void a(com.tencent.mm.kernel.api.g paramg)
  {
    AppMethodBeat.i(57997);
    this.eKi.a(paramg);
    AppMethodBeat.o(57997);
  }

  public final void a(com.tencent.mm.kernel.b.h paramh, Object paramObject)
  {
    AppMethodBeat.i(57996);
    if (!this.eKr.containsKey(paramObject))
    {
      if (this.eKr.putIfAbsent(paramObject, this.eKr) == null)
        break label82;
      ab.i("MicroMsg.MMKernel", "Already add, skip[%s].", new Object[] { paramObject });
      AppMethodBeat.o(57996);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MMKernel", "Already add, skip it[%s].", new Object[] { paramObject });
      AppMethodBeat.o(57996);
      continue;
      label82: com.tencent.mm.kernel.a.c.Sa().add(paramObject);
      if ((paramObject instanceof ApplicationLifeCycle))
      {
        ApplicationLifeCycle localApplicationLifeCycle = (ApplicationLifeCycle)paramObject;
        paramh.eMA.aD(localApplicationLifeCycle);
      }
      if ((paramObject instanceof com.tencent.mm.kernel.api.d))
        this.eJn.aD((com.tencent.mm.kernel.api.d)paramObject);
      if ((paramObject instanceof com.tencent.mm.kernel.api.g))
        this.eKi.a((com.tencent.mm.kernel.api.g)paramObject);
      AppMethodBeat.o(57996);
    }
  }

  public final void a(com.tencent.mm.vending.h.d paramd)
  {
    AppMethodBeat.i(58018);
    this.eKi.a(paramd);
    AppMethodBeat.o(58018);
  }

  public final void b(com.tencent.mm.kernel.api.g paramg)
  {
    AppMethodBeat.i(57998);
    this.eKi.b(paramg);
    AppMethodBeat.o(57998);
  }

  public final void cn(boolean paramBoolean)
  {
    AppMethodBeat.i(58019);
    this.eKi.eKE.bi(paramBoolean);
    AppMethodBeat.o(58019);
  }

  public final void lL(String paramString)
  {
    AppMethodBeat.i(58016);
    ab.w("MicroMsg.MMKernel", "logoutAccount uin:%s info:%s stack:%s", new Object[] { com.tencent.mm.a.p.getString(a.QF()), paramString, bo.dpG() });
    a.lE(bo.dpG().toString() + paramString);
    this.eKm.QR().fu(a.QF());
    releaseAll();
    a.QM();
    a.cm(false);
    AppMethodBeat.o(58016);
  }

  public final void releaseAll()
  {
    AppMethodBeat.i(58017);
    long l = System.currentTimeMillis();
    if (this.eKm != null);
    for (String str = com.tencent.mm.a.p.getString(a.QF()); ; str = "-1")
    {
      ab.w("MicroMsg.MMKernel", "release uin:%s ", new Object[] { str });
      if (this.eKn.eJo != null)
        this.eKn.eJo.reset();
      com.tencent.mm.sdk.g.d.xDG.cin().shutdown();
      if (this.eKj != null)
        this.eKj.a(new al.b()
        {
          public final void wM()
          {
            AppMethodBeat.i(57990);
            com.tencent.mm.sdk.g.d.xDG.cin().reset();
            if (g.this.eKm != null)
              g.this.eKm.release();
            AppMethodBeat.o(57990);
          }
        });
      ab.i("MicroMsg.MMKernel", "release uin:%s finish!!! cost:%sms", new Object[] { str, Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(58017);
      return;
    }
  }

  static final class a extends com.tencent.mm.ci.a<p.a>
    implements p.a
  {
    public final void a(final com.tencent.mm.ai.p paramp)
    {
      AppMethodBeat.i(57994);
      a(new a.a()
      {
      });
      AppMethodBeat.o(57994);
    }

    public final void a(final com.tencent.mm.ai.p paramp, final boolean paramBoolean)
    {
      AppMethodBeat.i(57993);
      a(new a.a()
      {
      });
      AppMethodBeat.o(57993);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.g
 * JD-Core Version:    0.6.2
 */