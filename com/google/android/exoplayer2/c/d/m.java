package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m
{
  public final int[] aSB;
  public final int aXU;
  public final int[] aXW;
  public final long[] aZO;
  public final long[] offsets;
  public final int sampleCount;

  public m(long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(95016);
    if (paramArrayOfInt1.length == paramArrayOfLong2.length)
    {
      bool2 = true;
      a.checkArgument(bool2);
      if (paramArrayOfLong1.length != paramArrayOfLong2.length)
        break label107;
      bool2 = true;
      label39: a.checkArgument(bool2);
      if (paramArrayOfInt2.length != paramArrayOfLong2.length)
        break label113;
    }
    label107: label113: for (boolean bool2 = bool1; ; bool2 = false)
    {
      a.checkArgument(bool2);
      this.offsets = paramArrayOfLong1;
      this.aSB = paramArrayOfInt1;
      this.aXU = paramInt;
      this.aZO = paramArrayOfLong2;
      this.aXW = paramArrayOfInt2;
      this.sampleCount = paramArrayOfLong1.length;
      AppMethodBeat.o(95016);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label39;
    }
  }

  public final int Q(long paramLong)
  {
    AppMethodBeat.i(95017);
    int i = v.a(this.aZO, paramLong, false);
    if (i >= 0)
      if ((this.aXW[i] & 0x1) != 0)
        AppMethodBeat.o(95017);
    while (true)
    {
      return i;
      i--;
      break;
      i = -1;
      AppMethodBeat.o(95017);
    }
  }

  public final int R(long paramLong)
  {
    AppMethodBeat.i(95018);
    int i = v.a(this.aZO, paramLong, true, false);
    if (i < this.aZO.length)
      if ((this.aXW[i] & 0x1) != 0)
        AppMethodBeat.o(95018);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
      AppMethodBeat.o(95018);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.m
 * JD-Core Version:    0.6.2
 */