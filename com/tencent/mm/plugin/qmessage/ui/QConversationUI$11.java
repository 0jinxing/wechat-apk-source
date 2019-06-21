package com.tencent.mm.plugin.qmessage.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QConversationUI$11
  implements MenuItem.OnMenuItemClickListener
{
  QConversationUI$11(QConversationUI paramQConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24137);
    QConversationUI.e(this.ptk);
    AppMethodBeat.o(24137);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.11
 * JD-Core Version:    0.6.2
 */