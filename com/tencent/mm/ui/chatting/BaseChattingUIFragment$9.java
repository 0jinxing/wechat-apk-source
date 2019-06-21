package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.d.a;

final class BaseChattingUIFragment$9
  implements Runnable
{
  BaseChattingUIFragment$9(BaseChattingUIFragment paramBaseChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30448);
    ab.i("MicroMsg.BaseChattingUIFragment", "[doDestroy] activity:%s isPreLoaded:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj) });
    if ((this.yHn.Oe(16)) && (!this.yHn.Oe(8)))
    {
      RuntimeException localRuntimeException = new RuntimeException(String.format("[doDestroy] never doPause, activity:%s isPreLoaded:%b isForeground:%b isFinishing:%b isNeverCreate:%b", new Object[] { this.yHn.yHg, Boolean.valueOf(this.yHn.yHj), Boolean.valueOf(this.yHn.cgL.caA), Boolean.valueOf(this.yHn.isFinishing()), Boolean.valueOf(this.yHn.Oe(2)) }));
      AppMethodBeat.o(30448);
      throw localRuntimeException;
    }
    this.yHn.cgL.caA = false;
    BaseChattingUIFragment.b(this.yHn);
    AppMethodBeat.o(30448);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment.9
 * JD-Core Version:    0.6.2
 */