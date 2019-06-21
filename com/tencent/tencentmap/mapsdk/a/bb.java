package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.gg;
import com.tencent.tencentmap.mapsdk.maps.a.hz;
import com.tencent.tencentmap.mapsdk.maps.a.ia;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import java.util.ArrayList;
import java.util.List;

public class bb extends cc
{
  private iz a;

  public bb(gg paramgg)
  {
    AppMethodBeat.i(100738);
    this.a = null;
    this.a = ((iz)paramgg.getVectorMapDelegate());
    AppMethodBeat.o(100738);
  }

  private ArrayList<GeoPoint> a(List<db> paramList)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(100748);
    if (paramList == null)
    {
      AppMethodBeat.o(100748);
      paramList = localArrayList;
    }
    while (true)
    {
      return paramList;
      int i = paramList.size();
      if (i <= 0)
      {
        AppMethodBeat.o(100748);
        paramList = localArrayList;
      }
      else
      {
        localArrayList = new ArrayList();
        for (int j = 0; j < i; j++)
        {
          Object localObject = (db)paramList.get(j);
          if (localObject != null)
          {
            localObject = ic.a((db)localObject);
            if (localObject != null)
              localArrayList.add(localObject);
          }
        }
        AppMethodBeat.o(100748);
        paramList = localArrayList;
      }
    }
  }

  dj a(dk paramdk, ba paramba)
  {
    Object localObject = null;
    AppMethodBeat.i(100740);
    if (this.a == null)
    {
      AppMethodBeat.o(100740);
      paramdk = localObject;
    }
    while (true)
    {
      return paramdk;
      ia localia = new ia(this.a, paramdk);
      localia.a(paramdk);
      localia.c();
      if (!this.a.a(localia))
      {
        AppMethodBeat.o(100740);
        paramdk = localObject;
      }
      else
      {
        this.a.b().a();
        paramdk = new dj(paramdk, paramba, localia.A());
        AppMethodBeat.o(100740);
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(100739);
    if (this.a != null)
    {
      this.a.b(ia.class);
      this.a = null;
    }
    AppMethodBeat.o(100739);
  }

  void a(String paramString)
  {
    AppMethodBeat.i(100741);
    if (this.a == null)
      AppMethodBeat.o(100741);
    while (true)
    {
      return;
      this.a.b(paramString, true);
      this.a.b().a();
      AppMethodBeat.o(100741);
    }
  }

  void a(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100745);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100745);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100745);
          continue;
        }
        paramString.d(paramFloat);
        this.a.b().a();
        AppMethodBeat.o(100745);
      }
    }
  }

  void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(100742);
    if (this.a == null)
      AppMethodBeat.o(100742);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100742);
          continue;
        }
        paramString.d(paramInt);
        this.a.b().a();
        AppMethodBeat.o(100742);
      }
    }
  }

  void a(String paramString, List<db> paramList)
  {
    AppMethodBeat.i(100743);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100743);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100743);
          continue;
        }
        if (!(paramString instanceof ia))
        {
          AppMethodBeat.o(100743);
          continue;
        }
        paramString = (ia)paramString;
        paramString.a(a(paramList));
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100743);
      }
    }
  }

  void a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(100746);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100746);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100746);
          continue;
        }
        paramString.a(paramBoolean);
        this.a.b().a();
        AppMethodBeat.o(100746);
      }
    }
  }

  List<j> b(String paramString)
  {
    AppMethodBeat.i(100750);
    if ((this.a == null) || (this.a.b() == null))
    {
      AppMethodBeat.o(100750);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if ((paramString == null) || (!(paramString instanceof ia)))
        {
          AppMethodBeat.o(100750);
          paramString = null;
          continue;
        }
        ia localia = (ia)paramString;
        paramString = new ArrayList(1);
        paramString.add(localia);
        AppMethodBeat.o(100750);
      }
    }
  }

  void b()
  {
    AppMethodBeat.i(100749);
    if (this.a != null)
      this.a.c(ia.class);
    AppMethodBeat.o(100749);
  }

  void b(String paramString, float paramFloat)
  {
    AppMethodBeat.i(100747);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100747);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100747);
          continue;
        }
        paramString.c(paramFloat);
        this.a.b().a();
        AppMethodBeat.o(100747);
      }
    }
  }

  void b(String paramString, int paramInt)
  {
    AppMethodBeat.i(100744);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100744);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100744);
          continue;
        }
        paramString.c(paramInt);
        this.a.b().a();
        AppMethodBeat.o(100744);
      }
    }
  }

  void c(String paramString, int paramInt)
  {
    AppMethodBeat.i(100751);
    if ((this.a == null) || (this.a.b() == null))
      AppMethodBeat.o(100751);
    while (true)
    {
      return;
      synchronized (this.a.b)
      {
        paramString = this.a.b(paramString);
        if (paramString == null)
        {
          AppMethodBeat.o(100751);
          continue;
        }
        paramString.a_(paramInt);
        paramString.c();
        this.a.b().a();
        AppMethodBeat.o(100751);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bb
 * JD-Core Version:    0.6.2
 */