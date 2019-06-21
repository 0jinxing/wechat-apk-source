package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$10
  implements Runnable
{
  h$10(a parama, WepkgCrossProcessTask paramWepkgCrossProcessTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63576);
    if (this.uXt != null)
      this.uXt.a(this.uXy);
    this.uXy.aBW();
    AppMethodBeat.o(63576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.h.10
 * JD-Core Version:    0.6.2
 */