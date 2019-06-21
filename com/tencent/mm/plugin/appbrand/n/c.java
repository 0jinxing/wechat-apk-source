package com.tencent.mm.plugin.appbrand.n;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public enum c
{
  private Map<c.a, Long> izl;
  private Map<c.a, Long> izm;

  static
  {
    AppMethodBeat.i(91135);
    izk = new c("INSTANCE");
    izn = new c[] { izk };
    AppMethodBeat.o(91135);
  }

  private c()
  {
    AppMethodBeat.i(91133);
    this.izl = new HashMap();
    this.izm = new HashMap();
    AppMethodBeat.o(91133);
  }

  public final void a(c.a parama)
  {
    AppMethodBeat.i(91134);
    this.izl.put(parama, Long.valueOf(SystemClock.elapsedRealtime()));
    AppMethodBeat.o(91134);
  }

  public final String toString()
  {
    return "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.n.c
 * JD-Core Version:    0.6.2
 */