package com.tencent.mm.plugin.gwallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends Exception
{
  c npI;

  public a(int paramInt, String paramString)
  {
    this(new c(paramInt, paramString));
    AppMethodBeat.i(41689);
    AppMethodBeat.o(41689);
  }

  private a(c paramc)
  {
    this(paramc, null);
  }

  private a(c paramc, Exception paramException)
  {
    super(paramc.nqb, paramException);
    this.npI = paramc;
  }

  public a(String paramString, Exception paramException)
  {
    this(new c(-1001, paramString), paramException);
    AppMethodBeat.i(41690);
    AppMethodBeat.o(41690);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.a
 * JD-Core Version:    0.6.2
 */