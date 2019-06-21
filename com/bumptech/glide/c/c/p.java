package com.bumptech.glide.c.c;

import android.support.v4.f.k.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class p
{
  private final r aEr;
  private final p.a aEs;

  public p(k.a<List<Throwable>> parama)
  {
    this(new r(parama));
    AppMethodBeat.i(92101);
    AppMethodBeat.o(92101);
  }

  private p(r paramr)
  {
    AppMethodBeat.i(92102);
    this.aEs = new p.a();
    this.aEr = paramr;
    AppMethodBeat.o(92102);
  }

  public final <A> List<n<A, ?>> P(A paramA)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    while (true)
    {
      try
      {
        AppMethodBeat.i(92104);
        localObject1 = paramA.getClass();
        localObject2 = (p.a.a)this.aEs.aEt.get(localObject1);
        if (localObject2 == null)
        {
          localObject2 = null;
          if (localObject2 != null)
            break label201;
          localObject2 = Collections.unmodifiableList(this.aEr.s((Class)localObject1));
          localObject3 = this.aEs.aEt;
          p.a.a locala = new com/bumptech/glide/c/c/p$a$a;
          locala.<init>((List)localObject2);
          if ((p.a.a)((Map)localObject3).put(localObject1, locala) == null)
            break;
          paramA = new java/lang/IllegalStateException;
          paramA.<init>("Already cached loaders for model: ".concat(String.valueOf(localObject1)));
          AppMethodBeat.o(92104);
          throw paramA;
        }
      }
      finally
      {
      }
      localObject2 = ((p.a.a)localObject2).aEu;
    }
    label201: 
    while (true)
    {
      int i = ((List)localObject2).size();
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>(i);
      for (int j = 0; j < i; j++)
      {
        localObject1 = (n)((List)localObject2).get(j);
        if (((n)localObject1).X(paramA))
          ((List)localObject3).add(localObject1);
      }
      AppMethodBeat.o(92104);
      return localObject3;
    }
  }

  public final <Model, Data> void b(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo)
  {
    try
    {
      AppMethodBeat.i(92103);
      this.aEr.b(paramClass, paramClass1, paramo);
      this.aEs.aEt.clear();
      AppMethodBeat.o(92103);
      return;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  public final List<Class<?>> r(Class<?> paramClass)
  {
    try
    {
      AppMethodBeat.i(92105);
      paramClass = this.aEr.r(paramClass);
      AppMethodBeat.o(92105);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.p
 * JD-Core Version:    0.6.2
 */