package com.tencent.mm.plugin.emoji.sync;

import android.net.TrafficStats;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class BKGLoaderManager$1
  implements ap.a
{
  BKGLoaderManager$1(BKGLoaderManager paramBKGLoaderManager)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(53180);
    long l1;
    long l2;
    if ((this.kXI.kXp) || (this.kXI.kXq) || (this.kXI.kXr))
    {
      l1 = TrafficStats.getUidTxBytes(this.kXI.fDe);
      l2 = TrafficStats.getUidRxBytes(this.kXI.fDe);
      long l3 = l1 - this.kXI.kXD + (l2 - this.kXI.kXE);
      ab.d("MicroMsg.BKGLoader.BKGLoaderManager", "delta of data: " + l3 / 1024L);
      if (l3 > 20480L)
        break label127;
      this.kXI.bkG();
    }
    while (true)
    {
      AppMethodBeat.o(53180);
      return false;
      label127: this.kXI.kXD = l1;
      this.kXI.kXE = l2;
      this.kXI.kXF.ae(1000L, 1000L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.BKGLoaderManager.1
 * JD-Core Version:    0.6.2
 */