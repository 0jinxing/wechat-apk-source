package com.tencent.tencentmap.mapsdk.a;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Polygon;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class ef
  implements Polygon
{
  private dj a;

  public ef(dj paramdj)
  {
    this.a = paramdj;
  }

  public boolean contains(LatLng paramLatLng)
  {
    AppMethodBeat.i(101426);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.a(ej.a(paramLatLng));
      AppMethodBeat.o(101426);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101426);
    }
  }

  public int getFillColor()
  {
    AppMethodBeat.i(101419);
    int i;
    if (this.a != null)
    {
      i = this.a.g();
      AppMethodBeat.o(101419);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101419);
    }
  }

  public String getId()
  {
    AppMethodBeat.i(101411);
    String str;
    if (this.a != null)
    {
      str = this.a.c();
      AppMethodBeat.o(101411);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(101411);
    }
  }

  public int getLevel()
  {
    AppMethodBeat.i(101423);
    int i;
    if (this.a != null)
    {
      i = this.a.j();
      AppMethodBeat.o(101423);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101423);
    }
  }

  public List<LatLng> getPoints()
  {
    AppMethodBeat.i(101413);
    List localList;
    if (this.a != null)
    {
      localList = ej.a(this.a.d());
      AppMethodBeat.o(101413);
    }
    while (true)
    {
      return localList;
      localList = null;
      AppMethodBeat.o(101413);
    }
  }

  public int getStrokeColor()
  {
    AppMethodBeat.i(101417);
    int i;
    if (this.a != null)
    {
      i = this.a.f();
      AppMethodBeat.o(101417);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101417);
    }
  }

  public float getStrokeWidth()
  {
    AppMethodBeat.i(101415);
    float f;
    if (this.a != null)
    {
      f = this.a.e() * y.g();
      AppMethodBeat.o(101415);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101415);
    }
  }

  public float getZIndex()
  {
    AppMethodBeat.i(101421);
    float f;
    if (this.a != null)
    {
      f = (int)this.a.h();
      AppMethodBeat.o(101421);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101421);
    }
  }

  public boolean isVisible()
  {
    AppMethodBeat.i(101425);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.i();
      AppMethodBeat.o(101425);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101425);
    }
  }

  public void remove()
  {
    AppMethodBeat.i(101410);
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(101410);
  }

  public void setFillColor(int paramInt)
  {
    AppMethodBeat.i(101418);
    if (this.a != null)
      this.a.b(paramInt);
    AppMethodBeat.o(101418);
  }

  public void setLevel(int paramInt)
  {
    AppMethodBeat.i(101422);
    if (this.a != null)
      this.a.d(paramInt);
    AppMethodBeat.o(101422);
  }

  public void setPoints(List<LatLng> paramList)
  {
    AppMethodBeat.i(101412);
    if (this.a != null)
      this.a.a(ej.b(paramList));
    AppMethodBeat.o(101412);
  }

  public void setStrokeColor(int paramInt)
  {
    AppMethodBeat.i(101416);
    if (this.a != null)
      this.a.a(paramInt);
    AppMethodBeat.o(101416);
  }

  public void setStrokeWidth(float paramFloat)
  {
    AppMethodBeat.i(101414);
    if (this.a != null)
    {
      dj localdj = this.a;
      float f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F;
      localdj.a(f / y.g());
    }
    AppMethodBeat.o(101414);
  }

  public void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(101424);
    if (this.a != null)
      this.a.a(paramBoolean);
    AppMethodBeat.o(101424);
  }

  public void setZIndex(float paramFloat)
  {
    AppMethodBeat.i(101420);
    if (this.a != null)
      this.a.c((int)paramFloat);
    AppMethodBeat.o(101420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ef
 * JD-Core Version:    0.6.2
 */