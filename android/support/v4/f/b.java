package android.support.v4.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E>
  implements Collection<E>, Set<E>
{
  private static final int[] KW = new int[0];
  private static final Object[] KX = new Object[0];
  private static Object[] KY;
  private static int KZ;
  private static Object[] La;
  private static int Lb;
  private h<E, E> KU;
  private int[] Lc;
  public Object[] Ld;
  private int mSize;

  public b()
  {
    this(0);
  }

  public b(int paramInt)
  {
    if (paramInt == 0)
    {
      this.Lc = KW;
      this.Ld = KX;
    }
    while (true)
    {
      this.mSize = 0;
      return;
      aD(paramInt);
    }
  }

  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8);
    while (true)
    {
      try
      {
        if (Lb < 10)
        {
          paramArrayOfObject[0] = La;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          if (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
            continue;
          }
          La = paramArrayOfObject;
          Lb += 1;
        }
        return;
      }
      finally
      {
      }
      if (paramArrayOfInt.length == 4)
        try
        {
          if (KZ < 10)
          {
            paramArrayOfObject[0] = KY;
            paramArrayOfObject[1] = paramArrayOfInt;
            paramInt--;
            while (paramInt >= 2)
            {
              paramArrayOfObject[paramInt] = null;
              paramInt--;
            }
            KY = paramArrayOfObject;
            KZ += 1;
          }
        }
        finally
        {
        }
    }
    throw paramArrayOfInt;
  }

  private void aD(int paramInt)
  {
    if (paramInt == 8);
    while (true)
    {
      try
      {
        if (La != null)
        {
          Object[] arrayOfObject1 = La;
          this.Ld = arrayOfObject1;
          La = (Object[])arrayOfObject1[0];
          this.Lc = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          Lb -= 1;
          return;
        }
        this.Lc = new int[paramInt];
        this.Ld = new Object[paramInt];
        continue;
      }
      finally
      {
      }
      if (paramInt == 4)
        try
        {
          if (KY != null)
          {
            Object[] arrayOfObject2 = KY;
            this.Ld = arrayOfObject2;
            KY = (Object[])arrayOfObject2[0];
            this.Lc = ((int[])arrayOfObject2[1]);
            arrayOfObject2[1] = null;
            arrayOfObject2[0] = null;
            KZ -= 1;
            continue;
          }
        }
        finally
        {
        }
    }
  }

  private int ek()
  {
    int i = this.mSize;
    int j;
    if (i == 0)
      j = -1;
    while (true)
    {
      return j;
      int k = c.a(this.Lc, i, 0);
      j = k;
      if (k >= 0)
      {
        j = k;
        if (this.Ld[k] != null)
        {
          for (int m = k + 1; ; m++)
          {
            if ((m >= i) || (this.Lc[m] != 0))
              break label83;
            if (this.Ld[m] == null)
            {
              j = m;
              break;
            }
          }
          label83: k--;
          while (true)
          {
            if ((k < 0) || (this.Lc[k] != 0))
              break label116;
            j = k;
            if (this.Ld[k] == null)
              break;
            k--;
          }
          label116: j = m ^ 0xFFFFFFFF;
        }
      }
    }
  }

  private int indexOf(Object paramObject, int paramInt)
  {
    int i = this.mSize;
    int j;
    if (i == 0)
      j = -1;
    while (true)
    {
      return j;
      int k = c.a(this.Lc, i, paramInt);
      j = k;
      if (k >= 0)
      {
        j = k;
        if (!paramObject.equals(this.Ld[k]))
        {
          for (int m = k + 1; ; m++)
          {
            if ((m >= i) || (this.Lc[m] != paramInt))
              break label103;
            if (paramObject.equals(this.Ld[m]))
            {
              j = m;
              break;
            }
          }
          label103: k--;
          while (true)
          {
            if ((k < 0) || (this.Lc[k] != paramInt))
              break label146;
            j = k;
            if (paramObject.equals(this.Ld[k]))
              break;
            k--;
          }
          label146: j = m ^ 0xFFFFFFFF;
        }
      }
    }
  }

  public final boolean add(E paramE)
  {
    int i = 8;
    int j;
    int k;
    if (paramE == null)
    {
      j = ek();
      k = 0;
    }
    boolean bool;
    while (j >= 0)
    {
      bool = false;
      return bool;
      k = paramE.hashCode();
      j = indexOf(paramE, k);
    }
    int m = j ^ 0xFFFFFFFF;
    if (this.mSize >= this.Lc.length)
    {
      if (this.mSize < 8)
        break label238;
      j = this.mSize + (this.mSize >> 1);
    }
    while (true)
    {
      Object localObject = this.Lc;
      Object[] arrayOfObject = this.Ld;
      aD(j);
      if (this.Lc.length > 0)
      {
        System.arraycopy(localObject, 0, this.Lc, 0, localObject.length);
        System.arraycopy(arrayOfObject, 0, this.Ld, 0, arrayOfObject.length);
      }
      a((int[])localObject, arrayOfObject, this.mSize);
      if (m < this.mSize)
      {
        localObject = this.Lc;
        System.arraycopy(localObject, m, localObject, m + 1, this.mSize - m);
        localObject = this.Ld;
        System.arraycopy(localObject, m, localObject, m + 1, this.mSize - m);
      }
      this.Lc[m] = k;
      this.Ld[m] = paramE;
      this.mSize += 1;
      bool = true;
      break;
      label238: j = i;
      if (this.mSize < 4)
        j = 4;
    }
  }

  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    boolean bool = false;
    int i = this.mSize + paramCollection.size();
    if (this.Lc.length < i)
    {
      int[] arrayOfInt = this.Lc;
      Object[] arrayOfObject = this.Ld;
      aD(i);
      if (this.mSize > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.Lc, 0, this.mSize);
        System.arraycopy(arrayOfObject, 0, this.Ld, 0, this.mSize);
      }
      a(arrayOfInt, arrayOfObject, this.mSize);
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
      bool |= add(paramCollection.next());
    return bool;
  }

  public final void clear()
  {
    if (this.mSize != 0)
    {
      a(this.Lc, this.Ld, this.mSize);
      this.Lc = KW;
      this.Ld = KX;
      this.mSize = 0;
    }
  }

  public final boolean contains(Object paramObject)
  {
    if (indexOf(paramObject) >= 0);
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

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this == paramObject)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((paramObject instanceof Set))
      {
        paramObject = (Set)paramObject;
        if (size() != paramObject.size())
        {
          bool2 = false;
        }
        else
        {
          int i = 0;
          bool2 = bool1;
          try
          {
            if (i >= this.mSize)
              continue;
            bool2 = paramObject.contains(this.Ld[i]);
            if (!bool2)
            {
              bool2 = false;
              continue;
            }
            i++;
          }
          catch (NullPointerException paramObject)
          {
            bool2 = false;
            continue;
          }
          catch (ClassCastException paramObject)
          {
            bool2 = false;
          }
        }
      }
      else
      {
        bool2 = false;
      }
    }
  }

  public final int hashCode()
  {
    int[] arrayOfInt = this.Lc;
    int i = this.mSize;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m + k)
    {
      m = arrayOfInt[j];
      j++;
    }
    return k;
  }

  public final int indexOf(Object paramObject)
  {
    if (paramObject == null);
    for (int i = ek(); ; i = indexOf(paramObject, paramObject.hashCode()))
      return i;
  }

  public final boolean isEmpty()
  {
    if (this.mSize <= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Iterator<E> iterator()
  {
    if (this.KU == null)
      this.KU = new h()
      {
        protected final int E(Object paramAnonymousObject)
        {
          return b.this.indexOf(paramAnonymousObject);
        }

        protected final int F(Object paramAnonymousObject)
        {
          return b.this.indexOf(paramAnonymousObject);
        }

        protected final E a(int paramAnonymousInt, E paramAnonymousE)
        {
          throw new UnsupportedOperationException("not a map");
        }

        protected final void aC(int paramAnonymousInt)
        {
          b.this.removeAt(paramAnonymousInt);
        }

        protected final void d(E paramAnonymousE1, E paramAnonymousE2)
        {
          b.this.add(paramAnonymousE1);
        }

        protected final int eh()
        {
          return b.a(b.this);
        }

        protected final Map<E, E> ei()
        {
          throw new UnsupportedOperationException("not a map");
        }

        protected final void ej()
        {
          b.this.clear();
        }

        protected final Object v(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return b.b(b.this)[paramAnonymousInt1];
        }
      };
    return this.KU.getKeySet().iterator();
  }

  public final boolean remove(Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i >= 0)
      removeAt(i);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean removeAll(Collection<?> paramCollection)
  {
    boolean bool = false;
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
      bool |= remove(paramCollection.next());
    return bool;
  }

  public final E removeAt(int paramInt)
  {
    int i = 8;
    Object localObject = this.Ld[paramInt];
    if (this.mSize <= 1)
    {
      a(this.Lc, this.Ld, this.mSize);
      this.Lc = KW;
      this.Ld = KX;
      this.mSize = 0;
    }
    while (true)
    {
      return localObject;
      if ((this.Lc.length > 8) && (this.mSize < this.Lc.length / 3))
      {
        if (this.mSize > 8)
          i = this.mSize + (this.mSize >> 1);
        int[] arrayOfInt = this.Lc;
        Object[] arrayOfObject = this.Ld;
        aD(i);
        this.mSize -= 1;
        if (paramInt > 0)
        {
          System.arraycopy(arrayOfInt, 0, this.Lc, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, this.Ld, 0, paramInt);
        }
        if (paramInt < this.mSize)
        {
          System.arraycopy(arrayOfInt, paramInt + 1, this.Lc, paramInt, this.mSize - paramInt);
          System.arraycopy(arrayOfObject, paramInt + 1, this.Ld, paramInt, this.mSize - paramInt);
        }
      }
      else
      {
        this.mSize -= 1;
        if (paramInt < this.mSize)
        {
          System.arraycopy(this.Lc, paramInt + 1, this.Lc, paramInt, this.mSize - paramInt);
          System.arraycopy(this.Ld, paramInt + 1, this.Ld, paramInt, this.mSize - paramInt);
        }
        this.Ld[this.mSize] = null;
      }
    }
  }

  public final boolean retainAll(Collection<?> paramCollection)
  {
    boolean bool = false;
    for (int i = this.mSize - 1; i >= 0; i--)
      if (!paramCollection.contains(this.Ld[i]))
      {
        removeAt(i);
        bool = true;
      }
    return bool;
  }

  public final int size()
  {
    return this.mSize;
  }

  public final Object[] toArray()
  {
    Object[] arrayOfObject = new Object[this.mSize];
    System.arraycopy(this.Ld, 0, arrayOfObject, 0, this.mSize);
    return arrayOfObject;
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length < this.mSize)
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.mSize);
    while (true)
    {
      System.arraycopy(this.Ld, 0, paramArrayOfT, 0, this.mSize);
      if (paramArrayOfT.length > this.mSize)
        paramArrayOfT[this.mSize] = null;
      return paramArrayOfT;
    }
  }

  public final String toString()
  {
    if (isEmpty());
    for (Object localObject1 = "{}"; ; localObject1 = ((StringBuilder)localObject1).toString())
    {
      return localObject1;
      localObject1 = new StringBuilder(this.mSize * 14);
      ((StringBuilder)localObject1).append('{');
      int i = 0;
      if (i < this.mSize)
      {
        if (i > 0)
          ((StringBuilder)localObject1).append(", ");
        Object localObject2 = this.Ld[i];
        if (localObject2 != this)
          ((StringBuilder)localObject1).append(localObject2);
        while (true)
        {
          i++;
          break;
          ((StringBuilder)localObject1).append("(this Set)");
        }
      }
      ((StringBuilder)localObject1).append('}');
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.f.b
 * JD-Core Version:    0.6.2
 */