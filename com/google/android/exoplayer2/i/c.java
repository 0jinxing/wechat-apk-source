package com.google.android.exoplayer2.i;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  private static final byte[] bqY = { 0, 0, 0, 1 };
  private static final int[] bqZ = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  private static final int[] bra = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };

  private static int c(k paramk)
  {
    AppMethodBeat.i(95866);
    int i = paramk.ed(5);
    int j = i;
    if (i == 31)
      j = paramk.ed(6) + 32;
    AppMethodBeat.o(95866);
    return j;
  }

  private static int d(k paramk)
  {
    AppMethodBeat.i(95867);
    int i = paramk.ed(4);
    if (i == 15)
    {
      i = paramk.ed(24);
      AppMethodBeat.o(95867);
      return i;
    }
    if (i < 13);
    for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      i = bqZ[i];
      break;
    }
  }

  public static byte[] j(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95865);
    byte[] arrayOfByte = new byte[bqY.length + paramInt2];
    System.arraycopy(bqY, 0, arrayOfByte, 0, bqY.length);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, bqY.length, paramInt2);
    AppMethodBeat.o(95865);
    return arrayOfByte;
  }

  public static Pair<Integer, Integer> q(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95864);
    paramArrayOfByte = new k(paramArrayOfByte);
    int i = c(paramArrayOfByte);
    int j = d(paramArrayOfByte);
    int k = paramArrayOfByte.ed(4);
    if (i != 5)
    {
      m = k;
      if (i != 29);
    }
    else
    {
      i = d(paramArrayOfByte);
      m = k;
      j = i;
      if (c(paramArrayOfByte) == 22)
      {
        m = paramArrayOfByte.ed(4);
        j = i;
      }
    }
    int m = bra[m];
    if (m != -1);
    for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      paramArrayOfByte = Pair.create(Integer.valueOf(j), Integer.valueOf(m));
      AppMethodBeat.o(95864);
      return paramArrayOfByte;
    }
  }

  public static byte[] t(int paramInt1, int paramInt2, int paramInt3)
  {
    return new byte[] { (byte)(paramInt1 << 3 & 0xF8 | paramInt2 >> 1 & 0x7), (byte)(paramInt2 << 7 & 0x80 | paramInt3 << 3 & 0x78) };
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.c
 * JD-Core Version:    0.6.2
 */