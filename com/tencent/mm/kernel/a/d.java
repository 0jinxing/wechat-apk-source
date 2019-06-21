package com.tencent.mm.kernel.a;

import android.os.HandlerThread;
import com.tencent.mm.blink.b.2;
import com.tencent.mm.blink.b.b;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.g.a.ml;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.kernel.a.b.e.b;
import com.tencent.mm.kernel.a.b.e.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.aj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class d
  implements b
{
  public com.tencent.mm.kernel.a.b.e<Object> eLv = com.tencent.mm.kernel.a.b.e.Sr();
  private final HashSet<String> eLw = new HashSet();

  public static void Q(Class<? extends f> paramClass)
  {
    com.tencent.mm.kernel.g.RL().I(paramClass);
  }

  protected static void lO(String paramString)
  {
    com.tencent.mm.kernel.g.RL().lH(paramString);
  }

  public void Bd()
  {
    boolean bool = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG();
    double d1 = n.getNumCores();
    if (bool);
    for (double d2 = 1.5D; ; d2 = 1.0D)
    {
      int i = (int)Math.min(Math.floor(d2 * d1), 6.0D);
      ab.i("MicroMsg.ParallelsBootStep", "core num %s for parallels", new Object[] { Integer.valueOf(i) });
      this.eLv.init(i);
      c localc = c.Sa();
      localc.eKT.a(new Class[] { com.tencent.mm.kernel.b.b.class });
      localc.eKS.a(new Class[] { com.tencent.mm.kernel.a.c.b.class });
      localc.eKU.a(new Class[] { com.tencent.mm.kernel.api.h.class, com.tencent.mm.kernel.api.a.class, com.tencent.mm.kernel.api.e.class, aj.class, com.tencent.mm.kernel.api.c.class });
      Object localObject = localc.eKU;
      ((com.tencent.mm.kernel.a.b.g)localObject).eMg = new Class[1];
      localObject = ((com.tencent.mm.kernel.a.b.g)localObject).eMg;
      System.arraycopy(new Class[] { com.tencent.mm.kernel.api.c.class }, 0, localObject, 0, 1);
      ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eJE.eKM = new c.1(localc);
      com.tencent.mm.blink.a.jD("helloWeChat");
      return;
    }
  }

  public boolean Bg()
  {
    return true;
  }

  public final void RY()
  {
    com.tencent.mm.kernel.g.RL().Rl();
    this.eLv.prepare();
    Iterator localIterator = this.eLv.St().iterator();
    while (localIterator.hasNext())
    {
      e.c localc = (e.c)localIterator.next();
      c.Sa().d(localc.cet.getLooper());
    }
    com.tencent.mm.blink.a.jD("makeDependency");
  }

  public final void RZ()
  {
    this.eLv.a(new e.b(), c.eLd, c.Sa().eKS, "task-functional plugins");
    com.tencent.mm.blink.a.jD("executeTasks");
  }

  public void a(com.tencent.mm.kernel.b.g paramg)
  {
    this.eLv.a(new e.b(), c.eLc, c.Sa().eKT, "configure-functional plugins");
    com.tencent.mm.blink.a.jD("configurePlugins");
    paramg = new ml();
    com.tencent.mm.sdk.b.a.xxA.m(paramg);
  }

  public void b(com.tencent.mm.kernel.b.g paramg)
  {
    a.k("startup final step, account initialize... for parallels", new Object[0]);
    Object localObject1;
    Object localObject2;
    if (paramg.SG())
    {
      localObject1 = c.Sa();
      localObject2 = com.tencent.mm.kernel.g.RL().Rm().iterator();
      while (((Iterator)localObject2).hasNext())
        ((c)localObject1).aA((f)((Iterator)localObject2).next());
      if (com.tencent.mm.kernel.g.RN().QY())
        com.tencent.mm.kernel.g.RN().QP();
    }
    com.tencent.mm.blink.a.jD("installPendingPlugins");
    long l = System.nanoTime();
    if (this.eLw.size() > 0)
    {
      localObject1 = this.eLw.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RL().u((String)localObject2, true);
      }
      this.eLw.clear();
      com.tencent.mm.blink.a.h("installPendingPlugins installed", l);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RL().Rl();
      com.tencent.mm.blink.a.jD("installPendingPlugins dependency made.");
      localObject2 = new mm();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
    }
    boolean bool = Bg();
    int i;
    if ((paramg.SG()) && (com.tencent.mm.kernel.g.RN().QY()))
    {
      i = 1;
      if ((i != 0) && (!bool))
        com.tencent.mm.kernel.g.RN().QZ();
      paramg = com.tencent.mm.blink.b.HQ();
      ab.i("MicroMsg.FirstScreenArrangement", "arrangeInitializePendingPlugins now? %s", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        break label291;
      paramg.a(b.b.ebo);
    }
    while (true)
    {
      if ((i != 0) && (bool))
        com.tencent.mm.kernel.g.RN().QZ();
      com.tencent.mm.blink.a.jD("afterAccountInit");
      return;
      i = 0;
      break;
      label291: al.n(new b.2(paramg), 1000L);
    }
  }

  protected final void lP(String paramString)
  {
    this.eLw.add(paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.d
 * JD-Core Version:    0.6.2
 */