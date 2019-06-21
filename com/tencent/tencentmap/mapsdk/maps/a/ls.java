package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.b;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.da;
import com.tencent.tencentmap.mapsdk.a.r;
import com.tencent.tencentmap.mapsdk.a.v;
import com.tencent.tencentmap.mapsdk.a.w;
import java.io.File;

public class ls
{
  private iz a;
  private lo b;
  private lt c;
  private int d;
  private volatile boolean e;

  public ls(iz paramiz)
  {
    AppMethodBeat.i(100469);
    this.a = null;
    this.b = null;
    this.c = new lt();
    this.e = false;
    this.a = paramiz;
    f();
    AppMethodBeat.o(100469);
  }

  public static void a(int paramInt, w paramw)
  {
    AppMethodBeat.i(100475);
    new Thread(new ls.1(paramw, paramInt)).start();
    AppMethodBeat.o(100475);
  }

  private boolean a(b[] paramArrayOfb)
  {
    boolean bool = true;
    AppMethodBeat.i(100480);
    if (this.a == null)
      AppMethodBeat.o(100480);
    while (true)
    {
      return bool;
      b[] arrayOfb = this.a.R();
      if ((arrayOfb == null) || (paramArrayOfb == null))
      {
        AppMethodBeat.o(100480);
      }
      else
      {
        bool = ln.a(arrayOfb, paramArrayOfb);
        AppMethodBeat.o(100480);
      }
    }
  }

  private void f()
  {
    AppMethodBeat.i(100473);
    v.c(r.b(this.a.i()) + "/tencentmapsdk/rastermap/unmainland");
    v.c(r.a(this.a.i()).a().getPath() + "/rastermap/taiwan");
    AppMethodBeat.o(100473);
  }

  private void g()
  {
    AppMethodBeat.i(100478);
    if ((this.a == null) || (this.a.b() == null) || (this.b == null))
      AppMethodBeat.o(100478);
    while (true)
    {
      return;
      f localf = this.a.b();
      a(this.b.A());
      localf.g(true);
      localf.h(true);
      this.b = null;
      AppMethodBeat.o(100478);
    }
  }

  private void h()
  {
    AppMethodBeat.i(100479);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100479);
    while (true)
    {
      return;
      f localf = this.a.b();
      localf.g(false);
      localf.h(false);
      this.b = a(this.c);
      AppMethodBeat.o(100479);
    }
  }

  public iz a()
  {
    return this.a;
  }

  public lo a(lt paramlt)
  {
    AppMethodBeat.i(100471);
    if (this.a == null)
    {
      paramlt = null;
      AppMethodBeat.o(100471);
    }
    while (true)
    {
      return paramlt;
      paramlt = new lo(this, paramlt);
      this.a.a(paramlt);
      this.a.b().a();
      this.d = 0;
      AppMethodBeat.o(100471);
    }
  }

  public void a(int paramInt)
  {
    try
    {
      this.d += paramInt;
      return;
    }
    finally
    {
    }
  }

  public void a(da paramda)
  {
    AppMethodBeat.i(100477);
    this.c.a(paramda);
    AppMethodBeat.o(100477);
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(100472);
    if (this.a == null)
      AppMethodBeat.o(100472);
    while (true)
    {
      return;
      this.a.b(paramString, true);
      this.a.b().a();
      AppMethodBeat.o(100472);
    }
  }

  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public void b()
  {
    AppMethodBeat.i(100470);
    a(this.d, w.a(this.a.i()));
    this.a = null;
    this.d = 0;
    AppMethodBeat.o(100470);
  }

  public boolean c()
  {
    return this.e;
  }

  public void d()
  {
    AppMethodBeat.i(100474);
    if (this.b != null)
      this.b.e();
    AppMethodBeat.o(100474);
  }

  public void e()
  {
    AppMethodBeat.i(100476);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100476);
    while (true)
    {
      return;
      if (this.a.b().h() < 7)
      {
        g();
        AppMethodBeat.o(100476);
      }
      else if (!lq.d())
      {
        if (this.b != null)
          g();
        AppMethodBeat.o(100476);
      }
      else if (a(ln.a().c("china")))
      {
        if (this.b != null)
          g();
        AppMethodBeat.o(100476);
      }
      else
      {
        if (this.b == null)
          h();
        AppMethodBeat.o(100476);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ls
 * JD-Core Version:    0.6.2
 */