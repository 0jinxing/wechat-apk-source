package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class g$1
  implements ap.a
{
  g$1(g paramg, Long paramLong1, int paramInt, Long paramLong2)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(17666);
    Long localLong1 = Long.valueOf(bo.anU());
    Long localLong2 = Long.valueOf(this.jxN.B(this.jxK.longValue(), localLong1.longValue()));
    ab.i("MicroMsg.BackupLogManager", "backupAfterLogTimeHandler, backupMode[%d], endAfterLogTime[%d], startAfterLogTime[%d], endAfterLogSize[%d], startAfterLogSize[%d]", new Object[] { Integer.valueOf(this.jxL), localLong1, this.jxK, localLong2, this.jxM });
    if ((localLong2.longValue() != 0L) && (localLong2.longValue() > this.jxM.longValue()))
      this.jxN.a(this.jxL, localLong1.longValue() - this.jxK.longValue(), localLong2.longValue() - this.jxM.longValue(), true);
    AppMethodBeat.o(17666);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.g.1
 * JD-Core Version:    0.6.2
 */