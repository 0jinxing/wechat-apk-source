package com.tencent.mm.plugin.wepkg.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.wepkg.model.a;

final class d$1
  implements Runnable
{
  d$1(WepkgCrossProcessTask paramWepkgCrossProcessTask, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63649);
    this.uXk.asP();
    if (this.uXt != null)
      this.uXt.a(this.uXk);
    AppMethodBeat.o(63649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.d.1
 * JD-Core Version:    0.6.2
 */