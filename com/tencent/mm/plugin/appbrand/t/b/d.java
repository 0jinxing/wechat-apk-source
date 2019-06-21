package com.tencent.mm.plugin.appbrand.t.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.e.i;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class d extends c
{
  public final com.tencent.mm.plugin.appbrand.t.e.c a(com.tencent.mm.plugin.appbrand.t.e.a parama, i parami)
  {
    AppMethodBeat.i(73249);
    super.a(parama, parami);
    parami.Ep("WebSocket Protocol Handshake");
    parami.put("Server", "Java-WebSocket");
    Calendar localCalendar = Calendar.getInstance();
    parama = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
    parama.setTimeZone(TimeZone.getTimeZone("GMT"));
    parami.put("Date", parama.format(localCalendar.getTime()));
    AppMethodBeat.o(73249);
    return parami;
  }

  public final a aOm()
  {
    AppMethodBeat.i(73250);
    d locald = new d();
    AppMethodBeat.o(73250);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.b.d
 * JD-Core Version:    0.6.2
 */