package com.tencent.mm.plugin.game.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.ui.base.h;

final class GameRegionSelectUI$2
  implements MenuItem.OnMenuItemClickListener
{
  GameRegionSelectUI$2(GameRegionSelectUI paramGameRegionSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112160);
    if (e.eg(this.nlU))
    {
      h.a(this.nlU, true, this.nlU.getString(2131300338), "", this.nlU.getString(2131300339), this.nlU.getString(2131300337), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(112159);
          e.eh(GameRegionSelectUI.2.this.nlU);
          GameRegionSelectUI.a(GameRegionSelectUI.2.this.nlU);
          Intent localIntent = new Intent();
          paramAnonymousDialogInterface = e.dX(GameRegionSelectUI.2.this.nlU);
          if (paramAnonymousDialogInterface != null)
          {
            localIntent.putExtra("gameRegionName", e.a(paramAnonymousDialogInterface));
            GameRegionSelectUI.2.this.nlU.setResult(-1, localIntent);
          }
          while (true)
          {
            GameRegionSelectUI.2.this.nlU.finish();
            AppMethodBeat.o(112159);
            return;
            GameRegionSelectUI.2.this.nlU.setResult(1);
          }
        }
      }
      , new GameRegionSelectUI.2.2(this));
      AppMethodBeat.o(112160);
      return true;
    }
    GameRegionSelectUI.a(this.nlU);
    Intent localIntent = new Intent();
    paramMenuItem = e.dX(this.nlU);
    if (paramMenuItem != null)
    {
      localIntent.putExtra("gameRegionName", e.a(paramMenuItem));
      this.nlU.setResult(-1, localIntent);
    }
    while (true)
    {
      this.nlU.finish();
      break;
      this.nlU.setResult(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRegionSelectUI.2
 * JD-Core Version:    0.6.2
 */