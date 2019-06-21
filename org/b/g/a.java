package org.b.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class a
{
  private static final char[] BZn;
  private static final int[] BZo;

  static
  {
    AppMethodBeat.i(77306);
    BZn = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    int[] arrayOfInt = new int[256];
    BZo = arrayOfInt;
    Arrays.fill(arrayOfInt, -1);
    int i = BZn.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        BZo[61] = 0;
        AppMethodBeat.o(77306);
        return;
      }
      BZo[BZn[j]] = j;
    }
  }

  public static final char[] cQ(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte != null);
    for (int j = paramArrayOfByte.length; j == 0; j = 0)
    {
      paramArrayOfByte = new char[0];
      return paramArrayOfByte;
    }
    int k = j / 3 * 3;
    int m = (j - 1) / 3 + 1 << 2;
    int n = m + ((m - 1) / 76 << 1);
    char[] arrayOfChar = new char[n];
    m = 0;
    int i1 = 0;
    int i2 = 0;
    label70: if (i2 >= k)
    {
      i1 = j - k;
      if (i1 > 0)
      {
        i2 = paramArrayOfByte[k];
        m = i;
        if (i1 == 2)
          m = (paramArrayOfByte[(j - 1)] & 0xFF) << 2;
        m |= (i2 & 0xFF) << 10;
        arrayOfChar[(n - 4)] = ((char)BZn[(m >> 12)]);
        arrayOfChar[(n - 3)] = ((char)BZn[(m >>> 6 & 0x3F)]);
        if (i1 != 2)
          break label444;
      }
    }
    label444: for (m = BZn[(m & 0x3F)]; ; m = 61)
    {
      arrayOfChar[(n - 2)] = ((char)m);
      arrayOfChar[(n - 1)] = ((char)61);
      paramArrayOfByte = arrayOfChar;
      break;
      int i3 = i2 + 1;
      int i4 = paramArrayOfByte[i2];
      i2 = i3 + 1;
      int i5 = paramArrayOfByte[i3];
      i3 = i2 + 1;
      i2 = (i5 & 0xFF) << 8 | (i4 & 0xFF) << 16 | paramArrayOfByte[i2] & 0xFF;
      i4 = i1 + 1;
      arrayOfChar[i1] = ((char)BZn[(i2 >>> 18 & 0x3F)]);
      i5 = i4 + 1;
      arrayOfChar[i4] = ((char)BZn[(i2 >>> 12 & 0x3F)]);
      i1 = i5 + 1;
      arrayOfChar[i5] = ((char)BZn[(i2 >>> 6 & 0x3F)]);
      i4 = i1 + 1;
      arrayOfChar[i1] = ((char)BZn[(i2 & 0x3F)]);
      i5 = m + 1;
      m = i5;
      i1 = i4;
      i2 = i3;
      if (i5 != 19)
        break label70;
      m = i5;
      i1 = i4;
      i2 = i3;
      if (i4 >= n - 2)
        break label70;
      m = i4 + 1;
      arrayOfChar[i4] = ((char)13);
      i1 = m + 1;
      arrayOfChar[m] = ((char)10);
      m = 0;
      i2 = i3;
      break label70;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.b.g.a
 * JD-Core Version:    0.6.2
 */