package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$1
  implements Runnable
{
  i$1(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111811);
    this.ngl.notifyDataSetChanged();
    AppMethodBeat.o(111811);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.i.1
 * JD-Core Version:    0.6.2
 */