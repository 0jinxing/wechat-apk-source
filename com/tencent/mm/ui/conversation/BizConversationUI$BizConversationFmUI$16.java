package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class BizConversationUI$BizConversationFmUI$16
  implements MMSlideDelView.c
{
  BizConversationUI$BizConversationFmUI$16(BizConversationUI.BizConversationFmUI paramBizConversationFmUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(34133);
    int i = BizConversationUI.BizConversationFmUI.d(this.zqR).getPositionForView(paramView);
    AppMethodBeat.o(34133);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI.16
 * JD-Core Version:    0.6.2
 */