package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class cs extends cq
{
  private static boolean q = false;
  private String A;
  private bu B;
  private String C;
  private String D;
  public boolean p;
  private boolean r;
  private boolean s;
  private int t;
  private int u;
  private cw v;
  private cv w;
  private cr x;
  private cp y;
  private boolean z;

  public cs(String paramString1, boolean paramBoolean1, Map<String, String> paramMap, byte[] paramArrayOfByte, int paramInt1, String paramString2, boolean paramBoolean2, int paramInt2, boolean paramBoolean3, cd paramcd, String paramString3)
  {
    AppMethodBeat.i(98663);
    this.p = true;
    this.r = false;
    this.s = false;
    this.u = -1;
    this.y = cp.a();
    this.b = paramString1;
    this.c = paramBoolean1;
    this.d = paramMap;
    this.e = paramArrayOfByte;
    this.f = paramInt1;
    this.g = paramString2;
    this.r = false;
    this.t = 0;
    this.z = paramBoolean3;
    this.C = paramString3;
    AppMethodBeat.o(98663);
  }

  public static cs a(String paramString1, boolean paramBoolean1, Map<String, String> paramMap, byte[] paramArrayOfByte, int paramInt, String paramString2, boolean paramBoolean2, cd paramcd)
  {
    AppMethodBeat.i(98662);
    paramString1 = new cs(paramString1, false, paramMap, paramArrayOfByte, paramInt, paramString2, false, 0, false, paramcd, "");
    AppMethodBeat.o(98662);
    return paramString1;
  }

  public final cv a()
  {
    AppMethodBeat.i(98664);
    if (!q)
      q = true;
    try
    {
      if ((Build.VERSION.SDK != null) && (Build.VERSION.SDK_INT < 8))
        System.setProperty("http.keepAlive", "false");
      label37: this.w = new cv(0, "", 0);
      while (true)
      {
        long l2;
        try
        {
          Object localObject = new java/net/URL;
          ((URL)localObject).<init>(this.b);
          String str = ((URL)localObject).getHost();
          this.x = new cr((URL)localObject, this.b);
          boolean bool = ((URL)localObject).getProtocol().toLowerCase().startsWith("https");
          localObject = this.x.a(this.y, this.z, bool);
          int i = ((List)localObject).size();
          long l1 = SystemClock.elapsedRealtime();
          j = this.f;
          int k = 0;
          if (k >= i)
            break label594;
          this.o.incrementAndGet();
          this.B = ((bu)((List)localObject).get(k));
          if (this.B.b() < 3)
            this.s = true;
          this.D = this.x.a(this.B);
          this.v = new cw(str, this.D, this.c, this.d, this.e, j, this.g);
          if ((k != 0) || (this.r))
            this.v.s = true;
          if ((ce.i()) && (k != 0))
            this.v.q = true;
          this.v.r = this.o.get();
          this.w = this.v.a();
          if (((this.v.i) || (this.w.c >= 500)) && (ce.h()) && (this.s))
            cp.a(str, this.B, this.w.a);
          int m = (int)(this.f - (SystemClock.elapsedRealtime() - l1));
          if (((this.w.a == 0) && (this.w.c >= 200) && (this.w.c < 400)) || (this.w.a == -20) || (this.w.a == -300) || (this.w.a == -306) || (k == i - 1) || (m <= 200))
          {
            j = 1;
            n = j;
            if (j == 0)
            {
              n = j;
              if (this.w.a == -4)
              {
                n = ce.a.a("direct_nonet_retry_gap", 0, 10000, 3000);
                l2 = this.v.p;
                if (l2 < n)
                  break label565;
                n = 1;
              }
            }
            if (n != 0)
              break label594;
            a(true);
            k++;
            j = m;
            continue;
          }
        }
        catch (MalformedURLException localMalformedURLException)
        {
          this.w.a = -300;
          localcv = this.w;
          AppMethodBeat.o(98664);
          return localcv;
        }
        int j = 0;
        continue;
        label565: SystemClock.sleep(eu.a((int)(n - l2), 200, n, 200));
        int n = j;
        continue;
        label594: cv localcv = this.w;
        AppMethodBeat.o(98664);
      }
    }
    catch (Exception localException)
    {
      break label37;
    }
  }

  public final void a(int paramInt)
  {
    this.u = paramInt;
  }

  public final void a(String paramString)
  {
    this.A = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(98665);
    HashMap localHashMap1;
    HashMap localHashMap2;
    StringBuilder localStringBuilder;
    if (this.v != null)
    {
      if (this.i)
        this.v.i = true;
      localHashMap1 = new HashMap();
      if (paramBoolean)
        break label588;
      localHashMap1.put("B22", this.k);
      if (!eu.a(this.A))
        localHashMap1.put("B15", this.A);
      if (!eu.a(this.C))
        localHashMap1.put("B54", this.C);
      localHashMap2 = new HashMap();
      localHashMap2.put("B82", this.g);
      if (this.r)
      {
        localHashMap1.put("B52", "1");
        localHashMap1.put("B58", this.t);
      }
      if (this.l != 0L)
        localHashMap2.put("B83", this.l);
      localHashMap2.put("B44", this.a);
      if ((!TextUtils.isEmpty(this.a)) && (!this.a.equals(this.D)))
        localHashMap2.put("B49", this.D);
      if (this.B != null)
      {
        if (!this.B.e())
          localHashMap2.put("B10", this.B.d());
        if (this.B.a != -1)
          localHashMap2.put("B45", this.B.a);
        localHashMap2.put("B202", this.B.b());
        localHashMap2.put("B204", this.B.b);
        localStringBuilder = new StringBuilder();
        if (!this.s)
          break label604;
      }
    }
    while (true)
    {
      localHashMap2.put("B203", i);
      localHashMap2.put("B53", this.o.get());
      if (!TextUtils.isEmpty(this.x.a))
        localHashMap2.put("B26", this.x.a);
      if (this.j)
        localHashMap2.put("B97", "1");
      if (this.u != -1)
        localHashMap2.put("B211", this.u);
      this.v.a(localHashMap1, localHashMap2);
      AppMethodBeat.o(98665);
      return;
      label588: localHashMap1.put("B46", "1");
      break;
      label604: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cs
 * JD-Core Version:    0.6.2
 */