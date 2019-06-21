package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameLibraryUI$3
  implements m.a
{
  GameLibraryUI$3(GameLibraryUI paramGameLibraryUI)
  {
  }

  public final void wF(int paramInt)
  {
    AppMethodBeat.i(112032);
    int i = GameLibraryUI.b(this.nkf).getFirstVisiblePosition() - GameLibraryUI.c(this.nkf);
    int j = GameLibraryUI.b(this.nkf).getLastVisiblePosition();
    int k = GameLibraryUI.c(this.nkf);
    if ((paramInt >= i) && (paramInt <= j - k))
    {
      View localView = GameLibraryUI.b(this.nkf).getChildAt(paramInt - i);
      GameLibraryUI.d(this.nkf).U(localView, paramInt);
    }
    AppMethodBeat.o(112032);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryUI.3
 * JD-Core Version:    0.6.2
 */