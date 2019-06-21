package com.bumptech.glide.e;

import com.bumptech.glide.c.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private final List<a<?>> aGX;

  public a()
  {
    AppMethodBeat.i(92429);
    this.aGX = new ArrayList();
    AppMethodBeat.o(92429);
  }

  public final <T> void b(Class<T> paramClass, d<T> paramd)
  {
    try
    {
      AppMethodBeat.i(92431);
      List localList = this.aGX;
      a locala = new com/bumptech/glide/e/a$a;
      locala.<init>(paramClass, paramd);
      localList.add(locala);
      AppMethodBeat.o(92431);
      return;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  public final <T> d<T> u(Class<T> paramClass)
  {
    try
    {
      AppMethodBeat.i(92430);
      Iterator localIterator = this.aGX.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala.aBd.isAssignableFrom(paramClass))
        {
          paramClass = locala.aAc;
          AppMethodBeat.o(92430);
        }
      }
      while (true)
      {
        return paramClass;
        paramClass = null;
        AppMethodBeat.o(92430);
      }
    }
    finally
    {
    }
    throw paramClass;
  }

  static final class a<T>
  {
    final d<T> aAc;
    final Class<T> aBd;

    a(Class<T> paramClass, d<T> paramd)
    {
      this.aBd = paramClass;
      this.aAc = paramd;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e.a
 * JD-Core Version:    0.6.2
 */