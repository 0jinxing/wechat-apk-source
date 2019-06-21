package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameDetailUI2$17
  implements View.OnClickListener
{
  GameDetailUI2$17(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111858);
    if ((paramView.getTag() instanceof String))
    {
      c.a(paramView, this.nhI);
      b.a(this.nhI.mController.ylL, 12, 1203, 999, 7, GameDetailUI2.f(this.nhI), GameDetailUI2.g(this.nhI), null);
      AppMethodBeat.o(111858);
    }
    while (true)
    {
      return;
      Object localObject = new GameDetailRankUI.a();
      ((GameDetailRankUI.a)localObject).ngJ = GameDetailUI2.n(this.nhI);
      ((GameDetailRankUI.a)localObject).ngK = GameDetailUI2.o(this.nhI);
      ((GameDetailRankUI.a)localObject).ngL = GameDetailUI2.l(this.nhI);
      paramView = v.nW("rankData");
      v.Zp().y(paramView, true).j(GameDetailRankUI.ngH, localObject);
      localObject = new Intent(this.nhI.mController.ylL, GameDetailRankUI.class);
      ((Intent)localObject).putExtra(GameDetailRankUI.EXTRA_SESSION_ID, paramView);
      this.nhI.startActivity((Intent)localObject);
      b.a(this.nhI.mController.ylL, 12, 1203, 999, 6, GameDetailUI2.f(this.nhI), GameDetailUI2.g(this.nhI), null);
      AppMethodBeat.o(111858);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.17
 * JD-Core Version:    0.6.2
 */