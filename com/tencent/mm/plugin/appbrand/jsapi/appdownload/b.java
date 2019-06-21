package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.ipc.d;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class b extends p
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "onDownloadAppStateChange";
  private static HashMap<String, b> hzE;
  private MMToClientEvent.c hzD;

  static
  {
    AppMethodBeat.i(130650);
    hzE = new HashMap();
    AppMethodBeat.o(130650);
  }

  private b(q paramq)
  {
    AppMethodBeat.i(130646);
    this.hzD = new b.1(this, paramq);
    MMToClientEvent.a(paramq.getAppId(), this.hzD);
    paramq.getRuntime().gNN.a(new b.2(this, paramq));
    AppMethodBeat.o(130646);
  }

  public static void a(AppbrandDownloadState paramAppbrandDownloadState)
  {
    AppMethodBeat.i(130648);
    Iterator localIterator = hzE.keySet().iterator();
    while (localIterator.hasNext())
      d.a((String)localIterator.next(), paramAppbrandDownloadState);
    AppMethodBeat.o(130648);
  }

  public static void e(q paramq)
  {
    AppMethodBeat.i(130647);
    if (hzE.containsKey(paramq.getAppId()))
      AppMethodBeat.o(130647);
    while (true)
    {
      return;
      b localb = new b(paramq);
      hzE.put(paramq.getAppId(), localb);
      AppMethodBeat.o(130647);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.b
 * JD-Core Version:    0.6.2
 */