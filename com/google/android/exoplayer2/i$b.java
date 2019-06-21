package com.google.android.exoplayer2;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i$b
{
  public final com.google.android.exoplayer2.source.i.b aNQ;
  public final long aNR;
  public final long aNS;
  public volatile long aNT;
  public volatile long aNU;

  public i$b(long paramLong)
  {
    this(new com.google.android.exoplayer2.source.i.b(0), paramLong);
    AppMethodBeat.i(94803);
    AppMethodBeat.o(94803);
  }

  public i$b(com.google.android.exoplayer2.source.i.b paramb, long paramLong)
  {
    this(paramb, paramLong, -9223372036854775807L);
  }

  public i$b(com.google.android.exoplayer2.source.i.b paramb, long paramLong1, long paramLong2)
  {
    this.aNQ = paramb;
    this.aNR = paramLong1;
    this.aNS = paramLong2;
    this.aNT = paramLong1;
    this.aNU = paramLong1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.b
 * JD-Core Version:    0.6.2
 */