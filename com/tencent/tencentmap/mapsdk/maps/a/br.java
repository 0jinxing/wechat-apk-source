package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class br
  implements ci
{
  protected bp a;
  public String b;
  public String c;
  protected AtomicInteger d = new AtomicInteger(0);
  protected cq e;
  private int f;
  private int g = 5000;
  private long h;
  private int i = 0;

  public br(bp parambp)
  {
    this.a = parambp;
    this.b = parambp.a;
    this.c = parambp.a;
    this.f = parambp.f;
    this.h = SystemClock.elapsedRealtime();
  }

  public cv a()
  {
    try
    {
      this.g = ce.a.a("app_http_proxy_timeout", 0, 20000, 5000);
      if (this.f <= 0)
        this.f = ce.a.a("app_req_timeout", 1000, 1000000, 15000);
      if ((this.a.k > 0) && (this.a.k < this.f))
        this.f = this.a.k;
      int j = this.f;
      cv localcv1 = a(j);
      j = eu.a((int)(this.f - (SystemClock.elapsedRealtime() - this.h)), 0, this.f);
      String str;
      if ((localcv1.a == 0) && (localcv1.c >= 300) && (localcv1.c < 400) && (this.a.e) && (j > 200))
      {
        str = localcv1.a("location");
        if (!TextUtils.isEmpty(str))
          break label247;
      }
      for (localcv1.a = -6; ; localcv1.a = -5)
      {
        if (this.a.j)
        {
          localcv1.a = -20;
          localcv1.b = "";
        }
        if (!this.a.m)
          break label308;
        this.e.j = true;
        this.e.i = true;
        this.e.k = this.a.k;
        this.e.a(false);
        return localcv1;
        label247: this.c = str;
        this.i += 1;
        if (this.i <= 5)
          break;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        cv localcv2 = new cv(-1, eu.a(localThrowable), 0);
        continue;
        this.e.a(true);
        continue;
        label308: this.e.k = (SystemClock.elapsedRealtime() - this.h);
      }
    }
  }

  protected abstract cv a(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.br
 * JD-Core Version:    0.6.2
 */