package com.tencent.mm.plugin.appbrand.config.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$c
{
  a.a hiS;
  a.b hiT;
  String name;
  boolean success;

  private a$c(a.a parama, a.b paramb, boolean paramBoolean, String paramString)
  {
    this.hiS = parama;
    this.hiT = paramb;
    this.success = paramBoolean;
    this.name = paramString;
  }

  final void execute()
  {
    AppMethodBeat.i(86910);
    ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "Notify Listener[%s]", new Object[] { this.name });
    if (this.hiS == null)
    {
      ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "PendingNotify: Listener is null when execute.");
      AppMethodBeat.o(86910);
    }
    while (true)
    {
      return;
      this.hiS.a(this.hiT, this.success);
      AppMethodBeat.o(86910);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.a.c
 * JD-Core Version:    0.6.2
 */