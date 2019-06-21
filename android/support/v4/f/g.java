package android.support.v4.f;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class g<K, V>
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap<K, V> map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;

  public g(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0");
    this.maxSize = paramInt;
    this.map = new LinkedHashMap(0, 0.75F, true);
  }

  private int safeSizeOf(K paramK, V paramV)
  {
    int i = sizeOf(paramK, paramV);
    if (i < 0)
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    return i;
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

  public final void evictAll()
  {
    trimToSize(-1);
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
    if (paramK == null)
      throw new NullPointerException("key == null");
    while (true)
    {
      Object localObject1;
      try
      {
        localObject1 = this.map.get(paramK);
        if (localObject1 != null)
        {
          this.hitCount += 1;
          paramK = localObject1;
          return paramK;
        }
        this.missCount += 1;
        localObject1 = create(paramK);
        if (localObject1 == null)
        {
          paramK = null;
          continue;
        }
      }
      finally
      {
      }
      try
      {
        this.createCount += 1;
        Object localObject2 = this.map.put(paramK, localObject1);
        if (localObject2 != null)
          this.map.put(paramK, localObject2);
        while (true)
        {
          if (localObject2 == null)
            break label155;
          entryRemoved(false, paramK, localObject1, localObject2);
          paramK = localObject2;
          break;
          this.size += safeSizeOf(paramK, localObject1);
        }
      }
      finally
      {
      }
      label155: trimToSize(this.maxSize);
      paramK = localObject1;
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
    if ((paramK == null) || (paramV == null))
      throw new NullPointerException("key == null || value == null");
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
      return localObject;
    }
    finally
    {
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
    if (paramK == null)
      throw new NullPointerException("key == null");
    try
    {
      Object localObject = this.map.remove(paramK);
      if (localObject != null)
        this.size -= safeSizeOf(paramK, localObject);
      if (localObject != null)
        entryRemoved(false, paramK, localObject, null);
      return localObject;
    }
    finally
    {
    }
    throw paramK;
  }

  public void resize(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0");
    try
    {
      this.maxSize = paramInt;
      trimToSize(paramInt);
      return;
    }
    finally
    {
    }
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
      LinkedHashMap localLinkedHashMap = new LinkedHashMap(this.map);
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
      int j = this.hitCount + this.missCount;
      if (j != 0)
        i = this.hitCount * 100 / j;
      String str = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i) });
      return str;
    }
    finally
    {
    }
  }

  public void trimToSize(int paramInt)
  {
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
          throw localIllegalStateException;
        }
      }
      finally
      {
      }
      if ((this.size <= paramInt) || (this.map.isEmpty()))
        return;
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
 * Qualified Name:     android.support.v4.f.g
 * JD-Core Version:    0.6.2
 */