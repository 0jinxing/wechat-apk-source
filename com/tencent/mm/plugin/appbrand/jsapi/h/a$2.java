package com.tencent.mm.plugin.appbrand.jsapi.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.j.d;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements com.tencent.mm.plugin.appbrand.j.a.a
{
  a$2(a parama, h paramh)
  {
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(114375);
    ab.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: module name: %s progress: %s", new Object[] { this.hRn.hRm, paramd.toString() });
    this.hRn.mTotalSize = paramd.awl();
    a.a.a(this.hwr, this.hRn.hvr, "progressUpdate", this.hRn.hRm, paramd.getProgress(), paramd.awk(), paramd.awl());
    AppMethodBeat.o(114375);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.h.a.2
 * JD-Core Version:    0.6.2
 */