package com.tencent.mm.plugin.card.ui;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardGiftVideoUI$1
  implements View.OnCreateContextMenuListener
{
  CardGiftVideoUI$1(CardGiftVideoUI paramCardGiftVideoUI)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(88448);
    paramContextMenu.add(0, 0, 0, this.klx.getString(2131297913));
    AppMethodBeat.o(88448);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.1
 * JD-Core Version:    0.6.2
 */