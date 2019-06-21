package com.tencent.mm.kernel.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public class a<T>
{
  protected final ConcurrentHashMap<T, a<T>> eLx;

  public a()
  {
    AppMethodBeat.i(123292);
    this.eLx = new ConcurrentHashMap();
    AppMethodBeat.o(123292);
  }

  private static void aH(T paramT)
  {
    AppMethodBeat.i(123296);
    Assert.assertNotNull("Found a null object, maybe your component isn't installedor registered.", paramT);
    Assert.assertFalse("Found a dummy object, maybe your component isn't installed or registered.", f.ay(paramT));
    AppMethodBeat.o(123296);
  }

  protected a<T> aE(T paramT)
  {
    AppMethodBeat.i(123293);
    if (!this.eLx.containsKey(paramT))
      this.eLx.putIfAbsent(paramT, new a(paramT));
    paramT = (a)this.eLx.get(paramT);
    AppMethodBeat.o(123293);
    return paramT;
  }

  public final a<T> aF(T paramT)
  {
    AppMethodBeat.i(123294);
    paramT = (a)this.eLx.get(paramT);
    AppMethodBeat.o(123294);
    return paramT;
  }

  public final boolean aG(T paramT)
  {
    AppMethodBeat.i(123295);
    paramT = (a)this.eLx.get(paramT);
    boolean bool;
    if ((paramT != null) && ((paramT.Sl()) || (paramT.Sn())))
    {
      bool = true;
      AppMethodBeat.o(123295);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123295);
    }
  }

  public final void n(T paramT1, T paramT2)
  {
    AppMethodBeat.i(123297);
    aH(paramT1);
    aH(paramT2);
    if (paramT1 == paramT2)
    {
      aE(paramT1).Sm();
      AppMethodBeat.o(123297);
    }
    while (true)
    {
      return;
      aE(paramT1).a(aE(paramT2));
      AppMethodBeat.o(123297);
    }
  }

  public void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(123298);
    Iterator localIterator = this.eLx.entrySet().iterator();
    while (localIterator.hasNext())
      ((a)((Map.Entry)localIterator.next()).getValue()).eLB = false;
    AppMethodBeat.o(123298);
  }

  public static class a<T>
  {
    public T eLA;
    public volatile boolean eLB = false;
    private boolean eLC = true;
    private HashSet<a> eLy;
    private HashSet<a> eLz;

    protected a(T paramT)
    {
      this.eLA = paramT;
    }

    private void b(a parama)
    {
      try
      {
        AppMethodBeat.i(123288);
        this.eLC = false;
        if (this.eLy == null)
        {
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>(4);
          this.eLy = localHashSet;
        }
        this.eLy.add(parama);
        AppMethodBeat.o(123288);
        return;
      }
      finally
      {
      }
      throw parama;
    }

    private void c(a parama)
    {
      try
      {
        AppMethodBeat.i(123289);
        if (this.eLz == null)
        {
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>(4);
          this.eLz = localHashSet;
        }
        this.eLz.add(parama);
        AppMethodBeat.o(123289);
        return;
      }
      finally
      {
      }
      throw parama;
    }

    public final HashSet<a> Si()
    {
      try
      {
        AppMethodBeat.i(123281);
        Object localObject1;
        if (this.eLz == null)
        {
          localObject1 = null;
          AppMethodBeat.o(123281);
        }
        while (true)
        {
          return localObject1;
          localObject1 = new java/util/HashSet;
          ((HashSet)localObject1).<init>(this.eLz);
          AppMethodBeat.o(123281);
        }
      }
      finally
      {
      }
    }

    public final HashSet<a> Sj()
    {
      try
      {
        AppMethodBeat.i(123282);
        Object localObject1;
        if (this.eLy == null)
        {
          localObject1 = null;
          AppMethodBeat.o(123282);
        }
        while (true)
        {
          return localObject1;
          localObject1 = new java/util/HashSet;
          ((HashSet)localObject1).<init>(this.eLy);
          AppMethodBeat.o(123282);
        }
      }
      finally
      {
      }
    }

    public final int Sk()
    {
      try
      {
        AppMethodBeat.i(123283);
        int i;
        if (this.eLy == null)
        {
          i = 0;
          AppMethodBeat.o(123283);
        }
        while (true)
        {
          return i;
          i = this.eLy.size();
          AppMethodBeat.o(123283);
        }
      }
      finally
      {
      }
    }

    public final boolean Sl()
    {
      try
      {
        boolean bool = this.eLC;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }

    public final void Sm()
    {
      try
      {
        AppMethodBeat.i(123284);
        if ((this.eLy == null) || (this.eLy.size() == 0))
          this.eLC = true;
        AppMethodBeat.o(123284);
        return;
      }
      finally
      {
      }
    }

    public final boolean Sn()
    {
      try
      {
        AppMethodBeat.i(123285);
        boolean bool;
        if ((this.eLy != null) && (this.eLy.size() > 0))
        {
          bool = true;
          AppMethodBeat.o(123285);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(123285);
        }
      }
      finally
      {
      }
    }

    public void a(a parama)
    {
      AppMethodBeat.i(123287);
      b(parama);
      parama.c(this);
      AppMethodBeat.o(123287);
    }

    public boolean equals(Object paramObject)
    {
      AppMethodBeat.i(123291);
      boolean bool;
      if ((paramObject instanceof a))
      {
        bool = this.eLA.equals(((a)paramObject).eLA);
        AppMethodBeat.o(123291);
      }
      while (true)
      {
        return bool;
        bool = this.eLA.equals(paramObject);
        AppMethodBeat.o(123291);
      }
    }

    public int hashCode()
    {
      AppMethodBeat.i(123290);
      int i = this.eLA.hashCode();
      AppMethodBeat.o(123290);
      return i;
    }

    public String toString()
    {
      AppMethodBeat.i(123286);
      String str = "Ref-" + this.eLA.toString();
      AppMethodBeat.o(123286);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.a.a
 * JD-Core Version:    0.6.2
 */