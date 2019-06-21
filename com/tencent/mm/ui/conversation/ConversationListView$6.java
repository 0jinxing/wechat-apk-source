package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.b;

final class ConversationListView$6
  implements Runnable
{
  ConversationListView$6(ConversationListView paramConversationListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34215);
    ConversationListView localConversationListView = this.zsw;
    int i = this.bVv;
    if (localConversationListView.zrY != null)
      localConversationListView.zrY.qh(i);
    AppMethodBeat.o(34215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationListView.6
 * JD-Core Version:    0.6.2
 */