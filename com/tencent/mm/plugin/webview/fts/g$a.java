package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.a;
import com.tencent.mm.plugin.websearch.api.s;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g$a
  implements Comparable
{
  private ThreadPoolExecutor cmi;
  public a ufZ;
  public g.a.a ugn;

  private g$a(g paramg)
  {
    AppMethodBeat.i(5744);
    this.cmi = new ThreadPoolExecutor(0, 10, 120L, TimeUnit.SECONDS, new ArrayBlockingQueue(32));
    AppMethodBeat.o(5744);
  }

  public final void b(s params)
  {
    AppMethodBeat.i(5745);
    if (this.ugn != null)
      this.ugn.jxQ = true;
    this.ugn = new g.a.a(this, (byte)0);
    this.ugn.fpL = params;
    g.a(this.ugk, params);
    this.cmi.execute(this.ugn);
    AppMethodBeat.o(5745);
  }

  public final int compareTo(Object paramObject)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.g.a
 * JD-Core Version:    0.6.2
 */