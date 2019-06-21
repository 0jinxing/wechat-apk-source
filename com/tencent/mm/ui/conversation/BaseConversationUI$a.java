package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum BaseConversationUI$a
{
  static
  {
    AppMethodBeat.i(34065);
    zqJ = new a("ACTIVITY_CREATE", 0);
    zqK = new a("ACTIVITY_RESUME", 1);
    zqL = new a("ACTIVITY_PAUSE", 2);
    zqM = new a[] { zqJ, zqK, zqL };
    AppMethodBeat.o(34065);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.a
 * JD-Core Version:    0.6.2
 */