package com.tencent.luggage.bridge.impl;

import com.tencent.luggage.bridge.a.a.a;
import com.tencent.luggage.bridge.a.a.b;
import com.tencent.luggage.bridge.a.a.c;
import com.tencent.luggage.bridge.impl.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vfs.FileSystemManager;

public class a
  implements a.b
{
  final com.tencent.mm.plugin.appbrand.d.a bOW;

  public a()
  {
    AppMethodBeat.i(90759);
    this.bOW = new b();
    AppMethodBeat.o(90759);
  }

  public void a(a.a parama)
  {
    AppMethodBeat.i(90761);
    parama.a(com.tencent.mm.plugin.appbrand.d.a.class, this.bOW);
    AppMethodBeat.o(90761);
  }

  public void a(a.c paramc)
  {
    AppMethodBeat.i(90760);
    FileSystemManager.setContext(ah.getContext());
    paramc.a(com.tencent.mm.plugin.appbrand.d.a.class, this.bOW);
    AppMethodBeat.o(90760);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.a
 * JD-Core Version:    0.6.2
 */