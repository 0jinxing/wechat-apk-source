package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.chatting.c.h;

final class BaseChattingUIFragment$2
  implements Runnable
{
  BaseChattingUIFragment$2(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(30441);
    ab.i("MicroMsg.BaseChattingUIFragment", "[onExitBegin] activity:%s isPreLoaded:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj) });
    BaseChattingUIFragment localBaseChattingUIFragment = this.yHn;
    boolean bool = WXHardCoderJNI.hcQuitChattingEnable;
    int j = WXHardCoderJNI.hcQuitChattingDelay;
    int k = WXHardCoderJNI.hcQuitChattingCPU;
    int m = WXHardCoderJNI.hcQuitChattingIO;
    if (WXHardCoderJNI.hcQuitChattingThr)
      i = g.RS().doL();
    localBaseChattingUIFragment.yHm = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcQuitChattingTimeout, 302, WXHardCoderJNI.hcQuitChattingAction, "ChattingUIFragment");
    BaseChattingUIFragment.a(this.yHn).dxC();
    AppMethodBeat.o(30441);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.2
 * JD-Core Version:    0.6.2
 */