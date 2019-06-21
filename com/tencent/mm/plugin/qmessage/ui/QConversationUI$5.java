package com.tencent.mm.plugin.qmessage.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class QConversationUI$5
  implements n.d
{
  QConversationUI$5(QConversationUI paramQConversationUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24131);
    QConversationUI.a(this.ptk, QConversationUI.j(this.ptk));
    AppMethodBeat.o(24131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.5
 * JD-Core Version:    0.6.2
 */