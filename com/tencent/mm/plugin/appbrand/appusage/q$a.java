package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum q$a
{
  final int value;

  static
  {
    AppMethodBeat.i(129604);
    gZL = new a("FORCE_OFF", 0, 0);
    gZM = new a("FORCE_ON", 1, 1);
    gZN = new a("DYNAMIC_THRESHOLD", 2, 2);
    gZO = new a[] { gZL, gZM, gZN };
    AppMethodBeat.o(129604);
  }

  private q$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.q.a
 * JD-Core Version:    0.6.2
 */