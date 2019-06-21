package com.tencent.mm.plugin.appbrand.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public enum e$b
{
  private AtomicBoolean cnv;
  Map<Integer, e.a> inB;
  private Runnable inC;

  static
  {
    AppMethodBeat.i(132291);
    inA = new b("INSTANCE");
    inD = new b[] { inA };
    AppMethodBeat.o(132291);
  }

  private e$b()
  {
    AppMethodBeat.i(132283);
    this.inB = new ConcurrentHashMap();
    this.cnv = new AtomicBoolean(true);
    this.inC = new e.b.1(this);
    AppMethodBeat.o(132283);
  }

  final void aIx()
  {
    boolean bool1 = false;
    boolean bool2 = true;
    try
    {
      AppMethodBeat.i(132286);
      g.RS();
      al.af(this.inC);
      if (this.cnv.get())
      {
        ab.d("MicroMsg.WxaUpdateableMsgService", "isPause, not sendUpdatableMsgRequest");
        AppMethodBeat.o(132286);
      }
      while (true)
      {
        return;
        if (this.inB.size() > 0)
          break;
        ab.d("MicroMsg.WxaUpdateableMsgService", "sGetUpdatableMsgWorkerMap is empty, not sendUpdatableMsgRequest");
        AppMethodBeat.o(132286);
      }
    }
    finally
    {
    }
    long l = 9223372036854775807L;
    Iterator localIterator = this.inB.values().iterator();
    label100: e.a locala;
    if (localIterator.hasNext())
    {
      locala = (e.a)localIterator.next();
      if (locala.aIv())
      {
        l = 0L;
        bool1 = bool2;
      }
    }
    while (true)
    {
      ab.d("MicroMsg.WxaUpdateableMsgService", "needUpdate:%b minDelayTime:%d", new Object[] { Boolean.valueOf(bool1), Long.valueOf(l) });
      if (!bool1)
      {
        AppMethodBeat.o(132286);
        break;
        if (locala.iny < 0)
          break label100;
        l = Math.min(locala.iny, l);
        bool1 = true;
        break label100;
      }
      g.RS().m(this.inC, l * 1000L);
      AppMethodBeat.o(132286);
      break;
    }
  }

  public final void start()
  {
    try
    {
      AppMethodBeat.i(132284);
      this.cnv.set(false);
      aIx();
      AppMethodBeat.o(132284);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void stop()
  {
    try
    {
      AppMethodBeat.i(132285);
      this.cnv.set(true);
      AppMethodBeat.o(132285);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.e.b
 * JD-Core Version:    0.6.2
 */