package com.tencent.tencentmap.mapsdk.a;

import android.graphics.DashPathEffect;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class eb
  implements Circle
{
  private cq a;

  public eb(cq paramcq)
  {
    this.a = paramcq;
  }

  public boolean contains(LatLng paramLatLng)
  {
    AppMethodBeat.i(101363);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.a(ej.a(paramLatLng));
      AppMethodBeat.o(101363);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101363);
    }
  }

  public LatLng getCenter()
  {
    AppMethodBeat.i(101348);
    LatLng localLatLng;
    if (this.a != null)
    {
      localLatLng = ej.a(this.a.d());
      AppMethodBeat.o(101348);
    }
    while (true)
    {
      return localLatLng;
      localLatLng = null;
      AppMethodBeat.o(101348);
    }
  }

  public int getFillColor()
  {
    AppMethodBeat.i(101356);
    int i;
    if (this.a != null)
    {
      i = this.a.h();
      AppMethodBeat.o(101356);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101356);
    }
  }

  public String getId()
  {
    AppMethodBeat.i(101346);
    String str;
    if (this.a != null)
    {
      str = this.a.c();
      AppMethodBeat.o(101346);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(101346);
    }
  }

  public int getLevel()
  {
    AppMethodBeat.i(101360);
    int i;
    if (this.a != null)
    {
      i = this.a.k();
      AppMethodBeat.o(101360);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101360);
    }
  }

  public double getRadius()
  {
    AppMethodBeat.i(101350);
    double d;
    if (this.a != null)
    {
      d = this.a.e();
      AppMethodBeat.o(101350);
    }
    while (true)
    {
      return d;
      d = 0.0D;
      AppMethodBeat.o(101350);
    }
  }

  public int getStrokeColor()
  {
    AppMethodBeat.i(101354);
    int i;
    if (this.a != null)
    {
      i = this.a.g();
      AppMethodBeat.o(101354);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101354);
    }
  }

  public boolean getStrokeDash()
  {
    return false;
  }

  public DashPathEffect getStrokeDashPathEffect()
  {
    return null;
  }

  public float getStrokeWidth()
  {
    AppMethodBeat.i(101352);
    float f;
    if (this.a != null)
    {
      f = this.a.f() * y.g();
      AppMethodBeat.o(101352);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101352);
    }
  }

  public float getZIndex()
  {
    AppMethodBeat.i(101358);
    float f;
    if (this.a != null)
    {
      f = (int)this.a.i();
      AppMethodBeat.o(101358);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101358);
    }
  }

  public boolean isVisible()
  {
    AppMethodBeat.i(101362);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.j();
      AppMethodBeat.o(101362);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101362);
    }
  }

  public void remove()
  {
    AppMethodBeat.i(101345);
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(101345);
  }

  public void setCenter(LatLng paramLatLng)
  {
    AppMethodBeat.i(101347);
    if (this.a != null)
      this.a.b(ej.a(paramLatLng));
    AppMethodBeat.o(101347);
  }

  public void setFillColor(int paramInt)
  {
    AppMethodBeat.i(101355);
    if (this.a != null)
      this.a.b(paramInt);
    AppMethodBeat.o(101355);
  }

  public void setLevel(int paramInt)
  {
    AppMethodBeat.i(101359);
    if (this.a != null)
      this.a.d(paramInt);
    AppMethodBeat.o(101359);
  }

  public void setRadius(double paramDouble)
  {
    AppMethodBeat.i(101349);
    if (this.a != null)
      this.a.a(paramDouble);
    AppMethodBeat.o(101349);
  }

  public void setStrokeColor(int paramInt)
  {
    AppMethodBeat.i(101353);
    if (this.a != null)
      this.a.a(paramInt);
    AppMethodBeat.o(101353);
  }

  public void setStrokeDash(boolean paramBoolean)
  {
  }

  public void setStrokeWidth(float paramFloat)
  {
    AppMethodBeat.i(101351);
    if (this.a != null)
    {
      cq localcq = this.a;
      float f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F;
      localcq.a(f / y.g());
    }
    AppMethodBeat.o(101351);
  }

  public void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(101361);
    if (this.a != null)
      this.a.a(paramBoolean);
    AppMethodBeat.o(101361);
  }

  public void setZIndex(float paramFloat)
  {
    AppMethodBeat.i(101357);
    if (this.a != null)
      this.a.c((int)paramFloat);
    AppMethodBeat.o(101357);
  }

  public void strokeDashPathEffect(DashPathEffect paramDashPathEffect)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eb
 * JD-Core Version:    0.6.2
 */