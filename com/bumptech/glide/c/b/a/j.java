package com.bumptech.glide.c.b.a;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class j
  implements b
{
  private final j.b aCB;
  private final Map<Class<?>, NavigableMap<Integer, Integer>> aCC;
  private final Map<Class<?>, a<?>> aCD;
  private final h<j.a, Object> aCr;
  private int fu;
  private final int maxSize;

  public j()
  {
    AppMethodBeat.i(91930);
    this.aCr = new h();
    this.aCB = new j.b();
    this.aCC = new HashMap();
    this.aCD = new HashMap();
    this.maxSize = 4194304;
    AppMethodBeat.o(91930);
  }

  public j(int paramInt)
  {
    AppMethodBeat.i(91931);
    this.aCr = new h();
    this.aCB = new j.b();
    this.aCC = new HashMap();
    this.aCD = new HashMap();
    this.maxSize = paramInt;
    AppMethodBeat.o(91931);
  }

  private <T> a<T> V(T paramT)
  {
    AppMethodBeat.i(91942);
    paramT = q(paramT.getClass());
    AppMethodBeat.o(91942);
    return paramT;
  }

  private <T> T a(j.a parama)
  {
    AppMethodBeat.i(91936);
    parama = this.aCr.b(parama);
    AppMethodBeat.o(91936);
    return parama;
  }

  private <T> T a(j.a parama, Class<T> paramClass)
  {
    AppMethodBeat.i(91935);
    a locala = q(paramClass);
    Object localObject = a(parama);
    if (localObject != null)
    {
      this.fu -= locala.U(localObject) * locala.mN();
      b(locala.U(localObject), paramClass);
    }
    paramClass = localObject;
    if (localObject == null)
    {
      if (Log.isLoggable(locala.getTag(), 2))
      {
        locala.getTag();
        new StringBuilder("Allocated ").append(parama.size).append(" bytes");
      }
      paramClass = locala.dd(parama.size);
    }
    AppMethodBeat.o(91935);
    return paramClass;
  }

  private void b(int paramInt, Class<?> paramClass)
  {
    AppMethodBeat.i(91940);
    NavigableMap localNavigableMap = p(paramClass);
    paramClass = (Integer)localNavigableMap.get(Integer.valueOf(paramInt));
    if (paramClass == null)
    {
      paramClass = new NullPointerException("Tried to decrement empty size, size: " + paramInt + ", this: " + this);
      AppMethodBeat.o(91940);
      throw paramClass;
    }
    if (paramClass.intValue() == 1)
    {
      localNavigableMap.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(91940);
    }
    while (true)
    {
      return;
      localNavigableMap.put(Integer.valueOf(paramInt), Integer.valueOf(paramClass.intValue() - 1));
      AppMethodBeat.o(91940);
    }
  }

  private void de(int paramInt)
  {
    AppMethodBeat.i(91939);
    while (this.fu > paramInt)
    {
      Object localObject = this.aCr.removeLast();
      com.bumptech.glide.h.i.d(localObject, "Argument must not be null");
      a locala = V(localObject);
      this.fu -= locala.U(localObject) * locala.mN();
      b(locala.U(localObject), localObject.getClass());
      if (Log.isLoggable(locala.getTag(), 2))
      {
        locala.getTag();
        new StringBuilder("evicted: ").append(locala.U(localObject));
      }
    }
    AppMethodBeat.o(91939);
  }

  private NavigableMap<Integer, Integer> p(Class<?> paramClass)
  {
    AppMethodBeat.i(91941);
    NavigableMap localNavigableMap = (NavigableMap)this.aCC.get(paramClass);
    Object localObject = localNavigableMap;
    if (localNavigableMap == null)
    {
      localObject = new TreeMap();
      this.aCC.put(paramClass, localObject);
    }
    AppMethodBeat.o(91941);
    return localObject;
  }

  private <T> a<T> q(Class<T> paramClass)
  {
    AppMethodBeat.i(91943);
    a locala = (a)this.aCD.get(paramClass);
    Object localObject = locala;
    if (locala == null)
      if (!paramClass.equals([I.class))
        break label61;
    for (localObject = new i(); ; localObject = new g())
    {
      this.aCD.put(paramClass, localObject);
      AppMethodBeat.o(91943);
      return localObject;
      label61: if (!paramClass.equals([B.class))
        break;
    }
    paramClass = new IllegalArgumentException("No array pool found for: " + paramClass.getSimpleName());
    AppMethodBeat.o(91943);
    throw paramClass;
  }

  public final <T> T a(int paramInt, Class<T> paramClass)
  {
    int i = 1;
    try
    {
      AppMethodBeat.i(91934);
      Object localObject = (Integer)p(paramClass).ceilingKey(Integer.valueOf(paramInt));
      int j;
      int k;
      if (localObject != null)
        if ((this.fu == 0) || (this.maxSize / this.fu >= 2))
        {
          j = 1;
          k = i;
          if (j == 0)
          {
            if (((Integer)localObject).intValue() > paramInt * 8)
              break label122;
            k = i;
          }
          label79: if (k == 0)
            break label128;
        }
      label128: for (localObject = this.aCB.d(((Integer)localObject).intValue(), paramClass); ; localObject = this.aCB.d(paramInt, paramClass))
      {
        paramClass = a((j.a)localObject, paramClass);
        AppMethodBeat.o(91934);
        return paramClass;
        j = 0;
        break;
        label122: k = 0;
        break label79;
      }
    }
    finally
    {
    }
    throw paramClass;
  }

  public final void mO()
  {
    try
    {
      AppMethodBeat.i(91937);
      de(0);
      AppMethodBeat.o(91937);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final <T> T o(Class<T> paramClass)
  {
    try
    {
      AppMethodBeat.i(91933);
      paramClass = a(this.aCB.d(8, paramClass), paramClass);
      AppMethodBeat.o(91933);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
    }
    throw paramClass;
  }

  public final <T> void put(T paramT)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(91932);
        Object localObject1 = paramT.getClass();
        Object localObject2 = q((Class)localObject1);
        int i = ((a)localObject2).U(paramT);
        int j = i * ((a)localObject2).mN();
        if (j <= this.maxSize / 2)
        {
          k = 1;
          if (k == 0)
            AppMethodBeat.o(91932);
        }
        else
        {
          k = 0;
          continue;
        }
        localObject2 = this.aCB.d(i, (Class)localObject1);
        this.aCr.a((m)localObject2, paramT);
        localObject1 = p((Class)localObject1);
        paramT = (Integer)((NavigableMap)localObject1).get(Integer.valueOf(((j.a)localObject2).size));
        i = ((j.a)localObject2).size;
        if (paramT == null)
        {
          k = 1;
          ((NavigableMap)localObject1).put(Integer.valueOf(i), Integer.valueOf(k));
          this.fu += j;
          de(this.maxSize);
          AppMethodBeat.o(91932);
          continue;
        }
      }
      finally
      {
      }
      int k = paramT.intValue();
      k++;
    }
  }

  public final void trimMemory(int paramInt)
  {
    try
    {
      AppMethodBeat.i(91938);
      if (paramInt >= 40)
      {
        mO();
        AppMethodBeat.o(91938);
      }
      while (true)
      {
        return;
        if ((paramInt >= 20) || (paramInt == 15))
          de(this.maxSize / 2);
        AppMethodBeat.o(91938);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.j
 * JD-Core Version:    0.6.2
 */