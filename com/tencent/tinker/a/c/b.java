package com.tencent.tinker.a.c;

public final class b
  implements Cloneable
{
  private static final int[] bxu = new int[0];
  public int[] Azj = new int[this.Ly.length];
  public int[] Ly = new int[10];
  public int mSize = 0;

  public b()
  {
    this((byte)0);
  }

  private b(byte paramByte)
  {
  }

  private static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    paramInt1--;
    int i = 0;
    while (i <= paramInt1)
    {
      int j = i + paramInt1 >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2)
      {
        i = j + 1;
      }
      else
      {
        paramInt1 = j;
        if (k <= paramInt2)
          break label58;
        paramInt1 = j - 1;
      }
    }
    paramInt1 = i ^ 0xFFFFFFFF;
    label58: return paramInt1;
  }

  private static int bl(int paramInt)
  {
    if (paramInt <= 4);
    for (paramInt = 8; ; paramInt = (paramInt >> 1) + paramInt)
      return paramInt;
  }

  private static int[] c(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramArrayOfInt.length)
      throw new IllegalArgumentException("Bad currentSize, originalSize: " + paramArrayOfInt.length + " currentSize: " + paramInt1);
    if (paramInt1 + 1 <= paramArrayOfInt.length)
    {
      System.arraycopy(paramArrayOfInt, paramInt2, paramArrayOfInt, paramInt2 + 1, paramInt1 - paramInt2);
      paramArrayOfInt[paramInt2] = paramInt3;
    }
    while (true)
    {
      return paramArrayOfInt;
      int[] arrayOfInt = new int[bl(paramInt1)];
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramInt2);
      arrayOfInt[paramInt2] = paramInt3;
      System.arraycopy(paramArrayOfInt, paramInt2, arrayOfInt, paramInt2 + 1, paramArrayOfInt.length - paramInt2);
      paramArrayOfInt = arrayOfInt;
    }
  }

  private b dSe()
  {
    try
    {
      localb = (b)super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        b localb;
        localb.Ly = ((int[])this.Ly.clone());
        localb.Azj = ((int[])this.Azj.clone());
        while (true)
        {
          label36: return localb;
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

  public static int[] h(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramArrayOfInt.length)
      throw new IllegalArgumentException("Bad currentSize, originalSize: " + paramArrayOfInt.length + " currentSize: " + paramInt1);
    int[] arrayOfInt = paramArrayOfInt;
    if (paramInt1 + 1 > paramArrayOfInt.length)
    {
      arrayOfInt = new int[bl(paramInt1)];
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramInt1);
    }
    arrayOfInt[paramInt1] = paramInt2;
    return arrayOfInt;
  }

  public final int indexOfKey(int paramInt)
  {
    return a(this.Ly, this.mSize, paramInt);
  }

  public final void put(int paramInt1, int paramInt2)
  {
    int i = a(this.Ly, this.mSize, paramInt1);
    if (i >= 0)
      this.Azj[i] = paramInt2;
    while (true)
    {
      return;
      i ^= -1;
      this.Ly = c(this.Ly, this.mSize, i, paramInt1);
      this.Azj = c(this.Azj, this.mSize, i, paramInt2);
      this.mSize += 1;
    }
  }

  public final String toString()
  {
    if (this.mSize <= 0);
    for (Object localObject = "{}"; ; localObject = ((StringBuilder)localObject).toString())
    {
      return localObject;
      localObject = new StringBuilder(this.mSize * 28);
      ((StringBuilder)localObject).append('{');
      for (int i = 0; i < this.mSize; i++)
      {
        if (i > 0)
          ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(this.Ly[i]);
        ((StringBuilder)localObject).append('=');
        ((StringBuilder)localObject).append(this.Azj[i]);
      }
      ((StringBuilder)localObject).append('}');
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.c.b
 * JD-Core Version:    0.6.2
 */