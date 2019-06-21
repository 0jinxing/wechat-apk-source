package com.tencent.mm.kernel.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.e.b;
import com.tencent.mm.kernel.a.b.f.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.aj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.api.e, com.tencent.mm.kernel.api.f
{
  private static c eKZ;
  public static com.tencent.mm.vending.c.a<Void, f.a> eLc;
  public static com.tencent.mm.vending.c.a<Void, f.a> eLd;
  public static com.tencent.mm.vending.c.a<Void, f.a> eLe;
  private static Map<Integer, Map> eLf;
  private boolean eKR;
  public final com.tencent.mm.kernel.a.b.g eKS;
  public final com.tencent.mm.kernel.a.b.g eKT;
  public final com.tencent.mm.kernel.a.b.g eKU;
  public final b eKV;
  public final c eKW;
  public final a eKX;
  public final d eKY;
  public volatile boolean eLa;
  private AtomicBoolean eLb;
  private Set<Looper> eLg;
  private ConcurrentHashMap<Object, e> eLh;
  private ConcurrentHashMap eLi;

  static
  {
    AppMethodBeat.i(58073);
    eKZ = new c();
    eLc = new com.tencent.mm.vending.c.a()
    {
    };
    eLd = new com.tencent.mm.vending.c.a()
    {
    };
    eLe = new com.tencent.mm.vending.c.a()
    {
    };
    eLf = new ConcurrentHashMap();
    AppMethodBeat.o(58073);
  }

  private c()
  {
    AppMethodBeat.i(58050);
    this.eKR = true;
    this.eKS = new com.tencent.mm.kernel.a.b.g();
    this.eKT = new com.tencent.mm.kernel.a.b.g();
    this.eKU = new com.tencent.mm.kernel.a.b.g();
    this.eKV = new b((byte)0);
    this.eKW = new c();
    this.eKX = new a();
    this.eKY = new d();
    this.eLa = false;
    this.eLb = new AtomicBoolean(false);
    this.eLg = new HashSet();
    this.eLh = new ConcurrentHashMap();
    this.eLi = new ConcurrentHashMap();
    AppMethodBeat.o(58050);
  }

  public static c Sa()
  {
    return eKZ;
  }

  private boolean Sb()
  {
    AppMethodBeat.i(58061);
    boolean bool;
    if (!((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
    {
      AppMethodBeat.o(58061);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.eLg.contains(Looper.myLooper()))
      {
        ab.d("MicroMsg.CallbacksProxy", "Invalidate scene, it not allows to load alone in this thread(%s), illegal.", new Object[] { Looper.myLooper() });
        AppMethodBeat.o(58061);
        bool = false;
      }
      else if (!com.tencent.mm.kernel.g.RQ().eKi.eKC)
      {
        ab.e("MicroMsg.CallbacksProxy", "Invalidate scene, kernel does not startup done.");
        AppMethodBeat.o(58061);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(58061);
        bool = true;
      }
    }
  }

  private void Sc()
  {
    AppMethodBeat.i(58064);
    Iterator localIterator = this.eLi.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      com.tencent.mm.kernel.g.RQ().a((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn(), localObject);
      eKZ.aA(localObject);
    }
    AppMethodBeat.o(58064);
  }

  private static void Se()
  {
    AppMethodBeat.i(58067);
    c localc = eKZ;
    Iterator localIterator = com.tencent.mm.kernel.g.RL().Rm().iterator();
    while (localIterator.hasNext())
      localc.aA((com.tencent.mm.kernel.b.f)localIterator.next());
    com.tencent.mm.blink.a.jD("makePluginsParallelsDependency");
    AppMethodBeat.o(58067);
  }

  private void Sf()
  {
    AppMethodBeat.i(58068);
    com.tencent.mm.blink.a.jD("configureAndExecutePendingPlugins");
    this.eKT.b(com.tencent.mm.kernel.b.b.class, false);
    com.tencent.mm.kernel.a.b.e.Sq().a(new e.b(), eLc, this.eKT, "configure-functional from pending plugins");
    this.eKS.b(com.tencent.mm.kernel.a.c.b.class, false);
    com.tencent.mm.kernel.a.b.e.Sq().a(new e.b(), eLd, this.eKS, "task-functional from pending plugins");
    com.tencent.mm.blink.a.jD("configureAndExecutePendingPlugins done");
    AppMethodBeat.o(58068);
  }

  private void Sg()
  {
    AppMethodBeat.i(58069);
    if ((!((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG()) || (!com.tencent.mm.kernel.g.RN().QY()))
      AppMethodBeat.o(58069);
    while (true)
    {
      return;
      this.eKU.b(com.tencent.mm.kernel.api.h.class, false);
      com.tencent.mm.kernel.a.b.e locale = com.tencent.mm.kernel.a.b.e.Sq();
      locale.a(new e.b(), eLe, this.eKU);
      this.eKU.SD();
      locale.start("account-init from pending plugins");
      locale.Ss();
      AppMethodBeat.o(58069);
    }
  }

  private static void a(com.tencent.mm.kernel.a.b.g paramg)
  {
    AppMethodBeat.i(58066);
    Object localObject = paramg.SC();
    if (((Map)localObject).size() > 0);
    StringBuilder localStringBuilder;
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.CallbacksProxy", "do parallels result check, %s for %s", new Object[] { Boolean.valueOf(bool), paramg });
      if (((Map)localObject).size() <= 0)
        break label207;
      com.tencent.mm.blink.a.s(0L, 1L);
      paramg = new HashMap();
      localStringBuilder = new StringBuilder();
      Iterator localIterator = ((Map)localObject).keySet().iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.kernel.a.b.f localf = (com.tencent.mm.kernel.a.b.f)localIterator.next();
        List localList = (List)((Map)localObject).get(localf);
        localStringBuilder.append(localf.eLT);
        localStringBuilder.append(" : ");
        localStringBuilder.append(localList.toString());
        localStringBuilder.append("\n");
      }
    }
    localObject = localStringBuilder.toString();
    ab.e("MicroMsg.CallbacksProxy", "unconsumed message %s", new Object[] { localObject });
    ab.e("MicroMsg.CallbacksProxy", "maybe cycle dependencies");
    com.tencent.mm.plugin.report.e.pXa.g("BlinkStartup", (String)localObject, paramg);
    label207: AppMethodBeat.o(58066);
  }

  public static boolean a(com.tencent.mm.kernel.a.b.g paramg, Class paramClass, Object paramObject)
  {
    AppMethodBeat.i(58051);
    paramg = (f.a)paramg.S(paramClass).aF(paramObject);
    boolean bool;
    if (paramg == null)
    {
      bool = false;
      AppMethodBeat.o(58051);
    }
    while (true)
    {
      return bool;
      bool = paramg.eLB;
      AppMethodBeat.o(58051);
    }
  }

  public final void RV()
  {
    AppMethodBeat.i(138427);
    this.eKY.RV();
    AppMethodBeat.o(138427);
  }

  public final void Sd()
  {
    AppMethodBeat.i(58065);
    com.tencent.mm.blink.a.jD("initializePendingPlugins");
    if (this.eLb.compareAndSet(false, true))
    {
      ab.i("MicroMsg.CallbacksProxy", "initialize pending plugins.");
      Se();
      Sc();
      Sf();
      Sg();
      this.eLa = true;
      if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
        com.tencent.mm.kernel.g.RN().QQ();
      com.tencent.mm.blink.a.jD("initializePendingPlugins done");
      if (((com.tencent.mm.protocal.d.vxr) || (com.tencent.mm.protocal.d.vxq)) && (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG()) && (com.tencent.mm.kernel.g.RN().QY()))
      {
        a(this.eKS);
        a(this.eKT);
        a(this.eKU);
      }
      com.tencent.mm.kernel.a.b.e.Sq();
      com.tencent.mm.blink.a.jD("checkAllUnConsumed done");
    }
    AppMethodBeat.o(58065);
  }

  public final void aA(Object paramObject)
  {
    AppMethodBeat.i(58052);
    if (!((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
    {
      ab.d("MicroMsg.CallbacksProxy", "Not main process, skip making parallels dependencies.");
      AppMethodBeat.o(58052);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.kernel.f.ay(paramObject))
      {
        ab.printErrStackTrace("MicroMsg.CallbacksProxy", new RuntimeException(), "Found dummy subject!", new Object[0]);
        AppMethodBeat.o(58052);
      }
      else
      {
        this.eKU.aN(paramObject);
        AppMethodBeat.o(58052);
      }
    }
  }

  public final void aB(Object paramObject)
  {
    AppMethodBeat.i(58062);
    if ((!this.eLb.get()) || (this.eLa))
      AppMethodBeat.o(58062);
    while (true)
    {
      return;
      if (!Sb())
      {
        ab.d("MicroMsg.CallbacksProxy", "Invalidate scene for subject %s to load account-init alone.", new Object[] { paramObject });
        AppMethodBeat.o(58062);
        continue;
      }
      if (!this.eLh.containsKey(paramObject))
        this.eLh.putIfAbsent(paramObject, new e());
      e locale = (e)this.eLh.get(paramObject);
      if (!locale.Sh())
      {
        AppMethodBeat.o(58062);
        continue;
      }
      long l = System.currentTimeMillis();
      ab.i("MicroMsg.CallbacksProxy", "loadAlone for subject %s", new Object[] { paramObject });
      ab.printErrStackTrace("MicroMsg.CallbacksProxy", new RuntimeException(), "loadAlone", new Object[0]);
      if (!this.eKU.aM(paramObject))
      {
        ab.e("MicroMsg.CallbacksProxy", "This subject(%s) has not made dependency while loading alone.");
        this.eKU.aN(paramObject);
      }
      try
      {
        locale.jS(1);
        f.a locala;
        if ((paramObject instanceof com.tencent.mm.kernel.b.f))
        {
          if (!((com.tencent.mm.kernel.b.f)paramObject).isConfigured())
          {
            locala = this.eKT.S(com.tencent.mm.kernel.b.b.class).aK((com.tencent.mm.kernel.b.b)paramObject);
            Assert.assertNotNull(locala);
            locala.a(eLc);
          }
          locala = this.eKS.S(com.tencent.mm.kernel.a.c.b.class).aK((com.tencent.mm.kernel.a.c.b)paramObject);
          Assert.assertNotNull(locala);
          locala.a(eLd);
        }
        if (!com.tencent.mm.kernel.g.RN().QY())
        {
          ab.i("MicroMsg.CallbacksProxy", "account not init, return.");
          locale.jS(2);
          ab.i("MicroMsg.CallbacksProxy", "Subject(%s) load alone spend %sms", new Object[] { paramObject, Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(58062);
          continue;
        }
        if ((paramObject instanceof com.tencent.mm.kernel.api.h))
        {
          locala = this.eKU.S(com.tencent.mm.kernel.api.h.class).aK((com.tencent.mm.kernel.api.h)paramObject);
          Assert.assertNotNull(locala);
          locala.a(eLe);
        }
        if ((paramObject instanceof com.tencent.mm.kernel.api.a))
        {
          locala = this.eKU.S(com.tencent.mm.kernel.api.a.class).aK((com.tencent.mm.kernel.api.a)paramObject);
          Assert.assertNotNull(locala);
          locala.a(eLe);
        }
        if ((paramObject instanceof aj))
        {
          locala = this.eKU.S(aj.class).aK((aj)paramObject);
          Assert.assertNotNull(locala);
          locala.a(eLe);
        }
        if ((paramObject instanceof com.tencent.mm.kernel.api.e))
        {
          locala = this.eKU.S(com.tencent.mm.kernel.api.e.class).aK((com.tencent.mm.kernel.api.e)paramObject);
          Assert.assertNotNull(locala);
          locala.a(eLe);
        }
        if ((paramObject instanceof com.tencent.mm.kernel.api.f))
        {
          locala = this.eKU.S(com.tencent.mm.kernel.api.f.class).aK((com.tencent.mm.kernel.api.f)paramObject);
          Assert.assertNotNull(locala);
          locala.a(eLe);
        }
        locale.jS(2);
        ab.i("MicroMsg.CallbacksProxy", "Subject(%s) load alone spend %sms", new Object[] { paramObject, Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(58062);
      }
      finally
      {
        locale.jS(2);
        ab.i("MicroMsg.CallbacksProxy", "Subject(%s) load alone spend %sms", new Object[] { paramObject, Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(58062);
      }
    }
  }

  public final void aC(Object paramObject)
  {
    AppMethodBeat.i(58063);
    ab.i("MicroMsg.CallbacksProxy", "add pending callbacks %s", new Object[] { paramObject });
    this.eLi.putIfAbsent(paramObject, this.eLi);
    AppMethodBeat.o(58063);
  }

  public final void add(Object paramObject)
  {
    AppMethodBeat.i(58059);
    if ((paramObject instanceof com.tencent.mm.kernel.api.f))
      this.eKV.aD((com.tencent.mm.kernel.api.f)paramObject);
    if ((paramObject instanceof com.tencent.mm.kernel.api.e))
      this.eKW.aD((com.tencent.mm.kernel.api.e)paramObject);
    if ((paramObject instanceof com.tencent.mm.kernel.api.b))
      this.eKX.a((com.tencent.mm.kernel.api.b)paramObject);
    if ((paramObject instanceof com.tencent.mm.kernel.api.f))
      this.eKY.a((com.tencent.mm.kernel.api.f)paramObject);
    AppMethodBeat.o(58059);
  }

  public final void d(Looper paramLooper)
  {
    AppMethodBeat.i(58060);
    ab.i("MicroMsg.CallbacksProxy", "Thread(%s) not allow load-alone.", new Object[] { paramLooper });
    this.eLg.add(paramLooper);
    AppMethodBeat.o(58060);
  }

  public final void lM(String paramString)
  {
    AppMethodBeat.i(58054);
    this.eKX.lN(paramString);
    this.eKY.lM(paramString);
    AppMethodBeat.o(58054);
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(58055);
    if (this.eKR)
    {
      com.tencent.mm.blink.a.jD("beforeAccountInit");
      this.eKU.b(com.tencent.mm.kernel.api.f.class, true);
      paramc = com.tencent.mm.kernel.a.b.e.Sq();
      paramc.a(new e.b(), eLe, this.eKU);
      this.eKU.SD();
      paramc.start("account-init from onAccountInitialized");
      paramc.Ss();
      AppMethodBeat.o(58055);
    }
    while (true)
    {
      return;
      this.eKV.onAccountInitialized(paramc);
      AppMethodBeat.o(58055);
    }
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(58056);
    this.eKV.onAccountRelease();
    this.eKU.b(com.tencent.mm.kernel.api.h.class, true);
    AppMethodBeat.o(58056);
  }

  public final void onDataBaseClosed(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
    AppMethodBeat.i(58058);
    this.eKW.onDataBaseClosed(paramh1, paramh2);
    AppMethodBeat.o(58058);
  }

  public final void onDataBaseOpened(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
    AppMethodBeat.i(58057);
    if (!this.eKR)
      this.eKW.onDataBaseOpened(paramh1, paramh2);
    AppMethodBeat.o(58057);
  }

  public static final class a extends com.tencent.mm.ci.a<com.tencent.mm.kernel.api.b>
    implements com.tencent.mm.kernel.api.b
  {
    private boolean eLk = false;

    private static void b(List<String> paramList, String paramString)
    {
      AppMethodBeat.i(58031);
      String[] arrayOfString = new String[paramList.size() + 1];
      arrayOfString[0] = paramString;
      for (int i = 0; i < paramList.size(); i++)
        arrayOfString[(i + 1)] = (paramString + (String)paramList.get(i));
      com.tencent.mm.a.e.f(arrayOfString);
      AppMethodBeat.o(58031);
    }

    public final com.tencent.mm.vending.b.b<com.tencent.mm.kernel.api.b> a(com.tencent.mm.kernel.api.b paramb)
    {
      try
      {
        AppMethodBeat.i(58028);
        com.tencent.mm.vending.b.b localb = super.aD(paramb);
        if (this.eLk)
        {
          List localList = paramb.collectStoragePaths();
          if ((localList != null) && (localList.size() > 0))
            b(localList, com.tencent.mm.kernel.g.RP().eJM);
          ab.i("MicroMsg.CallbacksProxy", "collectStoragePaths has been called. cb %s", new Object[] { paramb });
        }
        AppMethodBeat.o(58028);
        return localb;
      }
      finally
      {
      }
      throw paramb;
    }

    public final List<String> collectStoragePaths()
    {
      AppMethodBeat.i(58029);
      Object localObject1 = dMf();
      LinkedList localLinkedList = new LinkedList();
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (com.tencent.mm.vending.b.b)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = ((com.tencent.mm.kernel.api.b)((com.tencent.mm.vending.b.b)localObject2).d).collectStoragePaths();
          if (localObject2 != null)
            localLinkedList.addAll((Collection)localObject2);
        }
      }
      AppMethodBeat.o(58029);
      return localLinkedList;
    }

    public final void lN(String paramString)
    {
      try
      {
        AppMethodBeat.i(58030);
        List localList = collectStoragePaths();
        this.eLk = true;
        ab.i("MicroMsg.CallbacksProxy", "all account storage folder %s", new Object[] { localList.toString() });
        b(localList, paramString);
        AppMethodBeat.o(58030);
        return;
      }
      finally
      {
        paramString = finally;
      }
      throw paramString;
    }
  }

  public static final class b extends com.tencent.mm.ci.a<com.tencent.mm.kernel.api.c>
    implements com.tencent.mm.kernel.api.c
  {
    public final void onAccountInitialized(final e.c paramc)
    {
      AppMethodBeat.i(58035);
      a(new com.tencent.mm.ci.a.a()
      {
      });
      AppMethodBeat.o(58035);
    }

    public final void onAccountRelease()
    {
      AppMethodBeat.i(58036);
      a(new com.tencent.mm.ci.a.a()
      {
      });
      AppMethodBeat.o(58036);
    }
  }

  public static final class c extends com.tencent.mm.ci.a<com.tencent.mm.kernel.api.e>
    implements com.tencent.mm.kernel.api.e
  {
    public final void onDataBaseClosed(final com.tencent.mm.cd.h paramh1, final com.tencent.mm.cd.h paramh2)
    {
      AppMethodBeat.i(58041);
      a(new com.tencent.mm.ci.a.a()
      {
      });
      AppMethodBeat.o(58041);
    }

    public final void onDataBaseOpened(final com.tencent.mm.cd.h paramh1, final com.tencent.mm.cd.h paramh2)
    {
      AppMethodBeat.i(58040);
      a(new com.tencent.mm.ci.a.a()
      {
      });
      AppMethodBeat.o(58040);
    }
  }

  public static final class d extends com.tencent.mm.ci.a<com.tencent.mm.kernel.api.f>
    implements com.tencent.mm.kernel.api.f
  {
    private boolean eLq = false;
    private String eLr;

    public final void RV()
    {
      AppMethodBeat.i(58044);
      a(new com.tencent.mm.ci.a.a()
      {
      });
      AppMethodBeat.o(58044);
    }

    public final com.tencent.mm.vending.b.b<com.tencent.mm.kernel.api.f> a(com.tencent.mm.kernel.api.f paramf)
    {
      try
      {
        AppMethodBeat.i(58045);
        com.tencent.mm.vending.b.b localb = super.aD(paramf);
        if (this.eLq)
        {
          paramf.lM(this.eLr);
          ab.i("MicroMsg.CallbacksProxy", "onAccountPathChanged has been called. cb %s", new Object[] { paramf });
        }
        AppMethodBeat.o(58045);
        return localb;
      }
      finally
      {
      }
      throw paramf;
    }

    public final void lM(String paramString)
    {
      try
      {
        AppMethodBeat.i(58046);
        com.tencent.mm.ci.a.a local2 = new com/tencent/mm/kernel/a/c$d$2;
        local2.<init>(this, paramString);
        a(local2);
        this.eLq = true;
        this.eLr = paramString;
        AppMethodBeat.o(58046);
        return;
      }
      finally
      {
        paramString = finally;
      }
      throw paramString;
    }
  }

  static final class e
  {
    private long eLu;
    private int mStatus;

    public e()
    {
      AppMethodBeat.i(58048);
      this.eLu = 0L;
      this.mStatus = 0;
      this.eLu = Thread.currentThread().getId();
      AppMethodBeat.o(58048);
    }

    public final boolean Sh()
    {
      boolean bool = false;
      while (true)
      {
        try
        {
          AppMethodBeat.i(58049);
          if ((this.mStatus == 1) && (this.eLu == Thread.currentThread().getId()))
          {
            AppMethodBeat.o(58049);
            return bool;
          }
          if (this.mStatus == 2)
          {
            AppMethodBeat.o(58049);
            continue;
          }
        }
        finally
        {
        }
        AppMethodBeat.o(58049);
        bool = true;
      }
    }

    public final void jS(int paramInt)
    {
      try
      {
        if (paramInt > this.mStatus)
          this.mStatus = paramInt;
        return;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.c
 * JD-Core Version:    0.6.2
 */