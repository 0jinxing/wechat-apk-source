package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class ec
  implements ek, Runnable
{
  private static int a;
  private static ec b;
  private dq c;
  private boolean d;
  private Handler e;
  private Map<String, dy> f;
  private Runnable g;
  private Runnable h;
  private Runnable i;
  private Map<String, ec.a> j;

  static
  {
    AppMethodBeat.i(98775);
    a = -1;
    b = new ec();
    AppMethodBeat.o(98775);
  }

  private ec()
  {
    AppMethodBeat.i(98762);
    this.d = false;
    this.f = new ConcurrentHashMap();
    this.g = new eg(this);
    this.h = new ei(this);
    this.i = new ej(this);
    this.j = new HashMap();
    AppMethodBeat.o(98762);
  }

  private ec.a a(String paramString)
  {
    AppMethodBeat.i(98769);
    if (this.j.isEmpty())
      try
      {
        localObject1 = er.b("apnrecords", "", true);
        if (!((String)localObject1).isEmpty())
        {
          JSONObject localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>((String)localObject1);
          Iterator localIterator = localJSONObject1.keys();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            if (!TextUtils.isEmpty(str))
            {
              JSONObject localJSONObject2 = localJSONObject1.optJSONObject(str);
              if (localJSONObject2 != null)
              {
                localObject1 = new com/tencent/tencentmap/mapsdk/maps/a/ec$a;
                ((ec.a)localObject1).<init>(this, (byte)0);
                ((ec.a)localObject1).b = localJSONObject2.optInt("lastCode");
                ((ec.a)localObject1).a = localJSONObject2.optLong("lastReqTime");
                this.j.put(str, localObject1);
              }
            }
          }
        }
      }
      catch (Exception localException)
      {
      }
    Object localObject1 = (ec.a)this.j.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new ec.a(this, (byte)0);
      this.j.put(paramString, localObject2);
    }
    AppMethodBeat.o(98769);
    return localObject2;
  }

  private static int c(int paramInt)
  {
    AppMethodBeat.i(98770);
    String str;
    if (paramInt == 0)
    {
      str = "http_platform_update_interval_succ";
      if (paramInt != 0)
        break label60;
      paramInt = 1800000;
    }
    while (true)
    {
      paramInt = ce.a.a(str, 60000, 3600000, paramInt);
      AppMethodBeat.o(98770);
      return paramInt;
      if ((paramInt == -4) || (paramInt == -3))
      {
        str = "http_platform_update_interval_nonet";
        break;
      }
      str = "http_platform_update_interval_fail";
      break;
      label60: if ((paramInt == -4) || (paramInt == -3))
        paramInt = 60000;
      else
        paramInt = 300000;
    }
  }

  public static ec c()
  {
    return b;
  }

  public final void a()
  {
    AppMethodBeat.i(98765);
    ((dy)this.f.get("accessscheduler")).a();
    AppMethodBeat.o(98765);
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(98767);
    if ((paramInt == 1) || (paramInt == 2))
    {
      this.e.removeCallbacks(this.h);
      this.e.post(this.h);
      AppMethodBeat.o(98767);
    }
    while (true)
    {
      return;
      if ((paramInt == 3) || (paramInt == 4))
      {
        paramInt = ce.a.a("detect_platform_update_random_interval", 0, 1440, 10);
        int k = new Random().nextInt(paramInt);
        paramInt = c(0);
        cm.a().a(this.g, k * 60 * 1000 + paramInt);
      }
      AppMethodBeat.o(98767);
    }
  }

  public final void a(dq paramdq)
  {
    AppMethodBeat.i(98763);
    this.c = paramdq;
    paramdq = new eh();
    this.f.put(paramdq.c(), paramdq);
    paramdq = new ea();
    this.f.put(paramdq.c(), paramdq);
    paramdq = new ed();
    this.f.put(paramdq.c(), paramdq);
    AppMethodBeat.o(98763);
  }

  public final void b()
  {
    AppMethodBeat.i(98766);
    ((dy)this.f.get("settings")).b();
    AppMethodBeat.o(98766);
  }

  public final dq d()
  {
    return this.c;
  }

  public final void e()
  {
    AppMethodBeat.i(98764);
    this.e = ce.a.a("HttpPlatformConnection", 10);
    this.e.post(this);
    this.c.c();
    AppMethodBeat.o(98764);
  }

  public final void run()
  {
    AppMethodBeat.i(98768);
    if (ce.a.a("http_platform_start_update_on", 0, 1, 0) == 1)
    {
      a = 1;
      this.e.post(this.i);
    }
    AppMethodBeat.o(98768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ec
 * JD-Core Version:    0.6.2
 */