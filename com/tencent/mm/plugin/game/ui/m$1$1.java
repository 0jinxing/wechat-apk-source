package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class m$1$1
  implements Runnable
{
  m$1$1(m.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112056);
    m.b(this.nks.nkr, this.nks.nkq);
    ab.i("MicroMsg.GameListAdapter", "add size: %d", new Object[] { Integer.valueOf(this.nks.nkq.size()) });
    AppMethodBeat.o(112056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.m.1.1
 * JD-Core Version:    0.6.2
 */