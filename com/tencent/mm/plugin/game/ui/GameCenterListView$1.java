package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameCenterListView$1
  implements AbsListView.OnScrollListener
{
  GameCenterListView$1(GameCenterListView paramGameCenterListView)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(111776);
    if ((paramInt1 == 0) && (GameCenterListView.a(this.nfL) != null) && (GameCenterListView.a(this.nfL).getTop() == 0))
    {
      GameCenterListView.a(this.nfL, true);
      AppMethodBeat.o(111776);
    }
    while (true)
    {
      return;
      GameCenterListView.a(this.nfL, false);
      AppMethodBeat.o(111776);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterListView.1
 * JD-Core Version:    0.6.2
 */