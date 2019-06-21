package com.tencent.mm.ui.bizchat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.b.a;

final class BizChatConversationUI$BizChatConversationFmUI$17
  implements AdapterView.OnItemLongClickListener
{
  BizChatConversationUI$BizChatConversationFmUI$17(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI, a parama)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(30074);
    this.ptl.a(paramView, paramInt, paramLong, this.yEp, BizChatConversationUI.BizChatConversationFmUI.f(this.yEp), BizChatConversationUI.BizChatConversationFmUI.g(this.yEp), BizChatConversationUI.BizChatConversationFmUI.h(this.yEp));
    AppMethodBeat.o(30074);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.17
 * JD-Core Version:    0.6.2
 */