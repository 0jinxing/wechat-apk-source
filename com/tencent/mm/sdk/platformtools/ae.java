package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ae<K, V>
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  public final LinkedHashMap<K, V> map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;

  public ae(int paramInt)
  {
    AppMethodBeat.i(52033);
    if (paramInt <= 0)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("maxSize <= 0");
      AppMethodBeat.o(52033);
      throw localIllegalArgumentException;
    }
    this.maxSize = paramInt;
    this.map = new LinkedHashMap(0, 0.75F, true);
    AppMethodBeat.o(52033);
  }

  private int safeSizeOf(K paramK, V paramV)
  {
    AppMethodBeat.i(52040);
    int i = sizeOf(paramK, paramV);
    if (i < 0)
    {
      paramK = new IllegalStateException("Negative size: " + paramK + "=" + paramV);
      AppMethodBeat.o(52040);
      throw paramK;
    }
    AppMethodBeat.o(52040);
    return i;
  }

  public final boolean aj(K paramK)
  {
    try
    {
      AppMethodBeat.i(52034);
      boolean bool = this.map.containsKey(paramK);
      AppMethodBeat.o(52034);
      return bool;
    }
    finally
    {
      paramK = finally;
    }
    throw paramK;
  }

  public final boolean ak(K paramK)
  {
    try
    {
      AppMethodBeat.i(52035);
      boolean bool;
      if (get(paramK) != null)
      {
        bool = true;
        AppMethodBeat.o(52035);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(52035);
      }
    }
    finally
    {
    }
    throw paramK;
  }

  protected V create(K paramK)
  {
    return null;
  }

  public final int createCount()
  {
    try
    {
      int i = this.createCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected void entryRemoved(boolean paramBoolean, K paramK, V paramV1, V paramV2)
  {
  }

  public final int evictionCount()
  {
    try
    {
      int i = this.evictionCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final V get(K paramK)
  {
    Object localObject1 = null;
    AppMethodBeat.i(52036);
    if (paramK == null)
    {
      ab.e("MicroMsg.LruMap", "key == null %s", new Object[] { bo.dpG().toString() });
      AppMethodBeat.o(52036);
    }
    Object localObject2;
    for (paramK = localObject1; ; paramK = localObject2)
    {
      while (true)
      {
        return paramK;
        try
        {
          localObject2 = this.map.get(paramK);
          if (localObject2 != null)
          {
            this.hitCount += 1;
            AppMethodBeat.o(52036);
            paramK = localObject2;
            continue;
          }
          this.missCount += 1;
          localObject2 = create(paramK);
          if (localObject2 == null)
          {
            AppMethodBeat.o(52036);
            paramK = localObject1;
            continue;
          }
        }
        finally
        {
          AppMethodBeat.o(52036);
        }
        try
        {
          this.createCount += 1;
          localObject1 = this.map.put(paramK, localObject2);
          if (localObject1 != null)
            this.map.put(paramK, localObject1);
          while (true)
          {
            if (localObject1 == null)
              break label207;
            entryRemoved(false, paramK, localObject2, localObject1);
            AppMethodBeat.o(52036);
            paramK = localObject1;
            break;
            this.size += safeSizeOf(paramK, localObject2);
          }
        }
        finally
        {
          AppMethodBeat.o(52036);
        }
      }
      label207: trimToSize(this.maxSize);
      AppMethodBeat.o(52036);
    }
  }

  public final int hitCount()
  {
    try
    {
      int i = this.hitCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Set<K> keySet()
  {
    AppMethodBeat.i(138331);
    Set localSet = this.map.keySet();
    AppMethodBeat.o(138331);
    return localSet;
  }

  public final int maxSize()
  {
    try
    {
      int i = this.maxSize;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int missCount()
  {
    try
    {
      int i = this.missCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final V put(K paramK, V paramV)
  {
    AppMethodBeat.i(52037);
    if ((paramK == null) || (paramV == null))
    {
      paramK = new NullPointerException("key == null || value == null");
      AppMethodBeat.o(52037);
      throw paramK;
    }
    try
    {
      this.putCount += 1;
      this.size += safeSizeOf(paramK, paramV);
      Object localObject = this.map.put(paramK, paramV);
      if (localObject != null)
        this.size -= safeSizeOf(paramK, localObject);
      if (localObject != null)
        entryRemoved(false, paramK, localObject, paramV);
      trimToSize(this.maxSize);
      AppMethodBeat.o(52037);
      return localObject;
    }
    finally
    {
      AppMethodBeat.o(52037);
    }
    throw paramK;
  }

  public final int putCount()
  {
    try
    {
      int i = this.putCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final V remove(K paramK)
  {
    AppMethodBeat.i(52039);
    if (paramK == null)
    {
      paramK = new NullPointerException("key == null");
      AppMethodBeat.o(52039);
      throw paramK;
    }
    try
    {
      Object localObject = this.map.remove(paramK);
      if (localObject != null)
        this.size -= safeSizeOf(paramK, localObject);
      if (localObject != null)
        entryRemoved(false, paramK, localObject, null);
      AppMethodBeat.o(52039);
      return localObject;
    }
    finally
    {
      AppMethodBeat.o(52039);
    }
    throw paramK;
  }

  public final int size()
  {
    try
    {
      int i = this.size;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected int sizeOf(K paramK, V paramV)
  {
    return 1;
  }

  public final Map<K, V> snapshot()
  {
    try
    {
      AppMethodBeat.i(52041);
      LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
      localLinkedHashMap.<init>(this.map);
      AppMethodBeat.o(52041);
      return localLinkedHashMap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String toString()
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(52042);
      int j = this.hitCount + this.missCount;
      if (j != 0)
        i = this.hitCount * 100 / j;
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i) });
      AppMethodBeat.o(52042);
      return str;
    }
    finally
    {
    }
  }

  public void trimToSize(int paramInt)
  {
    AppMethodBeat.i(52038);
    while (true)
    {
      try
      {
        if ((this.size < 0) || ((this.map.isEmpty()) && (this.size != 0)))
        {
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localIllegalStateException.<init>(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
          AppMethodBeat.o(52038);
          throw localIllegalStateException;
        }
      }
      finally
      {
        AppMethodBeat.o(52038);
      }
      if ((this.size <= paramInt) || (this.map.isEmpty()))
      {
        AppMethodBeat.o(52038);
        return;
      }
      Object localObject3 = (Map.Entry)this.map.entrySet().iterator().next();
      Object localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      this.map.remove(localObject2);
      this.size -= safeSizeOf(localObject2, localObject3);
      this.evictionCount += 1;
      entryRemoved(true, localObject2, localObject3, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ae
 * JD-Core Version:    0.6.2
 */