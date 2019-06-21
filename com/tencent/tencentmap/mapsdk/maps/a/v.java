package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.util.Base64;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.b;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class v
{
  private static v a = null;
  private String b;
  private int c;
  private int d;
  private SparseArray<v.a> e;
  private Map<String, String> f;
  private byte g;
  private byte h;
  private String i;
  private String j;
  private String k;

  private v()
  {
    AppMethodBeat.i(100562);
    this.b = "http://oth.str.mdt.qq.com:8080/analytics/upload";
    this.c = 360;
    this.d = 100;
    this.e = null;
    this.f = null;
    this.g = ((byte)3);
    this.h = ((byte)2);
    this.i = "";
    this.j = "";
    this.k = "";
    this.e = new SparseArray(3);
    this.e.put(1, new v.a(1));
    this.e.put(2, new v.a(2));
    this.e.put(3, new v.a(3));
    AppMethodBeat.o(100562);
  }

  public static v a()
  {
    AppMethodBeat.i(100563);
    if (a == null);
    try
    {
      if (a == null)
      {
        localv = new com/tencent/tencentmap/mapsdk/maps/a/v;
        localv.<init>();
        a = localv;
      }
      v localv = a;
      AppMethodBeat.o(100563);
      return localv;
    }
    finally
    {
      AppMethodBeat.o(100563);
    }
  }

  private void b(String paramString)
  {
    try
    {
      AppMethodBeat.i(100568);
      this.j = paramString;
      this.i = Base64.encodeToString(e.a(paramString), 2);
      AppMethodBeat.o(100568);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  private void c(String paramString)
  {
    try
    {
      this.k = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final void a(int paramInt)
  {
    this.c = paramInt;
  }

  final void a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(100570);
      Object[] arrayOfObject = e.a(paramContext, "sid");
      long l1;
      if ((arrayOfObject != null) && (arrayOfObject.length == 3))
      {
        Date localDate = new java/util/Date;
        localDate.<init>();
        l1 = localDate.getTime() / 1000L;
      }
      try
      {
        l2 = ((Long)arrayOfObject[2]).longValue();
        if (l2 > l1)
          c((String)arrayOfObject[1]);
        b(e.k(paramContext));
        AppMethodBeat.o(100570);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          long l2 = 0L;
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public final void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(100569);
      this.k = paramString1;
      v.1 local1 = new com/tencent/tencentmap/mapsdk/maps/a/v$1;
      local1.<init>(this, paramString1, paramString2, paramContext);
      b.a().a(local1);
      AppMethodBeat.o(100569);
      return;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  public final void a(Map<String, String> paramMap)
  {
    this.f = paramMap;
  }

  public final v.a b(int paramInt)
  {
    try
    {
      AppMethodBeat.i(100565);
      v.a locala;
      if (this.e != null)
      {
        locala = (v.a)this.e.get(paramInt);
        AppMethodBeat.o(100565);
      }
      while (true)
      {
        return locala;
        locala = null;
        AppMethodBeat.o(100565);
      }
    }
    finally
    {
    }
  }

  public final String b()
  {
    return this.b;
  }

  public final int c()
  {
    return this.c;
  }

  public final Map<String, String> d()
  {
    return this.f;
  }

  public final SparseArray<v.a> e()
  {
    try
    {
      AppMethodBeat.i(100564);
      SparseArray localSparseArray;
      if (this.e != null)
      {
        new ah();
        localSparseArray = ah.a(this.e);
        AppMethodBeat.o(100564);
      }
      while (true)
      {
        return localSparseArray;
        localSparseArray = null;
        AppMethodBeat.o(100564);
      }
    }
    finally
    {
    }
  }

  public final int f()
  {
    AppMethodBeat.i(100566);
    String str;
    int m;
    if (this.f != null)
    {
      str = (String)this.f.get("maxStrategyQueryOneDay");
      if ((str != null) && (!str.trim().equals("")))
        m = this.d;
    }
    while (true)
    {
      try
      {
        int n = Integer.valueOf(str).intValue();
        m = n;
        AppMethodBeat.o(100566);
        return m;
      }
      catch (Exception localException)
      {
        continue;
      }
      m = this.d;
      AppMethodBeat.o(100566);
    }
  }

  public final boolean g()
  {
    try
    {
      AppMethodBeat.i(100567);
      boolean bool;
      if (this.f != null)
      {
        String str = (String)this.f.get("zeroPeak");
        if ((str != null) && ("y".equalsIgnoreCase(str)) && (Calendar.getInstance().get(11) == 0))
        {
          bool = true;
          AppMethodBeat.o(100567);
        }
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(100567);
      }
    }
    finally
    {
    }
  }

  public final byte h()
  {
    try
    {
      byte b1 = this.g;
      return b1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final byte i()
  {
    try
    {
      byte b1 = this.h;
      return b1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String j()
  {
    try
    {
      String str = this.i;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String k()
  {
    try
    {
      String str = this.j;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String l()
  {
    try
    {
      String str = this.k;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.v
 * JD-Core Version:    0.6.2
 */