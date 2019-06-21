package com.bumptech.glide.c.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.c.h;
import com.bumptech.glide.f.f;
import com.bumptech.glide.h.a.a.c;
import com.bumptech.glide.h.a.b;
import com.bumptech.glide.h.a.b.a;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class k<R>
  implements g.a<R>, a.c
{
  private static final k.a aBF;
  private static final Handler aBG;
  com.bumptech.glide.c.a aAL;
  public final b aAq;
  private final android.support.v4.f.k.a<k<?>> aAr;
  boolean aAz;
  public final List<f> aBH;
  private final k.a aBI;
  boolean aBJ;
  boolean aBK;
  public boolean aBL;
  private p aBM;
  public boolean aBN;
  public List<f> aBO;
  o<?> aBP;
  public g<R> aBQ;
  private final com.bumptech.glide.c.b.c.a aBy;
  public final l aBz;
  private final com.bumptech.glide.c.b.c.a awq;
  final com.bumptech.glide.c.b.c.a awr;
  private final com.bumptech.glide.c.b.c.a awx;
  public h azP;
  boolean azQ;
  u<?> azR;
  public volatile boolean isCancelled;

  static
  {
    AppMethodBeat.i(91831);
    aBF = new k.a();
    aBG = new Handler(Looper.getMainLooper(), new k.b());
    AppMethodBeat.o(91831);
  }

  k(com.bumptech.glide.c.b.c.a parama1, com.bumptech.glide.c.b.c.a parama2, com.bumptech.glide.c.b.c.a parama3, com.bumptech.glide.c.b.c.a parama4, l paraml, android.support.v4.f.k.a<k<?>> parama)
  {
    this(parama1, parama2, parama3, parama4, paraml, parama, aBF);
  }

  private k(com.bumptech.glide.c.b.c.a parama1, com.bumptech.glide.c.b.c.a parama2, com.bumptech.glide.c.b.c.a parama3, com.bumptech.glide.c.b.c.a parama4, l paraml, android.support.v4.f.k.a<k<?>> parama, k.a parama5)
  {
    AppMethodBeat.i(91823);
    this.aBH = new ArrayList(2);
    this.aAq = new b.a();
    this.awr = parama1;
    this.awq = parama2;
    this.aBy = parama3;
    this.awx = parama4;
    this.aBz = paraml;
    this.aAr = parama;
    this.aBI = parama5;
    AppMethodBeat.o(91823);
  }

  public final void a(g<?> paramg)
  {
    AppMethodBeat.i(91829);
    mH().execute(paramg);
    AppMethodBeat.o(91829);
  }

  public final void a(p paramp)
  {
    AppMethodBeat.i(91828);
    this.aBM = paramp;
    aBG.obtainMessage(2, this).sendToTarget();
    AppMethodBeat.o(91828);
  }

  final void a(f paramf)
  {
    AppMethodBeat.i(91824);
    j.om();
    this.aAq.oq();
    if (this.aBL)
    {
      paramf.c(this.aBP, this.aAL);
      AppMethodBeat.o(91824);
    }
    while (true)
    {
      return;
      if (this.aBN)
      {
        paramf.a(this.aBM);
        AppMethodBeat.o(91824);
      }
      else
      {
        this.aBH.add(paramf);
        AppMethodBeat.o(91824);
      }
    }
  }

  final boolean b(f paramf)
  {
    AppMethodBeat.i(91825);
    boolean bool;
    if ((this.aBO != null) && (this.aBO.contains(paramf)))
    {
      bool = true;
      AppMethodBeat.o(91825);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91825);
    }
  }

  public final void c(u<R> paramu, com.bumptech.glide.c.a parama)
  {
    AppMethodBeat.i(91827);
    this.azR = paramu;
    this.aAL = parama;
    aBG.obtainMessage(1, this).sendToTarget();
    AppMethodBeat.o(91827);
  }

  final com.bumptech.glide.c.b.c.a mH()
  {
    com.bumptech.glide.c.b.c.a locala;
    if (this.aBJ)
      locala = this.aBy;
    while (true)
    {
      return locala;
      if (this.aBK)
        locala = this.awx;
      else
        locala = this.awq;
    }
  }

  final void mI()
  {
    AppMethodBeat.i(91826);
    j.om();
    this.aBH.clear();
    this.azP = null;
    this.aBP = null;
    this.azR = null;
    if (this.aBO != null)
      this.aBO.clear();
    this.aBN = false;
    this.isCancelled = false;
    this.aBL = false;
    g localg = this.aBQ;
    if (localg.aAt.mA())
      localg.ms();
    this.aBQ = null;
    this.aBM = null;
    this.aAL = null;
    this.aAr.release(this);
    AppMethodBeat.o(91826);
  }

  final void mJ()
  {
    AppMethodBeat.i(91830);
    this.aAq.oq();
    if (this.isCancelled)
    {
      mI();
      AppMethodBeat.o(91830);
    }
    while (true)
    {
      return;
      if (this.aBH.isEmpty())
      {
        localObject = new IllegalStateException("Received an exception without any callbacks to notify");
        AppMethodBeat.o(91830);
        throw ((Throwable)localObject);
      }
      if (this.aBN)
      {
        localObject = new IllegalStateException("Already failed once");
        AppMethodBeat.o(91830);
        throw ((Throwable)localObject);
      }
      this.aBN = true;
      this.aBz.a(this, this.azP, null);
      Object localObject = this.aBH.iterator();
      while (((Iterator)localObject).hasNext())
      {
        f localf = (f)((Iterator)localObject).next();
        if (!b(localf))
          localf.a(this.aBM);
      }
      mI();
      AppMethodBeat.o(91830);
    }
  }

  public final b my()
  {
    return this.aAq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.k
 * JD-Core Version:    0.6.2
 */