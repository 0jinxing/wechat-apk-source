package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.pluginsdk.f;

final class ChattingUI$2
  implements Runnable
{
  ChattingUI$2(ChattingUI paramChattingUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30820);
    if (this.yLi.yLg != null)
      f.a(this.yLi, this.yLi.yLg.getBodyView());
    b.bE(this.yLi.yLg.getContext());
    AppMethodBeat.o(30820);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUI.2
 * JD-Core Version:    0.6.2
 */