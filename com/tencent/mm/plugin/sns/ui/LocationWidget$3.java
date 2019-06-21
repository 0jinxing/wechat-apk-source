package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class LocationWidget$3
  implements c.a
{
  LocationWidget$3(LocationWidget paramLocationWidget)
  {
  }

  public final void b(Addr paramAddr)
  {
    AppMethodBeat.i(38287);
    ab.i("MicroMsg.LocationWidget", "get info %s", new Object[] { paramAddr.toString() });
    if (!LocationWidget.e(this.rko))
      AppMethodBeat.o(38287);
    while (true)
    {
      return;
      LocationWidget.f(this.rko);
      if (!bo.isNullOrNil(LocationWidget.g(this.rko)))
      {
        AppMethodBeat.o(38287);
      }
      else
      {
        LocationWidget.a(this.rko, paramAddr.fBi);
        LocationWidget.f(this.rko);
        AppMethodBeat.o(38287);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.LocationWidget.3
 * JD-Core Version:    0.6.2
 */