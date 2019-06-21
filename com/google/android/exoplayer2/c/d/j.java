package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.Format;

public final class j
{
  public final Format aOv;
  public final long aOz;
  public final int aTz;
  public final long aZm;
  public final long aZn;
  public final int aZo;
  public final long[] aZp;
  public final long[] aZq;
  private final k[] aZr;
  public final int id;
  public final int type;

  public j(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, Format paramFormat, int paramInt3, k[] paramArrayOfk, int paramInt4, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    this.id = paramInt1;
    this.type = paramInt2;
    this.aZm = paramLong1;
    this.aZn = paramLong2;
    this.aOz = paramLong3;
    this.aOv = paramFormat;
    this.aZo = paramInt3;
    this.aZr = paramArrayOfk;
    this.aTz = paramInt4;
    this.aZp = paramArrayOfLong1;
    this.aZq = paramArrayOfLong2;
  }

  public final k dZ(int paramInt)
  {
    if (this.aZr == null);
    for (k localk = null; ; localk = this.aZr[paramInt])
      return localk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.j
 * JD-Core Version:    0.6.2
 */