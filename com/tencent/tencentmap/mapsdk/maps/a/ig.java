package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class ig extends if
{
  protected boolean e;
  protected List<if> f;

  public ig(boolean paramBoolean)
  {
    AppMethodBeat.i(99837);
    this.e = true;
    this.f = null;
    this.e = paramBoolean;
    if (this.f == null)
      this.f = new ArrayList();
    AppMethodBeat.o(99837);
  }

  protected void a(float paramFloat, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(99840);
    if (this.f == null)
      AppMethodBeat.o(99840);
    while (true)
    {
      return;
      int i = this.f.size();
      if (i == 0)
      {
        AppMethodBeat.o(99840);
      }
      else
      {
        int j = 0;
        if (j < i)
        {
          if localif = (if)this.f.get(j);
          if (localif != null)
          {
            if (this.e != true)
              break label91;
            localif.a(paramFloat, paramInterpolator);
          }
          while (true)
          {
            j++;
            break;
            label91: localif.a(paramFloat, localif.a());
          }
        }
        AppMethodBeat.o(99840);
      }
    }
  }

  public void a(if.b paramb)
  {
    AppMethodBeat.i(99842);
    super.a(paramb);
    if (this.f == null)
      AppMethodBeat.o(99842);
    while (true)
    {
      return;
      int i = this.f.size();
      if (i == 0)
      {
        AppMethodBeat.o(99842);
      }
      else
      {
        for (int j = 0; j < i; j++)
        {
          if localif = (if)this.f.get(j);
          if (localif != null)
            localif.a(paramb);
        }
        AppMethodBeat.o(99842);
      }
    }
  }

  public void a(if paramif)
  {
    AppMethodBeat.i(99838);
    if (paramif == null)
      AppMethodBeat.o(99838);
    while (true)
    {
      return;
      this.f.add(paramif);
      AppMethodBeat.o(99838);
    }
  }

  public boolean a(GeoPoint paramGeoPoint1, GeoPoint paramGeoPoint2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(99841);
    boolean bool2 = super.a(paramGeoPoint1, paramGeoPoint2);
    if (!bool2)
    {
      AppMethodBeat.o(99841);
      bool2 = bool1;
    }
    int i;
    while (true)
    {
      return bool2;
      if (this.f == null)
      {
        AppMethodBeat.o(99841);
        bool2 = bool1;
      }
      else
      {
        i = this.f.size();
        if (i != 0)
          break;
        AppMethodBeat.o(99841);
        bool2 = bool1;
      }
    }
    int j = 0;
    label79: if (j < i)
    {
      if localif = (if)this.f.get(j);
      if (localif == null)
        break label145;
      if ((bool2) && (localif.a(paramGeoPoint1, paramGeoPoint2)))
        bool2 = true;
    }
    label145: 
    while (true)
    {
      j++;
      break label79;
      bool2 = false;
      continue;
      AppMethodBeat.o(99841);
      break;
    }
  }

  public void g()
  {
    AppMethodBeat.i(99839);
    if (this.f == null)
      AppMethodBeat.o(99839);
    while (true)
    {
      return;
      this.f.clear();
      AppMethodBeat.o(99839);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ig
 * JD-Core Version:    0.6.2
 */