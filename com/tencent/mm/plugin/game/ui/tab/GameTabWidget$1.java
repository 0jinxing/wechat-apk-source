package com.tencent.mm.plugin.game.ui.tab;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameTabWidget$1 extends DataSetObserver
{
  GameTabWidget$1(GameTabWidget paramGameTabWidget)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(112272);
    GameTabWidget.a(this.nnr);
    AppMethodBeat.o(112272);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(112271);
    GameTabWidget.a(this.nnr);
    AppMethodBeat.o(112271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameTabWidget.1
 * JD-Core Version:    0.6.2
 */