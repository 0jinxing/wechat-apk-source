package com.tencent.mm.plugin.game.ui;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class GameDetailUI2$9
  implements q.a
{
  GameDetailUI2$9(GameDetailUI2 paramGameDetailUI2, String paramString)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(111848);
    if (paramBoolean)
    {
      GameDetailUI2.a(this.nhI, this.cgF, paramString);
      h.bQ(this.nhI, this.nhI.getResources().getString(2131298422));
      b.a(this.nhI.mController.ylL, 12, 1207, 2, 14, GameDetailUI2.f(this.nhI), GameDetailUI2.g(this.nhI), null);
      AppMethodBeat.o(111848);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(111848);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.9
 * JD-Core Version:    0.6.2
 */