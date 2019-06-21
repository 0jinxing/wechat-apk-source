package com.tencent.mm.plugin.game.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameMessageUI$4
  implements AbsListView.OnScrollListener
{
  GameMessageUI$4(GameMessageUI paramGameMessageUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(112103);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (!GameMessageUI.b(this.nlu).bdn()))
    {
      GameMessageUI.b(this.nlu).bFr();
      GameMessageUI.b(this.nlu).a(null, null);
    }
    AppMethodBeat.o(112103);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageUI.4
 * JD-Core Version:    0.6.2
 */