package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.util.TimerTask;

public final class c$b extends TimerTask
{
  private int progress = 50;

  public c$b(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132946);
    if (this.progress >= 100)
    {
      cancel();
      AppMethodBeat.o(132946);
    }
    while (true)
    {
      return;
      this.progress += 1;
      al.d(new c.b.1(this));
      AppMethodBeat.o(132946);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.b
 * JD-Core Version:    0.6.2
 */