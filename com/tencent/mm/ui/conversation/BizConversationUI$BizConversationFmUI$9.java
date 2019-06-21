package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.b;

final class BizConversationUI$BizConversationFmUI$9
  implements n.d
{
  BizConversationUI$BizConversationFmUI$9(BizConversationUI.BizConversationFmUI paramBizConversationFmUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(34125);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(34125);
      while (true)
      {
        return;
        aw.ZK();
        paramMenuItem = c.XM().aoO(BizConversationUI.BizConversationFmUI.n(this.zqR));
        if (paramMenuItem == null)
        {
          ab.e("MicroMsg.BizConversationUI", "changed biz stick status failed, contact is null, talker = " + BizConversationUI.BizConversationFmUI.n(this.zqR));
          AppMethodBeat.o(34125);
        }
        else if (paramMenuItem.Oe())
        {
          h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(2) });
          t.x(BizConversationUI.BizConversationFmUI.n(this.zqR), true);
          AppMethodBeat.o(34125);
        }
        else
        {
          h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(2) });
          t.w(BizConversationUI.BizConversationFmUI.n(this.zqR), true);
          AppMethodBeat.o(34125);
          continue;
          aw.ZK();
          paramMenuItem = c.XM().aoO(BizConversationUI.BizConversationFmUI.n(this.zqR));
          b.a(z.aeR().qP(BizConversationUI.BizConversationFmUI.n(this.zqR)), this.zqR.thisActivity(), paramMenuItem, 2);
          AppMethodBeat.o(34125);
        }
      }
      BizConversationUI.BizConversationFmUI.b(this.zqR, BizConversationUI.BizConversationFmUI.n(this.zqR));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI.9
 * JD-Core Version:    0.6.2
 */