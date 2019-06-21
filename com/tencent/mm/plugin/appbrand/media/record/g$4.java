package com.tencent.mm.plugin.appbrand.media.record;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class g$4
  implements e
{
  g$4(g paramg)
  {
  }

  public final void aIh()
  {
    AppMethodBeat.i(105605);
    if (!g.l(this.ilC))
    {
      this.ilC.aIr();
      AppMethodBeat.o(105605);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Record.AudioRecordMgr", "is interrupting");
      AppMethodBeat.o(105605);
    }
  }

  public final void aIi()
  {
    AppMethodBeat.i(105606);
    if (g.l(this.ilC))
    {
      g localg = this.ilC;
      localg.ilx = false;
      ab.i("MicroMsg.Record.AudioRecordMgr", "onInterruptionEnd");
      mb localmb = new mb();
      localmb.cHS.action = 7;
      localmb.cHS.state = "interruptionEnd";
      if (localg.ilo != null)
        localmb.cHS.appId = localg.ilo.appId;
      a.xxA.a(localmb, Looper.getMainLooper());
      AppMethodBeat.o(105606);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Record.AudioRecordMgr", "not call onInterruptionEnd");
      AppMethodBeat.o(105606);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.g.4
 * JD-Core Version:    0.6.2
 */