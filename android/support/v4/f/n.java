package android.support.v4.f;

public final class n<E>
  implements Cloneable
{
  private static final Object Li = new Object();
  public boolean Lj = false;
  private Object[] Ll;
  public int[] Ly;
  public int mSize;

  public n()
  {
    this(10);
  }

  public n(int paramInt)
  {
    if (paramInt == 0)
      this.Ly = c.Lf;
    for (this.Ll = c.Lh; ; this.Ll = new Object[paramInt])
    {
      this.mSize = 0;
      return;
      paramInt = c.idealIntArraySize(paramInt);
      this.Ly = new int[paramInt];
    }
  }

  private n<E> em()
  {
    try
    {
      localn = (n)super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        n localn;
        localn.Ly = ((int[])this.Ly.clone());
        localn.Ll = ((Object[])this.Ll.clone());
        while (true)
        {
          label36: return localn;
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

  public final E aH(int paramInt)
  {
    paramInt = c.a(this.Ly, this.mSize, paramInt);
    if ((paramInt < 0) || (this.Ll[paramInt] == Li));
    for (Object localObject = null; ; localObject = this.Ll[paramInt])
      return localObject;
  }

  public final void append(int paramInt, E paramE)
  {
    if ((this.mSize != 0) && (paramInt <= this.Ly[(this.mSize - 1)]))
      put(paramInt, paramE);
    while (true)
    {
      return;
      if ((this.Lj) && (this.mSize >= this.Ly.length))
        gc();
      int i = this.mSize;
      if (i >= this.Ly.length)
      {
        int j = c.idealIntArraySize(i + 1);
        int[] arrayOfInt = new int[j];
        Object[] arrayOfObject = new Object[j];
        System.arraycopy(this.Ly, 0, arrayOfInt, 0, this.Ly.length);
        System.arraycopy(this.Ll, 0, arrayOfObject, 0, this.Ll.length);
        this.Ly = arrayOfInt;
        this.Ll = arrayOfObject;
      }
      this.Ly[i] = paramInt;
      this.Ll[i] = paramE;
      this.mSize = (i + 1);
    }
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

  public final void delete(int paramInt)
  {
    paramInt = c.a(this.Ly, this.mSize, paramInt);
    if ((paramInt >= 0) && (this.Ll[paramInt] != Li))
    {
      this.Ll[paramInt] = Li;
      this.Lj = true;
    }
  }

  public final void gc()
  {
    int i = this.mSize;
    int[] arrayOfInt = this.Ly;
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
          arrayOfInt[k] = arrayOfInt[j];
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

  public final int indexOfValue(E paramE)
  {
    if (this.Lj)
      gc();
    int i = 0;
    if (i < this.mSize)
      if (this.Ll[i] != paramE);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  public final int keyAt(int paramInt)
  {
    if (this.Lj)
      gc();
    return this.Ly[paramInt];
  }

  public final void put(int paramInt, E paramE)
  {
    int i = c.a(this.Ly, this.mSize, paramInt);
    if (i >= 0)
      this.Ll[i] = paramE;
    while (true)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.mSize) && (this.Ll[j] == Li))
      {
        this.Ly[j] = paramInt;
        this.Ll[j] = paramE;
      }
      else
      {
        i = j;
        if (this.Lj)
        {
          i = j;
          if (this.mSize >= this.Ly.length)
          {
            gc();
            i = c.a(this.Ly, this.mSize, paramInt) ^ 0xFFFFFFFF;
          }
        }
        Object localObject;
        if (this.mSize >= this.Ly.length)
        {
          j = c.idealIntArraySize(this.mSize + 1);
          localObject = new int[j];
          Object[] arrayOfObject = new Object[j];
          System.arraycopy(this.Ly, 0, localObject, 0, this.Ly.length);
          System.arraycopy(this.Ll, 0, arrayOfObject, 0, this.Ll.length);
          this.Ly = ((int[])localObject);
          this.Ll = arrayOfObject;
        }
        if (this.mSize - i != 0)
        {
          localObject = this.Ly;
          System.arraycopy(localObject, i, localObject, i + 1, this.mSize - i);
          localObject = this.Ll;
          System.arraycopy(localObject, i, localObject, i + 1, this.mSize - i);
        }
        this.Ly[i] = paramInt;
        this.Ll[i] = paramE;
        this.mSize += 1;
      }
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
    StringBuilder localStringBuilder;
    for (Object localObject = "{}"; ; localObject = localStringBuilder.toString())
    {
      return localObject;
      localStringBuilder = new StringBuilder(this.mSize * 28);
      localStringBuilder.append('{');
      int i = 0;
      if (i < this.mSize)
      {
        if (i > 0)
          localStringBuilder.append(", ");
        localStringBuilder.append(keyAt(i));
        localStringBuilder.append('=');
        localObject = valueAt(i);
        if (localObject != this)
          localStringBuilder.append(localObject);
        while (true)
        {
          i++;
          break;
          localStringBuilder.append("(this Map)");
        }
      }
      localStringBuilder.append('}');
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
 * Qualified Name:     android.support.v4.f.n
 * JD-Core Version:    0.6.2
 */