package com.bumptech.glide.c.c;

import android.support.v4.f.k.a;
import com.bumptech.glide.h.c;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class r
{
  private static final n<Object, Object> aEA;
  private static final r.c aEz;
  private final List<r.b<?, ?>> aEB;
  private final r.c aEC;
  private final Set<r.b<?, ?>> aED;
  private final k.a<List<Throwable>> awV;

  static
  {
    AppMethodBeat.i(92125);
    aEz = new r.c();
    aEA = new r.a();
    AppMethodBeat.o(92125);
  }

  public r(k.a<List<Throwable>> parama)
  {
    this(parama, aEz);
  }

  private r(k.a<List<Throwable>> parama, r.c paramc)
  {
    AppMethodBeat.i(92119);
    this.aEB = new ArrayList();
    this.aED = new HashSet();
    this.awV = parama;
    this.aEC = paramc;
    AppMethodBeat.o(92119);
  }

  private <Model, Data> n<Model, Data> a(r.b<?, ?> paramb)
  {
    AppMethodBeat.i(92124);
    paramb = (n)i.d(paramb.aEF.a(this), "Argument must not be null");
    AppMethodBeat.o(92124);
    return paramb;
  }

  public final <Model, Data> n<Model, Data> b(Class<Model> paramClass, Class<Data> paramClass1)
  {
    int i;
    while (true)
    {
      try
      {
        AppMethodBeat.i(92123);
        try
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          Iterator localIterator = this.aEB.iterator();
          i = 0;
          if (!localIterator.hasNext())
            break;
          r.b localb = (r.b)localIterator.next();
          if (this.aED.contains(localb))
          {
            i = 1;
            continue;
          }
          if ((localb.t(paramClass)) && (localb.aBd.isAssignableFrom(paramClass1)))
          {
            j = 1;
            if (j == 0)
              continue;
            this.aED.add(localb);
            ((List)localObject).add(a(localb));
            this.aED.remove(localb);
            continue;
          }
        }
        catch (Throwable paramClass)
        {
          this.aED.clear();
          AppMethodBeat.o(92123);
          throw paramClass;
        }
      }
      finally
      {
      }
      int j = 0;
    }
    if (((List)localObject).size() > 1)
    {
      paramClass1 = this.awV;
      paramClass = new com/bumptech/glide/c/c/q;
      paramClass.<init>((List)localObject, paramClass1);
      AppMethodBeat.o(92123);
    }
    while (true)
    {
      return paramClass;
      if (((List)localObject).size() == 1)
      {
        paramClass = (n)((List)localObject).get(0);
        AppMethodBeat.o(92123);
      }
      else
      {
        if (i == 0)
          break;
        paramClass = aEA;
        AppMethodBeat.o(92123);
      }
    }
    Object localObject = new com/bumptech/glide/h$c;
    ((h.c)localObject).<init>(paramClass, paramClass1);
    AppMethodBeat.o(92123);
    throw ((Throwable)localObject);
  }

  final <Model, Data> void b(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo)
  {
    try
    {
      AppMethodBeat.i(92120);
      r.b localb = new com/bumptech/glide/c/c/r$b;
      localb.<init>(paramClass, paramClass1, paramo);
      this.aEB.add(this.aEB.size(), localb);
      AppMethodBeat.o(92120);
      return;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  final List<Class<?>> r(Class<?> paramClass)
  {
    ArrayList localArrayList;
    try
    {
      AppMethodBeat.i(92122);
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = this.aEB.iterator();
      while (localIterator.hasNext())
      {
        r.b localb = (r.b)localIterator.next();
        if ((!localArrayList.contains(localb.aBd)) && (localb.t(paramClass)))
          localArrayList.add(localb.aBd);
      }
    }
    finally
    {
    }
    AppMethodBeat.o(92122);
    return localArrayList;
  }

  final <Model> List<n<Model, ?>> s(Class<Model> paramClass)
  {
    ArrayList localArrayList;
    try
    {
      AppMethodBeat.i(92121);
      try
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Iterator localIterator = this.aEB.iterator();
        while (localIterator.hasNext())
        {
          r.b localb = (r.b)localIterator.next();
          if ((!this.aED.contains(localb)) && (localb.t(paramClass)))
          {
            this.aED.add(localb);
            localArrayList.add(a(localb));
            this.aED.remove(localb);
          }
        }
      }
      catch (Throwable paramClass)
      {
        this.aED.clear();
        AppMethodBeat.o(92121);
        throw paramClass;
      }
    }
    finally
    {
    }
    AppMethodBeat.o(92121);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.r
 * JD-Core Version:    0.6.2
 */