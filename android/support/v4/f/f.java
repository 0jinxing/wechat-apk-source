package android.support.v4.f;

public final class f<E>
  implements Cloneable
{
  public static final Object Li = new Object();
  public boolean Lj = false;
  public long[] Lk;
  public Object[] Ll;
  public int mSize;

  public f()
  {
    this((byte)0);
  }

  private f(byte paramByte)
  {
    paramByte = c.aE(10);
    this.Lk = new long[paramByte];
    this.Ll = new Object[paramByte];
    this.mSize = 0;
  }

  private f<E> el()
  {
    try
    {
      localf = (f)super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        f localf;
        localf.Lk = ((long[])this.Lk.clone());
        localf.Ll = ((Object[])this.Ll.clone());
        while (true)
        {
          label36: return localf;
          localCloneNotSupportedException1 = localCloneNotSupportedException1;
          Object localObject = null;
        }
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2)
      {
        break label36;
      }
    }
  }

  private void gc()
  {
    int i = this.mSize;
    long[] arrayOfLong = this.Lk;
    Object[] arrayOfObject = this.Ll;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      Object localObject = arrayOfObject[j];
      m = k;
      if (localObject != Li)
      {
        if (j != k)
        {
          arrayOfLong[k] = arrayOfLong[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        m = k + 1;
      }
      j++;
    }
    this.Lj = false;
    this.mSize = k;
  }

  public final void clear()
  {
    int i = this.mSize;
    Object[] arrayOfObject = this.Ll;
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = null;
    this.mSize = 0;
    this.Lj = false;
  }

  public final int indexOfKey(long paramLong)
  {
    if (this.Lj)
      gc();
    return c.a(this.Lk, this.mSize, paramLong);
  }

  public final E k(long paramLong)
  {
    int i = c.a(this.Lk, this.mSize, paramLong);
    if ((i < 0) || (this.Ll[i] == Li));
    for (Object localObject = null; ; localObject = this.Ll[i])
      return localObject;
  }

  public final long keyAt(int paramInt)
  {
    if (this.Lj)
      gc();
    return this.Lk[paramInt];
  }

  public final void put(long paramLong, E paramE)
  {
    int i = c.a(this.Lk, this.mSize, paramLong);
    if (i >= 0)
      this.Ll[i] = paramE;
    while (true)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.mSize) && (this.Ll[j] == Li))
      {
        this.Lk[j] = paramLong;
        this.Ll[j] = paramE;
      }
      else
      {
        i = j;
        if (this.Lj)
        {
          i = j;
          if (this.mSize >= this.Lk.length)
          {
            gc();
            i = c.a(this.Lk, this.mSize, paramLong) ^ 0xFFFFFFFF;
          }
        }
        Object localObject;
        if (this.mSize >= this.Lk.length)
        {
          j = c.aE(this.mSize + 1);
          long[] arrayOfLong = new long[j];
          localObject = new Object[j];
          System.arraycopy(this.Lk, 0, arrayOfLong, 0, this.Lk.length);
          System.arraycopy(this.Ll, 0, localObject, 0, this.Ll.length);
          this.Lk = arrayOfLong;
          this.Ll = ((Object[])localObject);
        }
        if (this.mSize - i != 0)
        {
          localObject = this.Lk;
          System.arraycopy(localObject, i, localObject, i + 1, this.mSize - i);
          localObject = this.Ll;
          System.arraycopy(localObject, i, localObject, i + 1, this.mSize - i);
        }
        this.Lk[i] = paramLong;
        this.Ll[i] = paramE;
        this.mSize += 1;
      }
    }
  }

  public final void removeAt(int paramInt)
  {
    if (this.Ll[paramInt] != Li)
    {
      this.Ll[paramInt] = Li;
      this.Lj = true;
    }
  }

  public final int size()
  {
    if (this.Lj)
      gc();
    return this.mSize;
  }

  public final String toString()
  {
    if (size() <= 0);
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
        ((StringBuilder)localObject1).append(keyAt(i));
        ((StringBuilder)localObject1).append('=');
        Object localObject2 = valueAt(i);
        if (localObject2 != this)
          ((StringBuilder)localObject1).append(localObject2);
        while (true)
        {
          i++;
          break;
          ((StringBuilder)localObject1).append("(this Map)");
        }
      }
      ((StringBuilder)localObject1).append('}');
    }
  }

  public final E valueAt(int paramInt)
  {
    if (this.Lj)
      gc();
    return this.Ll[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.f.f
 * JD-Core Version:    0.6.2
 */