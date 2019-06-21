package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Timer;
import java.util.TimerTask;

public final class b extends c
{
  public final String TAG = "MicroMsg.FileTrafficStatsInspector";
  private Timer oGr = null;
  private TimerTask sJN = null;
  private boolean started;

  public final void cHB()
  {
    AppMethodBeat.i(114757);
    if (this.started)
      AppMethodBeat.o(114757);
    while (true)
    {
      return;
      this.currentIndex = 0;
      a.init(this.id);
      a.reset(this.id);
      a.update(this.id);
      this.sJN = new b.1(this);
      this.oGr = new Timer();
      this.oGr.schedule(this.sJN, 0L, this.interval);
      this.started = true;
      AppMethodBeat.o(114757);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.b
 * JD-Core Version:    0.6.2
 */