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

final class GameIndexSearchView$1
  implements View.OnClickListener
{
  GameIndexSearchView$1(GameIndexSearchView paramGameIndexSearchView, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111986);
    int i;
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
    {
      paramView = (String)paramView.getTag();
      i = c.t(GameIndexSearchView.a(this.njn), paramView, "game_center_msgcenter");
    }
    while (true)
    {
      b.a(GameIndexSearchView.a(this.njn), 14, 1401, 1, i, 0, null, this.nfb, 0, null, null, null);
      AppMethodBeat.o(111986);
      return;
      paramView = a.bDN();
      if (paramView.bJt == 2)
      {
        i = c.t(GameIndexSearchView.a(this.njn), paramView.url, "game_center_msgcenter");
      }
      else
      {
        paramView = new Intent(GameIndexSearchView.a(this.njn), GameSearchUI.class);
        paramView.putExtra("game_report_from_scene", 1001);
        GameIndexSearchView.a(this.njn).startActivity(paramView);
        i = 6;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexSearchView.1
 * JD-Core Version:    0.6.2
 */