package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;

final class GameLibraryUI$6
  implements View.OnClickListener
{
  GameLibraryUI$6(GameLibraryUI paramGameLibraryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112036);
    int i = 6;
    if ((paramView.getTag() instanceof String))
    {
      c.a(paramView, this.nkf);
      i = 7;
    }
    while (true)
    {
      b.a(this.nkf, 11, 1113, 1, i, GameLibraryUI.e(this.nkf), null);
      AppMethodBeat.o(112036);
      return;
      paramView = new Intent(this.nkf, GameCategoryUI.class);
      paramView.putExtra("extra_type", 2);
      paramView.putExtra("extra_category_name", this.nkf.getString(2131300280));
      paramView.putExtra("game_report_from_scene", 1113);
      this.nkf.startActivity(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryUI.6
 * JD-Core Version:    0.6.2
 */