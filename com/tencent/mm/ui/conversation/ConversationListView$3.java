package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConversationListView$3
  implements Runnable
{
  ConversationListView$3(ConversationListView paramConversationListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34212);
    this.zsw.smoothScrollToPositionFromTop(0, 0, 300);
    AppMethodBeat.o(34212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationListView.3
 * JD-Core Version:    0.6.2
 */