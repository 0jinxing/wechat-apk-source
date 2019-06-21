package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.l;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends a
{
  public final void b(c paramc)
  {
    AppMethodBeat.i(21909);
    if (paramc != null)
    {
      l locall = new l(paramc.nwu, paramc.nww, paramc.nwZ);
      aw.Rg().a(locall, 0);
      ab.i("MicroMsg.IPCallReportService", "start report, roomid: %d, callseq: %d, isAccept: %b", new Object[] { Integer.valueOf(paramc.nwu), Long.valueOf(paramc.nww), Boolean.valueOf(paramc.nwZ) });
    }
    AppMethodBeat.o(21909);
  }

  public final int[] bHC()
  {
    return new int[] { 227 };
  }

  public final int getServiceType()
  {
    return 7;
  }

  public final void onDestroy()
  {
  }

  public final void wO()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f.g
 * JD-Core Version:    0.6.2
 */