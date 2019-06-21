package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ai;
import java.util.concurrent.LinkedBlockingQueue;

final class c$c
{
  c.a jrQ;
  LinkedBlockingQueue<Object> jsk;
  ai jsl;
  c.b jsm;
  private Runnable jsn;

  public c$c(c paramc)
  {
    AppMethodBeat.i(17192);
    this.jsk = new LinkedBlockingQueue();
    this.jrQ = new c.a(this.jrL, (byte)0);
    this.jsl = new ai();
    this.jsm = null;
    this.jsn = new c.c.1(this);
    d.h(this.jsn, "tagRunnable").start();
    AppMethodBeat.o(17192);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.c
 * JD-Core Version:    0.6.2
 */