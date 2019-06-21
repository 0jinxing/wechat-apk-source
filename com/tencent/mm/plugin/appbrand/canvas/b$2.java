package com.tencent.mm.plugin.appbrand.canvas;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103141);
    boolean bool = this.hcy.mPause;
    this.hcy.mPause = false;
    ab.i("MicroMsg.DrawActionDelegateImpl", "preStae %b, hasChanged %b", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(this.hcy.hcf) });
    if ((bool) && (this.hcy.hcf))
      this.hcy.hck.ayc();
    AppMethodBeat.o(103141);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.2
 * JD-Core Version:    0.6.2
 */