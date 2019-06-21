package com.google.android.exoplayer2.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements l
{
  private final long aOz;
  public final int[] aSB;
  public final long[] aSC;
  public final long[] aSD;
  public final int length;
  public final long[] offsets;

  public a(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    AppMethodBeat.i(94840);
    this.aSB = paramArrayOfInt;
    this.offsets = paramArrayOfLong1;
    this.aSC = paramArrayOfLong2;
    this.aSD = paramArrayOfLong3;
    this.length = paramArrayOfInt.length;
    if (this.length > 0)
    {
      this.aOz = (paramArrayOfLong2[(this.length - 1)] + paramArrayOfLong3[(this.length - 1)]);
      AppMethodBeat.o(94840);
    }
    while (true)
    {
      return;
      this.aOz = 0L;
      AppMethodBeat.o(94840);
    }
  }

  public final long M(long paramLong)
  {
    AppMethodBeat.i(94841);
    paramLong = this.offsets[com.google.android.exoplayer2.i.v.a(this.aSD, paramLong, true)];
    AppMethodBeat.o(94841);
    return paramLong;
  }

  public final long getDurationUs()
  {
    return this.aOz;
  }

  public final boolean qX()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.a
 * JD-Core Version:    0.6.2
 */