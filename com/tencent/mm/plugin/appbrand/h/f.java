package com.tencent.mm.plugin.appbrand.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.c;
import com.tencent.mm.d.a.l;

final class f extends d
{
  private final c chO;
  private final l ifb;
  private final int ifc;

  public f(l paraml, int paramInt)
  {
    this.chO = paraml.chO;
    this.ifb = paraml;
    this.ifc = paramInt;
  }

  protected final c aGQ()
  {
    return this.chO;
  }

  protected final l aGR()
  {
    return this.ifb;
  }

  public final boolean aGS()
  {
    return false;
  }

  public final int aGT()
  {
    return this.ifc;
  }

  public final void pause()
  {
    AppMethodBeat.i(113942);
    com.tencent.luggage.g.d.w("MicroMsg.AppBrandJ2V8SubContext", "AppBrandJ2V8SubContext can not pause");
    AppMethodBeat.o(113942);
  }

  public final void resume()
  {
    AppMethodBeat.i(113943);
    com.tencent.luggage.g.d.w("MicroMsg.AppBrandJ2V8SubContext", "AppBrandJ2V8SubContext can not resume");
    AppMethodBeat.o(113943);
  }

  public final void setJsExceptionHandler(h paramh)
  {
    AppMethodBeat.i(113941);
    this.ifb.a(this.ifc, paramh);
    AppMethodBeat.o(113941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.f
 * JD-Core Version:    0.6.2
 */