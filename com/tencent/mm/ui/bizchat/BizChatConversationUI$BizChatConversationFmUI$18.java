package com.tencent.mm.ui.bizchat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.a;

final class BizChatConversationUI$BizChatConversationFmUI$18
  implements AdapterView.OnItemClickListener
{
  BizChatConversationUI$BizChatConversationFmUI$18(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(30075);
    paramAdapterView = (a)BizChatConversationUI.BizChatConversationFmUI.b(this.yEp).getItem(paramInt);
    BizChatConversationUI.BizChatConversationFmUI.b(this.yEp, paramAdapterView.field_bizChatId);
    AppMethodBeat.o(30075);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.18
 * JD-Core Version:    0.6.2
 */