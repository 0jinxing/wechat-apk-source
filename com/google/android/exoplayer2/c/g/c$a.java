package com.google.android.exoplayer2.c.g;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
{
  public final int id;
  public final long size;

  private c$a(int paramInt, long paramLong)
  {
    this.id = paramInt;
    this.size = paramLong;
  }

  public static a a(f paramf, l paraml)
  {
    AppMethodBeat.i(95190);
    paramf.b(paraml.data, 0, 8);
    paraml.setPosition(0);
    paramf = new a(paraml.readInt(), paraml.tE());
    AppMethodBeat.o(95190);
    return paramf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.g.c.a
 * JD-Core Version:    0.6.2
 */