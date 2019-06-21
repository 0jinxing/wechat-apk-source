package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseChattingUIFragment$1
  implements Runnable
{
  BaseChattingUIFragment$1(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30440);
    this.yHn.onExitBegin();
    AppMethodBeat.o(30440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.1
 * JD-Core Version:    0.6.2
 */