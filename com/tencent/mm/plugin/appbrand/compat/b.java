package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.sdk.b.a;

final class b
  implements com.tencent.mm.plugin.appbrand.compat.a.b
{
  public final void a(String paramString, h.a parama, h.b paramb)
  {
    AppMethodBeat.i(135460);
    fk localfk = new fk();
    localfk.czf.op = 1;
    localfk.czf.fileName = paramString;
    localfk.czf.czh = true;
    localfk.czf.com = true;
    localfk.czf.czi = parama;
    localfk.czf.czj = paramb;
    a.xxA.m(localfk);
    AppMethodBeat.o(135460);
  }

  public final void pause()
  {
    AppMethodBeat.i(135461);
    fk localfk = new fk();
    localfk.czf.op = 4;
    a.xxA.m(localfk);
    AppMethodBeat.o(135461);
  }

  public final void stop()
  {
    AppMethodBeat.i(135462);
    fk localfk = new fk();
    localfk.czf.op = 2;
    a.xxA.m(localfk);
    AppMethodBeat.o(135462);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.compat.b
 * JD-Core Version:    0.6.2
 */