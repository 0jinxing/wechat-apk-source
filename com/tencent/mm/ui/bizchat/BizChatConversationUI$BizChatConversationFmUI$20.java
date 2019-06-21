package com.tencent.mm.ui.bizchat;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class BizChatConversationUI$BizChatConversationFmUI$20
  implements MMSlideDelView.c
{
  BizChatConversationUI$BizChatConversationFmUI$20(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(30077);
    int i = BizChatConversationUI.BizChatConversationFmUI.j(this.yEp).getPositionForView(paramView);
    AppMethodBeat.o(30077);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.20
 * JD-Core Version:    0.6.2
 */