package com.tencent.mm.kernel.a.b;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.b;
import com.tencent.mm.kernel.a.a.a.a;
import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.h.h;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import junit.framework.Assert;

public final class e<T>
{
  private static e eLN = null;
  private Queue<c> eLG;
  private int eLH;
  private volatile a eLI;
  private volatile boolean eLJ;
  private final byte[] eLK;
  private volatile a<Void, f.a> eLL;
  private volatile c<T> eLM;

  private e()
  {
    AppMethodBeat.i(123311);
    this.eLG = new LinkedList();
    this.eLJ = false;
    this.eLK = new byte[0];
    AppMethodBeat.o(123311);
  }

  public static e Sq()
  {
    return eLN;
  }

  public static e Sr()
  {
    AppMethodBeat.i(123310);
    if (eLN == null)
      eLN = new e();
    e locale = eLN;
    AppMethodBeat.o(123310);
    return locale;
  }

  private c Su()
  {
    try
    {
      AppMethodBeat.i(123319);
      c localc = (c)this.eLG.poll();
      AppMethodBeat.o(123319);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(final c paramc, final f.a<T> parama)
  {
    AppMethodBeat.i(123323);
    paramc.eLR.o(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(123306);
        f.a locala = parama;
        Object localObject = e.a(e.this);
        if (!locala.eLB)
        {
          locala.eMc.eMd.dOV();
          if (!locala.eLB)
          {
            ((a)localObject).call(locala);
            ab.d("MMSkeleton.ParallelsDependencies", "consume call functional %s, node %s", new Object[] { localObject, locala });
            locala.eLB = true;
          }
          locala.eMc.eMd.done();
        }
        e.b(e.this).a(parama);
        localObject = e.b(e.this).Sp();
        if (localObject == null)
        {
          e.a(e.this, paramc);
          AppMethodBeat.o(123306);
        }
        while (true)
        {
          return;
          e.a(e.this, paramc, (f.a)localObject);
          e.c(e.this);
          AppMethodBeat.o(123306);
        }
      }
    });
    AppMethodBeat.o(123323);
  }

