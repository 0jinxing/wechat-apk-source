package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.ai;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.b;

final class NewBizConversationUI$9
  implements n.d
{
  NewBizConversationUI$9(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(34541);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(34541);
      while (true)
      {
        return;
        aw.ZK();
        paramMenuItem = c.XM().aoO(NewBizConversationUI.n(this.zvm));
        if (paramMenuItem == null)
        {
          ab.e("MicroMsg.NewBizConversationUI", "changed biz stick status failed, contact is null, talker = " + NewBizConversationUI.n(this.zvm));
          AppMethodBeat.o(34541);
        }
        else
        {
          if (paramMenuItem.Oe())
          {
            h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(2) });
            t.x(NewBizConversationUI.n(this.zvm), true);
          }
          while (true)
          {
            ai localai = new ai();
            localai.ctg.userName = paramMenuItem.field_username;
            a.xxA.m(localai);
            AppMethodBeat.o(34541);
            break;
            h.pYm.e(13307, new Object[] { paramMenuItem.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(2) });
            t.w(NewBizConversationUI.n(this.zvm), true);
          }
          aw.ZK();
          paramMenuItem = c.XM().aoO(NewBizConversationUI.n(this.zvm));
          b.a(z.aeR().qP(NewBizConversationUI.n(this.zvm)), this.zvm, paramMenuItem, 2);
          AppMethodBeat.o(34541);
        }
      }
      NewBizConversationUI.b(this.zvm, NewBizConversationUI.n(this.zvm));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.9
 * JD-Core Version:    0.6.2
 */