package com.bumptech.glide.e;

import com.bumptech.glide.c.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e
{
  private final List<String> aHd;
  private final Map<String, List<e.a<?, ?>>> aHe;

  public e()
  {
    AppMethodBeat.i(92441);
    this.aHd = new ArrayList();
    this.aHe = new HashMap();
    AppMethodBeat.o(92441);
  }

  private List<e.a<?, ?>> ad(String paramString)
  {
    try
    {
      AppMethodBeat.i(92446);
      if (!this.aHd.contains(paramString))
        this.aHd.add(paramString);
      List localList = (List)this.aHe.get(paramString);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.aHe.put(paramString, localObject);
      }
      AppMethodBeat.o(92446);
      return localObject;
    }
    finally
    {
    }
    throw paramString;
  }

  public final <T, R> void a(String paramString, k<T, R> paramk, Class<T> paramClass, Class<R> paramClass1)
  {
    try
    {
      AppMethodBeat.i(92445);
      paramString = ad(paramString);
      e.a locala = new com/bumptech/glide/e/e$a;
      locala.<init>(paramClass, paramClass1, paramk);
      paramString.add(locala);
      AppMethodBeat.o(92445);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final <T, R> List<k<T, R>> g(Class<T> paramClass, Class<R> paramClass1)
  {
    ArrayList localArrayList;
    try
    {
      AppMethodBeat.i(92443);
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator1 = this.aHd.iterator();
      while (localIterator1.hasNext())
      {
        Object localObject = (String)localIterator1.next();
        localObject = (List)this.aHe.get(localObject);
        if (localObject != null)
        {
          Iterator localIterator2 = ((List)localObject).iterator();
          while (localIterator2.hasNext())
          {
            localObject = (e.a)localIterator2.next();
            if (((e.a)localObject).e(paramClass, paramClass1))
              localArrayList.add(((e.a)localObject).aES);
          }
        }
      }
    }
    finally
    {
    }
    AppMethodBeat.o(92443);
    return localArrayList;
  }

  public final <T, R> List<Class<R>> h(Class<T> paramClass, Class<R> paramClass1)
  {
    ArrayList localArrayList;
    try
    {
      AppMethodBeat.i(92444);
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = this.aHd.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localObject = (List)this.aHe.get(localObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            e.a locala = (e.a)((Iterator)localObject).next();
            if ((locala.e(paramClass, paramClass1)) && (!localArrayList.contains(locala.aAf)))
              localArrayList.add(locala.aAf);
          }
        }
      }
    }
    finally
    {
    }
    AppMethodBeat.o(92444);
    return localArrayList;
  }

  public final void s(List<String> paramList)
  {
    try
    {
      AppMethodBeat.i(92442);
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(this.aHd);
      this.aHd.clear();
      this.aHd.addAll(paramList);
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!paramList.contains(str))
          this.aHd.add(str);
      }
    }
    finally
    {
    }
    AppMethodBeat.o(92442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e.e
 * JD-Core Version:    0.6.2
 */