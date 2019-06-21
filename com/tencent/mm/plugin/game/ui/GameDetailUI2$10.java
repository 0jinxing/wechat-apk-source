package com.tencent.mm.plugin.game.ui;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameDetailUI2$10
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  GameDetailUI2$10(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(111849);
    if (GameDetailUI2.b(this.nhI).getLineCount() > 3)
    {
      GameDetailUI2.c(this.nhI).setVisibility(0);
      AppMethodBeat.o(111849);
    }
    while (true)
    {
      return;
      GameDetailUI2.c(this.nhI).setVisibility(8);
      AppMethodBeat.o(111849);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.10
 * JD-Core Version:    0.6.2
 */