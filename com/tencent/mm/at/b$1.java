package com.tencent.mm.at;

import android.net.TrafficStats;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$1
  implements ap.a
{
  b$1(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(78151);
    long l1 = TrafficStats.getUidRxBytes(this.fDj.fDe);
    long l2 = TrafficStats.getUidTxBytes(this.fDj.fDe);
    long l3 = l1 - this.fDj.fDc + (l2 - this.fDj.fDd);
    ab.d("MicroMsg.AutoGetBigImgLogic", "delta of data: " + l3 / 1024L);
    if (l3 <= 20480L)
    {
      this.fDj.fDb = false;
      this.fDj.start();
    }
    while (true)
    {
      AppMethodBeat.o(78151);
      return true;
      this.fDj.fDc = l1;
      this.fDj.fDd = l2;
      this.fDj.fDg.ae(1000L, 1000L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.b.1
 * JD-Core Version:    0.6.2
 */