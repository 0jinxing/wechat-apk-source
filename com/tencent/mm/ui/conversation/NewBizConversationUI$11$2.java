package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class NewBizConversationUI$11$2
  implements n.d
{
  NewBizConversationUI$11$2(NewBizConversationUI.11 param11)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(34545);
    switch (paramMenuItem.getItemId())
    {
    default:
      ab.w("MicroMsg.NewBizConversationUI", "default onMMMenuItemSelected err");
      AppMethodBeat.o(34545);
    case 1:
    }
    while (true)
    {
      return;
      paramMenuItem = new Intent(this.zvo.zvm.mController.ylL, BizTimeLineNewMsgUI.class);
      paramMenuItem.putExtra("biz_time_line_line_enter_scene", 2);
      this.zvo.zvm.startActivity(paramMenuItem);
      AppMethodBeat.o(34545);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.11.2
 * JD-Core Version:    0.6.2
 */