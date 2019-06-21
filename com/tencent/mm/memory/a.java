package com.tencent.mm.memory;

import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;

public abstract class a<T> extends e<T, Integer>
{
  public T c(Integer paramInteger)
  {
    while (true)
    {
      try
      {
        paramInteger = this.fdA.subMap(paramInteger, true, Integer.valueOf(2147483647), true);
        if ((paramInteger != null) && (!paramInteger.isEmpty()))
        {
          Iterator localIterator = paramInteger.keySet().iterator();
          if (!localIterator.hasNext())
            break label133;
          d locald = (d)paramInteger.get(Integer.valueOf(((Integer)localIterator.next()).intValue()));
          if (locald.size() <= 0)
            continue;
          paramInteger = locald.pop();
          this.fdA.put(locald.WZ(), locald);
          if (paramInteger != null)
          {
            fj(aS(paramInteger));
            return paramInteger;
          }
        }
        paramInteger = null;
        continue;
      }
      finally
      {
      }
      label133: paramInteger = null;
    }
  }

  public T d(Integer paramInteger)
  {
    try
    {
      d locald = (d)this.fdA.get(paramInteger);
      if ((locald != null) && (locald.size() > 0))
      {
        paramInteger = locald.pop();
        this.fdA.put(locald.WZ(), locald);
        fj(aS(paramInteger));
        return paramInteger;
      }
      int i;
      if (locald == null)
        i = -1;
      while (true)
      {
        ab.d("MicroMsg.BiggerThanPool", "BiggerThanPool getExactSize cannot get %s size count %d", new Object[] { paramInteger, Integer.valueOf(i) });
        paramInteger = null;
        break;
        if (locald.fdy == null)
          i = -1;
        else
          i = locald.fdy.size();
      }
    }
    finally
    {
    }
    throw paramInteger;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a
 * JD-Core Version:    0.6.2
 */