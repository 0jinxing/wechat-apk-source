package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum l$a
{
  public final int value;

  static
  {
    AppMethodBeat.i(132639);
    iBQ = new a("NEARBY_H5", 0, 1);
    iBR = new a("EMPTY_PAGE", 1, 2);
    iBS = new a("LBS_NOT_ALLOW", 2, 3);
    iBT = new a("NEARBY_MINI_PROGRAM", 3, 4);
    iBU = new a[] { iBQ, iBR, iBS, iBT };
    AppMethodBeat.o(132639);
  }

  private l$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.l.a
 * JD-Core Version:    0.6.2
 */