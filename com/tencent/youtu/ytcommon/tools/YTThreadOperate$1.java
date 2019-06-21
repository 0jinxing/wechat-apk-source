package com.tencent.youtu.ytcommon.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class YTThreadOperate$1
  implements Runnable
{
  YTThreadOperate$1(Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(118102);
    this.val$runnable.run();
    AppMethodBeat.o(118102);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.YTThreadOperate.1
 * JD-Core Version:    0.6.2
 */