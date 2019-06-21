package com.tencent.map.lib.element;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.gl.model.GLIcon;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ev;
import com.tencent.tencentmap.mapsdk.maps.a.fn;
import com.tencent.tencentmap.mapsdk.maps.a.fw;
import com.tencent.tencentmap.mapsdk.maps.a.gh;
import com.tencent.tencentmap.mapsdk.maps.a.gj;

public class l
  implements j
{
  protected m a;
  protected GLIcon b;
  protected n c;
  protected DoublePoint d;
  private fn e;
  private boolean f;
  private ev g;

  public l()
  {
    AppMethodBeat.i(97883);
    this.d = new DoublePoint();
    this.g = null;
    this.f = true;
    AppMethodBeat.o(97883);
  }

  public l(m paramm)
  {
    AppMethodBeat.i(97884);
    this.d = new DoublePoint();
    this.g = null;
    this.a = paramm;
    this.b = new GLIcon(this.a.c(), this.a.a(), this.a.f(), this.a.g(), this.a.k(), this.a.l(), this.a.b());
    this.b.setFixPos(paramm.o());
    this.b.setFastLoad(paramm.p());
    this.b.setRotateAngle(paramm.h());
    this.b.setAvoidAnno(paramm.j());
    this.b.setAlpha(paramm.e());
    this.f = true;
    AppMethodBeat.o(97884);
  }

  public Rect a(fw paramfw)
  {
    AppMethodBeat.i(97888);
    if ((this.b == null) || (this.a == null) || (this.a.a() == null))
    {
      paramfw = null;
      AppMethodBeat.o(97888);
      return paramfw;
    }
    Object localObject;
    DoublePoint localDoublePoint;
    if (e())
    {
      localObject = a();
      localDoublePoint = new DoublePoint(0.0D, 0.0D);
      if (localObject != null)
      {
        localDoublePoint.x = ((GeoPoint)localObject).getLongitudeE6();
        localDoublePoint.y = ((GeoPoint)localObject).getLatitudeE6();
      }
    }
    for (this.d = localDoublePoint; ; this.d = paramfw.b(a()))
    {
      localObject = new DoublePoint();
      localDoublePoint = new DoublePoint();
      Bitmap localBitmap = this.b.getTextureBm(this.b.getState());
      int i = localBitmap.getWidth();
      int j = localBitmap.getHeight();
      ((DoublePoint)localObject).x = this.d.x;
      localDoublePoint.x = (this.d.x + i);
      ((DoublePoint)localObject).y = this.d.y;
      localDoublePoint.y = (this.d.y + j);
      float f1 = this.a.f();
      i = (int)(i * f1);
      f1 = this.a.g();
      j = (int)(j * f1);
      ((DoublePoint)localObject).x -= i;
      localDoublePoint.x -= i;
      ((DoublePoint)localObject).y -= j;
      localDoublePoint.y -= j;
      i = this.a.k();
      j = this.a.l();
      ((DoublePoint)localObject).x += i;
      localDoublePoint.x += i;
      ((DoublePoint)localObject).y += j;
      double d1 = localDoublePoint.y;
      localDoublePoint.y = (j + d1);
      localObject = paramfw.a((DoublePoint)localObject);
      paramfw = paramfw.a(localDoublePoint);
      paramfw = new Rect(((GeoPoint)localObject).getLongitudeE6(), ((GeoPoint)localObject).getLatitudeE6(), paramfw.getLongitudeE6(), paramfw.getLatitudeE6());
      AppMethodBeat.o(97888);
      break;
    }
  }

  public GeoPoint a()
  {
    AppMethodBeat.i(97893);
    GeoPoint localGeoPoint = this.a.a();
    AppMethodBeat.o(97893);
    return localGeoPoint;
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(97895);
    this.a = this.a.a(paramFloat);
    if (this.b != null)
    {
      this.b.setAlpha(paramFloat);
      this.b.setDirty(true);
    }
    AppMethodBeat.o(97895);
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(97896);
    this.a = this.a.a(paramFloat1, paramFloat2);
    if (this.b != null)
    {
      this.b.setAnchor(paramFloat1, paramFloat2);
      this.b.setDirty(true);
    }
    AppMethodBeat.o(97896);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(97892);
    this.a = this.a.c(paramInt);
    if (this.b != null)
      this.b.setDirty(true);
    AppMethodBeat.o(97892);
  }

  public void a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(97891);
    this.a = this.a.a(paramGeoPoint);
    if (this.b != null)
    {
      this.b.setPosition(paramGeoPoint);
      this.b.setDirty(true);
    }
    AppMethodBeat.o(97891);
  }

  public void a(m paramm)
  {
    AppMethodBeat.i(97885);
    if (paramm == null)
    {
      AppMethodBeat.o(97885);
      return;
    }
    if (this.a == null)
      this.a = paramm;
    while (true)
    {
      if (this.b == null)
        this.b = new GLIcon(this.a.c(), this.a.a(), this.a.f(), this.a.g(), this.a.k(), this.a.l(), this.a.b());
      this.b.setAlpha(this.a.e());
      this.b.setAnchor(this.a.f(), this.a.g());
      this.b.setRotateAngle(paramm.h());
      this.b.setFixPos(paramm.o());
      this.b.setFastLoad(paramm.p());
      this.b.setAvoidAnno(paramm.j());
      AppMethodBeat.o(97885);
      break;
      this.a.a(paramm.e());
      this.a.a(paramm.f(), paramm.g());
      this.a.b(paramm.d());
      this.a.a(paramm.h());
      this.a.b(paramm.m());
      this.a.c(paramm.j());
      this.a.c(paramm.n());
    }
  }

  public void a(String paramString, Bitmap[] paramArrayOfBitmap)
  {
    AppMethodBeat.i(97890);
    this.a = this.a.a(paramString, paramArrayOfBitmap);
    if (this.b != null)
    {
      this.b.update(paramString, paramArrayOfBitmap);
      this.b.setDirty(true);
    }
    AppMethodBeat.o(97890);
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public boolean a(fw paramfw, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(97887);
    if ((!d()) || (this.a.a() == null) || (this.e == null))
    {
      AppMethodBeat.o(97887);
      bool = false;
      return bool;
    }
    paramfw = this.e.f().a(paramFloat1, paramFloat2);
    if ((paramfw != null) && (paramfw.itemId == f()));
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
        this.b.setState(1);
      while (true)
      {
        if ((bool) && (this.c != null))
          this.c.a(this);
        AppMethodBeat.o(97887);
        break;
        this.b.setState(0);
      }
    }
  }

  public float b()
  {
    AppMethodBeat.i(97897);
    float f1 = this.a.f();
    AppMethodBeat.o(97897);
    return f1;
  }

  public Rect b(fw paramfw)
  {
    AppMethodBeat.i(97889);
    if ((this.b == null) || (this.a == null) || (this.a.a() == null))
    {
      paramfw = null;
      AppMethodBeat.o(97889);
      return paramfw;
    }
    Object localObject;
    label87: DoublePoint localDoublePoint;
    int i;
    int j;
    if (e())
    {
      localObject = a();
      paramfw = new DoublePoint(0.0D, 0.0D);
      if (localObject != null)
      {
        paramfw.x = ((GeoPoint)localObject).getLongitudeE6();
        paramfw.y = ((GeoPoint)localObject).getLatitudeE6();
      }
      this.d = paramfw;
      localDoublePoint = new DoublePoint();
      localObject = new DoublePoint();
      paramfw = this.b.getTextureBm(this.b.getState());
      if (paramfw == null)
        break label389;
      i = paramfw.getWidth();
      j = paramfw.getHeight();
    }
    while (true)
    {
      localDoublePoint.x = this.d.x;
      ((DoublePoint)localObject).x = (this.d.x + i);
      localDoublePoint.y = this.d.y;
      ((DoublePoint)localObject).y = (this.d.y + j);
      i = (int)(this.a.f() * i);
      float f1 = this.a.g();
      j = (int)(j * f1);
      localDoublePoint.x -= i;
      ((DoublePoint)localObject).x -= i;
      localDoublePoint.y -= j;
      ((DoublePoint)localObject).y -= j;
      i = this.a.k();
      j = this.a.l();
      localDoublePoint.x += i;
      ((DoublePoint)localObject).x += i;
      localDoublePoint.y += j;
      double d1 = ((DoublePoint)localObject).y;
      ((DoublePoint)localObject).y = (j + d1);
      paramfw = new Rect((int)localDoublePoint.x, (int)localDoublePoint.y, (int)((DoublePoint)localObject).x, (int)((DoublePoint)localObject).y);
      AppMethodBeat.o(97889);
      break;
      this.d = paramfw.b(a());
      break label87;
      label389: j = 0;
      i = 0;
    }
  }

  public void b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(97899);
    if (this.b != null)
    {
      this.b.setScale(paramFloat1, paramFloat2);
      this.b.setDirty(true);
    }
    AppMethodBeat.o(97899);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(97894);
    this.a = this.a.a(paramInt);
    if (this.b != null)
    {
      this.b.setRotateAngle(paramInt);
      this.b.setDirty(true);
    }
    AppMethodBeat.o(97894);
  }

  public void b(gj paramgj, fw paramfw)
  {
    AppMethodBeat.i(97886);
    if (!d())
    {
      if (this.b != null)
        this.b.mDisplayId = -1;
      AppMethodBeat.o(97886);
      return;
    }
    this.e = paramgj.b();
    if (this.g != null)
    {
      if (this.g.b())
        break label140;
      this.g.a();
    }
    while (true)
    {
      if (this.b != null)
        paramgj.a(this.a.a(), this.b, this.a.d(), this.a.h(), this.a.i(), this.a.q(), this.a.m(), this.a.n());
      AppMethodBeat.o(97886);
      break;
      label140: this.g = null;
    }
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(97901);
    if (this.b != null)
    {
      this.b.setFixPos(paramBoolean);
      this.b.setDirty(true);
    }
    AppMethodBeat.o(97901);
  }

  public float c()
  {
    AppMethodBeat.i(97898);
    float f1 = this.a.g();
    AppMethodBeat.o(97898);
    return f1;
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(97900);
    this.a = this.a.b(paramInt);
    if (this.b != null)
      this.b.setDirty(true);
    AppMethodBeat.o(97900);
  }

  public boolean d()
  {
    return this.f;
  }

  public boolean e()
  {
    AppMethodBeat.i(97902);
    boolean bool;
    if (this.b != null)
    {
      bool = this.b.isFixPos();
      AppMethodBeat.o(97902);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97902);
    }
  }

  public int f()
  {
    if (this.b != null);
    for (int i = this.b.mDisplayId; ; i = -1)
      return i;
  }

  public void g()
  {
    if (this.b != null)
      this.b.mDisplayId = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.element.l
 * JD-Core Version:    0.6.2
 */