package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d
{
  public static d.a a(int paramInt, long[] paramArrayOfLong, int[] paramArrayOfInt, long paramLong)
  {
    AppMethodBeat.i(94959);
    int i = 8192 / paramInt;
    int j = paramArrayOfInt.length;
    int k = 0;
    for (int m = 0; k < j; m = n + m)
    {
      n = v.bi(paramArrayOfInt[k], i);
      k++;
    }
    long[] arrayOfLong1 = new long[m];
    int[] arrayOfInt1 = new int[m];
    int i1 = 0;
    long[] arrayOfLong2 = new long[m];
    int[] arrayOfInt2 = new int[m];
    j = 0;
    int n = 0;
    for (m = 0; m < paramArrayOfInt.length; m++)
    {
      k = paramArrayOfInt[m];
      long l = paramArrayOfLong[m];
      while (k > 0)
      {
        int i2 = Math.min(i, k);
        arrayOfLong1[n] = l;
        arrayOfInt1[n] = (paramInt * i2);
        i1 = Math.max(i1, arrayOfInt1[n]);
        arrayOfLong2[n] = (j * paramLong);
        arrayOfInt2[n] = 1;
        l += arrayOfInt1[n];
        j += i2;
        k -= i2;
        n++;
      }
    }
    paramArrayOfLong = new d.a(arrayOfLong1, arrayOfInt1, i1, arrayOfLong2, arrayOfInt2, (byte)0);
    AppMethodBeat.o(94959);
    return paramArrayOfLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.d
 * JD-Core Version:    0.6.2
 */