package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameCategoryUI$3
  implements m.a
{
  GameCategoryUI$3(GameCategoryUI paramGameCategoryUI)
  {
  }

  public final void wF(int paramInt)
  {
    AppMethodBeat.i(111747);
    int i = GameCategoryUI.b(this.nfo).getFirstVisiblePosition();
    int j = GameCategoryUI.b(this.nfo).getLastVisiblePosition();
    if ((paramInt >= i) && (paramInt <= j))
    {
      View localView = GameCategoryUI.b(this.nfo).getChildAt(paramInt - i);
      GameCategoryUI.c(this.nfo).U(localView, paramInt);
    }
    AppMethodBeat.o(111747);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCategoryUI.3
 * JD-Core Version:    0.6.2
 */