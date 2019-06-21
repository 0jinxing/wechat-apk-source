package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.a;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.HashMap;
import java.util.Map;

public final class aq
{
  private static aq a = null;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;

  private aq(Context paramContext)
  {
    AppMethodBeat.i(98500);
    this.b = "";
    this.c = "";
    this.d = "";
    this.e = "";
    this.f = "";
    this.g = "";
    if (paramContext == null)
      ag.d(" DetailUserInfo context == null? pls check!", new Object[0]);
    ag.b(" start to create DetailUserInfo", new Object[0]);
    long l = System.currentTimeMillis();
    e.a(paramContext);
    this.b = e.b(paramContext);
    ag.b(" imei:" + this.b, new Object[0]);
    if (!"".equals(this.b));
    try
    {
      if ("".equals(a.b(paramContext, "IMEI_DENGTA", "")))
        a.a(paramContext, "IMEI_DENGTA", this.b);
      label162: this.e = e.d(paramContext);
      this.f = a.b(paramContext, "QIMEI_DENGTA", "");
      StringBuilder localStringBuilder;
      if ("".equals(this.f))
      {
        if (this.b.equals(""))
        {
          str = this.e;
          this.f = str;
        }
      }
      else
      {
        if (an.a == null)
          an.a = new HashMap();
        an.a.put("A3", this.f);
        this.c = e.e(paramContext);
        if ("".equals(this.c))
        {
          localStringBuilder = new StringBuilder();
          str = e.e("/sys/class/net/eth0/address");
          if ((!str.trim().equals("")) && (str.length() >= 17))
            break label468;
        }
      }
      label468: for (String str = ""; ; str = str.toLowerCase().substring(0, 17))
      {
        this.c = str;
        this.d = e.c(paramContext);
        new StringBuilder().append(e.d());
        new StringBuilder().append(e.e()).append("m");
        this.g = e.f();
        ag.b(" detail create cost: %d  values:\n %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), toString() });
        AppMethodBeat.o(98500);
        return;
        str = this.b;
        break;
      }
    }
    catch (Exception localException)
    {
      break label162;
    }
  }

  public static aq a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(98499);
      if (a == null)
      {
        aq localaq = new com/tencent/tencentmap/mapsdk/maps/a/aq;
        localaq.<init>(paramContext);
        a = localaq;
      }
      paramContext = a;
      AppMethodBeat.o(98499);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public final String a()
  {
    try
    {
      String str = this.b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String b()
  {
    try
    {
      String str = this.c;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String c()
  {
    try
    {
      String str = this.d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String d()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String e()
  {
    try
    {
      String str = this.f;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String f()
  {
    return this.g;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.aq
 * JD-Core Version:    0.6.2
 */