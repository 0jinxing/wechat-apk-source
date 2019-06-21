package com.tencent.mm.plugin.appbrand.t;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$a
{
  static
  {
    AppMethodBeat.i(73203);
    iSk = new a("NOT_YET_CONNECTED", 0);
    iSl = new a("CONNECTING", 1);
    iSm = new a("OPEN", 2);
    iSn = new a("CLOSING", 3);
    iSo = new a("CLOSED", 4);
    iSp = new a[] { iSk, iSl, iSm, iSn, iSo };
    AppMethodBeat.o(73203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.a.a
 * JD-Core Version:    0.6.2
 */