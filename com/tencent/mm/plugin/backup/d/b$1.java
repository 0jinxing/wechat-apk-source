package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.g.e;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements Runnable
{
  b$1(b paramb, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17235);
    c localc = b.aSZ().aTc();
    Object localObject = this.val$url;
    ab.w("MicroMsg.BackupMoveRecoverServer", "~~~~~~~~~~~~  start by url:%s", new Object[] { localObject });
    com.tencent.mm.plugin.backup.g.b.aTZ();
    aw.Rg().a(595, localc.jtG);
    localObject = new e((String)localObject);
    aw.Rg().a((m)localObject, 0);
    AppMethodBeat.o(17235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.b.1
 * JD-Core Version:    0.6.2
 */