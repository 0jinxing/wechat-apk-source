package com.tencent.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class l
{
  static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(125781);
    int[] arrayOfInt1 = new int[256];
    int[] arrayOfInt2 = new int[256];
    int i = paramArrayOfByte2.length;
    if ((i <= 0) || (i > 256))
    {
      paramArrayOfByte1 = new IllegalArgumentException("key must be between 1 and 256 bytes");
      AppMethodBeat.o(125781);
      throw paramArrayOfByte1;
    }
    int j = 0;
    label68: int k;
    if (j >= 256)
    {
      i = 0;
      j = 0;
      if (j < 256)
        break label127;
      paramArrayOfByte2 = new byte[paramArrayOfByte1.length];
      j = 0;
      k = 0;
      i = 0;
    }
    while (true)
    {
      if (j >= paramArrayOfByte1.length)
      {
        AppMethodBeat.o(125781);
        return paramArrayOfByte2;
        arrayOfInt1[j] = j;
        arrayOfInt2[j] = paramArrayOfByte2[(j % i)];
        j++;
        break;
        label127: i = i + arrayOfInt1[j] + arrayOfInt2[j] & 0xFF;
        k = arrayOfInt1[j];
        arrayOfInt1[j] = arrayOfInt1[i];
        arrayOfInt1[i] = k;
        j++;
        break label68;
      }
      k = k + 1 & 0xFF;
      i = arrayOfInt1[k] + i & 0xFF;
      int m = arrayOfInt1[k];
      arrayOfInt1[k] = arrayOfInt1[i];
      arrayOfInt1[i] = m;
      paramArrayOfByte2[j] = ((byte)(byte)(arrayOfInt1[(arrayOfInt1[k] + arrayOfInt1[i] & 0xFF)] ^ paramArrayOfByte1[j]));
      j++;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.l
 * JD-Core Version:    0.6.2
 */