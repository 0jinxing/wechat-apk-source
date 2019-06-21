package android.support.v4.f;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class m<K, V>
{
  static Object[] Lu;
  static int Lv;
  static Object[] Lw;
  static int Lx;
  int[] Lc;
  Object[] Ld;
  int mSize;

  public m()
  {
    this.Lc = c.Lf;
    this.Ld = c.Lh;
    this.mSize = 0;
  }

  public m(int paramInt)
  {
    if (paramInt == 0)
    {
      this.Lc = c.Lf;
      this.Ld = c.Lh;
    }
    while (true)
    {
      this.mSize = 0;
      return;
      aD(paramInt);
    }
  }

  public m(m<K, V> paramm)
  {
    this();
    if (paramm != null)
      a(paramm);
  }

  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8);
    while (true)
    {
      try
      {
        if (Lx < 10)
        {
          paramArrayOfObject[0] = Lw;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          if (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
            continue;
          }
          Lw = paramArrayOfObject;
          Lx += 1;
        }
        return;
      }
      finally
      {
      }
      if (paramArrayOfInt.length == 4)
        try
        {
          if (Lv < 10)
          {
            paramArrayOfObject[0] = Lu;
            paramArrayOfObject[1] = paramArrayOfInt;
            for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--)
              paramArrayOfObject[paramInt] = null;
            Lu = paramArrayOfObject;
            Lv += 1;
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
        if (Lw != null)
        {
          Object[] arrayOfObject1 = Lw;
          this.Ld = arrayOfObject1;
          Lw = (Object[])arrayOfObject1[0];
          this.Lc = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          Lx -= 1;
          return;
        }
        this.Lc = new int[paramInt];
        this.Ld = new Object[paramInt << 1];
        continue;
      }
      finally
      {
      }
      if (paramInt == 4)
        try
        {
          if (Lu != null)
          {
            Object[] arrayOfObject2 = Lu;
            this.Ld = arrayOfObject2;
            Lu = (Object[])arrayOfObject2[0];
            this.Lc = ((int[])arrayOfObject2[1]);
            arrayOfObject2[1] = null;
            arrayOfObject2[0] = null;
            Lv -= 1;
            continue;
          }
        }
        finally
        {
        }
    }
  }

  private static int b(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = c.a(paramArrayOfInt, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfInt)
    {
    }
    throw new ConcurrentModificationException();
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
      int k = b(this.Lc, i, 0);
      j = k;
      if (k >= 0)
      {
        j = k;
        if (this.Ld[(k << 1)] != null)
        {
          for (int m = k + 1; ; m++)
          {
            if ((m >= i) || (this.Lc[m] != 0))
              break label87;
            if (this.Ld[(m << 1)] == null)
            {
              j = m;
              break;
            }
          }
          label87: k--;
          while (true)
          {
            if ((k < 0) || (this.Lc[k] != 0))
              break label122;
            j = k;
            if (this.Ld[(k << 1)] == null)
              break;
            k--;
          }
          label122: j = m ^ 0xFFFFFFFF;
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
      int k = b(this.Lc, i, paramInt);
      j = k;
      if (k >= 0)
      {
        j = k;
        if (!paramObject.equals(this.Ld[(k << 1)]))
        {
          for (int m = k + 1; ; m++)
          {
            if ((m >= i) || (this.Lc[m] != paramInt))
              break label107;
            if (paramObject.equals(this.Ld[(m << 1)]))
            {
              j = m;
              break;
            }
          }
          label107: k--;
          while (true)
          {
            if ((k < 0) || (this.Lc[k] != paramInt))
              break label152;
            j = k;
            if (paramObject.equals(this.Ld[(k << 1)]))
              break;
            k--;
          }
          label152: j = m ^ 0xFFFFFFFF;
        }
      }
    }
  }

  public void a(m<? extends K, ? extends V> paramm)
  {
    int i = 0;
    int j = paramm.mSize;
    ensureCapacity(this.mSize + j);
    if (this.mSize == 0)
      if (j > 0)
      {
        System.arraycopy(paramm.Lc, 0, this.Lc, 0, j);
        System.arraycopy(paramm.Ld, 0, this.Ld, 0, j << 1);
        this.mSize = j;
      }
    while (true)
    {
      return;
      while (i < j)
      {
        put(paramm.keyAt(i), paramm.valueAt(i));
        i++;
      }
    }
  }

  public void clear()
  {
    if (this.mSize > 0)
    {
      int[] arrayOfInt = this.Lc;
      Object[] arrayOfObject = this.Ld;
      int i = this.mSize;
      this.Lc = c.Lf;
      this.Ld = c.Lh;
      this.mSize = 0;
      a(arrayOfInt, arrayOfObject, i);
    }
    if (this.mSize > 0)
      throw new ConcurrentModificationException();
  }

  public boolean containsKey(Object paramObject)
  {
    if (indexOfKey(paramObject) >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean containsValue(Object paramObject)
  {
    if (indexOfValue(paramObject) >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void ensureCapacity(int paramInt)
  {
    int i = this.mSize;
    if (this.Lc.length < paramInt)
    {
      int[] arrayOfInt = this.Lc;
      Object[] arrayOfObject = this.Ld;
      aD(paramInt);
      if (this.mSize > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.Lc, 0, i);
        System.arraycopy(arrayOfObject, 0, this.Ld, 0, i << 1);
      }
      a(arrayOfInt, arrayOfObject, i);
    }
    if (this.mSize != i)
      throw new ConcurrentModificationException();
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this == paramObject)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      Object localObject1;
      int i;
      Object localObject2;
      Object localObject3;
      if ((paramObject instanceof m))
      {
        localObject1 = (m)paramObject;
        if (size() != ((m)localObject1).size())
        {
          bool2 = false;
        }
        else
        {
          i = 0;
          bool2 = bool1;
          try
          {
            if (i >= this.mSize)
              continue;
            paramObject = keyAt(i);
            localObject2 = valueAt(i);
            localObject3 = ((m)localObject1).get(paramObject);
            if (localObject2 == null)
            {
              if ((localObject3 == null) && (((m)localObject1).containsKey(paramObject)))
                break label119;
              bool2 = false;
              continue;
            }
            bool2 = localObject2.equals(localObject3);
            if (!bool2)
            {
              bool2 = false;
              continue;
            }
            label119: i++;
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
      else if ((paramObject instanceof Map))
      {
        localObject2 = (Map)paramObject;
        if (size() != ((Map)localObject2).size())
        {
          bool2 = false;
        }
        else
        {
          i = 0;
          bool2 = bool1;
          try
          {
            if (i >= this.mSize)
              continue;
            localObject1 = keyAt(i);
            localObject3 = valueAt(i);
            paramObject = ((Map)localObject2).get(localObject1);
            if (localObject3 == null)
            {
              if ((paramObject == null) && (((Map)localObject2).containsKey(localObject1)))
                break label251;
              bool2 = false;
              continue;
            }
            bool2 = localObject3.equals(paramObject);
            if (!bool2)
            {
              bool2 = false;
              continue;
            }
            label251: i++;
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

  public V get(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0);
    for (paramObject = this.Ld[((i << 1) + 1)]; ; paramObject = null)
      return paramObject;
  }

  public int hashCode()
  {
    int[] arrayOfInt = this.Lc;
    Object[] arrayOfObject = this.Ld;
    int i = this.mSize;
    int j = 1;
    int k = 0;
    int m = 0;
    if (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      if (localObject == null);
      for (int i1 = 0; ; i1 = localObject.hashCode())
      {
        m += (i1 ^ n);
        k++;
        j += 2;
        break;
      }
    }
    return m;
  }

  public final int indexOfKey(Object paramObject)
  {
    if (paramObject == null);
    for (int i = ek(); ; i = indexOf(paramObject, paramObject.hashCode()))
      return i;
  }

  final int indexOfValue(Object paramObject)
  {
    int i = 1;
    int j = 1;
    int k = this.mSize * 2;
    Object[] arrayOfObject = this.Ld;
    if (paramObject == null)
    {
      i = j;
      if (i >= k)
        break label76;
      if (arrayOfObject[i] == null)
        i >>= 1;
    }
    while (true)
    {
      return i;
      i += 2;
      break;
      do
      {
        i += 2;
        if (i >= k)
          break;
      }
      while (!paramObject.equals(arrayOfObject[i]));
      i >>= 1;
      continue;
      label76: i = -1;
    }
  }

  public boolean isEmpty()
  {
    if (this.mSize <= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final K keyAt(int paramInt)
  {
    return this.Ld[(paramInt << 1)];
  }

  public V put(K paramK, V paramV)
  {
    int i = 8;
    int j = this.mSize;
    int k;
    int m;
    if (paramK == null)
    {
      k = ek();
      m = 0;
      if (k < 0)
        break label71;
      k = (k << 1) + 1;
      paramK = this.Ld[k];
      this.Ld[k] = paramV;
    }
    while (true)
    {
      return paramK;
      m = paramK.hashCode();
      k = indexOf(paramK, m);
      break;
      label71: int n = k ^ 0xFFFFFFFF;
      int[] arrayOfInt;
      if (j >= this.Lc.length)
      {
        if (j >= 8)
          k = (j >> 1) + j;
        Object[] arrayOfObject;
        while (true)
        {
          arrayOfInt = this.Lc;
          arrayOfObject = this.Ld;
          aD(k);
          if (j == this.mSize)
            break;
          throw new ConcurrentModificationException();
          k = i;
          if (j < 4)
            k = 4;
        }
        if (this.Lc.length > 0)
        {
          System.arraycopy(arrayOfInt, 0, this.Lc, 0, arrayOfInt.length);
          System.arraycopy(arrayOfObject, 0, this.Ld, 0, arrayOfObject.length);
        }
        a(arrayOfInt, arrayOfObject, j);
      }
      if (n < j)
      {
        arrayOfInt = this.Lc;
        System.arraycopy(arrayOfInt, n, arrayOfInt, n + 1, j - n);
        System.arraycopy(this.Ld, n << 1, this.Ld, n + 1 << 1, this.mSize - n << 1);
      }
      if ((j != this.mSize) || (n >= this.Lc.length))
        throw new ConcurrentModificationException();
      this.Lc[n] = m;
      this.Ld[(n << 1)] = paramK;
      this.Ld[((n << 1) + 1)] = paramV;
      this.mSize += 1;
      paramK = null;
    }
  }

  public V remove(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0);
    for (paramObject = removeAt(i); ; paramObject = null)
      return paramObject;
  }

  public V removeAt(int paramInt)
  {
    int i = 8;
    Object localObject = this.Ld[((paramInt << 1) + 1)];
    int j = this.mSize;
    if (j <= 1)
    {
      a(this.Lc, this.Ld, j);
      this.Lc = c.Lf;
      this.Ld = c.Lh;
      paramInt = 0;
    }
    while (j != this.mSize)
    {
      throw new ConcurrentModificationException();
      int k = j - 1;
      if ((this.Lc.length > 8) && (this.mSize < this.Lc.length / 3))
      {
        if (j > 8)
          i = (j >> 1) + j;
        int[] arrayOfInt = this.Lc;
        Object[] arrayOfObject = this.Ld;
        aD(i);
        if (j != this.mSize)
          throw new ConcurrentModificationException();
        if (paramInt > 0)
        {
          System.arraycopy(arrayOfInt, 0, this.Lc, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, this.Ld, 0, paramInt << 1);
        }
        if (paramInt < k)
        {
          System.arraycopy(arrayOfInt, paramInt + 1, this.Lc, paramInt, k - paramInt);
          System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.Ld, paramInt << 1, k - paramInt << 1);
        }
        paramInt = k;
      }
      else
      {
        if (paramInt < k)
        {
          System.arraycopy(this.Lc, paramInt + 1, this.Lc, paramInt, k - paramInt);
          System.arraycopy(this.Ld, paramInt + 1 << 1, this.Ld, paramInt << 1, k - paramInt << 1);
        }
        this.Ld[(k << 1)] = null;
        this.Ld[((k << 1) + 1)] = null;
        paramInt = k;
      }
    }
    this.mSize = paramInt;
    return localObject;
  }

  public V setValueAt(int paramInt, V paramV)
  {
    paramInt = (paramInt << 1) + 1;
    Object localObject = this.Ld[paramInt];
    this.Ld[paramInt] = paramV;
    return localObject;
  }

  public int size()
  {
    return this.mSize;
  }

  public String toString()
  {
    if (isEmpty());
    for (Object localObject1 = "{}"; ; localObject1 = ((StringBuilder)localObject1).toString())
    {
      return localObject1;
      localObject1 = new StringBuilder(this.mSize * 28);
      ((StringBuilder)localObject1).append('{');
      int i = 0;
      if (i < this.mSize)
      {
        if (i > 0)
          ((StringBuilder)localObject1).append(", ");
        Object localObject2 = keyAt(i);
        if (localObject2 != this)
        {
          ((StringBuilder)localObject1).append(localObject2);
          label72: ((StringBuilder)localObject1).append('=');
          localObject2 = valueAt(i);
          if (localObject2 == this)
            break label112;
          ((StringBuilder)localObject1).append(localObject2);
        }
        while (true)
        {
          i++;
          break;
          ((StringBuilder)localObject1).append("(this Map)");
          break label72;
          label112: ((StringBuilder)localObject1).append("(this Map)");
        }
      }
      ((StringBuilder)localObject1).append('}');
    }
  }

  public final V valueAt(int paramInt)
  {
    return this.Ld[((paramInt << 1) + 1)];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.f.m
 * JD-Core Version:    0.6.2
 */