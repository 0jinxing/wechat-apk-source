package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e.b;

final class SnsOnlineVideoActivity$3$1
  implements e.b
{
  SnsOnlineVideoActivity$3$1(SnsOnlineVideoActivity.3 param3)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(39144);
    if (SnsOnlineVideoActivity.d(this.rvg.rvf) != null)
      SnsOnlineVideoActivity.d(this.rvg.rvf).onResume();
    AppMethodBeat.o(39144);
  }

  public final void onAnimationStart()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.3.1
 * JD-Core Version:    0.6.2
 */