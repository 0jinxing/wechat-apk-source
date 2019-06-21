package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;

final class GameLibraryUI$5
  implements View.OnClickListener
{
  GameLibraryUI$5(GameLibraryUI paramGameLibraryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112035);
    c.a(paramView, this.nkf);
    b.a(this.nkf, 11, 1110, 999, 7, GameLibraryUI.e(this.nkf), null);
    AppMethodBeat.o(112035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryUI.5
 * JD-Core Version:    0.6.2
 */