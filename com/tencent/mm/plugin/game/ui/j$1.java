package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$1
  implements Runnable
{
  j$1(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111905);
    this.nic.invalidateSelf();
    AppMethodBeat.o(111905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.j.1
 * JD-Core Version:    0.6.2
 */