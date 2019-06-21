package com.tencent.mm.plugin.appbrand.jsapi.version;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a
{
  public final String hYi;

  static
  {
    AppMethodBeat.i(131500);
    hYe = new a("UPDATING", 0, "updating");
    hYf = new a("NO_UPDATE", 1, "noUpdate");
    hYg = new a("UPDATE_READY", 2, "updateReady");
    hYh = new a("UPDATE_FAILED", 3, "updateFailed");
    hYj = new a[] { hYe, hYf, hYg, hYh };
    AppMethodBeat.o(131500);
  }

  private a(String paramString)
  {
    this.hYi = paramString;
  }

  public static a BN(String paramString)
  {
    AppMethodBeat.i(131499);
    for (a locala : values())
      if (locala.hYi.equals(paramString))
      {
        AppMethodBeat.o(131499);
        return locala;
      }
    paramString = new IllegalArgumentException(String.format("Invalid name %s", new Object[] { paramString }));
    AppMethodBeat.o(131499);
    throw paramString;
  }

  public final String toString()
  {
    return this.hYi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.a
 * JD-Core Version:    0.6.2
 */