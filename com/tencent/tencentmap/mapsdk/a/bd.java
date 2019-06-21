package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.gg;
import com.tencent.tencentmap.mapsdk.maps.a.hz;
import com.tencent.tencentmap.mapsdk.maps.a.ib;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import java.util.ArrayList;
import java.util.List;

public final class bd extends cd
  implements cb
{
  private iz a;
  private aj.o b;

  public bd(gg paramgg)
  {
    AppMethodBeat.i(100765);
    this.a = null;
    this.b = null;
    this.a = ((iz)paramgg.getVectorMapDelegate());
    if ((this.a != null) && (this.a.a(ib.class) == null))
      this.a.a(ib.class, this);
    AppMethodBeat.o(100765);
  }

  final dl a(dm paramdm, bc parambc)
  {
    Object localObject = null;
    AppMethodBeat.i(100767);
    if (this.a == null)
    {
      AppMethodBeat.o(100767);
      paramdm = localObject;
    }
    while (true)
    {
      return paramdm;
      ib localib = new ib(this.a);
      localib.a(paramdm);
      localib.c();
      if (!this.a.a(localib))
      {
        AppMethodBeat.o(100767);
        paramdm = localObject;
      }
      else
      {
        this.a.b().a();
        paramdm = new dl(paramdm, parambc, localib.A());
        localib.a(paramdm);
        AppMethodBeat.o(100767);
      }
    }
  }

  public final void a()
  {
    AppMethodBeat.i(100766);
    if (this.a != null)
    {
      this.a.b(ib.class);
      this.a = null;
    }
    AppMethodBeat.o(100766);
  }

  final void a(String paramString)
  {
    AppMethodBeat.i(100768);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100768);
    while (true)
    {
      return;
      this.a.b(paramString, true);
      this.a.b().a();
      AppMethodBeat.o(100768);
    }
  }

  final void a(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100772);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100772);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100772);
          continue;
        }
        if (!(paramString instanceof ib))
        {
          AppMethodBeat.o(100772);
          continue;
        }
        paramString = (ib)paramString;
        paramString.d(paramFloat);
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100772);
      }
    }
  }

  final void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(100769);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100769);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100769);
          continue;
        }
        paramString.c(paramInt);
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100769);
      }
    }
  }

  final void a(String paramString, int paramInt, db paramdb)
  {
    AppMethodBeat.i(100776);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100776);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100776);
          continue;
        }
        if (!(paramString instanceof ib))
        {
          AppMethodBeat.o(100776);
          continue;
        }
        ((ib)paramString).a(paramInt, paramdb);
        this.a.b().a();
        AppMethodBeat.o(100776);
      }
    }
  }

  final void a(String paramString, cm paramcm)
  {
    AppMethodBeat.i(100775);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100775);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100775);
          continue;
        }
        if (!(paramString instanceof ib))
        {
          AppMethodBeat.o(100775);
          continue;
        }
        paramString = (ib)paramString;
        paramString.a(paramcm);
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100775);
      }
    }
  }

  final void a(String paramString, List<db> paramList)
  {
    AppMethodBeat.i(100770);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100770);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100770);
          continue;
        }
        if (!(paramString instanceof ib))
        {
          AppMethodBeat.o(100770);
          continue;
        }
        paramString = (ib)paramString;
      }
      try
      {
        paramString.a(paramList);
        label88: paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100770);
        continue;
        paramString = finally;
        AppMethodBeat.o(100770);
        throw paramString;
      }
      catch (IndexOutOfBoundsException paramList)
      {
        break label88;
      }
    }
  }

  final void a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100771);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100771);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100771);
          continue;
        }
        paramString.a(paramBoolean);
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100771);
      }
    }
  }

  public final boolean a(hz paramhz, boolean paramBoolean, GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(100778);
    paramhz = (ib)paramhz;
    paramBoolean = paramhz.h().j();
    if ((this.b != null) && (paramBoolean))
    {
      paramGeoPoint = ic.a(paramGeoPoint);
      this.b.a(paramhz.h(), paramGeoPoint);
      paramBoolean = true;
      AppMethodBeat.o(100778);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(100778);
    }
  }

  final List<j> b(String paramString)
  {
    AppMethodBeat.i(100779);
    if ((this.a == null) || (this.a.b() == null))
    {
      AppMethodBeat.o(100779);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if ((paramString == null) || (!(paramString instanceof ib)))
        {
          AppMethodBeat.o(100779);
          paramString = null;
          continue;
        }
        ib localib = (ib)paramString;
        paramString = new ArrayList(1);
        paramString.add(localib.j());
        AppMethodBeat.o(100779);
      }
    }
  }

  final void b()
  {
    AppMethodBeat.i(100774);
    if (this.a != null)
      this.a.c(ib.class);
    AppMethodBeat.o(100774);
  }

  final void b(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100773);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100773);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100773);
          continue;
        }
        if (!(paramString instanceof ib))
        {
          AppMethodBeat.o(100773);
          continue;
        }
        paramString = (ib)paramString;
        paramString.c(paramFloat);
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100773);
      }
    }
  }

  final void b(String paramString, int paramInt)
  {
    AppMethodBeat.i(100780);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100780);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100780);
          continue;
        }
        paramString.a_(paramInt);
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100780);
      }
    }
  }

  final void b(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100777);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100777);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100777);
          continue;
        }
        if (!(paramString instanceof ib))
        {
          AppMethodBeat.o(100777);
          continue;
        }
        ((ib)paramString).d(paramBoolean);
        this.a.b().a();
        AppMethodBeat.o(100777);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bd
 * JD-Core Version:    0.6.2
 */