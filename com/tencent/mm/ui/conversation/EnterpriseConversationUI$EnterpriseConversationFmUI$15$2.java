package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.g;
import com.tencent.mm.ui.transmit.SelectConversationUI;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$15$2
  implements n.d
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$15$2(EnterpriseConversationUI.EnterpriseConversationFmUI.15 param15)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(34434);
    paramInt = 0;
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      g.ew(EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zuv.zut), paramInt);
      AppMethodBeat.o(34434);
      return;
      g.u(this.zuv.zut.getContext(), EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zuv.zut), 5);
      continue;
      paramMenuItem = new Intent(this.zuv.zut.thisActivity(), SelectConversationUI.class);
      paramMenuItem.putExtra("Select_Talker_Name", EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zuv.zut));
      paramMenuItem.putExtra("Select_block_List", EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zuv.zut));
      paramMenuItem.putExtra("Select_Send_Card", true);
      paramMenuItem.putExtra("Select_Conv_Type", 3);
      this.zuv.zut.startActivityForResult(paramMenuItem, 1);
      paramInt = 3;
      continue;
      paramInt = 4;
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("enterprise_biz_name", EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zuv.zut));
      paramMenuItem.putExtra("enterprise_scene", 2);
      d.b(this.zuv.zut.thisActivity(), "brandservice", ".ui.EnterpriseBizContactPlainListUI", paramMenuItem);
      continue;
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("Contact_User", EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zuv.zut));
      d.b(this.zuv.zut.thisActivity(), "profile", ".ui.ContactInfoUI", paramMenuItem);
      paramInt = 5;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.15.2
 * JD-Core Version:    0.6.2
 */