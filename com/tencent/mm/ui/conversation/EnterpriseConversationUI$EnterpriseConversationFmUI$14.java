package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$14
  implements MenuItem.OnMenuItemClickListener
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$14(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34432);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("enterprise_biz_name", EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zut));
    paramMenuItem.addFlags(67108864);
    d.b(this.zut.getContext(), "brandservice", ".ui.EnterpriseBizSearchUI", paramMenuItem);
    AppMethodBeat.o(34432);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.14
 * JD-Core Version:    0.6.2
 */