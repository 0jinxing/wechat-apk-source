package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameMessageUI$5
  implements View.OnClickListener
{
  GameMessageUI$5(GameMessageUI paramGameMessageUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112104);
    if (!bo.isNullOrNil(GameMessageUI.f(this.nlu)))
    {
      int i = c.ax(this.nlu.mController.ylL, GameMessageUI.f(this.nlu));
      b.a(this.nlu.mController.ylL, 13, 1302, 1, i, GameMessageUI.g(this.nlu), null);
    }
    GameMessageUI.h(this.nlu);
    AppMethodBeat.o(112104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageUI.5
 * JD-Core Version:    0.6.2
 */