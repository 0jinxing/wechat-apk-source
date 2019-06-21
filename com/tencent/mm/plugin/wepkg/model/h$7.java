package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h$7
  implements Runnable
{
  public h$7(WepkgCrossProcessTask paramWepkgCrossProcessTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63573);
    if (this.uXt != null)
      this.uXt.a(this.uXy);
    this.uXy.aBW();
    AppMethodBeat.o(63573);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.h.7
 * JD-Core Version:    0.6.2
 */