package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.util.Log;
import com.tencent.map.lib.d;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.o;
import com.tencent.tencentmap.mapsdk.a.s;
import com.tencent.tencentmap.mapsdk.a.u;
import com.tencent.tencentmap.mapsdk.a.w;
import org.json.JSONArray;

public class jj
{
  public static int a = 0;
  public static int b = 1;
  public static int c = 0;
  public static int d = 1;
  private s e;
  private o f;
  private f g;
  private boolean h;

  public jj(Context paramContext, f paramf, String paramString)
  {
    AppMethodBeat.i(100042);
    if (paramString == null);
    for (this.e = w.a(paramContext); ; this.e = u.a(paramContext, paramString))
    {
      this.g = paramf;
      c();
      this.h = false;
      a(this.h);
      AppMethodBeat.o(100042);
      return;
    }
  }

  private void c()
  {
    AppMethodBeat.i(100043);
    int i = this.e.b("AIEnabled");
    int j = this.e.b("AIType");
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(this.e.a("AIBuildingList"));
      if ((i != -1) && (j != -1) && (localJSONArray != null))
        this.f = new o(i, j, localJSONArray);
      if ((this.g != null) && (j == d))
        this.g.a(b());
      AppMethodBeat.o(100043);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        d.b(Log.getStackTraceString(localException));
        Object localObject = null;
      }
    }
  }

  private boolean d()
  {
    AppMethodBeat.i(100046);
    boolean bool;
    if ((this.f != null) && (this.f.a() == b))
    {
      bool = true;
      AppMethodBeat.o(100046);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100046);
    }
  }

  public int a()
  {
    AppMethodBeat.i(100047);
    int i;
    if ((this.f != null) && (this.f.a() == b))
    {
      i = d;
      AppMethodBeat.o(100047);
    }
    while (true)
    {
      return i;
      i = c;
      AppMethodBeat.o(100047);
    }
  }

  public void a(o paramo)
  {
    AppMethodBeat.i(100044);
    this.f = paramo;
    if (this.f == null)
      this.e.a(new String[] { "AIEnabled", "AIType", "AIBuildingList" });
    while (true)
    {
      a(this.h);
      AppMethodBeat.o(100044);
      return;
      this.e.a("AIEnabled", this.f.a());
      this.e.a("AIType", this.f.b());
      if (this.f.c() != null)
        this.e.a("AIBuildingList", this.f.c().toString());
      if ((this.g != null) && (a() == d))
        this.g.a(b());
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100045);
    this.h = paramBoolean;
    if (this.g == null)
      AppMethodBeat.o(100045);
    while (true)
    {
      return;
      if (!d())
      {
        this.g.d(false);
        AppMethodBeat.o(100045);
      }
      else
      {
        this.g.d(paramBoolean);
        AppMethodBeat.o(100045);
      }
    }
  }

  public String[] b()
  {
    AppMethodBeat.i(100048);
    String[] arrayOfString;
    if (this.f != null)
    {
      arrayOfString = this.f.d();
      AppMethodBeat.o(100048);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = null;
      AppMethodBeat.o(100048);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jj
 * JD-Core Version:    0.6.2
 */