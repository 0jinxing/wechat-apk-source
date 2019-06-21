package com.tencent.mm.plugin.appbrand.report.model;

import android.support.v4.f.k.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

final class j$b
  implements k.a<j.a>
{
  private final Queue<j.a> cnx;

  private j$b()
  {
    AppMethodBeat.i(132620);
    this.cnx = new ConcurrentLinkedQueue();
    AppMethodBeat.o(132620);
  }

  public final boolean a(j.a parama)
  {
    AppMethodBeat.i(132622);
    boolean bool = this.cnx.offer(parama);
    AppMethodBeat.o(132622);
    return bool;
  }

  public final j.a aLu()
  {
    AppMethodBeat.i(132621);
    j.a locala = (j.a)this.cnx.poll();
    if (locala == null)
    {
      locala = new j.a((byte)0);
      AppMethodBeat.o(132621);
    }
    while (true)
    {
      return locala;
      AppMethodBeat.o(132621);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.j.b
 * JD-Core Version:    0.6.2
 */