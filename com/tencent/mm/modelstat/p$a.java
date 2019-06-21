package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum p$a
{
  public int value = 0;

  static
  {
    AppMethodBeat.i(35588);
    fUg = new a("Chat", 0, 1);
    fUh = new a("TalkChat", 1, 2);
    fUi = new a("Sns", 2, 3);
    fUj = new a[] { fUg, fUh, fUi };
    AppMethodBeat.o(35588);
  }

  private p$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.p.a
 * JD-Core Version:    0.6.2
 */