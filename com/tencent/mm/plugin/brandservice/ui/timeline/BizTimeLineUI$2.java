package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class BizTimeLineUI$2
  implements MenuItem.OnMenuItemClickListener
{
  BizTimeLineUI$2(BizTimeLineUI paramBizTimeLineUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(14184);
    paramMenuItem = new Intent();
    paramMenuItem.addFlags(67108864);
    paramMenuItem.putExtra("biz_from_scene", 2);
    paramMenuItem.putExtra("biz_time_line_line_session_id", BizTimeLineUI.k(this.jOK));
    paramMenuItem.putExtra("biz_enter_source", BizTimeLineUI.g(this.jOK));
    d.f(this.jOK, ".ui.conversation.NewBizConversationUI", paramMenuItem);
    BizTimeLineUI.h(this.jOK).si(7);
    BizTimeLineUI.l(this.jOK);
    AppMethodBeat.o(14184);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.2
 * JD-Core Version:    0.6.2
 */