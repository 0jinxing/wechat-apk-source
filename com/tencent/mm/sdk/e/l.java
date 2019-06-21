package com.tencent.mm.sdk.e;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public abstract class l<T, E>
{
  private static final ak xDl = new ak(Looper.getMainLooper());
  public int xDi = 0;
  private final Hashtable<T, Object> xDj = new Hashtable();
  private final HashSet<E> xDk = new HashSet();

  private Vector<T> dpY()
  {
    try
    {
      Vector localVector = new java/util/Vector;
      localVector.<init>();
      localVector.addAll(this.xDj.keySet());
      return localVector;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void dpZ()
  {
    Vector localVector = dpY();
    if (localVector.size() <= 0)
    {
      this.xDk.clear();
      return;
    }
    while (true)
    {
      HashMap localHashMap;
      final Object localObject3;
      a locala;
      Runnable local1;
      synchronized (this.xDk)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>(this.xDk);
        this.xDk.clear();
        el(localArrayList);
        localHashMap = new HashMap();
        Iterator localIterator1 = localVector.iterator();
        continue;
        if (!localIterator1.hasNext())
          break;
        localObject3 = localIterator1.next();
        Object localObject4 = this.xDj.get(localObject3);
        Iterator localIterator2 = localArrayList.iterator();
        if (!localIterator2.hasNext())
          continue;
        ??? = localIterator2.next();
        if ((??? == null) || (localObject4 == null))
          continue;
        if (!(localObject4 instanceof a))
          break label271;
        locala = (a)localObject4;
        local1 = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(52517);
            l.this.w(localObject3, localObject2);
            AppMethodBeat.o(52517);
          }
        };
        if (locala.xDq != null)
          locala.xDq.b(local1, locala.xDp);
      }
      if (locala.xzn != null)
      {
        ak localak = (ak)localHashMap.get(locala.xzn);
        ??? = localak;
        if (localak == null)
        {
          ??? = new ak(locala.xzn);
          localHashMap.put(locala.xzn, ???);
        }
        ((ak)???).post(local1);
      }
      else
      {
        xDl.post(local1);
        continue;
        label271: w(localObject3, ???);
      }
    }
  }

  public void a(T paramT, Looper paramLooper)
  {
    try
    {
      Object localObject;
      if (!this.xDj.containsKey(paramT))
      {
        if (paramLooper == null)
          break label44;
        Hashtable localHashtable = this.xDj;
        localObject = new com/tencent/mm/sdk/e/l$a;
        ((a)localObject).<init>(paramLooper);
        localHashtable.put(paramT, localObject);
      }
      while (true)
      {
        return;
        label44: localObject = this.xDj;
        paramLooper = new java/lang/Object;
        paramLooper.<init>();
        ((Hashtable)localObject).put(paramT, paramLooper);
      }
    }
    finally
    {
    }
    throw paramT;
  }

  public final boolean cF(E paramE)
  {
    synchronized (this.xDk)
    {
      boolean bool = this.xDk.add(paramE);
      return bool;
    }
  }

  public final void doNotify()
  {
    if (!isLocked())
      dpZ();
  }

  public void el(List<E> paramList)
  {
  }

  public final boolean isLocked()
  {
    if (this.xDi > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void lock()
  {
    this.xDi += 1;
  }

  public final void remove(T paramT)
  {
    try
    {
      this.xDj.remove(paramT);
      return;
    }
    finally
    {
      paramT = finally;
    }
    throw paramT;
  }

  public final void removeAll()
  {
    try
    {
      this.xDj.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void unlock()
  {
    this.xDi -= 1;
    if (this.xDi <= 0)
    {
      this.xDi = 0;
      dpZ();
    }
  }

  protected abstract void w(T paramT, E paramE);

  protected static final class a
  {
    String xDp;
    e xDq;
    Looper xzn;

    public a()
    {
    }

    public a(Looper paramLooper)
    {
      this.xzn = paramLooper;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.l
 * JD-Core Version:    0.6.2
 */