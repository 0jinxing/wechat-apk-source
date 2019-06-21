package com.google.firebase.components;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n
  implements b
{
  private final List<a<?>> bvc;
  private final Map<Class<?>, p<?>> bvd;

  public n(Iterable<e> paramIterable, a<?>[] paramArrayOfa)
  {
    AppMethodBeat.i(10619);
    this.bvd = new HashMap();
    Object localObject1 = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
      ((List)localObject1).addAll(((e)paramIterable.next()).getComponents());
    Collections.addAll((Collection)localObject1, paramArrayOfa);
    paramIterable = new HashMap(((List)localObject1).size());
    Object localObject4;
    do
    {
      paramArrayOfa = ((List)localObject1).iterator();
      while (!((Iterator)localObject4).hasNext())
      {
        if (!paramArrayOfa.hasNext())
          break;
        localObject2 = (a)paramArrayOfa.next();
        localObject3 = new o((a)localObject2);
        localObject4 = ((a)localObject2).buT.iterator();
      }
      localObject2 = (Class)((Iterator)localObject4).next();
    }
    while (paramIterable.put(localObject2, localObject3) == null);
    paramIterable = new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[] { localObject2 }));
    AppMethodBeat.o(10619);
    throw paramIterable;
    Object localObject2 = paramIterable.values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (o)((Iterator)localObject2).next();
      paramArrayOfa = ((o)localObject3).bve.buU.iterator();
      while (paramArrayOfa.hasNext())
      {
        localObject4 = (f)paramArrayOfa.next();
        if (((f)localObject4).uB())
        {
          localObject4 = (o)paramIterable.get(((f)localObject4).buW);
          if (localObject4 != null)
          {
            ((o)localObject3).bvf.add(localObject4);
            ((o)localObject4).bvg.add(localObject3);
          }
        }
      }
    }
    paramIterable = new HashSet(paramIterable.values());
    paramArrayOfa = new HashSet();
    Object localObject3 = paramIterable.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (o)((Iterator)localObject3).next();
      if (((o)localObject2).uC())
        paramArrayOfa.add(localObject2);
    }
    ArrayList localArrayList = new ArrayList();
    while (!paramArrayOfa.isEmpty())
    {
      localObject3 = (o)paramArrayOfa.iterator().next();
      paramArrayOfa.remove(localObject3);
      localArrayList.add(((o)localObject3).bve);
      localObject4 = ((o)localObject3).bvf.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject2 = (o)((Iterator)localObject4).next();
        ((o)localObject2).bvg.remove(localObject3);
        if (((o)localObject2).uC())
          paramArrayOfa.add(localObject2);
      }
    }
    if (localArrayList.size() == ((List)localObject1).size())
    {
      Collections.reverse(localArrayList);
      this.bvc = Collections.unmodifiableList(localArrayList);
      paramArrayOfa = this.bvc.iterator();
      while (paramArrayOfa.hasNext())
      {
        localObject1 = (a)paramArrayOfa.next();
        paramIterable = new p(((a)localObject1).buV, new s(((a)localObject1).buU, this));
        localObject3 = ((a)localObject1).buT.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = (Class)((Iterator)localObject3).next();
          this.bvd.put(localObject1, paramIterable);
        }
      }
    }
    paramArrayOfa = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      localObject1 = (o)paramIterable.next();
      if ((!((o)localObject1).uC()) && (!((o)localObject1).bvf.isEmpty()))
        paramArrayOfa.add(((o)localObject1).bve);
    }
    paramIterable = new g(paramArrayOfa);
    AppMethodBeat.o(10619);
    throw paramIterable;
    paramIterable = this.bvc.iterator();
    if (paramIterable.hasNext())
    {
      localObject1 = (a)paramIterable.next();
      paramArrayOfa = ((a)localObject1).buU.iterator();
      while (paramArrayOfa.hasNext())
      {
        localObject3 = (f)paramArrayOfa.next();
        if (((f)localObject3).buX == 1);
        for (int i = 1; (i != 0) && (!this.bvd.containsKey(((f)localObject3).buW)); i = 0)
        {
          paramIterable = new i(String.format("Unsatisfied dependency for component %s: %s", new Object[] { localObject1, ((f)localObject3).buW }));
          AppMethodBeat.o(10619);
          throw paramIterable;
        }
      }
    }
    AppMethodBeat.o(10619);
  }

  public final void aS(boolean paramBoolean)
  {
    AppMethodBeat.i(10621);
    Iterator localIterator = this.bvc.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if ((locala.uy()) || ((locala.uz()) && (paramBoolean)))
        c.a(this, (Class)locala.buT.iterator().next());
    }
    AppMethodBeat.o(10621);
  }

  public final Object x(Class paramClass)
  {
    AppMethodBeat.i(10622);
    paramClass = c.a(this, paramClass);
    AppMethodBeat.o(10622);
    return paramClass;
  }

  public final <T> com.google.firebase.a.a<T> z(Class<T> paramClass)
  {
    AppMethodBeat.i(10620);
    r.zza(paramClass, "Null interface requested.");
    paramClass = (com.google.firebase.a.a)this.bvd.get(paramClass);
    AppMethodBeat.o(10620);
    return paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.n
 * JD-Core Version:    0.6.2
 */