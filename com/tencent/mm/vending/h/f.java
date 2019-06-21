package com.tencent.mm.vending.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.c.a;

public final class f
{
  private volatile d zYs;
  volatile a zYt;

  public f(d paramd, a parama)
  {
    AppMethodBeat.i(126124);
    c(paramd);
    this.zYt = parama;
    AppMethodBeat.o(126124);
  }

  public final void a(a parama, Object paramObject, boolean paramBoolean)
  {
    label171: label189: 
    while (true)
    {
      d locald;
      Object localObject;
      try
      {
        AppMethodBeat.i(126125);
        locald = this.zYs;
        if (!(parama instanceof e))
          break label189;
        localObject = (e)parama;
        if ("Vending.ANY".equals(((e)localObject).HZ()))
          break label189;
        locald = g.asU(((e)localObject).HZ());
        if (locald == null)
        {
          if (this.zYt != null)
            this.zYt.interrupt();
          AppMethodBeat.o(126125);
          return;
        }
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("object is not right: ".concat(String.valueOf(paramObject)));
        localObject = new com/tencent/mm/vending/h/f$1;
        ((1)localObject).<init>(this, parama, paramObject, localRuntimeException);
        if (-1L >= 0L)
          break label171;
        if ((paramBoolean) && (g.dMq() == locald))
        {
          ((Runnable)localObject).run();
          AppMethodBeat.o(126125);
          continue;
        }
      }
      finally
      {
      }
      locald.o((Runnable)localObject);
      AppMethodBeat.o(126125);
      continue;
      locald.l((Runnable)localObject, -1L);
      AppMethodBeat.o(126125);
    }
  }

  public final void c(d paramd)
  {
    try
    {
      this.zYs = paramd;
      return;
    }
    finally
    {
      paramd = finally;
    }
    throw paramd;
  }

  public static abstract interface a
  {
    public abstract void cT(Object paramObject);

    public abstract void dMl();

    public abstract void interrupt();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.h.f
 * JD-Core Version:    0.6.2
 */