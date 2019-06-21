package com.tencent.mm.plugin.hp.tinker;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements Runnable
{
  a$1(a parama, a.a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90624);
    if (this.ntZ != null)
    {
      com.tencent.tinker.lib.util.a.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch runnable try to start", new Object[0]);
      this.ntZ.bGo();
    }
    AppMethodBeat.o(90624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.a.1
 * JD-Core Version:    0.6.2
 */