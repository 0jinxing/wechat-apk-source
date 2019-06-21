package android.support.v7.c.a;

import java.lang.reflect.Array;

final class c
{
  static
  {
    if (!c.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public static <T> T[] a(T[] paramArrayOfT, int paramInt, T paramT)
  {
    assert (paramInt <= paramArrayOfT.length);
    if (paramInt + 1 > paramArrayOfT.length)
    {
      Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), bl(paramInt));
      System.arraycopy(paramArrayOfT, 0, arrayOfObject, 0, paramInt);
      paramArrayOfT = arrayOfObject;
    }
    while (true)
    {
      paramArrayOfT[paramInt] = paramT;
      return paramArrayOfT;
    }
  }

  private static int bl(int paramInt)
  {
    if (paramInt <= 4)
      paramInt = 8;
    while (true)
    {
      return paramInt;
      paramInt *= 2;
    }
  }

  public static int[] c(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    assert (paramInt1 <= paramArrayOfInt.length);
    int[] arrayOfInt = paramArrayOfInt;
    if (paramInt1 + 1 > paramArrayOfInt.length)
    {
      arrayOfInt = new int[bl(paramInt1)];
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramInt1);
    }
    arrayOfInt[paramInt1] = paramInt2;
    return arrayOfInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.c.a.c
 * JD-Core Version:    0.6.2
 */