package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum e$a
{
  final int value;

  static
  {
    AppMethodBeat.i(15825);
    cUX = new a("ok", 0, 0);
    cUY = new a("cancel", 1, 1);
    cUZ = new a("error", 2, 2);
    cVa = new a[] { cUX, cUY, cUZ };
    AppMethodBeat.o(15825);
  }

  private e$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.e.a
 * JD-Core Version:    0.6.2
 */