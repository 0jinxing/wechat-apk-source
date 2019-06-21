package com.tencent.mm.plugin.appbrand.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.c;
import com.tencent.mm.d.a.g;
import com.tencent.mm.d.a.i;
import com.tencent.mm.d.a.i.3;
import com.tencent.mm.d.a.l;

public final class v extends a
{
  public v()
  {
    super(null, null);
  }

  public v(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString, paramArrayOfByte);
  }

  protected final l a(c paramc, int paramInt)
  {
    AppMethodBeat.i(113945);
    paramc = (i)paramc;
    if (paramc.chD == null)
      paramc.chD = new l(paramc, paramc.Cr(), new i.3(paramc));
    paramc = paramc.chD;
    AppMethodBeat.o(113945);
    return paramc;
  }

  protected final c r(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113944);
    paramString = g.g(paramString, paramArrayOfByte);
    AppMethodBeat.o(113944);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.v
 * JD-Core Version:    0.6.2
 */