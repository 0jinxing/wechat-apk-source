package com.google.android.exoplayer2.h;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r$d extends r.c
{
  public final String bqF;

  public r$d(String paramString, i parami)
  {
    super("Invalid content type: ".concat(String.valueOf(paramString)), parami);
    AppMethodBeat.i(95840);
    this.bqF = paramString;
    AppMethodBeat.o(95840);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.r.d
 * JD-Core Version:    0.6.2
 */