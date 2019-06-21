package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class BizConversationUI$BizConversationFmUI$4
  implements MMSlideDelView.c
{
  BizConversationUI$BizConversationFmUI$4(BizConversationUI.BizConversationFmUI paramBizConversationFmUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(34119);
    int i = BizConversationUI.BizConversationFmUI.d(this.zqR).getPositionForView(paramView);
    AppMethodBeat.o(34119);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI.4
 * JD-Core Version:    0.6.2
 */