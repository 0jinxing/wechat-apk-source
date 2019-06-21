package com.tencent.mm.plugin.appbrand.luggage.c;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;

public final class a
  implements com.tencent.mm.plugin.appbrand.n.a
{
  public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(132154);
    h.pYm.b(paramArrayList, paramBoolean);
    AppMethodBeat.o(132154);
  }

  public final void f(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(132153);
    h.pYm.a(paramLong1, paramLong2, paramLong3, false);
    AppMethodBeat.o(132153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.c.a
 * JD-Core Version:    0.6.2
 */