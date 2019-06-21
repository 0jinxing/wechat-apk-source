package com.tencent.mm.ui.bizchat;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a;
import com.tencent.mm.aj.c;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.g;

final class BizChatConversationUI$BizChatConversationFmUI$5$2
  implements n.d
{
  BizChatConversationUI$BizChatConversationFmUI$5$2(BizChatConversationUI.BizChatConversationFmUI.5 param5)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(30060);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(30060);
      while (true)
      {
        return;
        BizChatConversationUI.BizChatConversationFmUI.m(this.yEq.yEp);
        AppMethodBeat.o(30060);
        continue;
        g.u(this.yEq.yEp.getContext(), BizChatConversationUI.BizChatConversationFmUI.a(this.yEq.yEp), 6);
        AppMethodBeat.o(30060);
        continue;
        if (bo.isNullOrNil(BizChatConversationUI.BizChatConversationFmUI.c(this.yEq.yEp)))
        {
          paramMenuItem = z.aeR().qP(BizChatConversationUI.BizChatConversationFmUI.a(this.yEq.yEp));
          BizChatConversationUI.BizChatConversationFmUI.a(this.yEq.yEp, paramMenuItem.adX());
        }
        if ((!bo.isNullOrNil(BizChatConversationUI.BizChatConversationFmUI.c(this.yEq.yEp))) && (z.afd().qB(BizChatConversationUI.BizChatConversationFmUI.c(this.yEq.yEp))))
        {
          z.afa();
          c.a(BizChatConversationUI.BizChatConversationFmUI.c(this.yEq.yEp), null);
        }
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Contact_User", BizChatConversationUI.BizChatConversationFmUI.a(this.yEq.yEp));
        com.tencent.mm.bp.d.b(this.yEq.yEp.thisActivity(), "profile", ".ui.ContactInfoUI", paramMenuItem);
        AppMethodBeat.o(30060);
        continue;
        if (bo.isNullOrNil(BizChatConversationUI.BizChatConversationFmUI.a(this.yEq.yEp)))
          break;
        paramMenuItem = new Intent(this.yEq.yEp.getContext(), BizChatFavUI.class);
        paramMenuItem.putExtra("Contact_User", BizChatConversationUI.BizChatConversationFmUI.a(this.yEq.yEp));
        paramMenuItem.addFlags(67108864);
        this.yEq.yEp.startActivity(paramMenuItem);
        AppMethodBeat.o(30060);
      }
      ab.e("MicroMsg.BizChatConversationFmUI", "brandUserName null");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.5.2
 * JD-Core Version:    0.6.2
 */