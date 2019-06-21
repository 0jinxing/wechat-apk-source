package com.tencent.mm.plugin.appbrand.jsapi.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;

final class a$2
  implements f.c
{
  a$2(a parama)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(131632);
    a.a(this.icu).cleanup();
    AppMethodBeat.o(131632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.a.2
 * JD-Core Version:    0.6.2
 */