package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b$a
{
  public int value = 0;

  static
  {
    AppMethodBeat.i(78629);
    fRf = new a("OP_Chatting", 0, 1);
    fRg = new a("OP_Msg", 1, 2);
    fRh = new a[] { fRf, fRg };
    AppMethodBeat.o(78629);
  }

  private b$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.b.a
 * JD-Core Version:    0.6.2
 */