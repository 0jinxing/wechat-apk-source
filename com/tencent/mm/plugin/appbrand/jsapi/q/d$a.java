package com.tencent.mm.plugin.appbrand.jsapi.q;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum d$a
{
  public final String value;

  static
  {
    AppMethodBeat.i(126409);
    hXx = new a("None", 0, "none");
    hXy = new a("Mobile_2g", 1, "2g");
    hXz = new a("Mobile_3g", 2, "3g");
    hXA = new a("Mobile_4g", 3, "4g");
    hXB = new a("Wifi", 4, "wifi");
    hXC = new a("Unknown", 5, "unknown");
    hXD = new a[] { hXx, hXy, hXz, hXA, hXB, hXC };
    AppMethodBeat.o(126409);
  }

  private d$a(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.d.a
 * JD-Core Version:    0.6.2
 */