package com.tencent.mm.compatible.loader;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static Object[] euk = new Object[0];
  private static Object[] eul = new Object[73];

  public static boolean contains(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramArrayOfInt[j] == paramInt)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public static <T> boolean contains(T[] paramArrayOfT, T paramT)
  {
    boolean bool = true;
    AppMethodBeat.i(51923);
    int i = paramArrayOfT.length;
    int j = 0;
    T ?;
    if (j < i)
    {
      ? = paramArrayOfT[j];
      if (? == null)
      {
        if (paramT != null)
          break label62;
        AppMethodBeat.o(51923);
      }
    }
    while (true)
    {
      return bool;
      if ((paramT != null) && (?.equals(paramT)))
      {
        AppMethodBeat.o(51923);
      }
      else
      {
        label62: j++;
        break;
        AppMethodBeat.o(51923);
        bool = false;
      }
    }
  }

  public static int idealIntArraySize(int paramInt)
  {
    int i = paramInt * 4;
    for (int j = 4; ; j++)
    {
      paramInt = i;
      if (j < 32)
      {
        if (i <= (1 << j) - 12)
          paramInt = (1 << j) - 12;
      }
      else
        return paramInt / 4;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.a
 * JD-Core Version:    0.6.2
 */