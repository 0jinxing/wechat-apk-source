package com.tencent.tencentmap.mapsdk.a;

import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class ee
  implements Polyline
{
  private dl a;

  public ee(dl paramdl)
  {
    this.a = paramdl;
  }

  public void eraseTo(int paramInt, LatLng paramLatLng)
  {
    AppMethodBeat.i(101443);
    if (this.a == null)
      AppMethodBeat.o(101443);
    while (true)
    {
      return;
      this.a.a(paramInt, ej.a(paramLatLng));
      AppMethodBeat.o(101443);
    }
  }

  public int getColor()
  {
    AppMethodBeat.i(101434);
    int i;
    if (this.a != null)
    {
      i = this.a.f();
      AppMethodBeat.o(101434);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101434);
    }
  }

  public String getId()
  {
    AppMethodBeat.i(101428);
    String str;
    if (this.a != null)
    {
      str = this.a.c();
      AppMethodBeat.o(101428);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(101428);
    }
  }

  public int getLevel()
  {
    AppMethodBeat.i(101438);
    int i;
    if (this.a != null)
    {
      i = this.a.k();
      AppMethodBeat.o(101438);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101438);
    }
  }

  public List<LatLng> getPoints()
  {
    AppMethodBeat.i(101430);
    List localList;
    if (this.a != null)
    {
      localList = ej.a(this.a.d());
      AppMethodBeat.o(101430);
    }
    while (true)
    {
      return localList;
      localList = null;
      AppMethodBeat.o(101430);
    }
  }

  public float getWidth()
  {
    AppMethodBeat.i(101432);
    float f;
    if (this.a != null)
    {
      f = this.a.e();
      AppMethodBeat.o(101432);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101432);
    }
  }

  public float getZIndex()
  {
    AppMethodBeat.i(101437);
    float f;
    if (this.a != null)
    {
      f = this.a.g();
      AppMethodBeat.o(101437);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101437);
    }
  }

  public boolean isDottedLine()
  {
    AppMethodBeat.i(101441);
    boolean bool;
    if ((this.a == null) || (this.a.i() == null))
    {
      bool = false;
      AppMethodBeat.o(101441);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(101441);
    }
  }

  public boolean isGeodesic()
  {
    return false;
  }

  public boolean isVisible()
  {
    AppMethodBeat.i(101440);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.h();
      AppMethodBeat.o(101440);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101440);
    }
  }

  public void remove()
  {
    AppMethodBeat.i(101427);
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(101427);
  }

  public void setColor(int paramInt)
  {
    AppMethodBeat.i(101433);
    if (this.a != null)
      this.a.a(paramInt);
    AppMethodBeat.o(101433);
  }

  public void setColorTexture(BitmapDescriptor paramBitmapDescriptor)
  {
    AppMethodBeat.i(101442);
    if (this.a == null)
      AppMethodBeat.o(101442);
    while (true)
    {
      return;
      this.a.a(cn.a(paramBitmapDescriptor.getBitmap()));
      AppMethodBeat.o(101442);
    }
  }

  public void setDottedLine(boolean paramBoolean)
  {
  }

  public void setEraseable(boolean paramBoolean)
  {
    AppMethodBeat.i(101444);
    if (this.a == null)
      AppMethodBeat.o(101444);
    while (true)
    {
      return;
      this.a.b(paramBoolean);
      AppMethodBeat.o(101444);
    }
  }

  public void setGeodesic(boolean paramBoolean)
  {
  }

  public void setLevel(int paramInt)
  {
    AppMethodBeat.i(101436);
    if (this.a != null)
      this.a.c(paramInt);
    AppMethodBeat.o(101436);
  }

  public void setPoints(List<LatLng> paramList)
  {
    AppMethodBeat.i(101429);
    if (this.a != null)
      this.a.a(ej.b(paramList));
    AppMethodBeat.o(101429);
  }

  public void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(101439);
    if (this.a != null)
      this.a.a(paramBoolean);
    AppMethodBeat.o(101439);
  }

  public void setWidth(float paramFloat)
  {
    AppMethodBeat.i(101431);
    if (this.a != null)
    {
      dl localdl = this.a;
      float f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F;
      localdl.a(f);
    }
    AppMethodBeat.o(101431);
  }

  public void setZIndex(float paramFloat)
  {
    AppMethodBeat.i(101435);
    if (this.a != null)
      this.a.b((int)paramFloat);
    AppMethodBeat.o(101435);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ee
 * JD-Core Version:    0.6.2
 */