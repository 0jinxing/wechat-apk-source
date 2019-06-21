package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.f.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1
  implements f.a
{
  public final void gj(int paramInt)
  {
    AppMethodBeat.i(15850);
    ab.i("MicroMsg.PostTaskLightweightJob", "CrashStatus report: key %s ", new Object[] { Integer.valueOf(paramInt) });
    h.pYm.a(25L, paramInt, 1L, false);
    AppMethodBeat.o(15850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.h.1
 * JD-Core Version:    0.6.2
 */