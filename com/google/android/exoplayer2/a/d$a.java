package com.google.android.exoplayer2.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d$a extends Exception
{
  public d$a(int paramInt1, int paramInt2, int paramInt3)
  {
    super("Unhandled format: " + paramInt1 + " Hz, " + paramInt2 + " channels in encoding " + paramInt3);
    AppMethodBeat.i(94651);
    AppMethodBeat.o(94651);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.d.a
 * JD-Core Version:    0.6.2
 */