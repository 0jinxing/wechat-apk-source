package com.tencent.tinker.a.c;

public final class a
  implements Cloneable
{
  private static final boolean[] Azh = new boolean[0];
  private static final int[] bxu = new int[0];
  private boolean[] Azi = new boolean[10];
  private int[] Ly = new int[10];
  private int mSize = 0;

  public a()
  {
    this((byte)0);
  }

  private a(byte paramByte)
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

  private a dSd()
  {
    try
    {
      locala = (a)super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        a locala;
        locala.Ly = ((int[])this.Ly.clone());
        locala.Azi = ((boolean[])this.Azi.clone());
        while (true)
        {
          label36: return locala;
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

  public final void RI(int paramInt)
  {
    int i = a(this.Ly, this.mSize, paramInt);
    if (i >= 0)
    {
      this.Azi[i] = true;
      return;
    }
    i ^= -1;
    Object localObject1 = this.Ly;
    int j = this.mSize;
    if (j > localObject1.length)
      throw new IllegalArgumentException("Bad currentSize, originalSize: " + localObject1.length + " currentSize: " + j);
    Object localObject2;
    if (j + 1 <= localObject1.length)
    {
      System.arraycopy(localObject1, i, localObject1, i + 1, j - i);
      localObject1[i] = paramInt;
      localObject2 = localObject1;
    }
    while (true)
    {
      this.Ly = ((int[])localObject2);
      localObject2 = this.Azi;
      paramInt = this.mSize;
      if (paramInt <= localObject2.length)
        break;
      throw new IllegalArgumentException("Bad currentSize, originalSize: " + localObject2.length + " currentSize: " + paramInt);
      localObject2 = new int[bl(j)];
      System.arraycopy(localObject1, 0, localObject2, 0, i);
      localObject2[i] = paramInt;
      System.arraycopy(localObject1, i, localObject2, i + 1, localObject1.length - i);
    }
    if (paramInt + 1 <= localObject2.length)
    {
      System.arraycopy(localObject2, i, localObject2, i + 1, paramInt - i);
      localObject2[i] = 1;
    }
    while (true)
    {
      this.Azi = ((boolean[])localObject2);
      this.mSize += 1;
      break;
      localObject1 = new boolean[bl(paramInt)];
      System.arraycopy(localObject2, 0, localObject1, 0, i);
      localObject1[i] = 1;
      System.arraycopy(localObject2, i, localObject1, i + 1, localObject2.length - i);
      localObject2 = localObject1;
    }
  }

  public final boolean RJ(int paramInt)
  {
    if (a(this.Ly, this.mSize, paramInt) >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
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
        ((StringBuilder)localObject).append(this.Azi[i]);
      }
      ((StringBuilder)localObject).append('}');
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.c.a
 * JD-Core Version:    0.6.2
 */