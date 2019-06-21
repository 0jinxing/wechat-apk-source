package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class BizTimeLineNewMsgUI$3
  implements AdapterView.OnItemClickListener
{
  BizTimeLineNewMsgUI$3(BizTimeLineNewMsgUI paramBizTimeLineNewMsgUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(14158);
    paramView = BizTimeLineNewMsgUI.a(this.jOc).sg(paramInt);
    if (paramView == null)
    {
      ab.e("MicroMsg.BizTimeLineNewMsgUI", "onItemClick info is null");
      AppMethodBeat.o(14158);
    }
    while (true)
    {
      return;
      if (((j)g.K(j.class)).bOr().jf(paramView.field_msgId).field_msgId == 0L)
      {
        com.tencent.mm.ui.base.h.bQ(this.jOc, this.jOc.getString(2131297674));
        AppMethodBeat.o(14158);
      }
      else
      {
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("Chat_User", paramView.field_talker);
        paramAdapterView.putExtra("finish_direct", true);
        paramAdapterView.putExtra("from_global_search", true);
        paramAdapterView.putExtra("msg_local_id", paramView.field_msgId);
        paramAdapterView.putExtra("specific_chat_from_scene", 9);
        paramAdapterView.putExtra("preChatTYPE", 13);
        d.f(this.jOc.mController.ylL, ".ui.chatting.ChattingUI", paramAdapterView);
        AppMethodBeat.o(14158);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI.3
 * JD-Core Version:    0.6.2
 */