package com.tencent.mm.plugin.sport.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  public static final void kT(int paramInt)
  {
    AppMethodBeat.i(55718);
    ab.v("MicroMsg.Sport.SportReportLogic", "report action=%d", new Object[] { Integer.valueOf(paramInt) });
    e.pXa.e(13168, new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(55718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.a.d
 * JD-Core Version:    0.6.2
 */