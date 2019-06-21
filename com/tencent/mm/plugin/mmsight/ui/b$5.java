package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class b$5
  implements Runnable
{
  b$5(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55146);
    if (b.v(this.oBV) != null)
      b.v(this.oBV).dismiss();
    if (b.a(this.oBV) != null)
      b.a(this.oBV).bQf();
    AppMethodBeat.o(55146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.5
 * JD-Core Version:    0.6.2
 */