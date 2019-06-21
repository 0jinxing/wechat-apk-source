package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.h;

final class BaseChattingUIFragment$3
  implements Runnable
{
  BaseChattingUIFragment$3(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30442);
    ab.i("MicroMsg.BaseChattingUIFragment", "[onExitEnd] activity:%s isPreLoaded:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj) });
    BaseChattingUIFragment.a(this.yHn).dxD();
    BaseChattingUIFragment localBaseChattingUIFragment = this.yHn;
    if (localBaseChattingUIFragment.yHm != 0)
    {
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcQuitChattingEnable, localBaseChattingUIFragment.yHm);
      localBaseChattingUIFragment.yHm = 0;
    }
    this.yHn.cgL.caA = false;
    AppMethodBeat.o(30442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.3
 * JD-Core Version:    0.6.2
 */