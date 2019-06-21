package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.a;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameOverSeaCenterUI$4
  implements View.OnClickListener
{
  GameOverSeaCenterUI$4(GameOverSeaCenterUI paramGameOverSeaCenterUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112131);
    a.a locala = a.bDM();
    int i;
    if (locala.bJt == 2)
      i = c.t(this.nlH.mController.ylL, locala.url, "game_center_library");
    while (true)
    {
      b.a(this.nlH.mController.ylL, 10, 1005, 1, i, this.nlH.mXC, null);
      AppMethodBeat.o(112131);
      return;
      paramView = paramView.getTag();
      if ((paramView != null) && ((paramView instanceof String)) && (!bo.isNullOrNil((String)paramView)))
      {
        paramView = (String)paramView;
        i = c.t(this.nlH.mController.ylL, paramView, "game_center_library");
      }
      else
      {
        paramView = new Intent(this.nlH.mController.ylL, GameLibraryUI.class);
        paramView.putExtra("game_report_from_scene", 1005);
        this.nlH.startActivity(paramView);
        i = 6;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI.4
 * JD-Core Version:    0.6.2
 */