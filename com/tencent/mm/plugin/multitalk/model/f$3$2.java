package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multitalk.ui.widget.e;
import com.tencent.mm.plugin.voip.ui.d;

final class f$3$2
  implements Runnable
{
  f$3$2(f.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53943);
    if (f.l(this.oGD.oGB) == e.oIG)
    {
      com.tencent.mm.plugin.voip.b.cIk().Dq(this.oGD.oGB.oGk);
      if (f.k(this.oGD.oGB) != null)
        f.k(this.oGD.oGB).bHa();
    }
    AppMethodBeat.o(53943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.3.2
 * JD-Core Version:    0.6.2
 */