package com.tencent.mm.plugin.game.ui;

import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameInstalledView$1$1
  implements Runnable
{
  GameInstalledView$1$1(GameInstalledView.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111996);
    if (GameInstalledView.a(this.njJ.njI) == 0)
    {
      GameInstalledView.b(this.njJ.njI);
      GameInstalledView.c(this.njJ.njI).addView(this.njJ.val$view, this.njJ.njI.njH);
    }
    AppMethodBeat.o(111996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameInstalledView.1.1
 * JD-Core Version:    0.6.2
 */