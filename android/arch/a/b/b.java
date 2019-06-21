package android.arch.a.b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class b<K, V>
  implements Iterable<Map.Entry<K, V>>
{
  public b.c<K, V> bS;
  public b.c<K, V> bT;
  public WeakHashMap<f<K, V>, Boolean> bU = new WeakHashMap();
  public int mSize = 0;

  public final b<K, V>.d Z()
  {
    b.d locald = new b.d(this, (byte)0);
    this.bU.put(locald, Boolean.FALSE);
    return locald;
  }

  protected final b.c<K, V> b(K paramK, V paramV)
  {
    paramK = new b.c(paramK, paramV);
    this.mSize += 1;
    if (this.bT == null)
      this.bS = paramK;
    for (this.bT = this.bS; ; this.bT = paramK)
    {
      return paramK;
      this.bT.bW = paramK;
      paramK.bX = this.bT;
    }
  }

  protected b.c<K, V> d(K paramK)
  {
    for (b.c localc = this.bS; (localc != null) && (!localc.bV.equals(paramK)); localc = localc.bW);
    return localc;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
      bool = true;
    while (true)
    {
      return bool;
      if (!(paramObject instanceof b))
      {
        bool = false;
      }
      else
      {
        Object localObject1 = (b)paramObject;
        if (this.mSize != ((b)localObject1).mSize)
        {
          bool = false;
        }
        else
        {
          paramObject = iterator();
          localObject1 = ((b)localObject1).iterator();
          while (true)
            if ((paramObject.hasNext()) && (((Iterator)localObject1).hasNext()))
            {
              Map.Entry localEntry = (Map.Entry)paramObject.next();
              Object localObject2 = ((Iterator)localObject1).next();
              if (((localEntry == null) && (localObject2 != null)) || ((localEntry != null) && (!localEntry.equals(localObject2))))
              {
                bool = false;
                break;
              }
            }
          if ((!paramObject.hasNext()) && (!((Iterator)localObject1).hasNext()))
            bool = true;
          else
            bool = false;
        }
      }
    }
  }

  public Iterator<Map.Entry<K, V>> iterator()
  {
    b.a locala = new b.a(this.bS, this.bT);
    this.bU.put(locala, Boolean.FALSE);
    return locala;
  }

  public V putIfAbsent(K paramK, V paramV)
  {
    b.c localc = d(paramK);
    if (localc != null);
    for (paramK = localc.mValue; ; paramK = null)
    {
      return paramK;
      b(paramK, paramV);
    }
  }

  public V remove(K paramK)
  {
    b.c localc = d(paramK);
    if (localc == null)
    {
      paramK = null;
      return paramK;
    }
    this.mSize -= 1;
    if (!this.bU.isEmpty())
    {
      paramK = this.bU.keySet().iterator();
      while (paramK.hasNext())
        ((f)paramK.next()).c(localc);
    }
    if (localc.bX != null)
    {
      localc.bX.bW = localc.bW;
      label92: if (localc.bW == null)
        break label139;
      localc.bW.bX = localc.bX;
    }
    while (true)
    {
      localc.bW = null;
      localc.bX = null;
      paramK = localc.mValue;
      break;
      this.bS = localc.bW;
      break label92;
      label139: this.bT = localc.bX;
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(((Map.Entry)localIterator.next()).toString());
      if (localIterator.hasNext())
        localStringBuilder.append(", ");
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  static abstract class e<K, V>
    implements b.f<K, V>, Iterator<Map.Entry<K, V>>
  {
    b.c<K, V> bW;
    b.c<K, V> cb;

    e(b.c<K, V> paramc1, b.c<K, V> paramc2)
    {
      this.cb = paramc2;
      this.bW = paramc1;
    }

    private b.c<K, V> aa()
    {
      if ((this.bW == this.cb) || (this.cb == null));
      for (Object localObject = null; ; localObject = a(this.bW))
        return localObject;
    }

    abstract b.c<K, V> a(b.c<K, V> paramc);

    abstract b.c<K, V> b(b.c<K, V> paramc);

    public final void c(b.c<K, V> paramc)
    {
      if ((this.cb == paramc) && (paramc == this.bW))
      {
        this.bW = null;
        this.cb = null;
      }
      if (this.cb == paramc)
        this.cb = b(this.cb);
      if (this.bW == paramc)
        this.bW = aa();
    }

    public boolean hasNext()
    {
      if (this.bW != null);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }

  static abstract interface f<K, V>
  {
    public abstract void c(b.c<K, V> paramc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.arch.a.b.b
 * JD-Core Version:    0.6.2
 */