package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b$a
{
  static
  {
    AppMethodBeat.i(108106);
    icb = new a("NOT_YET_CONNECTED", 0);
    icc = new a("CONNECTING", 1);
    icd = new a("OPEN", 2);
    ice = new a("CLOSING", 3);
    icf = new a("CLOSED", 4);
    icg = new a[] { icb, icc, icd, ice, icf };
    AppMethodBeat.o(108106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.b.a
 * JD-Core Version:    0.6.2
 */