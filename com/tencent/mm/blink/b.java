package com.tencent.mm.blink;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b
{
  private static b ebe;
  private final Queue<a> ebf;
  private boolean ebg;
  private volatile boolean ebh;
  private boolean ebi;
  private volatile com.tencent.mm.vending.g.c ebj;
  private AtomicBoolean ebk;
  private al ebl;

  static
  {
    AppMethodBeat.i(57719);
    ebe = new b();
    AppMethodBeat.o(57719);
  }

  public b()
  {
    AppMethodBeat.i(57710);
    this.ebf = new LinkedList();
    this.ebg = false;
    this.ebh = false;
    this.ebi = true;
    this.ebj = f.dMn();
    this.ebk = new AtomicBoolean(false);
    this.ebl = new al("pending-stage");
    AppMethodBeat.o(57710);
  }

  public static b HQ()
  {
    return ebe;
  }

  private boolean HV()
  {
    try
    {
      if ((!this.ebg) || (this.ebi))
      {
        bool = this.ebh;
        if (!bool);
      }
      for (boolean bool = true; ; bool = false)
        return bool;
    }
    finally
    {
    }
  }

  private void HW()
  {
    AppMethodBeat.i(57714);
    a(b.ebq);
    HX();
    AppMethodBeat.o(57714);
  }

  private void HX()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(57715);
        if (!HV())
        {
          AppMethodBeat.o(57715);
          return;
        }
        a locala = (a)this.ebf.poll();
        if (locala != null)
        {
          ab.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s", new Object[] { a.a(locala), a.b(locala).getType() });
          this.ebj.c(locala);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(57715);
    }
  }

  public final void HR()
  {
    try
    {
      this.ebg = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void HS()
  {
    try
    {
      AppMethodBeat.i(57711);
      this.ebi = true;
      if (this.ebg)
        HW();
      AppMethodBeat.o(57711);
      return;
    }
    finally
    {
    }
  }

  public final void HT()
  {
    try
    {
      this.ebi = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void HU()
  {
    try
    {
      AppMethodBeat.i(57712);
      if (this.ebg)
      {
        this.ebg = false;
        HW();
      }
      AppMethodBeat.o(57712);
      return;
    }
    finally
    {
    }
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(57716);
    if (this.ebk.compareAndSet(false, true))
      if (paramb == b.ebo)
      {
        ab.i("MicroMsg.FirstScreenArrangement", "initialize pending plugins from %s", new Object[] { paramb });
        com.tencent.mm.kernel.a.c.Sa().Sd();
      }
    while (true)
    {
      try
      {
        this.ebh = true;
        HX();
        return;
      }
      finally
      {
        AppMethodBeat.o(57716);
      }
      Object localObject = new h(new com.tencent.mm.ci.d(this.ebl.doN()), "pending-stage");
      try
      {
        com.tencent.mm.vending.g.c localc = this.ebj.b((com.tencent.mm.vending.h.d)localObject);
        localObject = new com/tencent/mm/blink/b$1;
        ((1)localObject).<init>(this, paramb);
        localc.c((a)localObject);
        AppMethodBeat.o(57716);
        continue;
      }
      finally
      {
        AppMethodBeat.o(57716);
      }
      AppMethodBeat.o(57716);
    }
  }

  public final void o(Runnable paramRunnable)
  {
    try
    {
      AppMethodBeat.i(57713);
      com.tencent.mm.vending.h.d locald = com.tencent.mm.vending.h.d.dMq();
      if (!(locald instanceof com.tencent.mm.vending.h.c))
        g.a(locald.getType(), locald);
      Object localObject;
      a locala;
      if (!HV())
      {
        ab.i("MicroMsg.FirstScreenArrangement", "arrange first screen runnable: %s, %s, %s, %s", new Object[] { Boolean.valueOf(this.ebg), Boolean.valueOf(this.ebi), Boolean.valueOf(this.ebh), this.ebf });
        localObject = this.ebf;
        locala = new com/tencent/mm/blink/b$a;
        locala.<init>(paramRunnable, locald);
        ((Queue)localObject).add(locala);
        AppMethodBeat.o(57713);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement arrange runnable postToMainThread %s", new Object[] { paramRunnable });
        localObject = this.ebj;
        locala = new com/tencent/mm/blink/b$a;
        locala.<init>(paramRunnable, locald);
        ((com.tencent.mm.vending.g.c)localObject).c(locala);
        AppMethodBeat.o(57713);
      }
    }
    finally
    {
    }
    throw paramRunnable;
  }

  static final class a
    implements e
  {
    private com.tencent.mm.vending.h.d ceu;
    private Runnable mRunnable;

    public a(Runnable paramRunnable, com.tencent.mm.vending.h.d paramd)
    {
      this.mRunnable = paramRunnable;
      this.ceu = paramd;
    }

    public final String HZ()
    {
      AppMethodBeat.i(57706);
      String str;
      if ((this.ceu instanceof com.tencent.mm.vending.h.c))
        if ((com.tencent.mm.vending.h.d.dMq() instanceof com.tencent.mm.vending.h.c))
        {
          str = com.tencent.mm.vending.h.d.zYp.c;
          AppMethodBeat.o(57706);
        }
      while (true)
      {
        return str;
        str = com.tencent.mm.vending.h.d.dMq().getType();
        AppMethodBeat.o(57706);
        continue;
        str = this.ceu.getType();
        AppMethodBeat.o(57706);
      }
    }

    public final Object call(Object paramObject)
    {
      AppMethodBeat.i(57705);
      ab.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s", new Object[] { this.mRunnable, this.ceu.getType() });
      this.mRunnable.run();
      AppMethodBeat.o(57705);
      return null;
    }
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(57709);
      ebo = new b("Now", 0);
      ebp = new b("Timeout", 1);
      ebq = new b("FirstScreen", 2);
      ebr = new b[] { ebo, ebp, ebq };
      AppMethodBeat.o(57709);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.blink.b
 * JD-Core Version:    0.6.2
 */