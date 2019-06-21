package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.plugin.game.model.k;

final class GameRankHeadView$1
  implements j.a
{
  GameRankHeadView$1(GameRankHeadView paramGameRankHeadView)
  {
  }

  public final void f(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(112144);
    if (GameRankHeadView.a(this.nlO) != null)
    {
      GameRankHeadView.b(this.nlO).ei(this.nlO.getContext());
      GameRankHeadView.b(this.nlO).biT();
      if (paramBoolean)
        GameRankHeadView.c(this.nlO);
    }
    AppMethodBeat.o(112144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRankHeadView.1
 * JD-Core Version:    0.6.2
 */