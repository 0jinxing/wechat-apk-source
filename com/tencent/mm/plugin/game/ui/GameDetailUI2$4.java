package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameDetailUI2$4
  implements View.OnClickListener
{
  GameDetailUI2$4(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111843);
    c.a(paramView, this.nhI);
    b.a(this.nhI.mController.ylL, 12, 1205, 999, 7, GameDetailUI2.f(this.nhI), GameDetailUI2.g(this.nhI), null);
    AppMethodBeat.o(111843);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.4
 * JD-Core Version:    0.6.2
 */