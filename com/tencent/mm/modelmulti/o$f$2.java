package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class o$f$2
  implements Runnable
{
  o$f$2(o.f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(58410);
    ab.i("MicroMsg.SyncService", "%s onFinishCmd ContinueFlag[%s]", new Object[] { this.fJC, Integer.valueOf(this.fJC.fJp.vQe) });
    g.RQ();
    g.RP().Ry().set(8196, Long.valueOf(this.fJC.fJp.vQe));
    if ((this.fJC.fJp.vQe & 0x100) != 0)
    {
      rv localrv = new rv();
      localrv.cNO.cvp = 2;
      a.xxA.m(localrv);
      com.tencent.mm.plugin.report.e.pXa.a(99L, 22L, 1L, false);
      ab.i("MicroMsg.SyncService", "%s onFinishCmd publish SnsSyncEvent", new Object[] { this.fJC });
    }
    AppMethodBeat.o(58410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.f.2
 * JD-Core Version:    0.6.2
 */