package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$a
{
  public int value = 0;

  static
  {
    AppMethodBeat.i(16611);
    fQW = new a("Expose", 0, 1);
    fQX = new a("Click", 1, 2);
    fQY = new a[] { fQW, fQX };
    AppMethodBeat.o(16611);
  }

  private a$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.a.a
 * JD-Core Version:    0.6.2
 */