package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class b$10$1
  implements Runnable
{
  b$10$1(b.10 param10)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55155);
    if (b.v(this.oCd.oBV) != null)
      b.v(this.oCd.oBV).dismiss();
    if (b.a(this.oCd.oBV) != null)
      b.a(this.oCd.oBV).onError();
    AppMethodBeat.o(55155);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.10.1
 * JD-Core Version:    0.6.2
 */