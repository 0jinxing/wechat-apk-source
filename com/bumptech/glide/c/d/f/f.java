package com.bumptech.glide.c.d.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f
{
  private final List<f.a<?, ?>> aGs;

  public f()
  {
    AppMethodBeat.i(92366);
    this.aGs = new ArrayList();
    AppMethodBeat.o(92366);
  }

  public final <Z, R> void b(Class<Z> paramClass, Class<R> paramClass1, e<Z, R> parame)
  {
    try
    {
      AppMethodBeat.i(92367);
      List localList = this.aGs;
      f.a locala = new com/bumptech/glide/c/d/f/f$a;
      locala.<init>(paramClass, paramClass1, parame);
      localList.add(locala);
      AppMethodBeat.o(92367);
      return;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  public final <Z, R> e<Z, R> c(Class<Z> paramClass, Class<R> paramClass1)
  {
    try
    {
      AppMethodBeat.i(92368);
      if (paramClass1.isAssignableFrom(paramClass))
      {
        paramClass = g.nH();
        AppMethodBeat.o(92368);
      }
      while (true)
      {
        return paramClass;
        localObject1 = this.aGs.iterator();
        do
        {
          if (!((Iterator)localObject1).hasNext())
            break;
          localObject2 = (f.a)((Iterator)localObject1).next();
        }
        while (!((f.a)localObject2).e(paramClass, paramClass1));
        paramClass = ((f.a)localObject2).aBf;
        AppMethodBeat.o(92368);
      }
    }
    finally
    {
    }
    Object localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("No transcoder registered to transcode from ");
    ((IllegalArgumentException)localObject1).<init>(paramClass + " to " + paramClass1);
    AppMethodBeat.o(92368);
    throw ((Throwable)localObject1);
  }

  public final <Z, R> List<Class<R>> d(Class<Z> paramClass, Class<R> paramClass1)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(92369);
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        if (paramClass1.isAssignableFrom(paramClass))
        {
          localArrayList.add(paramClass1);
          AppMethodBeat.o(92369);
          return localArrayList;
        }
        Iterator localIterator = this.aGs.iterator();
        if (localIterator.hasNext())
        {
          if (!((f.a)localIterator.next()).e(paramClass, paramClass1))
            continue;
          localArrayList.add(paramClass1);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(92369);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.f.f
 * JD-Core Version:    0.6.2
 */