package com.bumptech.glide.e;

import com.bumptech.glide.c.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class f
{
  private final List<f.a<?>> aGX;

  public f()
  {
    AppMethodBeat.i(92447);
    this.aGX = new ArrayList();
    AppMethodBeat.o(92447);
  }

  public final <Z> void b(Class<Z> paramClass, l<Z> paraml)
  {
    try
    {
      AppMethodBeat.i(92448);
      List localList = this.aGX;
      f.a locala = new com/bumptech/glide/e/f$a;
      locala.<init>(paramClass, paraml);
      localList.add(locala);
      AppMethodBeat.o(92448);
      return;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  public final <Z> l<Z> v(Class<Z> paramClass)
  {
    try
    {
      AppMethodBeat.i(92449);
      int i = this.aGX.size();
      int j = 0;
      if (j < i)
      {
        f.a locala = (f.a)this.aGX.get(j);
        if (locala.aAf.isAssignableFrom(paramClass))
        {
          paramClass = locala.aAN;
          AppMethodBeat.o(92449);
        }
      }
      while (true)
      {
        return paramClass;
        j++;
        break;
        paramClass = null;
        AppMethodBeat.o(92449);
      }
    }
    finally
    {
    }
    throw paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e.f
 * JD-Core Version:    0.6.2
 */