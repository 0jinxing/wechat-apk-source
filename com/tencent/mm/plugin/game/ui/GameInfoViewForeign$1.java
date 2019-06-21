package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.a;
import com.tencent.mm.plugin.game.model.a.a;

final class GameInfoViewForeign$1
  implements View.OnClickListener
{
  GameInfoViewForeign$1(GameInfoViewForeign paramGameInfoViewForeign)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111992);
    int i;
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
    {
      paramView = (String)paramView.getTag();
      i = c.t(GameInfoViewForeign.a(this.njt), paramView, "game_center_msgcenter");
    }
    while (true)
    {
      paramView = b.eA("resource", "5");
      b.a(GameInfoViewForeign.a(this.njt), 10, 1001, GameInfoViewForeign.b(this.njt), i, 0, null, GameInfoViewForeign.c(this.njt), 0, null, null, paramView);
      AppMethodBeat.o(111992);
      return;
      paramView = a.bDN();
      if (paramView.bJt == 2)
      {
        i = c.t(GameInfoViewForeign.a(this.njt), paramView.url, "game_center_msgcenter");
      }
      else
      {
        paramView = new Intent(GameInfoViewForeign.a(this.njt), GameMessageUI.class);
        paramView.putExtra("game_report_from_scene", 1001);
        GameInfoViewForeign.a(this.njt).startActivity(paramView);
        i = 6;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameInfoViewForeign.1
 * JD-Core Version:    0.6.2
 */