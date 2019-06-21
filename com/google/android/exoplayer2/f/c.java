package com.google.android.exoplayer2.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c extends i
{
  private final b blc;

  public c(b paramb)
  {
    this.blc = paramb;
  }

  public final void release()
  {
    AppMethodBeat.i(95635);
    this.blc.a(this);
    AppMethodBeat.o(95635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.c
 * JD-Core Version:    0.6.2
 */