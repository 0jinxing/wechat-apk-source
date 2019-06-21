package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class b$1
  implements Runnable
{
  b$1(b paramb, long paramLong, b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18005);
    g.RN().QU();
    ab.i("MicroMsg.BakOldTempDbModel", "initTempDB, initTempDBCount:%d  timediff:%d ", new Object[] { Integer.valueOf(b.access$000()), Long.valueOf(bo.gb(this.ecn)) });
    b.Fc();
    aw.RS().a(new b.1.1(this));
    AppMethodBeat.o(18005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.b.1
 * JD-Core Version:    0.6.2
 */