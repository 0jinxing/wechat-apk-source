package com.tencent.mm.plugin.appbrand.widget.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.q;

public final class h extends d
{
  public h(String paramString, c paramc, q paramq)
  {
    super(paramString, paramc, paramq);
  }

  public final void aSg()
  {
    AppMethodBeat.i(87569);
    i locali = this.hwf.getRuntime();
    if ((locali != null) && (this.jpu != null))
      com.tencent.mm.sdk.g.d.h(new h.1(this, locali), "PackageIconLoader ").start();
    AppMethodBeat.o(87569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.h
 * JD-Core Version:    0.6.2
 */