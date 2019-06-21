package com.google.android.exoplayer2.source.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.h.i;

public abstract class d extends a
{
  public final int bih;

  public d(f paramf, i parami, Format paramFormat, int paramInt1, Object paramObject, long paramLong1, long paramLong2, int paramInt2)
  {
    super(paramf, parami, 1, paramFormat, paramInt1, paramObject, paramLong1, paramLong2);
    com.google.android.exoplayer2.i.a.checkNotNull(paramFormat);
    this.bih = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.a.d
 * JD-Core Version:    0.6.2
 */