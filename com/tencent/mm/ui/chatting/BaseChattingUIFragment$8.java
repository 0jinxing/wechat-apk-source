package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseChattingUIFragment$8
  implements Runnable
{
  BaseChattingUIFragment$8(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30447);
    ab.i("MicroMsg.BaseChattingUIFragment", "[doStop] activity:%s isPreLoaded:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj) });
    AppMethodBeat.o(30447);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.8
 * JD-Core Version:    0.6.2
 */