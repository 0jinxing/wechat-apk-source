package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class ar$7
  implements Runnable
{
  ar$7(ar paramar)
  {
  }

  public final void run()
  {
    boolean bool = true;
    AppMethodBeat.i(36651);
    if (this.qNb.qMX.isEmpty())
    {
      ab.i("MicroMsg.SnsVideoService", "download queue is null, do nothing");
      AppMethodBeat.o(36651);
    }
    ay localay;
    while (true)
    {
      return;
      localay = (ay)this.qNb.qMX.poll();
      if (localay != null)
        break;
      ab.w("MicroMsg.SnsVideoService", "try start download video task is null. queue size %d", new Object[] { Integer.valueOf(this.qNb.qMX.size()) });
      AppMethodBeat.o(36651);
    }
    if ((this.qNb.qMW != null) && (localay.fUL.equals(this.qNb.qMW.fUL)));
    while (true)
    {
      this.qNb.a(localay, bool);
      AppMethodBeat.o(36651);
      break;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ar.7
 * JD-Core Version:    0.6.2
 */