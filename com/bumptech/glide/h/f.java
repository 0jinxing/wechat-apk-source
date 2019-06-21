package com.bumptech.glide.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class f<T, Y>
{
  private final long aCJ;
  private long aCL;
  private long axz;
  private final Map<T, Y> cache;

  public f(long paramLong)
  {
    AppMethodBeat.i(92580);
    this.cache = new LinkedHashMap(100, 0.75F, true);
    this.aCJ = paramLong;
    this.axz = paramLong;
    AppMethodBeat.o(92580);
  }

  protected int W(Y paramY)
  {
    return 1;
  }

  protected void g(T paramT, Y paramY)
  {
  }

  public final Y get(T paramT)
  {
    try
    {
      AppMethodBeat.i(92581);
      paramT = this.cache.get(paramT);
      AppMethodBeat.o(92581);
      return paramT;
    }
    finally
    {
      paramT = finally;
    }
    throw paramT;
  }

  public final void mO()
  {
    AppMethodBeat.i(92584);
    p(0L);
    AppMethodBeat.o(92584);
  }

  public final long ol()
  {
    try
    {
      long l = this.axz;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void p(long paramLong)
  {
    try
    {
      AppMethodBeat.i(92585);
      while (this.aCL > paramLong)
      {
        Iterator localIterator = this.cache.entrySet().iterator();
        Object localObject2 = (Map.Entry)localIterator.next();
        Object localObject3 = ((Map.Entry)localObject2).getValue();
        this.aCL -= W(localObject3);
        localObject2 = ((Map.Entry)localObject2).getKey();
        localIterator.remove();
        g(localObject2, localObject3);
      }
    }
    finally
    {
    }
    AppMethodBeat.o(92585);
  }

  public final Y put(T paramT, Y paramY)
  {
    try
    {
      AppMethodBeat.i(92582);
      int i = W(paramY);
      if (i >= this.axz)
      {
        g(paramT, paramY);
        paramT = null;
        AppMethodBeat.o(92582);
      }
      while (true)
      {
        return paramT;
        if (paramY != null)
        {
          long l = this.aCL;
          this.aCL = (i + l);
        }
        Object localObject = this.cache.put(paramT, paramY);
        if (localObject != null)
        {
          this.aCL -= W(localObject);
          if (!localObject.equals(paramY))
            g(paramT, localObject);
        }
        p(this.axz);
        AppMethodBeat.o(92582);
        paramT = localObject;
      }
    }
    finally
    {
    }
    throw paramT;
  }

  public final Y remove(T paramT)
  {
    try
    {
      AppMethodBeat.i(92583);
      paramT = this.cache.remove(paramT);
      if (paramT != null)
        this.aCL -= W(paramT);
      AppMethodBeat.o(92583);
      return paramT;
    }
    finally
    {
    }
    throw paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.f
 * JD-Core Version:    0.6.2
 */