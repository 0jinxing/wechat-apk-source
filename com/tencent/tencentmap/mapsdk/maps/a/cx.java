package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class cx
{
  private static int c = 20;
  protected AtomicInteger a = new AtomicInteger(0);
  private long b;
  private Handler d;
  private de e;
  private AtomicInteger f = new AtomicInteger(0);
  private List<String> g = new ArrayList();
  private volatile boolean h = false;
  private volatile boolean i = false;
  private AtomicInteger j = new AtomicInteger(0);
  private int k;
  private int l = 0;
  private long m = 0L;
  private AtomicInteger n = new AtomicInteger(0);
  private volatile boolean o = false;
  private de.a p = new da(this);
  private final Runnable q = new dc(this);
  private final Runnable r = new dd(this);

  public cx()
  {
    df.a(bt.a());
    this.d = ce.a.a("ReportAction", 10);
    this.e = new cy();
    a(true);
    b(true, false);
    this.k = a();
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
      this.d.postDelayed(new db(this), 5000L);
    while (true)
    {
      return;
      if ((this.b != 0L) && (SystemClock.elapsedRealtime() - this.b > 1800000L))
        d();
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    while (true)
    {
      try
      {
        a(false);
        if ((paramBoolean1) && (paramBoolean2))
        {
          b(false, true);
          if (this.h)
            if (paramBoolean1)
              this.i = true;
        }
        else
        {
          b(false, false);
          continue;
        }
      }
      finally
      {
      }
      if (!paramBoolean1)
        this.f.set(0);
      if ((this.m == 0L) || (SystemClock.elapsedRealtime() - this.m >= this.l * 60 * 1000))
      {
        this.h = true;
        try
        {
          cx.d locald = new com/tencent/tencentmap/mapsdk/maps/a/cx$d;
          locald.<init>(this, paramBoolean1, paramBoolean2);
          locald.a(true);
        }
        catch (Throwable localThrowable)
        {
          this.h = false;
        }
      }
    }
  }

  private void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
      if (this.n.get() > 3)
        this.n.set(0);
    while (true)
    {
      return;
      cm.a().a(this.q, ce.a.a("report_real_timer_interval", 1, 60, 5) * 1000);
      continue;
      if (paramBoolean1)
        cm.a().a(this.r, 10000L);
      else if (!this.o)
        cm.a().a(this.r, ce.a.a("report_timer_interval", 30000, 600000, 300000));
    }
  }

  private void d()
  {
    this.b = SystemClock.elapsedRealtime();
    int i1 = er.b("report_missing_event", 0, false);
    int i2 = er.b("report_using_traffic", 0, false);
    int i3 = ce.a.a("report_using_traffic_limit", 1, 10240, 32);
    if ((i1 == 0) && (i2 < i3 << 10));
    while (true)
    {
      return;
      l1 = er.b("report_traffic_last_time", 0L, false);
      if (l1 != 0L)
        break;
      er.a("report_traffic_last_time", System.currentTimeMillis(), false);
    }
    long l1 = System.currentTimeMillis() - l1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("B110", String.valueOf(i2));
    String str;
    if (l1 < 0L)
    {
      str = "0";
      label118: localHashMap.put("B112", str);
      if (i1 != 0)
        break label169;
      bx.a("HLReportEvent", bt.c(), 0, "", localHashMap, null, false);
    }
    while (true)
    {
      er.a("report_using_traffic", 0, false);
      break;
      str = String.valueOf(l1);
      break label118;
      label169: localHashMap.put("B111", String.valueOf(i1));
      bx.a("HLReportEvent", bt.c(), -500, "", localHashMap, null, false);
      er.a("report_missing_event", 0, false);
    }
  }

  public abstract int a();

  public final void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      if (this.j.getAndIncrement() > this.k)
        this.j.decrementAndGet();
      while (true)
      {
        label22: return;
        cx.b localb = new com/tencent/tencentmap/mapsdk/maps/a/cx$b;
        localb.<init>(this, paramString, paramBoolean1, paramBoolean2);
        localb.a(false);
      }
    }
    catch (Throwable paramString)
    {
      break label22;
    }
  }

  public abstract String b();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cx
 * JD-Core Version:    0.6.2
 */