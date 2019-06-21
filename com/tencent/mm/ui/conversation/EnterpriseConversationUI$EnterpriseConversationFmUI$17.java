package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$17
  implements MMSlideDelView.c
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$17(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(34437);
    int i = EnterpriseConversationUI.EnterpriseConversationFmUI.a(this.zut).getPositionForView(paramView);
    AppMethodBeat.o(34437);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.17
 * JD-Core Version:    0.6.2
 */