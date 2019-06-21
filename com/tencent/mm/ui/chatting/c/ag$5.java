package com.tencent.mm.ui.chatting.c;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.u;

final class ag$5
  implements AdapterView.OnItemClickListener
{
  ag$5(ag paramag)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(31646);
    paramView = (bi)ag.d(this.yRH).getItem(paramInt);
    if ((paramView != null) && (!bo.isNullOrNil(paramView.field_talker)))
    {
      h.pYm.e(10450, new Object[] { Integer.valueOf(1) });
      paramAdapterView = new Intent(this.yRH.cgL.yTx.getContext(), ChattingUI.class);
      paramAdapterView.putExtra("Chat_User", paramView.field_talker);
      paramAdapterView.putExtra("finish_direct", true);
      paramAdapterView.putExtra("show_search_chat_content_result", false);
      paramAdapterView.putExtra("msg_local_id", paramView.field_msgId);
      paramAdapterView.putExtra("img_gallery_enter_from_chatting_ui", true);
      this.yRH.cgL.yTx.startActivity(paramAdapterView);
    }
    AppMethodBeat.o(31646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ag.5
 * JD-Core Version:    0.6.2
 */