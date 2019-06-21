package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConversationListView$2
  implements Runnable
{
  ConversationListView$2(ConversationListView paramConversationListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34211);
    this.zsw.setSelection(1);
    ConversationListView.e(this.zsw);
    AppMethodBeat.o(34211);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationListView.2
 * JD-Core Version:    0.6.2
 */