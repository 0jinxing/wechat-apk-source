package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cc;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandPrepareTask$a$2$2 extends c<cc>
{
  AppBrandPrepareTask$a$2$2(AppBrandPrepareTask.a.2 param2)
  {
    AppMethodBeat.i(131743);
    this.xxI = cc.class.getName().hashCode();
    AppMethodBeat.o(131743);
  }

  private boolean a(cc paramcc)
  {
    AppMethodBeat.i(131744);
    if (paramcc != null)
    {
      dead();
      ab.i("MicroMsg.AppBrandPrepareTask", "prepareCall account notifyAllDone, start real prepare");
    }
    this.igf.igd.aHd();
    AppMethodBeat.o(131744);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.a.2.2
 * JD-Core Version:    0.6.2
 */