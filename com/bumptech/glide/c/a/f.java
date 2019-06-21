package com.bumptech.glide.c.a;

import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class f
{
  private static final e.a<?> azl;
  private final Map<Class<?>, e.a<?>> azk;

  static
  {
    AppMethodBeat.i(91709);
    azl = new f.1();
    AppMethodBeat.o(91709);
  }

  public f()
  {
    AppMethodBeat.i(91706);
    this.azk = new HashMap();
    AppMethodBeat.o(91706);
  }

  public final <T> e<T> T(T paramT)
  {
    try
    {
      AppMethodBeat.i(91708);
      i.d(paramT, "Argument must not be null");
      Object localObject1 = (e.a)this.azk.get(paramT.getClass());
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        Iterator localIterator = this.azk.values().iterator();
        do
        {
          localObject2 = localObject1;
          if (!localIterator.hasNext())
            break;
          localObject2 = (e.a)localIterator.next();
        }
        while (!((e.a)localObject2).mg().isAssignableFrom(paramT.getClass()));
      }
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = azl;
      paramT = ((e.a)localObject1).T(paramT);
      AppMethodBeat.o(91708);
      return paramT;
    }
    finally
    {
    }
    throw paramT;
  }

  public final void b(e.a<?> parama)
  {
    try
    {
      AppMethodBeat.i(91707);
      this.azk.put(parama.mg(), parama);
      AppMethodBeat.o(91707);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.f
 * JD-Core Version:    0.6.2
 */