  private boolean a(c paramc)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(123320);
      this.eLG.add(paramc);
      j.d("MMSkeleton.Parallels", "Parallels check threads idle. %s of %s", new Object[] { Integer.valueOf(this.eLG.size()), Integer.valueOf(this.eLH) });
      if (this.eLG.size() == this.eLH)
        AppMethodBeat.o(123320);
      while (true)
      {
        return bool;
        AppMethodBeat.o(123320);
        bool = false;
      }
    }
    finally
    {
    }
    throw paramc;
  }

  private void active()
  {
    AppMethodBeat.i(123322);
    c localc;
    while (true)
    {
      localc = Su();
      if (localc == null)
        break label48;
      f.a locala = this.eLM.Sp();
      if (locala == null)
        break;
      a(localc, locala);
    }
    b(localc);
    AppMethodBeat.o(123322);
    while (true)
    {
      return;
      label48: AppMethodBeat.o(123322);
    }
  }

  private void b(c arg1)
  {
    AppMethodBeat.i(123321);
    if (a(???));
    while (true)
    {
      synchronized (this.eLK)
      {
        if (this.eLJ)
          j.i("MMSkeleton.Parallels", "Parallels notify done", new Object[0]);
        this.eLJ = false;
        this.eLI.Sv();
        AppMethodBeat.o(123321);
        return;
      }
      AppMethodBeat.o(123321);
    }
  }

  public final void Ss()
  {
    AppMethodBeat.i(123316);
    this.eLI.Ss();
    AppMethodBeat.o(123316);
  }

  public final List<c> St()
  {
    try
    {
      AppMethodBeat.i(123318);
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>(this.eLG);
      AppMethodBeat.o(123318);
      return localLinkedList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(a parama, a<Void, f.a> parama1, c<T> paramc, String paramString)
  {
    AppMethodBeat.i(123315);
    if (a(parama, parama1, paramc))
    {
      paramc.prepare();
      start(paramString);
      Ss();
    }
    AppMethodBeat.o(123315);
  }

  public final boolean a(a parama, a<Void, f.a> parama1, c<T> paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(123314);
    synchronized (this.eLK)
    {
      if (this.eLJ)
      {
        ab.w("MMSkeleton.Parallels", "Arrange parallels task failed. It's busy on working.");
        Assert.assertTrue(false);
        AppMethodBeat.o(123314);
        return bool;
      }
      this.eLI = parama;
      this.eLL = parama1;
      this.eLM = paramc;
      bool = true;
      AppMethodBeat.o(123314);
    }
  }

  public final void init(int paramInt)
  {
    try
    {
      AppMethodBeat.i(123312);
      for (int i = 0; i < paramInt; i++)
      {
        Queue localQueue = this.eLG;
        Object localObject1 = "parallels-".concat(String.valueOf(i));
        HandlerThread localHandlerThread = new android/os/HandlerThread;
        localHandlerThread.<init>((String)localObject1, -8);
        localHandlerThread.start();
        localObject1 = new com/tencent/mm/kernel/a/b/e$c;
        ((c)localObject1).<init>();
        ((c)localObject1).cet = localHandlerThread;
        localQueue.add(localObject1);
      }
      this.eLH = paramInt;
      AppMethodBeat.o(123312);
      return;
    }
    finally
    {
    }
  }

  public final void prepare()
  {
    try
    {
      AppMethodBeat.i(123313);
      for (int i = 0; i < this.eLH; i++)
      {
        c localc = (c)((LinkedList)this.eLG).get(i);
        Handler localHandler = new android/os/Handler;
        localHandler.<init>(localc.cet.getLooper());
        h localh = new com/tencent/mm/vending/h/h;
        localh.<init>(localHandler, localc.cet.getName());
        localc.handler = localHandler;
        localc.eLR = localh;
      }
      AppMethodBeat.o(123313);
      return;
    }
    finally
    {
    }
  }

  public final void start(String paramString)
  {
    AppMethodBeat.i(123317);
    j.i("MMSkeleton.Parallels", "Start working. For %s", new Object[] { paramString });
    synchronized (this.eLK)
    {
      this.eLJ = true;
      active();
      AppMethodBeat.o(123317);
      return;
    }
  }

  public static abstract interface a
  {
    public abstract void Ss();

    public abstract void Sv();
  }

  public static final class b
    implements e.a
  {
    private final byte[] eHH;

    public b()
    {
      AppMethodBeat.i(123307);
      this.eHH = new byte[] { 0 };
      AppMethodBeat.o(123307);
    }

    public final void Ss()
    {
      AppMethodBeat.i(123308);
      try
      {
        synchronized (this.eHH)
        {
          if (this.eHH[0] == 0)
          {
            j.i("MMSkeleton.Parallels", "Waiting for lock(%s)", new Object[] { this.eHH });
            this.eHH.wait();
            AppMethodBeat.o(123308);
            return;
          }
          j.i("MMSkeleton.Parallels", "Not need wait for lock(%s)", new Object[] { this.eHH });
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
        {
          ab.printErrStackTrace("MMSkeleton.Parallels", localInterruptedException, "", new Object[0]);
          AppMethodBeat.o(123308);
        }
      }
    }

    public final void Sv()
    {
      AppMethodBeat.i(123309);
      synchronized (this.eHH)
      {
        this.eHH[0] = ((byte)1);
        this.eHH.notify();
        j.i("MMSkeleton.Parallels", "Lock(%s) notified", new Object[] { this.eHH });
        AppMethodBeat.o(123309);
        return;
      }
    }
  }

  public static final class c
  {
    public HandlerThread cet;
    h eLR;
    Handler handler;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.a.b.e
 * JD-Core Version:    0.6.2
 */