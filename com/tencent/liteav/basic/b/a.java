package com.tencent.liteav.basic.b;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class a
{
  private long A;
  private long B;
  private long C;
  private long D;
  private long E;
  private long F;
  private ReadWriteLock G;
  private b a;
  private LinkedList<com.tencent.liteav.basic.g.b> b;
  private LinkedList<com.tencent.liteav.basic.g.b> c;
  private long d;
  private long e;
  private volatile boolean f;
  private volatile float g;
  private long h;
  private long i;
  private long j;
  private long k;
  private long l;
  private long m;
  private long n;
  private long o;
  private boolean p;
  private HandlerThread q;
  private Handler r;
  private boolean s;
  private long t;
  private long u;
  private volatile long v;
  private volatile long w;
  private int x;
  private int y;
  private long z;

  public a()
  {
    AppMethodBeat.i(66049);
    this.a = null;
    this.b = new LinkedList();
    this.c = new LinkedList();
    this.d = 0L;
    this.e = 15L;
    this.f = false;
    this.g = 1.0F;
    this.h = 0L;
    this.i = 0L;
    this.j = 0L;
    this.k = 0L;
    this.l = 0L;
    this.m = 0L;
    this.n = 0L;
    this.o = 0L;
    this.p = false;
    this.q = null;
    this.r = null;
    this.s = false;
    this.t = 20L;
    this.u = 0L;
    this.v = 0L;
    this.w = 0L;
    this.x = 0;
    this.y = 0;
    this.z = 0L;
    this.A = 0L;
    this.B = 0L;
    this.C = 0L;
    this.D = 0L;
    this.E = 0L;
    this.F = 0L;
    this.G = new ReentrantReadWriteLock();
    this.q = new HandlerThread("VideoJitterBufferHandler");
    this.q.start();
    this.G.writeLock().lock();
    this.r = new Handler(this.q.getLooper());
    this.G.writeLock().unlock();
    AppMethodBeat.o(66049);
  }

  private long a(long paramLong1, long paramLong2)
  {
    long l1;
    if (this.e > 0L)
    {
      l1 = 1000L / this.e;
      if (paramLong1 < l1)
        paramLong1 = l1;
    }
    while (true)
    {
      l1 = paramLong2;
      if (paramLong1 > paramLong2)
        l1 = paramLong1;
      return l1;
    }
  }

  private long b(long paramLong)
  {
    long l1 = 500L;
    AppMethodBeat.i(66057);
    long l2 = paramLong;
    if (paramLong > 500L)
      l2 = 500L;
    if (l2 <= 0L)
    {
      if (this.e > 0L)
      {
        paramLong = 1000L / this.e;
        AppMethodBeat.o(66057);
      }
      while (true)
      {
        return paramLong;
        AppMethodBeat.o(66057);
        paramLong = 0L;
      }
    }
    if (this.a != null);
    for (paramLong = this.a.o(); ; paramLong = 0L)
    {
      if (paramLong > 0L)
      {
        paramLong = 50L;
        label94: paramLong = a(l2, paramLong);
        if (!this.f)
          break label148;
      }
      label148: for (float f1 = d(paramLong); ; f1 = c(paramLong))
      {
        paramLong = ()((float)l2 / f1);
        AppMethodBeat.o(66057);
        break;
        paramLong = l1;
        if (!this.f)
          break label94;
        paramLong = 200L;
        break label94;
      }
    }
  }

  private float c(long paramLong)
  {
    long l1 = 0L;
    AppMethodBeat.i(66058);
    int i1 = 0;
    if (this.a != null)
      i1 = this.a.p();
    float f1;
    if (i1 > 24)
    {
      TXCLog.e("TXCVideoJitterBuffer", "videojitter pull nal with speed : 0.1");
      f1 = 0.1F;
      AppMethodBeat.o(66058);
      return f1;
    }
    if (this.a != null);
    for (long l2 = this.a.o(); ; l2 = 0L)
    {
      if (l2 > 0L)
        if (l2 >= this.v + paramLong)
          if (l2 >= this.v + paramLong + 200L)
            f1 = 2.2F;
      while (true)
      {
        AppMethodBeat.o(66058);
        break;
        f1 = 1.2F;
        continue;
        if (this.v >= l2 + paramLong)
        {
          if (this.v >= l2 + paramLong + 200L)
          {
            f1 = 0.5F;
          }
          else
          {
            f1 = 0.9F;
            continue;
            if (this.w > this.v);
            for (long l3 = this.w - this.v; ; l3 = 0L)
            {
              long l4 = ()(this.g * 1000.0F);
              l2 = l1;
              if (this.a != null)
                l2 = this.n * this.a.p();
              l1 = l4;
              if (l2 > l4)
                l1 = l2;
              if (l3 > l1 + paramLong);
              for (f1 = 1.1F; ; f1 = 1.0F)
              {
                if (l3 <= l1)
                {
                  f1 = 1.0F;
                  break;
                }
                break;
              }
            }
          }
        }
        else
          f1 = 1.0F;
      }
    }
  }

  private float d(long paramLong)
  {
    AppMethodBeat.i(66059);
    float f1 = 1.0F;
    int i1 = 0;
    if (this.a != null)
      i1 = this.a.p();
    if (i1 > 24)
    {
      TXCLog.e("TXCVideoJitterBuffer", "videojitter pull nal with speed : 0.1");
      f1 = 0.1F;
      AppMethodBeat.o(66059);
      return f1;
    }
    long l1 = 0L;
    if (this.a != null)
      l1 = this.a.o();
    if ((l1 > 0L) && (this.a != null) && (0L != this.a.n()))
    {
      if (l1 >= this.v + paramLong)
        if (l1 >= this.v + paramLong + 200L)
          f1 = 2.2F;
      while (true)
      {
        AppMethodBeat.o(66059);
        break;
        f1 = 1.5F;
        continue;
        if (this.v < l1 + paramLong)
          break label304;
        if (this.v >= l1 + paramLong + 400L)
          f1 = 1.0F;
        else if (this.v >= l1 + paramLong + 200L)
          f1 = 0.5F;
        else
          f1 = 0.7F;
      }
    }
    long l2 = 0L;
    if (this.w > this.v)
      l2 = this.w - this.v;
    long l3 = ()(this.g * 1000.0F);
    l1 = 0L;
    if (this.a != null)
      l1 = this.n * this.a.p();
    if (l1 > l3);
    while (true)
    {
      if (l2 > l1 + paramLong)
        f1 = 1.2F;
      if (l2 <= l1)
      {
        f1 = 1.0F;
        break;
      }
      label304: break;
      l1 = l3;
    }
  }

  private void e(long paramLong)
  {
    if (this.j != 0L)
    {
      if (this.i < 5L)
        break label113;
      this.e = (this.h / this.i);
      if (this.e <= 200L)
        break label96;
      this.e = 200L;
      if ((this.e >= 30L) && (this.t != 5L))
        this.t = 5L;
      this.h = 0L;
      this.i = 0L;
    }
    while (true)
    {
      this.j = paramLong;
      return;
      label96: if (this.e >= 1L)
        break;
      this.e = 1L;
      break;
      label113: long l1 = paramLong - this.j;
      if (l1 > 0L)
      {
        long l2 = this.h;
        this.h = (1000L / l1 + l2);
        this.i += 1L;
      }
    }
  }

  private void f(long paramLong)
  {
    long l2;
    if (this.k != 0L)
    {
      if (paramLong <= this.k)
        break label120;
      long l1 = paramLong - this.k;
      l2 = l1;
      if (l1 > 500L)
        l2 = 500L;
    }
    while (true)
    {
      this.l = (l2 + this.l);
      this.m += 1L;
      if (this.m >= 5L)
      {
        this.n = (this.l / this.m);
        if (this.n <= 500L)
          break label142;
        this.n = 500L;
      }
      while (true)
      {
        this.l = 0L;
        this.m = 0L;
        this.k = paramLong;
        return;
        label120: if (this.e <= 0L)
          break label163;
        l2 = 1000L / this.e;
        break;
        label142: if (this.n < 5L)
          this.n = 5L;
      }
      label163: l2 = 0L;
    }
  }

  private void l()
  {
    AppMethodBeat.i(66053);
    this.b.clear();
    this.d = 0L;
    this.c.clear();
    this.e = 15L;
    this.h = 0L;
    this.i = 0L;
    this.j = 0L;
    this.v = 0L;
    this.w = 0L;
    this.y = 0;
    this.x = 0;
    this.f = false;
    this.g = 1.0F;
    this.k = 0L;
    this.o = 0L;
    this.l = 0L;
    this.m = 0L;
    this.C = 0L;
    this.D = 0L;
    this.E = 0L;
    this.F = 0L;
    this.p = false;
    AppMethodBeat.o(66053);
  }

  private void m()
  {
    AppMethodBeat.i(66054);
    this.G.readLock().lock();
    if (this.r != null)
      this.r.postDelayed(new a.4(this), this.t);
    this.G.readLock().unlock();
    AppMethodBeat.o(66054);
  }

  private com.tencent.liteav.basic.g.b n()
  {
    AppMethodBeat.i(66056);
    com.tencent.liteav.basic.g.b localb;
    if ((this.b == null) || (this.b.isEmpty()))
    {
      localb = null;
      AppMethodBeat.o(66056);
      return localb;
    }
    if (this.v > this.w)
      this.v = this.w;
    long l1 = TXCTimeUtil.getTimeTick();
    int i1;
    if (this.k == 0L)
      i1 = 1;
    while (true)
    {
      if (i1 != 0)
      {
        localb = o();
        f(localb.h);
        this.o = l1;
        AppMethodBeat.o(66056);
        break;
        localb = (com.tencent.liteav.basic.g.b)this.b.getFirst();
        long l2;
        if (localb.h > this.k)
          l2 = b(localb.h - this.k);
        while (true)
        {
          if (this.o + l2 > this.u + l1)
            break label266;
          this.u = (this.u + l1 - (this.o + l2));
          if (this.u > l2)
            this.u = l2;
          i1 = 1;
          break;
          l2 = b(0L);
          TXCLog.w("TXCVideoJitterBuffer", "videojitter pull nal with invalid ts, current dts [" + localb.h + "] < last dts[ " + this.k + "]!!! decInterval is " + l2);
        }
      }
      localb = null;
      AppMethodBeat.o(66056);
      break;
      label266: i1 = 0;
    }
  }

  private com.tencent.liteav.basic.g.b o()
  {
    AppMethodBeat.i(66061);
    Object localObject = null;
    if (!this.b.isEmpty())
    {
      com.tencent.liteav.basic.g.b localb = (com.tencent.liteav.basic.g.b)this.b.getFirst();
      this.b.removeFirst();
      this.d = this.b.size();
      localObject = localb;
      if (this.a != null)
      {
        this.d += this.a.p();
        localObject = localb;
      }
    }
    AppMethodBeat.o(66061);
    return localObject;
  }

  public void a()
  {
    AppMethodBeat.i(66051);
    this.G.readLock().lock();
    if (this.r != null)
      this.r.post(new a.2(this));
    this.G.readLock().unlock();
    m();
    AppMethodBeat.o(66051);
  }

  public void a(float paramFloat)
  {
    this.g = paramFloat;
  }

  public void a(long paramLong)
  {
    this.v = paramLong;
    if (this.v > this.w)
      this.v = this.w;
  }

  public void a(b paramb)
  {
    AppMethodBeat.i(66050);
    this.G.readLock().lock();
    if (this.r != null)
      this.r.post(new a.1(this, paramb));
    this.G.readLock().unlock();
    AppMethodBeat.o(66050);
  }

  public void a(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(66055);
    if (paramb == null)
    {
      AppMethodBeat.o(66055);
      return;
    }
    if ((paramb.g > this.w) || (paramb.g + 500L < this.w))
      this.w = paramb.g;
    if (this.v > this.w)
      this.v = this.w;
    if (paramb.b == 0)
      this.x = this.y;
    for (this.y = 1; ; this.y += 1)
      do
      {
        this.G.readLock().lock();
        if (this.r != null)
          this.r.post(new a.5(this, paramb));
        this.G.readLock().unlock();
        AppMethodBeat.o(66055);
        break;
      }
      while ((paramb.b != 2) && (paramb.b != 1));
  }

  public void a(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }

  public void b()
  {
    AppMethodBeat.i(66052);
    this.G.writeLock().lock();
    if (this.r != null)
      this.r.post(new a.3(this));
    this.r = null;
    this.G.writeLock().unlock();
    AppMethodBeat.o(66052);
  }

  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  void c()
  {
    AppMethodBeat.i(66060);
    if (this.b.size() == 0)
    {
      AppMethodBeat.o(66060);
      return;
    }
    this.b.getFirst();
    this.b.getLast();
    if (this.a != null);
    for (int i1 = this.a.p(); ; i1 = 0)
    {
      if ((!this.b.isEmpty()) && (i1 >= 24))
      {
        i1 = 0;
        int i2 = 0;
        while (i1 < this.b.size())
        {
          if (((com.tencent.liteav.basic.g.b)this.b.get(i1)).b == 0)
            i2 = i1;
          i1++;
        }
        for (i1 = 0; (!this.b.isEmpty()) && (i1 < i2); i1++)
        {
          this.k = ((com.tencent.liteav.basic.g.b)this.b.getFirst()).h;
          while (!this.c.isEmpty())
          {
            com.tencent.liteav.basic.g.b localb = (com.tencent.liteav.basic.g.b)this.c.getFirst();
            if (localb.g > ((com.tencent.liteav.basic.g.b)this.b.getFirst()).h)
              break;
            this.a.c(localb);
            this.c.removeFirst();
          }
          this.b.removeFirst();
        }
        if (i1 > 0)
          TXCLog.w("TXCVideoJitterBuffer", "videojitter cache too maney ， so drop " + i1 + " frames");
      }
      AppMethodBeat.o(66060);
      break;
    }
  }

  public long d()
  {
    return this.w - this.v;
  }

  public long e()
  {
    return this.d;
  }

  public long f()
  {
    return this.v;
  }

  protected void finalize()
  {
    AppMethodBeat.i(66062);
    super.finalize();
    try
    {
      b();
      AppMethodBeat.o(66062);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(66062);
    }
  }

  public long g()
  {
    return this.w;
  }

  public int h()
  {
    return this.x;
  }

  public long i()
  {
    return this.C;
  }

  public long j()
  {
    return this.F;
  }

  public long k()
  {
    if (this.A != 0L);
    for (long l1 = this.z / this.A; ; l1 = 0L)
    {
      this.A = 0L;
      this.z = 0L;
      return l1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.b.a
 * JD-Core Version:    0.6.2
 */