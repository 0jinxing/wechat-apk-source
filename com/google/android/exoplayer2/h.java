package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.g.g;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class h
  implements f
{
  private final r[] aMQ;
  final com.google.android.exoplayer2.g.h aMR;
  private final g aMS;
  private final i aMT;
  final CopyOnWriteArraySet<q.a> aMU;
  private final w.b aMV;
  private final w.a aMW;
  boolean aMX;
  boolean aMY;
  int aMZ;
  int aNa;
  int aNb;
  w aNc;
  Object aNd;
  com.google.android.exoplayer2.source.p aNe;
  g aNf;
  p aNg;
  i.b aNh;
  int aNi;
  int aNj;
  long aNk;
  private final Handler eventHandler;
  boolean isLoading;
  private int repeatMode;

  @SuppressLint({"HandlerLeak"})
  public h(r[] paramArrayOfr, com.google.android.exoplayer2.g.h paramh, m paramm)
  {
    AppMethodBeat.i(94778);
    new StringBuilder("Init ").append(Integer.toHexString(System.identityHashCode(this))).append(" [ExoPlayerLib/2.5.4] [").append(v.brM).append("]");
    boolean bool;
    if (paramArrayOfr.length > 0)
    {
      bool = true;
      a.checkState(bool);
      this.aMQ = ((r[])a.checkNotNull(paramArrayOfr));
      this.aMR = ((com.google.android.exoplayer2.g.h)a.checkNotNull(paramh));
      this.aMY = false;
      this.repeatMode = 0;
      this.aMZ = 1;
      this.aMU = new CopyOnWriteArraySet();
      this.aMS = new g(new com.google.android.exoplayer2.g.f[paramArrayOfr.length]);
      this.aNc = w.aPb;
      this.aMV = new w.b();
      this.aMW = new w.a();
      this.aNe = com.google.android.exoplayer2.source.p.bhZ;
      this.aNf = this.aMS;
      this.aNg = p.aOC;
      if (Looper.myLooper() == null)
        break label253;
    }
    label253: for (Looper localLooper = Looper.myLooper(); ; localLooper = Looper.getMainLooper())
    {
      this.eventHandler = new h.1(this, localLooper);
      this.aNh = new i.b(0L);
      this.aMT = new i(paramArrayOfr, paramh, paramm, this.aMY, this.repeatMode, this.eventHandler, this.aNh, this);
      AppMethodBeat.o(94778);
      return;
      bool = false;
      break;
    }
  }

  private int pQ()
  {
    AppMethodBeat.i(94789);
    int i;
    if ((this.aNc.isEmpty()) || (this.aNa > 0))
    {
      i = this.aNi;
      AppMethodBeat.o(94789);
    }
    while (true)
    {
      return i;
      i = this.aNc.a(this.aNh.aNQ.bhq, this.aMW, false).aNV;
      AppMethodBeat.o(94789);
    }
  }

  private long z(long paramLong)
  {
    AppMethodBeat.i(94794);
    long l = b.w(paramLong);
    paramLong = l;
    if (!this.aNh.aNQ.sh())
    {
      this.aNc.a(this.aNh.aNQ.bhq, this.aMW, false);
      paramLong = l + b.w(this.aMW.aPd);
    }
    AppMethodBeat.o(94794);
    return paramLong;
  }

  public final void a(q.a parama)
  {
    AppMethodBeat.i(94779);
    this.aMU.add(parama);
    AppMethodBeat.o(94779);
  }

  public final void a(com.google.android.exoplayer2.source.i parami)
  {
    AppMethodBeat.i(94781);
    Iterator localIterator;
    if ((!this.aNc.isEmpty()) || (this.aNd != null))
    {
      this.aNc = w.aPb;
      this.aNd = null;
      localIterator = this.aMU.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    if (this.aMX)
    {
      this.aMX = false;
      this.aNe = com.google.android.exoplayer2.source.p.bhZ;
      this.aNf = this.aMS;
      this.aMR.ae(null);
      localIterator = this.aMU.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    this.aNb += 1;
    this.aMT.handler.obtainMessage(0, 1, 0, parami).sendToTarget();
    AppMethodBeat.o(94781);
  }

  public final void a(f.c[] paramArrayOfc)
  {
    AppMethodBeat.i(94787);
    i locali = this.aMT;
    if (!locali.released)
    {
      locali.aNx += 1;
      locali.handler.obtainMessage(11, paramArrayOfc).sendToTarget();
    }
    AppMethodBeat.o(94787);
  }

  public final void aE(boolean paramBoolean)
  {
    AppMethodBeat.i(94782);
    if (this.aMY != paramBoolean)
    {
      this.aMY = paramBoolean;
      Object localObject = this.aMT.handler;
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        ((Handler)localObject).obtainMessage(1, i, 0).sendToTarget();
        localObject = this.aMU.iterator();
        while (((Iterator)localObject).hasNext())
          ((q.a)((Iterator)localObject).next()).c(paramBoolean, this.aMZ);
      }
    }
    AppMethodBeat.o(94782);
  }

  public final void b(q.a parama)
  {
    AppMethodBeat.i(94780);
    this.aMU.remove(parama);
    AppMethodBeat.o(94780);
  }

  public final void b(f.c[] paramArrayOfc)
  {
    AppMethodBeat.i(94788);
    this.aMT.b(paramArrayOfc);
    AppMethodBeat.o(94788);
  }

  public final int getBufferedPercentage()
  {
    int i = 0;
    AppMethodBeat.i(94793);
    if (this.aNc.isEmpty())
      AppMethodBeat.o(94793);
    while (true)
    {
      return i;
      long l1 = getBufferedPosition();
      long l2 = getDuration();
      if ((l1 == -9223372036854775807L) || (l2 == -9223372036854775807L))
      {
        AppMethodBeat.o(94793);
      }
      else if (l2 == 0L)
      {
        AppMethodBeat.o(94793);
        i = 100;
      }
      else
      {
        i = v.u((int)(l1 * 100L / l2), 0, 100);
        AppMethodBeat.o(94793);
      }
    }
  }

  public final long getBufferedPosition()
  {
    AppMethodBeat.i(94792);
    long l;
    if ((this.aNc.isEmpty()) || (this.aNa > 0))
    {
      l = this.aNk;
      AppMethodBeat.o(94792);
    }
    while (true)
    {
      return l;
      l = z(this.aNh.aNU);
      AppMethodBeat.o(94792);
    }
  }

  public final long getCurrentPosition()
  {
    AppMethodBeat.i(94791);
    long l;
    if ((this.aNc.isEmpty()) || (this.aNa > 0))
    {
      l = this.aNk;
      AppMethodBeat.o(94791);
    }
    while (true)
    {
      return l;
      l = z(this.aNh.aNT);
      AppMethodBeat.o(94791);
    }
  }

  public final long getDuration()
  {
    AppMethodBeat.i(94790);
    long l;
    if (this.aNc.isEmpty())
    {
      l = -9223372036854775807L;
      AppMethodBeat.o(94790);
    }
    while (true)
    {
      return l;
      if ((!this.aNc.isEmpty()) && (this.aNa == 0) && (this.aNh.aNQ.sh()));
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label126;
        com.google.android.exoplayer2.source.i.b localb = this.aNh.aNQ;
        this.aNc.a(localb.bhq, this.aMW, false);
        l = b.w(this.aMW.bb(localb.bhr, localb.bhs));
        AppMethodBeat.o(94790);
        break;
      }
      label126: l = b.w(this.aNc.a(pQ(), this.aMV).aOz);
      AppMethodBeat.o(94790);
    }
  }

  public final boolean isLoading()
  {
    return this.isLoading;
  }

  public final int pO()
  {
    return this.aMZ;
  }

  public final boolean pP()
  {
    return this.aMY;
  }

  public final void release()
  {
    AppMethodBeat.i(94786);
    new StringBuilder("Release ").append(Integer.toHexString(System.identityHashCode(this))).append(" [ExoPlayerLib/2.5.4] [").append(v.brM).append("] [").append(j.qa()).append("]");
    this.aMT.release();
    this.eventHandler.removeCallbacksAndMessages(null);
    AppMethodBeat.o(94786);
  }

  public final void seekTo(long paramLong)
  {
    AppMethodBeat.i(94784);
    int i = pQ();
    Object localObject;
    if ((i < 0) || ((!this.aNc.isEmpty()) && (i >= this.aNc.qg())))
    {
      localObject = new l(this.aNc, i, paramLong);
      AppMethodBeat.o(94784);
      throw ((Throwable)localObject);
    }
    this.aNa += 1;
    this.aNi = i;
    if (this.aNc.isEmpty())
    {
      this.aNj = 0;
      if (paramLong != -9223372036854775807L)
        break label278;
      this.aNk = 0L;
      this.aMT.a(this.aNc, i, -9223372036854775807L);
      AppMethodBeat.o(94784);
    }
    while (true)
    {
      return;
      this.aNc.a(i, this.aMV);
      if (paramLong == -9223372036854775807L);
      int j;
      for (long l1 = this.aMV.aPq; ; l1 = b.x(paramLong))
      {
        j = this.aMV.aPo;
        l1 = this.aMV.aPr + l1;
        for (long l2 = this.aNc.a(j, this.aMW, false).aOz; (l2 != -9223372036854775807L) && (l1 >= l2) && (j < this.aMV.aPp); l2 = ((w)localObject).a(j, this.aMW, false).aOz)
        {
          l1 -= l2;
          localObject = this.aNc;
          j++;
        }
      }
      this.aNj = j;
      break;
      label278: this.aNk = paramLong;
      this.aMT.a(this.aNc, i, b.x(paramLong));
      localObject = this.aMU.iterator();
      while (((Iterator)localObject).hasNext())
        ((q.a)((Iterator)localObject).next()).qe();
      AppMethodBeat.o(94784);
    }
  }

  public final void setRepeatMode(int paramInt)
  {
    AppMethodBeat.i(94783);
    if (this.repeatMode != paramInt)
    {
      this.repeatMode = paramInt;
      this.aMT.handler.obtainMessage(12, paramInt, 0).sendToTarget();
      Iterator localIterator = this.aMU.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    AppMethodBeat.o(94783);
  }

  public final void stop()
  {
    AppMethodBeat.i(94785);
    this.aMT.handler.sendEmptyMessage(5);
    AppMethodBeat.o(94785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h
 * JD-Core Version:    0.6.2
 */