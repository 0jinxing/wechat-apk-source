package com.tencent.mm.plugin.game.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$1$1
  implements Runnable
{
  h$1$1(h.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111534);
    h.cancelDownload(this.mZg.mZe.field_appId);
    this.mZg.mZf.hO(false);
    AppMethodBeat.o(111534);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.h.1.1
 * JD-Core Version:    0.6.2
 */