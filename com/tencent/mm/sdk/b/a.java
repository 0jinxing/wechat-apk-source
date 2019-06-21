package com.tencent.mm.sdk.b;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.vending.h.d;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import junit.framework.Assert;

public final class a
{
  public static a xxA;
  private final HashMap<Integer, LinkedList<c>> xxB;
  private final HashMap<Integer, b> xxC;
  private a xxz;

  static
  {
    AppMethodBeat.i(115166);
    xxA = new a();
    AppMethodBeat.o(115166);
  }

  private a()
  {
    AppMethodBeat.i(115156);
    this.xxz = new a();
    this.xxB = new HashMap();
    this.xxC = new HashMap();
    AppMethodBeat.o(115156);
  }

  private void a(LinkedList<c> paramLinkedList, b paramb)
  {
    AppMethodBeat.i(115165);
    if (paramb.dnT())
      Collections.sort(paramLinkedList, new Comparator()
      {
      });
    c[] arrayOfc = new c[paramLinkedList.size()];
    paramLinkedList.toArray(arrayOfc);
    int i = arrayOfc.length;
    for (int j = 0; (j < i) && ((!arrayOfc[j].a(paramb)) || (!paramb.dnT())); j++);
    if (paramb.callback != null)
      paramb.callback.run();
    AppMethodBeat.o(115165);
  }

