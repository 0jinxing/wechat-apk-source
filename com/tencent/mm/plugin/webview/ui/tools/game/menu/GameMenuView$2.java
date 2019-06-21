package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.m;

final class GameMenuView$2
  implements View.OnClickListener
{
  GameMenuView$2(GameMenuView paramGameMenuView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(8829);
    if (GameMenuView.b(this.uEX) != null)
    {
      paramView = (m)paramView.getTag();
      GameMenuView.b(this.uEX).f(paramView);
    }
    if (GameMenuView.c(this.uEX) != null)
      GameMenuView.c(this.uEX).onDismiss();
    AppMethodBeat.o(8829);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView.2
 * JD-Core Version:    0.6.2
 */