package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameCategoryUI$4
  implements AbsListView.OnScrollListener
{
  GameCategoryUI$4(GameCategoryUI paramGameCategoryUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(111748);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
      if ((!GameCategoryUI.d(this.nfo)) || (GameCategoryUI.e(this.nfo)))
        AppMethodBeat.o(111748);
    while (true)
    {
      return;
      GameCategoryUI.f(this.nfo).setVisibility(0);
      GameCategoryUI.g(this.nfo);
      AppMethodBeat.o(111748);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCategoryUI.4
 * JD-Core Version:    0.6.2
 */