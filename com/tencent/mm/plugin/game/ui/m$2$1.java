package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class m$2$1
  implements Runnable
{
  m$2$1(m.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112058);
    m.c(this.nkt.nkr, this.nkt.nkq);
    ab.i("MicroMsg.GameListAdapter", "set size: %d", new Object[] { Integer.valueOf(this.nkt.nkq.size()) });
    AppMethodBeat.o(112058);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.m.2.1
 * JD-Core Version:    0.6.2
 */