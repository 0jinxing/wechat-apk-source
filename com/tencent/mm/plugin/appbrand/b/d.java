package com.tencent.mm.plugin.appbrand.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.l;
import com.tencent.mm.d.a.t;
import com.tencent.mm.plugin.appbrand.h.r;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.w;
import com.tencent.mm.sdk.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bj;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d extends i
{
  final String TAG = this.mName;
  final com.tencent.mm.plugin.appbrand.i gPI;
  final d.d gWB;
  final d.a gWC;
  final e gWD;
  final d.c gWE;
  final d.b gWF;
  public final AtomicBoolean gWG = new AtomicBoolean(false);
  private final AtomicBoolean gWH = new AtomicBoolean(false);
  private final AtomicReference<com.tencent.mm.sdk.d.c> gWI = new AtomicReference(null);
  private final AtomicReference<com.tencent.mm.sdk.d.c> gWJ = new AtomicReference(null);
  private com.tencent.mm.sdk.d.c gWK = null;

  d(com.tencent.mm.plugin.appbrand.i parami)
  {
    super("MicroMsg.AppBrand.AppRunningStateMachine[" + parami.mAppId + "]", parami.atd());
    this.gPI = parami;
    this.gWE = new d.c(this, this);
    this.gWF = new d.b(this, this);
    this.gWC = new d.a(this, this, parami);
    this.gWB = new d.d(this, this);
    this.gWD = new e(this);
    parami = new d.1(this);
    if (Looper.myLooper() == this.xCt.getLooper())
      parami.run();
    while (true)
    {
      return;
      this.gWH.set(true);
      this.xCt.post(parami);
    }
  }

  private b a(a parama)
  {
    if ((parama == this.gWC) || (parama == this.gWE) || (parama == this.gWF))
      parama = b.gWu;
    while (true)
    {
      return parama;
      if (parama == this.gWD)
        parama = b.gWv;
      else if (parama == this.gWB)
        parama = b.gWt;
      else
        parama = b.gWt;
    }
  }

  private b awA()
  {
    if (this.gWG.get())
      localObject = b.gWw;
    while (true)
    {
      return localObject;
      localObject = (com.tencent.mm.sdk.d.c)this.gWI.get();
      if (localObject != null)
      {
        localObject = a((a)localObject);
      }
      else
      {
        localObject = (com.tencent.mm.sdk.d.c)this.gWJ.get();
        if (localObject == null)
          break;
        localObject = a((a)localObject);
      }
    }
    if (Thread.currentThread().getId() != this.xCt.getLooper().getThread().getId());
    for (Object localObject = (a)new d.4(this).b(new ak(this.xCt.getLooper())); ; localObject = super.dpQ())
    {
      localObject = a((a)localObject);
      break;
    }
  }

  public abstract void a(b paramb);

  final void a(h paramh)
  {
    this.gWI.set(null);
    this.gWJ.set(paramh);
    Object localObject = dpP();
    if ((localObject != null) && (((Message)localObject).what == -2))
      this.gWK = paramh;
    while (true)
    {
      return;
      localObject = this.gWK;
      this.gWK = paramh;
      if ((localObject != null) && (a((a)localObject) != a(paramh)))
        a(a(paramh));
    }
  }

  public final void avC()
  {
    super.avC();
    if (this.xCt.getLooper().getThread().getId() != Looper.getMainLooper().getThread().getId())
      this.xCt.post(new d.6(this));
  }

  abstract void awy();

  public final b awz()
  {
    Object localObject = this.xCt;
    if (localObject == null)
      localObject = b.gWw;
    while (true)
    {
      return localObject;
      if ((this.gWH.get()) && (Thread.currentThread().getId() != ((Handler)localObject).getLooper().getThread().getId()))
      {
        if (al.isMainThread())
        {
          com.tencent.mm.sdk.d.c localc = (com.tencent.mm.sdk.d.c)this.gWJ.get();
          boolean bool = this.gWG.get();
          ab.i(this.TAG, "getRunningStateExport, pending change in sm-looper(%d) but query from main-looper, cached-state=%s, stopped=%b", new Object[] { Long.valueOf(((Handler)localObject).getLooper().getThread().getId()), localc, Boolean.valueOf(bool) });
          if (localc != null)
            localObject = a(localc);
          else if (bool)
            localObject = b.gWw;
          else
            localObject = b.gWt;
        }
        else
        {
          localObject = (b)new d.3(this).b(new ak(((Handler)localObject).getLooper()));
        }
      }
      else
        localObject = awA();
    }
  }

  public final boolean i(Message paramMessage)
  {
    if (paramMessage.what != 1000);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void j(Message paramMessage)
  {
    super.j(paramMessage);
    Object localObject = super.dpQ();
    String str = this.TAG;
    int i = paramMessage.what;
    if (localObject == null);
    for (localObject = "NULL"; ; localObject = ((a)localObject).getName())
    {
      ab.i(str, "unhandledMessage(%d) state=%s", new Object[] { Integer.valueOf(i), localObject });
      this.gWH.set(false);
      if ((3 == paramMessage.what) && (this.xCt.hasMessages(1)))
        super.sendMessage(3);
      return;
    }
  }

  public final void nt(int paramInt)
  {
    this.gWH.set(true);
    if (dpP() == null)
      super.sendMessage(paramInt);
    while (true)
    {
      return;
      super.Mc(paramInt);
    }
  }

  public final void start()
  {
    if (this.gWG.get());
    while (true)
    {
      return;
      if (Looper.myLooper() == this.xCt.getLooper())
        super.start();
      else
        this.xCt.post(new d.2(this));
    }
  }

  final class e extends h
  {
    e(i arg2)
    {
      super();
    }

    public final void enter()
    {
      AppMethodBeat.i(86861);
      super.enter();
      d.this.xCt.sendEmptyMessageDelayed(11, d.this.gPI.ye().hhc * 1000L);
      Object localObject = d.d(d.this);
      if (localObject != null)
      {
        ((r)localObject).pause();
        localObject = d.this.gPI.xT().gPJ.gQj.ciF.values().iterator();
        while (((Iterator)localObject).hasNext())
          ((l)((Iterator)localObject).next()).chO.pause();
      }
      AppMethodBeat.o(86861);
    }

    public final void exit()
    {
      AppMethodBeat.i(86862);
      super.exit();
      d.this.xCt.removeMessages(11);
      AppMethodBeat.o(86862);
    }

    public final String getName()
    {
      AppMethodBeat.i(86860);
      String str = d.this.mName + "|Suspend";
      AppMethodBeat.o(86860);
      return str;
    }

    public final boolean k(Message paramMessage)
    {
      boolean bool = true;
      AppMethodBeat.i(86863);
      switch (paramMessage.what)
      {
      default:
        bool = super.k(paramMessage);
        AppMethodBeat.o(86863);
      case 3:
      case 11:
      }
      while (true)
      {
        return bool;
        d.a(d.this, d.this.gWB);
        AppMethodBeat.o(86863);
        continue;
        ab.i(d.this.TAG, "suspend timeout");
        d.this.awy();
        AppMethodBeat.o(86863);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.d
 * JD-Core Version:    0.6.2
 */