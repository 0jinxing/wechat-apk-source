package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.chatting.c.h;

final class BaseChattingUIFragment$10
  implements Runnable
{
  BaseChattingUIFragment$10(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(30449);
    ab.i("MicroMsg.BaseChattingUIFragment", "[onEnterBegin] activity:%s isPreLoaded:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj) });
    BaseChattingUIFragment localBaseChattingUIFragment = this.yHn;
    boolean bool = WXHardCoderJNI.hcEnterChattingEnable;
    int j = WXHardCoderJNI.hcEnterChattingDelay;
    int k = WXHardCoderJNI.hcEnterChattingCPU;
    int m = WXHardCoderJNI.hcEnterChattingIO;
    if (WXHardCoderJNI.hcEnterChattingThr)
      i = g.RS().doL();
    localBaseChattingUIFragment.yHl = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcEnterChattingTimeout, 301, WXHardCoderJNI.hcEnterChattingAction, "ChattingUIFragment");
    this.yHn.cgL.caA = true;
    BaseChattingUIFragment.a(this.yHn).dxy();
    AppMethodBeat.o(30449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.10
 * JD-Core Version:    0.6.2
 */