package com.tencent.mm.ui;

import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class AllRemindMsgUI$c$3$2
  implements n.d
{
  AllRemindMsgUI$c$3$2(AllRemindMsgUI.c.3 param3, View paramView)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(29124);
    paramMenuItem = (AllRemindMsgUI.d)this.mqd.getTag();
    ab.i("MicroMsg.emoji.AllRemindMsgUI", "[onMMMenuItemSelected] delete item:%s", new Object[] { paramMenuItem });
    paramMenuItem = new w(2, paramMenuItem.yeE);
    aw.Rg().a(paramMenuItem, 0);
    AppMethodBeat.o(29124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.c.3.2
 * JD-Core Version:    0.6.2
 */