  public final void a(final b paramb, Looper paramLooper)
  {
    AppMethodBeat.i(115161);
    Assert.assertNotNull("EventPoolImpl.asyncPublish event", paramb);
    Assert.assertNotNull("EventPoolImpl.asyncPublish looper", paramLooper);
    ab.v("MicroMsg.EventCenter", "publish %s(%d)", new Object[] { paramb, Integer.valueOf(paramb.dnS()) });
    new ak(paramLooper).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(115146);
        a.xxA.m(paramb);
        AppMethodBeat.o(115146);
      }
    });
    AppMethodBeat.o(115161);
  }

  public final void a(final b paramb, Executor paramExecutor)
  {
    AppMethodBeat.i(115162);
    Assert.assertNotNull("EventPoolImpl.asyncPublish event", paramb);
    Assert.assertNotNull("EventPoolImpl.asyncPublish executor", paramExecutor);
    ab.v("MicroMsg.EventCenter", "publish %s(%d)", new Object[] { paramb, Integer.valueOf(paramb.dnS()) });
    paramExecutor.execute(new com.tencent.mm.sdk.g.d.b()
    {
      public final String getKey()
      {
        AppMethodBeat.i(115147);
        String str = paramb.getClass().getName();
        AppMethodBeat.o(115147);
        return str;
      }

      public final void run()
      {
        AppMethodBeat.i(115148);
        a.xxA.m(paramb);
        AppMethodBeat.o(115148);
      }
    });
    AppMethodBeat.o(115162);
  }

  public final boolean av(Class<? extends b> paramClass)
  {
    try
    {
      AppMethodBeat.i(115163);
      Assert.assertNotNull("EventPoolImpl.hasListener", paramClass);
      LinkedList localLinkedList = (LinkedList)this.xxB.get(Integer.valueOf(paramClass.getName().hashCode()));
      boolean bool;
      if ((localLinkedList != null) && (localLinkedList.size() > 0))
      {
        AppMethodBeat.o(115163);
        bool = true;
      }
      while (true)
      {
        return bool;
        paramClass = (b)this.xxC.get(Integer.valueOf(paramClass.getName().hashCode()));
        if ((paramClass != null) && (paramClass.size() > 0))
        {
          AppMethodBeat.o(115163);
          bool = true;
        }
        else
        {
          bool = false;
          AppMethodBeat.o(115163);
        }
      }
    }
    finally
    {
    }
    throw paramClass;
  }

  public final com.tencent.mm.vending.b.b<c> b(c paramc)
  {
    AppMethodBeat.i(115157);
    try
    {
      Assert.assertNotNull("EventPoolImpl.add", paramc);
      ab.v("MicroMsg.EventCenter", "addListener %s(%d)", new Object[] { paramc, Integer.valueOf(paramc.dnS()) });
      Object localObject1 = (b)this.xxC.get(Integer.valueOf(paramc.dnS()));
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = this.xxC;
        int i = paramc.dnS();
        localObject2 = new com/tencent/mm/sdk/b/a$b;
        ((b)localObject2).<init>(this);
        ((HashMap)localObject1).put(Integer.valueOf(i), localObject2);
      }
      paramc = ((b)localObject2).b(paramc);
      return paramc;
    }
    finally
    {
      AppMethodBeat.o(115157);
    }
    throw paramc;
  }

  @Deprecated
  public final boolean c(c paramc)
  {
    AppMethodBeat.i(115158);
    try
    {
      Assert.assertNotNull("EventPoolImpl.add", paramc);
      ab.v("MicroMsg.EventCenter", "addListener %s(%d)", new Object[] { paramc, Integer.valueOf(paramc.dnS()) });
      Object localObject1 = (LinkedList)this.xxB.get(Integer.valueOf(paramc.dnS()));
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = this.xxB;
        int i = paramc.dnS();
        localObject2 = new java/util/LinkedList;
        ((LinkedList)localObject2).<init>();
        ((HashMap)localObject1).put(Integer.valueOf(i), localObject2);
      }
      boolean bool;
      if (((LinkedList)localObject2).contains(paramc))
      {
        AppMethodBeat.o(115158);
        bool = true;
      }
      while (true)
      {
        return bool;
        ListenerInstanceMonitor.cA(paramc);
        bool = ((LinkedList)localObject2).add(paramc);
        AppMethodBeat.o(115158);
      }
    }
    finally
    {
      AppMethodBeat.o(115158);
    }
    throw paramc;
  }

  @Deprecated
  public final boolean d(c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(115159);
    while (true)
      try
      {
        Assert.assertNotNull("EventPoolImpl.remove", paramc);
        ab.v("MicroMsg.EventCenter", "removeListener %s(%d)", new Object[] { paramc, Integer.valueOf(paramc.dnS()) });
        Object localObject = (LinkedList)this.xxB.get(Integer.valueOf(paramc.dnS()));
        if (localObject != null)
          bool = ((LinkedList)localObject).remove(paramc);
        localObject = (b)this.xxC.get(Integer.valueOf(paramc.dnS()));
        if (localObject != null)
        {
          ((b)localObject).f(paramc);
          bool = true;
          ListenerInstanceMonitor.cB(paramc);
          return bool;
        }
      }
      finally
      {
        AppMethodBeat.o(115159);
      }
  }

  public final boolean e(c paramc)
  {
    try
    {
      AppMethodBeat.i(115164);
      Assert.assertNotNull("EventPoolImpl.hadListened", paramc);
      Object localObject = (LinkedList)this.xxB.get(Integer.valueOf(paramc.dnS()));
      boolean bool;
      if ((localObject != null) && (!((LinkedList)localObject).isEmpty()) && (((LinkedList)localObject).contains(paramc)))
      {
        AppMethodBeat.o(115164);
        bool = true;
      }
      while (true)
      {
        return bool;
        localObject = (b)this.xxC.get(Integer.valueOf(paramc.dnS()));
        if ((localObject != null) && (((b)localObject).size() > 0) && (((b)localObject).contains(paramc)))
        {
          AppMethodBeat.o(115164);
          bool = true;
        }
        else
        {
          bool = false;
          AppMethodBeat.o(115164);
        }
      }
    }
    finally
    {
    }
    throw paramc;
  }

  public final boolean m(b paramb)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(115160);
    Assert.assertNotNull("EventPoolImpl.publish", paramb);
    ab.v("MicroMsg.EventCenter", "publish %s(%d)", new Object[] { paramb, Integer.valueOf(paramb.dnS()) });
    LinkedList localLinkedList = null;
    while (true)
      try
      {
        int i = paramb.dnS();
        Object localObject = (LinkedList)this.xxB.get(Integer.valueOf(i));
        if (localObject != null)
        {
          localLinkedList = new java/util/LinkedList;
          localLinkedList.<init>((Collection)localObject);
          bool1 = true;
        }
        localObject = (b)this.xxC.get(Integer.valueOf(i));
        if (localObject != null)
        {
          bool1 = bool2;
          if (!bool1)
            ab.w("MicroMsg.EventCenter", "No listener for this event %s(%d), Stack: %s.", new Object[] { paramb, Integer.valueOf(i), "" });
          if (localLinkedList != null)
            a(localLinkedList, paramb);
          if (localObject != null)
            ((b)localObject).a(f.cV(paramb));
          AppMethodBeat.o(115160);
          return bool1;
        }
      }
      finally
      {
        AppMethodBeat.o(115160);
      }
  }

  public static final class a extends d
  {
    public final void cancel()
    {
    }

    public final String getType()
    {
      AppMethodBeat.i(115151);
      String str = Thread.currentThread().toString();
      AppMethodBeat.o(115151);
      return str;
    }

    public final void l(Runnable paramRunnable, long paramLong)
    {
      AppMethodBeat.i(115150);
      paramRunnable.run();
      AppMethodBeat.o(115150);
    }

    public final void o(Runnable paramRunnable)
    {
      AppMethodBeat.i(115149);
      paramRunnable.run();
      AppMethodBeat.o(115149);
    }
  }

  final class b extends com.tencent.mm.vending.b.a<c>
  {
    public b()
    {
      super();
      AppMethodBeat.i(115152);
      AppMethodBeat.o(115152);
    }

    public final void a(com.tencent.mm.vending.j.a parama)
    {
      AppMethodBeat.i(115153);
      LinkedList localLinkedList = dMf();
      parama = (b)parama.get(0);
      if (parama == null)
      {
        ab.e("MicroMsg.EventCenter", "event is null! fatal!");
        AppMethodBeat.o(115153);
      }
      while (true)
      {
        return;
        if (parama.dnT())
          Collections.sort(localLinkedList, new Comparator()
          {
          });
        com.tencent.mm.vending.b.b[] arrayOfb = new com.tencent.mm.vending.b.b[localLinkedList.size()];
        localLinkedList.toArray(arrayOfb);
        int i = arrayOfb.length;
        for (int j = 0; (j < i) && ((!((c)arrayOfb[j].d).a(parama)) || (!parama.dnT())); j++);
        if (parama.callback != null)
          parama.callback.run();
        AppMethodBeat.o(115153);
      }
    }

    public final com.tencent.mm.vending.b.b<c> b(c paramc)
    {
      AppMethodBeat.i(115154);
      paramc = a(new com.tencent.mm.vending.b.b(paramc, this));
      AppMethodBeat.o(115154);
      return paramc;
    }

    public final void f(c paramc)
    {
      AppMethodBeat.i(115155);
      b(new com.tencent.mm.vending.b.b(paramc, this));
      AppMethodBeat.o(115155);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.b.a
 * JD-Core Version:    0.6.2
 */