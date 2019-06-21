package com.tencent.mm.plugin.appbrand.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.g;
import com.tencent.mm.d.a.l;

public class c extends a
{
  public c()
  {
    this(null, null);
  }

  public c(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString, paramArrayOfByte);
  }

  protected final l a(com.tencent.mm.d.a.c paramc, int paramInt)
  {
    AppMethodBeat.i(113933);
    paramc = paramc.gm(paramInt);
    AppMethodBeat.o(113933);
    return paramc;
  }

  protected com.tencent.mm.d.a.c r(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113932);
    paramString = g.h(paramString, paramArrayOfByte);
    AppMethodBeat.o(113932);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.c
 * JD-Core Version:    0.6.2
 */