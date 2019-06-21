package com.tencent.mm.plugin.bottle.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BottleConversationUI$8
  implements MenuItem.OnMenuItemClickListener
{
  BottleConversationUI$8(BottleConversationUI paramBottleConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(18563);
    this.jKb.finish();
    AppMethodBeat.o(18563);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.8
 * JD-Core Version:    0.6.2
 */