package com.google.android.exoplayer2.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$b
{
  public final int bms;
  public final int bmt;
  public final byte[] bmu;
  int currentIndex;

  public c$b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95594);
    this.bms = paramInt1;
    this.bmt = paramInt2;
    this.bmu = new byte[paramInt2 * 2 - 1];
    this.currentIndex = 0;
    AppMethodBeat.o(95594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.a.c.b
 * JD-Core Version:    0.6.2
 */