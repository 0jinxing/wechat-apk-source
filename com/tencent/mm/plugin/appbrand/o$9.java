package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.networking.b;
import com.tencent.mm.plugin.appbrand.networking.e;
import com.tencent.mm.plugin.appbrand.task.f;

final class o$9
  implements f
{
  o$9(o paramo)
  {
  }

  public final void finish()
  {
    AppMethodBeat.i(128994);
    this.gPy.finish();
    AppMethodBeat.o(128994);
  }

  public final void onNetworkChange()
  {
    AppMethodBeat.i(128995);
    b localb = (b)this.gPy.K(b.class);
    if ((localb instanceof e))
      ((e)localb).aIQ();
    AppMethodBeat.o(128995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.9
 * JD-Core Version:    0.6.2
 */