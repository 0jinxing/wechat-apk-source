package com.tencent.mm.ui.bizchat;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.a;
import com.tencent.mm.aj.z;
import com.tencent.mm.ui.base.n.d;

final class BizChatConversationUI$BizChatConversationFmUI$15
  implements n.d
{
  BizChatConversationUI$BizChatConversationFmUI$15(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(30072);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(30072);
      while (true)
      {
        return;
        BizChatConversationUI.BizChatConversationFmUI.a(this.yEp, BizChatConversationUI.BizChatConversationFmUI.e(this.yEp));
        AppMethodBeat.o(30072);
        continue;
        paramMenuItem = z.aeU().fv(BizChatConversationUI.BizChatConversationFmUI.e(this.yEp));
        paramMenuItem.field_unReadCount = 1;
        paramMenuItem.field_atCount = 0;
        z.aeU().b(paramMenuItem);
        com.tencent.mm.modelstat.b.fRa.Q(paramMenuItem.field_brandUserName, true);
        AppMethodBeat.o(30072);
        continue;
        z.aeU().fx(BizChatConversationUI.BizChatConversationFmUI.e(this.yEp));
        paramMenuItem = z.aeU().fv(BizChatConversationUI.BizChatConversationFmUI.e(this.yEp));
        com.tencent.mm.modelstat.b.fRa.Q(paramMenuItem.field_brandUserName, false);
        AppMethodBeat.o(30072);
        continue;
        paramMenuItem = z.aeU().fv(BizChatConversationUI.BizChatConversationFmUI.e(this.yEp));
        if (!z.aeU().fy(BizChatConversationUI.BizChatConversationFmUI.e(this.yEp)))
          break;
        z.aeU().fA(BizChatConversationUI.BizChatConversationFmUI.e(this.yEp));
        com.tencent.mm.modelstat.b.fRa.c(true, paramMenuItem.field_brandUserName, false);
        AppMethodBeat.o(30072);
      }
      z.aeU().fz(BizChatConversationUI.BizChatConversationFmUI.e(this.yEp));
      com.tencent.mm.modelstat.b.fRa.c(true, paramMenuItem.field_brandUserName, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.15
 * JD-Core Version:    0.6.2
 */