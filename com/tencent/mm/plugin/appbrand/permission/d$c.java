package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.al;

final class d$c
  implements d.b
{
  private final d.b iwE;

  private d$c(d.b paramb)
  {
    this.iwE = paramb;
  }

  private void aKv()
  {
    AppMethodBeat.i(102263);
    m.aNS().aa(new d.c.1(this));
    AppMethodBeat.o(102263);
  }

  public final void CW(String paramString)
  {
    AppMethodBeat.i(102261);
    if (this.iwE != null)
      this.iwE.CW(paramString);
    aKv();
    AppMethodBeat.o(102261);
  }

  public final void aIX()
  {
    AppMethodBeat.i(102260);
    if (this.iwE != null)
      this.iwE.aIX();
    aKv();
    AppMethodBeat.o(102260);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(102262);
    if (this.iwE != null)
      this.iwE.onCancel();
    aKv();
    AppMethodBeat.o(102262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d.c
 * JD-Core Version:    0.6.2
 */