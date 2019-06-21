package com.tencent.mm.plugin.qmessage.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class QConversationUI$13
  implements MenuItem.OnMenuItemClickListener
{
  QConversationUI$13(QConversationUI paramQConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24139);
    if (!bo.isNullOrNil(QConversationUI.f(this.ptk)))
      QConversationUI.a(this.ptk, QConversationUI.f(this.ptk), QConversationUI.g(this.ptk));
    AppMethodBeat.o(24139);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.13
 * JD-Core Version:    0.6.2
 */