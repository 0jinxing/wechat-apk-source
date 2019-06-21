package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.map.lib.mapstructure.TrafficRequestItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import navsns.RttRequest;
import navsns.user_login_t;

public class gz extends Thread
{
  private gm a;
  private hf b;
  private boolean c;
  private boolean d;
  private boolean e;
  private List<Object> f;

  public gz(gm paramgm, hf paramhf)
  {
    AppMethodBeat.i(99503);
    this.a = null;
    this.b = null;
    this.c = true;
    this.d = false;
    this.e = false;
    this.a = paramgm;
    this.b = paramhf;
    this.f = new ArrayList();
    AppMethodBeat.o(99503);
  }

  private gz.a a(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(99513);
    paramDouble1 = (180.0D + paramDouble1) / 360.0D;
    paramDouble2 = Math.sin(3.1415926D * paramDouble2 / 180.0D);
    paramDouble2 = (180.0D - Math.log((1.0D + paramDouble2) / (1.0D - paramDouble2)) * 180.0D / 6.2831852D) / 360.0D;
    gz.a locala = new gz.a(this, null);
    locala.a = ((int)(paramDouble1 * 268435456.0D + 0.5D));
    locala.b = ((int)(0.5D + paramDouble2 * 268435456.0D));
    AppMethodBeat.o(99513);
    return locala;
  }

  private byte[] a(RttRequest paramRttRequest)
  {
    AppMethodBeat.i(99511);
    user_login_t localuser_login_t = new user_login_t();
    localuser_login_t.pf = "android_sdk";
    localuser_login_t.is_login = false;
    localuser_login_t.channel = "";
    localuser_login_t.imei = ic.a();
    e locale = new e();
    locale.c("rttserverex");
    locale.d("getRtt");
    locale.a("info", localuser_login_t);
    locale.a("req", paramRttRequest);
    paramRttRequest = locale.a();
    AppMethodBeat.o(99511);
    return paramRttRequest;
  }

  private void d()
  {
    AppMethodBeat.i(99508);
    if (this.a == null)
      AppMethodBeat.o(99508);
    while (true)
    {
      return;
      e();
      byte[] arrayOfByte = f();
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        this.a.i().a(arrayOfByte, arrayOfByte.length, true, false);
      AppMethodBeat.o(99508);
    }
  }

  private void e()
  {
    AppMethodBeat.i(99509);
    int i = this.a.a().m();
    Object localObject = this.a.a().y();
    double d1 = ((Rect)localObject).left / 1000000.0F;
    double d2 = ((Rect)localObject).bottom / 1000000.0F;
    double d3 = ((Rect)localObject).right / 1000000.0F;
    double d4 = ((Rect)localObject).top / 1000000.0F;
    localObject = a(d1, d2);
    gz.a locala = a(d3, d4);
    this.a.i().a(i, Math.min(((gz.a)localObject).a, locala.a), Math.min(((gz.a)localObject).b, locala.b), Math.max(locala.a, ((gz.a)localObject).a), Math.max(locala.b, ((gz.a)localObject).b));
    AppMethodBeat.o(99509);
  }

  private byte[] f()
  {
    byte[] arrayOfByte = null;
    AppMethodBeat.i(99510);
    if (this.a == null)
      AppMethodBeat.o(99510);
    while (true)
    {
      return arrayOfByte;
      RttRequest localRttRequest = g();
      if (localRttRequest == null)
      {
        AppMethodBeat.o(99510);
      }
      else
      {
        arrayOfByte = this.b.a(a(localRttRequest));
        AppMethodBeat.o(99510);
      }
    }
  }

  private RttRequest g()
  {
    RttRequest localRttRequest = null;
    AppMethodBeat.i(99512);
    if (this.a == null)
      AppMethodBeat.o(99512);
    while (true)
    {
      return localRttRequest;
      TrafficRequestItem[] arrayOfTrafficRequestItem = this.a.i().h();
      if ((arrayOfTrafficRequestItem == null) || (arrayOfTrafficRequestItem.length == 0))
      {
        AppMethodBeat.o(99512);
      }
      else
      {
        localRttRequest = new RttRequest();
        ArrayList localArrayList = new ArrayList();
        int i = arrayOfTrafficRequestItem.length;
        for (int j = 0; j < i; j++)
        {
          TrafficRequestItem localTrafficRequestItem = arrayOfTrafficRequestItem[j];
          localArrayList.add(Integer.valueOf(localTrafficRequestItem.left));
          localArrayList.add(Integer.valueOf(localTrafficRequestItem.top));
          localArrayList.add(Integer.valueOf(localTrafficRequestItem.right));
          localArrayList.add(Integer.valueOf(localTrafficRequestItem.bottom));
          localArrayList.add(Integer.valueOf(localTrafficRequestItem.timestamp));
        }
        localRttRequest.bounds = localArrayList;
        localRttRequest.zip = ((short)1);
        localRttRequest.zoom = ((short)(short)arrayOfTrafficRequestItem[0].level);
        AppMethodBeat.o(99512);
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(99505);
    this.d = true;
    try
    {
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(99505);
    }
  }

  public void b()
  {
    AppMethodBeat.i(99506);
    this.d = false;
    try
    {
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(99506);
    }
  }

  public void c()
  {
    AppMethodBeat.i(99507);
    this.e = true;
    try
    {
      notify();
      interrupt();
      AppMethodBeat.o(99507);
      return;
    }
    finally
    {
      AppMethodBeat.o(99507);
    }
  }

  public void run()
  {
    AppMethodBeat.i(99504);
    super.run();
    if (!this.e)
      if (!this.d)
      {
        if (this.a == null)
        {
          AppMethodBeat.o(99504);
          label35: return;
        }
        d();
        this.a.w();
      }
    while (true)
    {
      try
      {
        while (true)
          try
          {
            if (!this.c)
              break label92;
            wait(500L);
            this.c = false;
            break;
          }
          finally
          {
            AppMethodBeat.o(99504);
          }
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      AppMethodBeat.o(99504);
      break label35;
      label92: wait(30000L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gz
 * JD-Core Version:    0.6.2
 */