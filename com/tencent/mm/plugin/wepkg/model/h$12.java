package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$12
  implements Runnable
{
  h$12(a parama, WepkgCrossProcessTask paramWepkgCrossProcessTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63578);
    if (this.uXt != null)
      this.uXt.a(this.uXy);
    this.uXy.aBW();
    AppMethodBeat.o(63578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.h.12
 * JD-Core Version:    0.6.2
 */