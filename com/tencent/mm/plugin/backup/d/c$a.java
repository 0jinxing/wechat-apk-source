package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
{
  byte[] buf;
  int fQi;
  boolean iae;
  int type;

  c$a(c paramc, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17259);
    this.iae = false;
    this.fQi = paramInt1;
    this.type = paramInt2;
    this.buf = ((byte[])paramArrayOfByte.clone());
    AppMethodBeat.o(17259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c.a
 * JD-Core Version:    0.6.2
 */