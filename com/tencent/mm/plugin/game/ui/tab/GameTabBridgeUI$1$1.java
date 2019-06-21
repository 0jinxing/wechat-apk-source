package com.tencent.mm.plugin.game.ui.tab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class GameTabBridgeUI$1$1
  implements Runnable
{
  GameTabBridgeUI$1$1(GameTabBridgeUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112237);
    ab.i("MicroMsg.GameTabBridgeUI", "load tools process, web page load time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.nnl.fEG) });
    if (GameTabWidget.nnp == this.nnl.nnk.hashCode())
    {
      GameTabWidget.a(this.nnl.nnk, this.nnl.val$intent, false, true, true, false);
      AppMethodBeat.o(112237);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.GameTabBridgeUI", "GameTabWidget.mHashCode(%d) != hashCode(%d), dont need turn page!", new Object[] { Integer.valueOf(GameTabWidget.nnp), Integer.valueOf(this.nnl.nnk.hashCode()) });
      AppMethodBeat.o(112237);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI.1.1
 * JD-Core Version:    0.6.2
 */