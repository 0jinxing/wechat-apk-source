package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class b$4$5
  implements Runnable
{
  b$4$5(b.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55144);
    if (b.v(this.oCa.oBV) != null)
      b.v(this.oCa.oBV).dismiss();
    if (b.a(this.oCa.oBV) != null)
      b.a(this.oCa.oBV).bQf();
    AppMethodBeat.o(55144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.4.5
 * JD-Core Version:    0.6.2
 */