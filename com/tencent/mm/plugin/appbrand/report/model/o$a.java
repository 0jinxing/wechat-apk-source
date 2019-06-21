package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum o$a
{
  final int value;

  static
  {
    AppMethodBeat.i(132662);
    iCr = new a("GUIDE_EXPOSE", 0, 1);
    iCs = new a("GUIDE_CLOSE", 1, 2);
    iCt = new a("TO_APP_LAUNCHER", 2, 3);
    iCu = new a("GUIDE_CLOSE_BY_BACK", 3, 4);
    iCv = new a[] { iCr, iCs, iCt, iCu };
    AppMethodBeat.o(132662);
  }

  private o$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.o.a
 * JD-Core Version:    0.6.2
 */