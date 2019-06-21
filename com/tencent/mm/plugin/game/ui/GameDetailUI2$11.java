package com.tencent.mm.plugin.game.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameDetailUI2$11
  implements View.OnClickListener
{
  GameDetailUI2$11(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111850);
    if (!GameDetailUI2.d(this.nhI))
    {
      GameDetailUI2.b(this.nhI).setMaxLines(100);
      GameDetailUI2.c(this.nhI).setText(this.nhI.getResources().getText(2131300232));
      GameDetailUI2.a(this.nhI, true);
      AppMethodBeat.o(111850);
    }
    while (true)
    {
      return;
      GameDetailUI2.b(this.nhI).setMaxLines(3);
      GameDetailUI2.c(this.nhI).setText(this.nhI.getResources().getText(2131300231));
      GameDetailUI2.a(this.nhI, false);
      AppMethodBeat.o(111850);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.11
 * JD-Core Version:    0.6.2
 */