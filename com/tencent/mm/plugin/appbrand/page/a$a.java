package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$a
{
  final int iqK;
  final int iqL;

  static
  {
    AppMethodBeat.i(87026);
    iqF = new a("NORMAL", 0, -1, -1);
    iqG = new a("LBS", 1, 2131301228, 2130837709);
    iqH = new a("VOICE", 2, 2131301229, 2130837711);
    iqI = new a("VIDEO", 3, -1, 2130837710);
    iqJ = new a("LOADING", 4, -1, -1);
    iqM = new a[] { iqF, iqG, iqH, iqI, iqJ };
    AppMethodBeat.o(87026);
  }

  private a$a(int paramInt1, int paramInt2)
  {
    this.iqK = paramInt1;
    this.iqL = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.a
 * JD-Core Version:    0.6.2
 */