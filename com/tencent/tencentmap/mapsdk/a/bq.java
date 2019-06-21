package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.gg;
import com.tencent.tencentmap.mapsdk.maps.a.hu;
import com.tencent.tencentmap.mapsdk.maps.a.hz;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import java.util.ArrayList;
import java.util.List;

public final class bq extends bu
  implements cb
{
  private iz a;

  public bq(gg paramgg)
  {
    AppMethodBeat.i(100870);
    this.a = null;
    this.a = ((iz)paramgg.getVectorMapDelegate());
    if (this.a == null)
      AppMethodBeat.o(100870);
    while (true)
    {
      return;
      if (this.a.a(hu.class) == null)
        this.a.a(hu.class, this);
      AppMethodBeat.o(100870);
    }
  }

  final cq a(cr paramcr, bp parambp)
  {
    Object localObject = null;
    AppMethodBeat.i(100872);
    if (this.a == null)
    {
      AppMethodBeat.o(100872);
      paramcr = localObject;
    }
    while (true)
    {
      return paramcr;
      hu localhu = new hu(this.a);
      localhu.a(paramcr);
      localhu.c();
      if (!this.a.a(localhu))
      {
        AppMethodBeat.o(100872);
        paramcr = localObject;
      }
      else
      {
        this.a.b().a();
        paramcr = new cq(paramcr, parambp, localhu.A());
        AppMethodBeat.o(100872);
      }
    }
  }

  public final void a()
  {
    AppMethodBeat.i(100871);
    if (this.a != null)
    {
      this.a.b(hu.class);
      this.a = null;
    }
    AppMethodBeat.o(100871);
  }

  final void a(String paramString)
  {
    AppMethodBeat.i(100873);
    if (this.a == null)
      AppMethodBeat.o(100873);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString, false);
        if ((paramString == null) || (!(paramString instanceof hu)))
        {
          AppMethodBeat.o(100873);
          continue;
        }
        paramString.d();
        this.a.b().a();
        AppMethodBeat.o(100873);
      }
    }
  }

  final void a(String paramString, double paramDouble)
  {
    AppMethodBeat.i(100876);
    if (this.a == null)
      AppMethodBeat.o(100876);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100876);
          continue;
        }
        if (!(paramString instanceof hu))
        {
          AppMethodBeat.o(100876);
          continue;
        }
        ((hu)paramString).a(paramDouble);
        this.a.b().a();
        AppMethodBeat.o(100876);
      }
    }
  }

  final void a(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100878);
    if (this.a == null)
      AppMethodBeat.o(100878);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100878);
          continue;
        }
        if (!(paramString instanceof hu))
        {
          AppMethodBeat.o(100878);
          continue;
        }
        ((hu)paramString).d(paramFloat);
        this.a.b().a();
        AppMethodBeat.o(100878);
      }
    }
  }

  final void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(100875);
    if (this.a == null)
      AppMethodBeat.o(100875);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100875);
          continue;
        }
        if (!(paramString instanceof hu))
        {
          AppMethodBeat.o(100875);
          continue;
        }
        ((hu)paramString).d(paramInt);
        this.a.b().a();
        AppMethodBeat.o(100875);
      }
    }
  }

  final void a(String paramString, db paramdb)
  {
    AppMethodBeat.i(100874);
    if (this.a == null)
      AppMethodBeat.o(100874);
    while (true)
    {
      return;
      if (paramdb == null)
      {
        AppMethodBeat.o(100874);
        continue;
      }
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100874);
          continue;
        }
        if (!(paramString instanceof hu))
        {
          AppMethodBeat.o(100874);
          continue;
        }
        ((hu)paramString).a(ic.a(paramdb));
        this.a.b().a();
        AppMethodBeat.o(100874);
      }
    }
  }

  final void a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100879);
    if (this.a == null)
      AppMethodBeat.o(100879);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100879);
          continue;
        }
        if (!(paramString instanceof hu))
        {
          AppMethodBeat.o(100879);
          continue;
        }
        ((hu)paramString).a(paramBoolean);
        this.a.b().a();
        AppMethodBeat.o(100879);
      }
    }
  }

  public final boolean a(hz paramhz, boolean paramBoolean, GeoPoint paramGeoPoint)
  {
    return false;
  }

  final List<j> b(String paramString)
  {
    AppMethodBeat.i(100883);
    if (this.a == null)
    {
      AppMethodBeat.o(100883);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if ((paramString == null) || (!(paramString instanceof hu)))
        {
          AppMethodBeat.o(100883);
          paramString = null;
          continue;
        }
        hu localhu = (hu)paramString;
        paramString = new ArrayList(1);
        paramString.add(localhu);
        AppMethodBeat.o(100883);
      }
    }
  }

  final void b()
  {
    AppMethodBeat.i(100882);
    if (this.a != null)
      this.a.c(hu.class);
    AppMethodBeat.o(100882);
  }

  final void b(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100880);
    if (this.a == null)
      AppMethodBeat.o(100880);
    while (true)
    {
      return;
      hz localhz = this.a.b(paramString);
      if (localhz != null)
        localhz.c(paramFloat);
      this.a.a(paramString, paramFloat);
      this.a.b().a();
      AppMethodBeat.o(100880);
    }
  }

  final void b(String paramString, int paramInt)
  {
    AppMethodBeat.i(100877);
    if (this.a == null)
      AppMethodBeat.o(100877);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100877);
          continue;
        }
        if (!(paramString instanceof hu))
        {
          AppMethodBeat.o(100877);
          continue;
        }
        ((hu)paramString).c(paramInt);
        this.a.b().a();
        AppMethodBeat.o(100877);
      }
    }
  }

  final void c(String paramString, int paramInt)
  {
    AppMethodBeat.i(100881);
    if (this.a == null)
      AppMethodBeat.o(100881);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100881);
          continue;
        }
        if (!(paramString instanceof hu))
        {
          AppMethodBeat.o(100881);
          continue;
        }
        if (paramString != null)
          paramString.a_(paramInt);
        this.a.b().a();
        AppMethodBeat.o(100881);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bq
 * JD-Core Version:    0.6.2
 */