package com.tencent.mm.kernel.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class g
  implements com.tencent.mm.kernel.a.a.b, c<Object>, d<Object>
{
  private Map<Class<?>, f<Object>> eMe;
  private Class<?>[] eMf;
  public volatile Class<?>[] eMg;
  public Map<Class, Object> eMh;
  private int eMi;
  private Queue<f.a> eMj;
  private ConcurrentHashMap<Object, a> eMk;

  public g()
  {
    AppMethodBeat.i(123345);
    this.eMe = new ConcurrentHashMap();
    this.eMh = new ConcurrentHashMap();
    this.eMi = 0;
    this.eMj = new ConcurrentLinkedQueue();
    this.eMk = new ConcurrentHashMap();
    AppMethodBeat.o(123345);
  }

  private boolean R(Class paramClass)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    int j;
    if (this.eMg != null)
    {
      Class[] arrayOfClass = this.eMg;
      int i = arrayOfClass.length;
      j = 0;
      if (j >= i)
        break label51;
      if (arrayOfClass[j] != paramClass)
        break label45;
    }
    label45: label51: for (bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      j++;
      break;
    }
  }

  private int T(Class paramClass)
  {
    int i = 0;
    if (i < this.eMf.length)
      if (this.eMf[i] != paramClass);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  private f.a c(Class paramClass, Object paramObject)
  {
    AppMethodBeat.i(123358);
    f localf = S(paramClass);
    f.a locala = (f.a)localf.aF(paramObject);
    ab.d("MicroMsg.ParallelsManagement", "makeDependency on IDependency of type %s for %s with %s", new Object[] { paramClass, paramObject, localf });
    Object localObject = locala;
    if (locala == null)
    {
      localObject = this.eMh.get(paramClass);
      paramClass = (Class)localObject;
      if (localObject == null)
        paramClass = paramObject;
      localf.n(paramObject, paramClass);
      localObject = (f.a)localf.aF(paramObject);
    }
    AppMethodBeat.o(123358);
    return localObject;
  }

  public final <T> f<T> S(Class<T> paramClass)
  {
    AppMethodBeat.i(123348);
    paramClass = (f)this.eMe.get(paramClass);
    AppMethodBeat.o(123348);
    return paramClass;
  }

  public final Map<f, List<com.tencent.mm.kernel.a.a.a.a>> SC()
  {
    AppMethodBeat.i(123347);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.eMe.values().iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      List localList = localf.Sw();
      if (localList.size() > 0)
        localHashMap.put(localf, localList);
    }
    AppMethodBeat.o(123347);
    return localHashMap;
  }

  public final void SD()
  {
    AppMethodBeat.i(123351);
    synchronized (this.eMf)
    {
      if (this.eMf.length <= this.eMi)
      {
        AppMethodBeat.o(123351);
        return;
      }
      prepare();
    }
  }

  public final f.a Sp()
  {
    AppMethodBeat.i(123352);
    synchronized (this.eMj)
    {
      f.a locala = (f.a)this.eMj.poll();
      AppMethodBeat.o(123352);
      return locala;
    }
  }

  public final void a(f.a parama)
  {
    AppMethodBeat.i(123353);
    ab.i("MicroMsg.ParallelsManagement", "ParallelsManagement resolvedOne %s for type %s then next %s", new Object[] { parama, parama.eMa.eLE, parama.eMa.eMn });
    S(parama.eMa.eLE).a(parama);
    if (parama.eMa.eMn != null)
      S(parama.eMa.eMn).aL(parama);
    AppMethodBeat.o(123353);
  }

  public final void a(Class paramClass, Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(123355);
    if (R(paramClass))
    {
      paramClass = S(paramClass);
      if (paramClass != null)
        paramClass.n(paramObject1, paramObject2);
      AppMethodBeat.o(123355);
    }
    while (true)
    {
      return;
      j.w("MicroMsg.ParallelsManagement", "Not allow phase(%s) has dependency", new Object[] { paramClass });
      AppMethodBeat.o(123355);
    }
  }

  public final void a(Class[] paramArrayOfClass)
  {
    int i = 0;
    AppMethodBeat.i(123346);
    this.eMf = new Class[paramArrayOfClass.length];
    System.arraycopy(paramArrayOfClass, 0, this.eMf, 0, paramArrayOfClass.length);
    while (i < this.eMf.length)
    {
      this.eMe.put(this.eMf[i], new f(this.eMf[i], this, this));
      i++;
    }
    AppMethodBeat.o(123346);
  }

  public final boolean aM(Object paramObject)
  {
    AppMethodBeat.i(123356);
    paramObject = (a)this.eMk.get(paramObject);
    boolean bool;
    if ((paramObject != null) && (paramObject.SE()))
    {
      bool = true;
      AppMethodBeat.o(123356);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123356);
    }
  }

  public final void aN(Object arg1)
  {
    int i = 0;
    AppMethodBeat.i(123357);
    if (!this.eMk.containsKey(???))
      this.eMk.putIfAbsent(???, new a((byte)0));
    a locala = (a)this.eMk.get(???);
    while (true)
    {
      int j;
      synchronized (locala.eMl)
      {
        if (locala.eMl[0] == 2)
        {
          if (locala.SE())
          {
            j.i("MicroMsg.ParallelsManagement", "%s Has done. return.", new Object[] { ??? });
            AppMethodBeat.o(123357);
          }
        }
        else
        {
          j = locala.eMl[0];
          if (j != 1);
        }
      }
      try
      {
        locala.eMl.wait();
        while (true)
        {
          label118: break;
          ??? = finally;
          AppMethodBeat.o(123357);
          throw ???;
          locala.eMl[0] = ((byte)1);
        }
        j.d("MicroMsg.ParallelsManagement", "Make dependency on subject(%s), hashcode(%s)", new Object[] { ???, Integer.valueOf(???.hashCode()) });
        Object localObject4;
        if ((??? instanceof b))
        {
          a.start();
          ((b)???).parallelsDependency();
          ??? = a.So();
          if (((a.b)???).cS != null)
          {
            localObject3 = ((a.b)???).cS.values().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject4 = (a.a)((Iterator)localObject3).next();
              localObject5 = ((a.a)localObject4).eLF.iterator();
              while (((Iterator)localObject5).hasNext())
              {
                ??? = ((Iterator)localObject5).next();
                if (S(((a.a)localObject4).eLE).aF(???) == null)
                {
                  j.i("MicroMsg.ParallelsManagement", "Traversal make dependency for %s by subject(%s)", new Object[] { ???, ??? });
                  aN(???);
                }
                a(((a.a)localObject4).eLE, ???, ???);
              }
            }
          }
        }
        Object localObject3 = new ArrayList();
        for (??? : this.eMf)
          if (((Class)???).isInstance(???))
            ((ArrayList)localObject3).add(???);
        Object localObject5 = (Class[])((ArrayList)localObject3).toArray(new Class[0]);
        ??? = null;
        localObject3 = null;
        j = i;
        if (j < localObject5.length)
        {
          Class localClass = localObject5[j];
          if (j < localObject5.length - 1)
          {
            localObject4 = localObject5[(j + 1)];
            label447: if (??? == null)
              break label542;
            label452: if (localObject4 == null)
              break label554;
          }
          label542: label554: for (localObject4 = c((Class)localObject4, ???); ; localObject4 = null)
          {
            ((f.a)???).eLY = ((f.a)localObject3);
            ((f.a)???).eLZ = ((f.a)localObject4);
            if (localObject3 != null)
              ((f.a)???).eMa.eMm = ((f.a)localObject3).eMa.eLE;
            if (localObject4 != null)
              ((f.a)???).eMa.eMn = ((f.a)localObject4).eMa.eLE;
            j++;
            localObject3 = ???;
            ??? = localObject4;
            break;
            localObject4 = null;
            break label447;
            ??? = c(localClass, ???);
            break label452;
          }
        }
        synchronized (locala.eMl)
        {
          if (locala.eMl[0] == 1)
          {
            locala.eMl[0] = ((byte)2);
            locala.eMl.notifyAll();
          }
          AppMethodBeat.o(123357);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label118;
      }
    }
  }

  public final void b(f.a<Object> parama)
  {
    AppMethodBeat.i(123354);
    synchronized (this.eMj)
    {
      this.eMj.offer(parama);
      ab.d("MicroMsg.ParallelsManagement", "ParallelsManagement provideOne %s %s", new Object[] { parama, parama.eMa.eLE });
      AppMethodBeat.o(123354);
      return;
    }
  }

  public final void b(Class paramClass, boolean paramBoolean)
  {
    AppMethodBeat.i(123349);
    int i = Math.min(T(paramClass), this.eMf.length - 1);
    if ((i >= 0) && (this.eMi > i))
    {
      for (int j = i; j < this.eMi; j++)
        S(this.eMf[j]).reset(paramBoolean);
      this.eMi = i;
    }
    AppMethodBeat.o(123349);
  }

  public final void prepare()
  {
    AppMethodBeat.i(123350);
    j.i("MicroMsg.ParallelsManagement", "prepare()", new Object[0]);
    while (true)
    {
      synchronized (this.eMf)
      {
        if (this.eMf.length > this.eMi)
        {
          i = this.eMi;
          this.eMi += 1;
          if (i != -1)
            S(this.eMf[i]).prepare();
          AppMethodBeat.o(123350);
          return;
        }
      }
      int i = -1;
    }
  }

  static final class a
  {
    byte[] eMl;

    private a()
    {
      AppMethodBeat.i(123344);
      this.eMl = new byte[1];
      AppMethodBeat.o(123344);
    }

    final boolean SE()
    {
      boolean bool = false;
      synchronized (this.eMl)
      {
        if (this.eMl[0] == 2)
          bool = true;
        return bool;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.b.g
 * JD-Core Version:    0.6.2
 */