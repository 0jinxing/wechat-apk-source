package com.tencent.mm.plugin.appbrand.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$b
  implements Runnable
{
  private c hrH;
  private d.c hrL;

  public final void run()
  {
    AppMethodBeat.i(130179);
    if (this.hrH == null)
      AppMethodBeat.o(130179);
    while (true)
    {
      return;
      if (this.hrL != null)
        this.hrL.release(this);
      AppMethodBeat.o(130179);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.d.b
 * JD-Core Version:    0.6.2
 */