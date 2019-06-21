package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class g$6
  implements ap.a
{
  g$6(g paramg)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(105608);
    ab.i("MicroMsg.Record.AudioRecordMgr", "timer, onTimerExpired to stop record");
    this.ilC.EB();
    AppMethodBeat.o(105608);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.g.6
 * JD-Core Version:    0.6.2
 */