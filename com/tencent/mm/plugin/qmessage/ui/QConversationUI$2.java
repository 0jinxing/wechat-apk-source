package com.tencent.mm.plugin.qmessage.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.qmessage.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class QConversationUI$2
  implements MenuItem.OnMenuItemClickListener
{
  QConversationUI$2(QConversationUI paramQConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24127);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("Contact_User", QConversationUI.a(this.ptk).field_username);
    paramMenuItem.putExtra("Chat_Readonly", true);
    a.gkE.c(paramMenuItem, this.ptk.mController.ylL);
    AppMethodBeat.o(24127);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.2
 * JD-Core Version:    0.6.2
 */