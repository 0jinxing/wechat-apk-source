package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum r$a
{
  public final int value;

  static
  {
    AppMethodBeat.i(129619);
    gZQ = new a("NONE", 0, 0);
    gZR = new a("REDDOT", 1, 1);
    gZS = new a("NEW", 2, 2);
    gZT = new a[] { gZQ, gZR, gZS };
    AppMethodBeat.o(129619);
  }

  private r$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.r.a
 * JD-Core Version:    0.6.2
 */