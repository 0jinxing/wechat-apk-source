package android.support.v4.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class h<K, V>
{
  h<K, V>.b Lm;
  h<K, V>.c Ln;
  h<K, V>.e Lo;

  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
      if (!paramCollection.contains(localIterator.next()))
        localIterator.remove();
    if (i != paramMap.size());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    boolean bool1 = true;
    if (paramSet == paramObject);
    while (true)
    {
      return bool1;
      if ((paramObject instanceof Set))
      {
        paramObject = (Set)paramObject;
        try
        {
          if (paramSet.size() == paramObject.size())
          {
            boolean bool2 = paramSet.containsAll(paramObject);
            if (bool2)
              continue;
          }
          bool1 = false;
        }
        catch (NullPointerException paramSet)
        {
          bool1 = false;
        }
        catch (ClassCastException paramSet)
        {
          bool1 = false;
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }

  protected abstract int E(Object paramObject);

  protected abstract int F(Object paramObject);

  protected abstract V a(int paramInt, V paramV);

  protected abstract void aC(int paramInt);

  public final Object[] aG(int paramInt)
  {
    int i = eh();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = v(j, paramInt);
    return arrayOfObject;
  }

  public final <T> T[] c(T[] paramArrayOfT, int paramInt)
  {
    int i = eh();
    if (paramArrayOfT.length < i)
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
    while (true)
    {
      for (int j = 0; j < i; j++)
        paramArrayOfT[j] = v(j, paramInt);
      if (paramArrayOfT.length > i)
        paramArrayOfT[i] = null;
      return paramArrayOfT;
    }
  }

  protected abstract void d(K paramK, V paramV);

  protected abstract int eh();

  protected abstract Map<K, V> ei();

  protected abstract void ej();

  public final Set<K> getKeySet()
  {
    if (this.Ln == null)
      this.Ln = new c();
    return this.Ln;
  }

  protected abstract Object v(int paramInt1, int paramInt2);

  final class a<T>
    implements Iterator<T>
  {
    final int Lp;
    boolean Lq = false;
    int mIndex;
    int mSize;

    a(int arg2)
    {
      int i;
      this.Lp = i;
      this.mSize = h.this.eh();
    }

    public final boolean hasNext()
    {
      if (this.mIndex < this.mSize);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final T next()
    {
      if (!hasNext())
        throw new NoSuchElementException();
      Object localObject = h.this.v(this.mIndex, this.Lp);
      this.mIndex += 1;
      this.Lq = true;
      return localObject;
    }

    public final void remove()
    {
      if (!this.Lq)
        throw new IllegalStateException();
      this.mIndex -= 1;
      this.mSize -= 1;
      this.Lq = false;
      h.this.aC(this.mIndex);
    }
  }

  final class b
    implements Set<Map.Entry<K, V>>
  {
    b()
    {
    }

    public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = h.this.eh();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramCollection.next();
        h.this.d(localEntry.getKey(), localEntry.getValue());
      }
      if (i != h.this.eh());
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final void clear()
    {
      h.this.ej();
    }

    public final boolean contains(Object paramObject)
    {
      boolean bool = false;
      if (!(paramObject instanceof Map.Entry));
      while (true)
      {
        return bool;
        paramObject = (Map.Entry)paramObject;
        int i = h.this.E(paramObject.getKey());
        if (i >= 0)
          bool = c.equal(h.this.v(i, 1), paramObject.getValue());
      }
    }

    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      do
        if (!paramCollection.hasNext())
          break;
      while (contains(paramCollection.next()));
      for (boolean bool = false; ; bool = true)
        return bool;
    }

    public final boolean equals(Object paramObject)
    {
      return h.a(this, paramObject);
    }

    public final int hashCode()
    {
      int i = h.this.eh() - 1;
      int j = 0;
      if (i >= 0)
      {
        Object localObject1 = h.this.v(i, 0);
        Object localObject2 = h.this.v(i, 1);
        int k;
        if (localObject1 == null)
        {
          k = 0;
          label44: if (localObject2 != null)
            break label75;
        }
        label75: for (int m = 0; ; m = localObject2.hashCode())
        {
          i--;
          j += (m ^ k);
          break;
          k = localObject1.hashCode();
          break label44;
        }
      }
      return j;
    }

    public final boolean isEmpty()
    {
      if (h.this.eh() == 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new h.d(h.this);
    }

    public final boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }

    public final int size()
    {
      return h.this.eh();
    }

    public final Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }

    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      throw new UnsupportedOperationException();
    }
  }

  final class c
    implements Set<K>
  {
    c()
    {
    }

    public final boolean add(K paramK)
    {
      throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends K> paramCollection)
    {
      throw new UnsupportedOperationException();
    }

    public final void clear()
    {
      h.this.ej();
    }

    public final boolean contains(Object paramObject)
    {
      if (h.this.E(paramObject) >= 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean containsAll(Collection<?> paramCollection)
    {
      Map localMap = h.this.ei();
      paramCollection = paramCollection.iterator();
      do
        if (!paramCollection.hasNext())
          break;
      while (localMap.containsKey(paramCollection.next()));
      for (boolean bool = false; ; bool = true)
        return bool;
    }

    public final boolean equals(Object paramObject)
    {
      return h.a(this, paramObject);
    }

    public final int hashCode()
    {
      int i = h.this.eh() - 1;
      int j = 0;
      if (i >= 0)
      {
        Object localObject = h.this.v(i, 0);
        if (localObject == null);
        for (int k = 0; ; k = localObject.hashCode())
        {
          j += k;
          i--;
          break;
        }
      }
      return j;
    }

    public final boolean isEmpty()
    {
      if (h.this.eh() == 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final Iterator<K> iterator()
    {
      return new h.a(h.this, 0);
    }

    public final boolean remove(Object paramObject)
    {
      int i = h.this.E(paramObject);
      if (i >= 0)
        h.this.aC(i);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean removeAll(Collection<?> paramCollection)
    {
      Map localMap = h.this.ei();
      int i = localMap.size();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
        localMap.remove(paramCollection.next());
      if (i != localMap.size());
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean retainAll(Collection<?> paramCollection)
    {
      return h.a(h.this.ei(), paramCollection);
    }

    public final int size()
    {
      return h.this.eh();
    }

    public final Object[] toArray()
    {
      return h.this.aG(0);
    }

    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return h.this.c(paramArrayOfT, 0);
    }
  }

  final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    int Ls = h.this.eh() - 1;
    boolean Lt = false;
    int mIndex = -1;

    d()
    {
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool1 = false;
      if (!this.Lt)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      boolean bool2;
      if (!(paramObject instanceof Map.Entry))
        bool2 = bool1;
      while (true)
      {
        return bool2;
        paramObject = (Map.Entry)paramObject;
        bool2 = bool1;
        if (c.equal(paramObject.getKey(), h.this.v(this.mIndex, 0)))
        {
          bool2 = bool1;
          if (c.equal(paramObject.getValue(), h.this.v(this.mIndex, 1)))
            bool2 = true;
        }
      }
    }

    public final K getKey()
    {
      if (!this.Lt)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      return h.this.v(this.mIndex, 0);
    }

    public final V getValue()
    {
      if (!this.Lt)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      return h.this.v(this.mIndex, 1);
    }

    public final boolean hasNext()
    {
      if (this.mIndex < this.Ls);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final int hashCode()
    {
      int i = 0;
      if (!this.Lt)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      Object localObject1 = h.this.v(this.mIndex, 0);
      Object localObject2 = h.this.v(this.mIndex, 1);
      int j;
      if (localObject1 == null)
      {
        j = 0;
        if (localObject2 != null)
          break label70;
      }
      while (true)
      {
        return i ^ j;
        j = localObject1.hashCode();
        break;
        label70: i = localObject2.hashCode();
      }
    }

    public final void remove()
    {
      if (!this.Lt)
        throw new IllegalStateException();
      h.this.aC(this.mIndex);
      this.mIndex -= 1;
      this.Ls -= 1;
      this.Lt = false;
    }

    public final V setValue(V paramV)
    {
      if (!this.Lt)
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      return h.this.a(this.mIndex, paramV);
    }

    public final String toString()
    {
      return getKey() + "=" + getValue();
    }
  }

  final class e
    implements Collection<V>
  {
    e()
    {
    }

    public final boolean add(V paramV)
    {
      throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends V> paramCollection)
    {
      throw new UnsupportedOperationException();
    }

    public final void clear()
    {
      h.this.ej();
    }

    public final boolean contains(Object paramObject)
    {
      if (h.this.F(paramObject) >= 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      do
        if (!paramCollection.hasNext())
          break;
      while (contains(paramCollection.next()));
      for (boolean bool = false; ; bool = true)
        return bool;
    }

    public final boolean isEmpty()
    {
      if (h.this.eh() == 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final Iterator<V> iterator()
    {
      return new h.a(h.this, 1);
    }

    public final boolean remove(Object paramObject)
    {
      int i = h.this.F(paramObject);
      if (i >= 0)
        h.this.aC(i);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean removeAll(Collection<?> paramCollection)
    {
      int i = h.this.eh();
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = j;
        int m = i;
        if (paramCollection.contains(h.this.v(j, 1)))
        {
          h.this.aC(j);
          k = j - 1;
          m = i - 1;
          bool = true;
        }
        j = k + 1;
        i = m;
      }
      return bool;
    }

    public final boolean retainAll(Collection<?> paramCollection)
    {
      int i = h.this.eh();
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = j;
        int m = i;
        if (!paramCollection.contains(h.this.v(j, 1)))
        {
          h.this.aC(j);
          k = j - 1;
          m = i - 1;
          bool = true;
        }
        j = k + 1;
        i = m;
      }
      return bool;
    }

    public final int size()
    {
      return h.this.eh();
    }

    public final Object[] toArray()
    {
      return h.this.aG(1);
    }

    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return h.this.c(paramArrayOfT, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.f.h
 * JD-Core Version:    0.6.2
 */