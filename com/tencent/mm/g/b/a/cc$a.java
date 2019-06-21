package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cc$a
{
  final int value;

  static
  {
    AppMethodBeat.i(128781);
    deY = new a("release", 0, 1);
    deZ = new a("debug", 1, 2);
    dfa = new a("demo", 2, 3);
    dfb = new a[] { deY, deZ, dfa };
    AppMethodBeat.o(128781);
  }

  private cc$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cc.a
 * JD-Core Version:    0.6.2
 */