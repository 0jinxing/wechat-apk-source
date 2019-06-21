package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameDetailUI2$2
  implements View.OnClickListener
{
  GameDetailUI2$2(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111841);
    c.a(paramView, this.nhI);
    b.a(this.nhI.mController.ylL, 12, 1204, 999, 7, GameDetailUI2.f(this.nhI), GameDetailUI2.g(this.nhI), null);
    AppMethodBeat.o(111841);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.2
 * JD-Core Version:    0.6.2
 */