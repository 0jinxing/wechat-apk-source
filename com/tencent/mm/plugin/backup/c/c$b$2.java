package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.g.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

final class c$b$2
  implements c.c
{
  c$b$2(c.b paramb)
  {
  }

  public final void a(com.tencent.mm.plugin.backup.g.c paramc)
  {
    AppMethodBeat.i(17179);
    long l1 = bo.anU();
    c.a locala = this.jsa.jrQ;
    long l2 = paramc.aUj();
    boolean bool1 = this.jsa.hkm;
    long l3 = locala.jrM.get();
    boolean bool2;
    label81: long l4;
    if (locala.jrM.get() >= 8388608L)
    {
      bool2 = true;
      if (locala.jrM.get() < 16777216L)
        break label383;
      bool3 = true;
      ab.v("MicroMsg.BackupPackAndSend", "MemoryChecker.waitMemoryValid %b inSize:%d sum:%d  [%b,%b]", new Object[] { Boolean.valueOf(bool1), Long.valueOf(l2), Long.valueOf(l3), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if (locala.jrM.get() + l2 >= 8388608L)
        locala.jrN.close();
      if (locala.jrM.get() >= 16777216L)
        locala.jrO.close();
      l4 = bo.anU();
      if (!locala.jrL.jrD)
      {
        long l5 = locala.jrM.get();
        if (!bool1)
          break label389;
        l3 = 16777216L;
        label217: if (l5 >= l3)
          break label409;
        locala.jrM.addAndGet(l2);
        l3 = bo.gb(l4);
        l4 = locala.jrM.get();
        if (locala.jrM.get() < 8388608L)
          break label397;
        bool2 = true;
        label271: if (locala.jrM.get() < 16777216L)
          break label403;
      }
    }
    label389: label397: label403: for (boolean bool3 = true; ; bool3 = false)
    {
      ab.v("MicroMsg.BackupPackAndSend", "MemoryChecker.waitMemoryValid Out:%d %b inSize:%d sum:%d  [%b,%b]", new Object[] { Long.valueOf(l3), Boolean.valueOf(bool1), Long.valueOf(l2), Long.valueOf(l4), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      this.jsa.jrP.offer(new c.b.2.1(this, paramc, l1));
      AppMethodBeat.o(17179);
      return;
      bool2 = false;
      break;
      label383: bool3 = false;
      break label81;
      l3 = 8388608L;
      break label217;
      bool2 = false;
      break label271;
    }
    label409: if (bool1);
    for (ai localai = locala.jrO; ; localai = locala.jrN)
    {
      localai.doJ();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.2
 * JD-Core Version:    0.6.2
 */