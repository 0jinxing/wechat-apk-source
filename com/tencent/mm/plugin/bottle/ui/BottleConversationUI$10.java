package com.tencent.mm.plugin.bottle.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class BottleConversationUI$10
  implements n.d
{
  BottleConversationUI$10(BottleConversationUI paramBottleConversationUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(18565);
    BottleConversationUI.a(this.jKb, BottleConversationUI.e(this.jKb));
    AppMethodBeat.o(18565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.10
 * JD-Core Version:    0.6.2
 */