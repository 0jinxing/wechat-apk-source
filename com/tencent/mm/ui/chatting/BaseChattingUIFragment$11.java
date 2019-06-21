package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.h;

final class BaseChattingUIFragment$11
  implements Runnable
{
  BaseChattingUIFragment$11(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30450);
    BaseChattingUIFragment.a(this.yHn).dxz();
    BaseChattingUIFragment localBaseChattingUIFragment = this.yHn;
    WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcEnterChattingEnable, localBaseChattingUIFragment.yHl);
    localBaseChattingUIFragment.yHl = 0;
    ab.i("MicroMsg.BaseChattingUIFragment", "[onEnterEnd] activity:%s isPreLoaded:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj) });
    AppMethodBeat.o(30450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.11
 * JD-Core Version:    0.6.2
 */