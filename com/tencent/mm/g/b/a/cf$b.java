package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cf$b
{
  final int value;

  static
  {
    AppMethodBeat.i(128807);
    dfK = new b("sync", 0, 0);
    dfL = new b("async", 1, 1);
    dfM = new b[] { dfK, dfL };
    AppMethodBeat.o(128807);
  }

  private cf$b(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cf.b
 * JD-Core Version:    0.6.2
 */