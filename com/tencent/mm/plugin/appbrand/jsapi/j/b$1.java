package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements c.a
{
  b$1(b paramb)
  {
  }

  public final void a(String paramString, com.tencent.mm.plugin.appbrand.b.b paramb)
  {
    AppMethodBeat.i(131386);
    if ((paramb == com.tencent.mm.plugin.appbrand.b.b.gWu) && (b.a(this.hTf).equals(paramString)))
    {
      ab.i(b.access$100(), "hy: appbrand change to background");
      j.kzW.a(new b.1.1(this), j.a.kBj);
    }
    AppMethodBeat.o(131386);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.j.b.1
 * JD-Core Version:    0.6.2
 */