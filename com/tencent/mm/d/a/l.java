package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public final class l
{
  public final c chO;
  public final e chP;
  public final LinkedList<n> chQ;
  private final FutureTask<V8Context> chR;
  public final f chr;

  public l(c paramc, f paramf, l.a parama)
  {
    AppMethodBeat.i(113846);
    this.chQ = new LinkedList();
    this.chO = paramc;
    this.chR = new FutureTask(new l.1(this, parama));
    paramc.k(this.chR);
    paramc = paramf;
    if (paramf == null)
      paramc = new s();
    this.chr = paramc;
    this.chP = new k(this);
    this.chO.k(new l.5(this));
    AppMethodBeat.o(113846);
  }

  public final V8Context CB()
  {
    AppMethodBeat.i(113847);
    try
    {
      V8Context localV8Context = (V8Context)this.chR.get(10L, TimeUnit.SECONDS);
      AppMethodBeat.o(113847);
      return localV8Context;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.J2V8.V8ContextEngine", localException, "getV8Context failed", new Object[0]);
        Object localObject = null;
      }
    }
  }

  public final void a(int paramInt, h paramh)
  {
    AppMethodBeat.i(113850);
    this.chO.a(paramInt, paramh);
    AppMethodBeat.o(113850);
  }

  public final void a(final String paramString, final l.b paramb)
  {
    AppMethodBeat.i(113848);
    this.chO.k(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(113840);
        Object localObject;
        if (paramb != null)
        {
          localObject = l.this.CB().executeScript(paramString);
          l.b localb = paramb;
          if (localObject == null)
          {
            localObject = null;
            localb.ds((String)localObject);
            AppMethodBeat.o(113840);
          }
        }
        while (true)
        {
          return;
          localObject = localObject.toString();
          break;
          l.this.CB().executeVoidScript(paramString);
          AppMethodBeat.o(113840);
        }
      }
    });
    AppMethodBeat.o(113848);
  }

  public final void a(final String paramString1, final String paramString2, final l.b paramb)
  {
    AppMethodBeat.i(113849);
    this.chO.k(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(113841);
        ab.d("MicroMsg.J2V8.V8ContextEngine", "eval with script(%s)", new Object[] { paramString1 });
        Object localObject;
        if (paramb != null)
        {
          localObject = l.this.CB().executeScript(paramString2, paramString1, 0);
          l.b localb = paramb;
          if (localObject == null)
          {
            localObject = null;
            localb.ds((String)localObject);
            AppMethodBeat.o(113841);
          }
        }
        while (true)
        {
          return;
          localObject = localObject.toString();
          break;
          l.this.CB().executeVoidScript(paramString2, paramString1, 0);
          AppMethodBeat.o(113841);
        }
      }
    });
    AppMethodBeat.o(113849);
  }

  public final void destroy()
  {
    AppMethodBeat.i(113851);
    this.chO.l(new l.11(this));
    AppMethodBeat.o(113851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.l
 * JD-Core Version:    0.6.2
 */