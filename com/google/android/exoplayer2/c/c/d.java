package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d
  implements b.a
{
  private final long aOz;
  private final long aVD;
  private final long[] aVE;
  private final long aVF;
  private final int aVG;
  private final long firstFramePosition;

  d(long paramLong1, long paramLong2, long paramLong3)
  {
    this(paramLong1, paramLong2, paramLong3, null, 0L, 0);
  }

  d(long paramLong1, long paramLong2, long paramLong3, long[] paramArrayOfLong, long paramLong4, int paramInt)
  {
    this.firstFramePosition = paramLong1;
    this.aOz = paramLong2;
    this.aVD = paramLong3;
    this.aVE = paramArrayOfLong;
    this.aVF = paramLong4;
    this.aVG = paramInt;
  }

  private long dS(int paramInt)
  {
    return this.aOz * paramInt / 100L;
  }

  public final long M(long paramLong)
  {
    float f1 = 256.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(94933);
    if (!qX())
    {
      paramLong = this.firstFramePosition;
      AppMethodBeat.o(94933);
      return paramLong;
    }
    float f3 = (float)paramLong * 100.0F / (float)this.aOz;
    float f4;
    label53: long l1;
    long l2;
    if (f3 <= 0.0F)
    {
      f4 = 0.0F;
      l1 = Math.round(f4 * 0.00390625D * this.aVF);
      l2 = this.firstFramePosition;
      if (this.aVD == -1L)
        break label188;
    }
    label188: for (paramLong = this.aVD - 1L; ; paramLong = this.firstFramePosition - this.aVG + this.aVF - 1L)
    {
      paramLong = Math.min(l2 + l1, paramLong);
      AppMethodBeat.o(94933);
      break;
      f4 = f1;
      if (f3 >= 100.0F)
        break label53;
      int i = (int)f3;
      if (i == 0);
      for (f4 = f2; ; f4 = (float)this.aVE[(i - 1)])
      {
        if (i < 99)
          f1 = (float)this.aVE[i];
        f4 = (f1 - f4) * (f3 - i) + f4;
        break;
      }
    }
  }

  public final long O(long paramLong)
  {
    AppMethodBeat.i(94934);
    if ((!qX()) || (paramLong < this.firstFramePosition))
    {
      paramLong = 0L;
      AppMethodBeat.o(94934);
      return paramLong;
    }
    double d1 = 256.0D * (paramLong - this.firstFramePosition) / this.aVF;
    int i = v.a(this.aVE, ()d1, false) + 1;
    long l1 = dS(i);
    label77: long l2;
    label89: long l3;
    if (i == 0)
    {
      paramLong = 0L;
      if (i != 99)
        break label134;
      l2 = 256L;
      l3 = dS(i + 1);
      if (l2 != paramLong)
        break label146;
    }
    label134: label146: double d2;
    for (paramLong = 0L; ; paramLong = ()((d1 - paramLong) * d2 / (l2 - paramLong)))
    {
      paramLong += l1;
      AppMethodBeat.o(94934);
      break;
      paramLong = this.aVE[(i - 1)];
      break label77;
      l2 = this.aVE[i];
      break label89;
      d2 = l3 - l1;
    }
  }

  public final long getDurationUs()
  {
    return this.aOz;
  }

  public final boolean qX()
  {
    if (this.aVE != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.c.d
 * JD-Core Version:    0.6.2
 */