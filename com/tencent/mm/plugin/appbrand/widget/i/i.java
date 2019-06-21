package com.tencent.mm.plugin.appbrand.widget.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;

public final class i extends d
{
  public i(String paramString, c paramc, q paramq)
  {
    super(paramString, paramc, paramq);
  }

  public final void aSg()
  {
    AppMethodBeat.i(87571);
    if ((this.hwf.asE() != null) && (this.jpu != null))
    {
      com.tencent.mm.sdk.g.d.h(new i.1(this), "TempFileIconLoader").start();
      AppMethodBeat.o(87571);
    }
    while (true)
    {
      return;
      this.jpv.a("Failed to load icon via temp file", this);
      AppMethodBeat.o(87571);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.i
 * JD-Core Version:    0.6.2
 */