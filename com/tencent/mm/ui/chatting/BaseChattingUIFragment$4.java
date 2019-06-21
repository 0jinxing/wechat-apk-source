package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.h;

final class BaseChattingUIFragment$4
  implements Runnable
{
  BaseChattingUIFragment$4(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30443);
    this.yHn.cgL.caA = true;
    BaseChattingUIFragment.a(this.yHn).dxx();
    ab.i("MicroMsg.BaseChattingUIFragment", "[doCreate] activity:%s isPreLoaded:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj) });
    AppMethodBeat.o(30443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.4
 * JD-Core Version:    0.6.2
 */