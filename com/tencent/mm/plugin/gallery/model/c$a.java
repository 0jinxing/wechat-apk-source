package com.tencent.mm.plugin.gallery.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;

final class c$a
{
  private c$a(c paramc)
  {
  }

  public final void d(az.a parama)
  {
    AppMethodBeat.i(21227);
    if (e.bCa() == null)
    {
      ab.w("MircoMsg.CacheService", "add thread object, but worker thread is null");
      AppMethodBeat.o(21227);
    }
    while (true)
    {
      return;
      e.bCa().X(new c.a.1(this, parama));
      AppMethodBeat.o(21227);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.c.a
 * JD-Core Version:    0.6.2
 */