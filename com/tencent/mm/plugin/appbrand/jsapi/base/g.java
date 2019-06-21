package com.tencent.mm.plugin.appbrand.jsapi.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;

public final class g
{
  c hCS;
  int hwi;

  public g(c paramc, int paramInt)
  {
    this.hCS = paramc;
    this.hwi = paramInt;
  }

  public final void AR(String paramString)
  {
    AppMethodBeat.i(91048);
    this.hCS.M(this.hwi, paramString);
    AppMethodBeat.o(91048);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.g
 * JD-Core Version:    0.6.2
 */