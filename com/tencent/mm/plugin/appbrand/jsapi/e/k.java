package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.r.m;

final class k
{
  long hKQ = 0L;
  c.a hKR;

  final void aDE()
  {
    AppMethodBeat.i(74750);
    m.runOnUiThread(new k.2(this));
    AppMethodBeat.o(74750);
  }

  final void w(i parami)
  {
    AppMethodBeat.i(74749);
    m.runOnUiThread(new k.1(this, parami));
    AppMethodBeat.o(74749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.k
 * JD-Core Version:    0.6.2
 */