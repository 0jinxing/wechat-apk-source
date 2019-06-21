package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.k;

final class ChattingUIFragment$6
  implements Runnable
{
  ChattingUIFragment$6(ChattingUIFragment paramChattingUIFragment, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30836);
    k.a(ChattingUIFragment.a(this.yLv), this.ewG - 1, -this.fzv, true);
    AppMethodBeat.o(30836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.6
 * JD-Core Version:    0.6.2
 */