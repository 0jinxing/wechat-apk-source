package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Timer;
import java.util.TimerTask;

final class k$5 extends TimerTask
{
  k$5(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4395);
    k localk = this.sPI;
    localk.sPF += 1;
    if ((this.sPI.sPp.sVv != 0) || (this.sPI.sPF > 10))
    {
      this.sPI.cIR();
      this.sPI.sPE.cancel();
      this.sPI.sPE = null;
      AppMethodBeat.o(4395);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4395);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.k.5
 * JD-Core Version:    0.6.2
 */