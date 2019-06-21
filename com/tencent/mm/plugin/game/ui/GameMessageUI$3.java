package com.tencent.mm.plugin.game.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.p.a;

final class GameMessageUI$3
  implements p.a
{
  GameMessageUI$3(GameMessageUI paramGameMessageUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(112102);
    if (GameMessageUI.b(this.nlu).getCount() == 0)
    {
      GameMessageUI.e(this.nlu).setVisibility(8);
      GameMessageUI.a(this.nlu, 0);
      this.nlu.enableOptionMenu(false);
      AppMethodBeat.o(112102);
    }
    while (true)
    {
      return;
      GameMessageUI.e(this.nlu).setVisibility(0);
      GameMessageUI.a(this.nlu, 8);
      this.nlu.enableOptionMenu(true);
      AppMethodBeat.o(112102);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageUI.3
 * JD-Core Version:    0.6.2
 */