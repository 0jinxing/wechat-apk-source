package com.google.android.exoplayer2.source.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.h.s.c;

public abstract class a
  implements s.c
{
  protected final f aSF;
  public final i bib;
  public final Format bic;
  public final int bid;
  public final Object bie;
  public final long bif;
  public final long big;
  public final int type;

  public a(f paramf, i parami, int paramInt1, Format paramFormat, int paramInt2, Object paramObject, long paramLong1, long paramLong2)
  {
    this.aSF = ((f)com.google.android.exoplayer2.i.a.checkNotNull(paramf));
    this.bib = ((i)com.google.android.exoplayer2.i.a.checkNotNull(parami));
    this.type = paramInt1;
    this.bic = paramFormat;
    this.bid = paramInt2;
    this.bie = paramObject;
    this.bif = paramLong1;
    this.big = paramLong2;
  }

  public abstract long ss();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.a.a
 * JD-Core Version:    0.6.2
 */