package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.h.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$a
{
  public final long aXw;
  public final long aZQ;
  public boolean bhR;
  public a bhS;
  public a bhT;

  public k$a(long paramLong, int paramInt)
  {
    AppMethodBeat.i(95528);
    this.aZQ = paramLong;
    this.aXw = (paramInt + paramLong);
    AppMethodBeat.o(95528);
  }

  public final void a(a parama, a parama1)
  {
    this.bhS = parama;
    this.bhT = parama1;
    this.bhR = true;
  }

  public final int af(long paramLong)
  {
    return (int)(paramLong - this.aZQ) + this.bhS.offset;
  }

  public final a sr()
  {
    this.bhS = null;
    a locala = this.bhT;
    this.bhT = null;
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.k.a
 * JD-Core Version:    0.6.2
 */