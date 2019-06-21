package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;
import java.util.Arrays;

abstract class h
{
  private g aTn;
  private m aVw;
  private long aZU;
  private h.a baA;
  private long baB;
  private boolean baC;
  private boolean baD;
  private final d baw = new d();
  private f bax;
  long bay;
  private long baz;
  private int sampleRate;
  int state;

  protected final long T(long paramLong)
  {
    return 1000000L * paramLong / this.sampleRate;
  }

  protected final long U(long paramLong)
  {
    return this.sampleRate * paramLong / 1000000L;
  }

  protected void V(long paramLong)
  {
    this.baz = paramLong;
  }

  final void a(g paramg, m paramm)
  {
    this.aTn = paramg;
    this.aVw = paramm;
    reset(true);
  }

  protected abstract boolean a(l paraml, long paramLong, h.a parama);

  final int b(com.google.android.exoplayer2.c.f paramf, k paramk)
  {
    long l1 = this.bax.i(paramf);
    int i;
    if (l1 >= 0L)
    {
      paramk.position = l1;
      i = 1;
    }
    while (true)
    {
      return i;
      if (l1 < -1L)
        V(-(l1 + 2L));
      if (!this.baC)
      {
        paramk = this.bax.rk();
        this.aTn.a(paramk);
        this.baC = true;
      }
      if ((this.baB > 0L) || (this.baw.k(paramf)))
      {
        this.baB = 0L;
        paramf = this.baw.bah;
        long l2 = s(paramf);
        if ((l2 >= 0L) && (this.baz + l2 >= this.aZU))
        {
          l1 = T(this.baz);
          this.aVw.a(paramf, paramf.limit);
          this.aVw.a(l1, 1, paramf.limit, 0, null);
          this.aZU = -1L;
        }
        this.baz += l2;
        i = 0;
      }
      else
      {
        this.state = 3;
        i = -1;
      }
    }
  }

  final void g(long paramLong1, long paramLong2)
  {
    boolean bool = false;
    d locald = this.baw;
    locald.aZP.reset();
    locald.bah.reset();
    locald.bai = -1;
    locald.baj = false;
    if (paramLong1 == 0L)
    {
      if (!this.baC)
        bool = true;
      reset(bool);
    }
    while (true)
    {
      return;
      if (this.state != 0)
      {
        this.aZU = this.bax.S(paramLong2);
        this.state = 2;
      }
    }
  }

  final int l(com.google.android.exoplayer2.c.f paramf)
  {
    int i = 0;
    int j = 1;
    int k;
    while (j != 0)
    {
      if (!this.baw.k(paramf))
      {
        this.state = 3;
        k = -1;
        return k;
      }
      this.baB = (paramf.getPosition() - this.bay);
      boolean bool = a(this.baw.bah, this.bay, this.baA);
      j = bool;
      if (bool)
      {
        this.bay = paramf.getPosition();
        j = bool;
      }
    }
    this.sampleRate = this.baA.aOv.sampleRate;
    if (!this.baD)
    {
      this.aVw.f(this.baA.aOv);
      this.baD = true;
    }
    if (this.baA.bax != null)
      this.bax = this.baA.bax;
    while (true)
    {
      this.baA = null;
      this.state = 2;
      paramf = this.baw;
      k = i;
      if (paramf.bah.data.length == 65025)
        break;
      paramf.bah.data = Arrays.copyOf(paramf.bah.data, Math.max(65025, paramf.bah.limit));
      k = i;
      break;
      if (paramf.getLength() == -1L)
      {
        this.bax = new h.b((byte)0);
      }
      else
      {
        e locale = this.baw.aZP;
        this.bax = new a(this.bay, paramf.getLength(), this, locale.aVG + locale.bar, locale.bam);
      }
    }
  }

  protected void reset(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.baA = new h.a();
      this.bay = 0L;
    }
    for (this.state = 0; ; this.state = 1)
    {
      this.aZU = -1L;
      this.baz = 0L;
      return;
    }
  }

  protected abstract long s(l paraml);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.h
 * JD-Core Version:    0.6.2
 */