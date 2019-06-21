package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cs$c
{
  final int value;

  static
  {
    AppMethodBeat.i(51104);
    dhU = new c("DEFAULT", 0, 0);
    dhV = new c("YES", 1, 1);
    dhW = new c("NO", 2, 2);
    dhX = new c[] { dhU, dhV, dhW };
    AppMethodBeat.o(51104);
  }

  private cs$c(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cs.c
 * JD-Core Version:    0.6.2
 */