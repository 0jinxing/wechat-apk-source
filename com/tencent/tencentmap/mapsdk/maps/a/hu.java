package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.basemap.data.b;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.f;
import com.tencent.map.lib.mapstructure.CircleInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cr;
import com.tencent.tencentmap.mapsdk.a.db;
import javax.microedition.khronos.opengles.GL10;

public class hu extends hz
  implements j
{
  private GeoPoint a;
  private double b;
  private float c;
  private iz d;
  private cr e;
  private int f;
  private CircleInfo g;

  public hu(iz paramiz)
  {
    AppMethodBeat.i(99586);
    this.a = new GeoPoint(39909230, 116397428);
    this.b = 0.0D;
    this.c = 1000.0F;
    this.d = null;
    this.f = -1;
    this.g = new CircleInfo();
    this.d = paramiz;
    AppMethodBeat.o(99586);
  }

  private double a(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(99595);
    paramDouble1 /= Math.cos(3.141592653589793D * paramDouble2 / 180.0D);
    AppMethodBeat.o(99595);
    return paramDouble1;
  }

  private b a(db paramdb)
  {
    AppMethodBeat.i(99596);
    if (paramdb == null)
    {
      paramdb = null;
      AppMethodBeat.o(99596);
    }
    while (true)
    {
      return paramdb;
      double d1 = paramdb.a;
      paramdb = new b(paramdb.b * 20037508.34D / 180.0D, Math.log(Math.tan((d1 + 90.0D) * 3.141592653589793D / 360.0D)) / 0.0174532925199433D * 20037508.34D / 180.0D);
      AppMethodBeat.o(99596);
    }
  }

  private db a(b paramb)
  {
    AppMethodBeat.i(99597);
    float f1 = (float)(paramb.b() * 180.0D / 20037508.34D);
    paramb = new db((float)(57.295779513082323D * (2.0D * Math.atan(Math.exp((float)(paramb.a() * 180.0D / 20037508.34D) * 3.141592653589793D / 180.0D)) - 1.570796326794897D)), f1);
    AppMethodBeat.o(99597);
    return paramb;
  }

  public Rect a(fw paramfw)
  {
    AppMethodBeat.i(99594);
    double d1 = a(this.b, this.a.getLatitudeE6() / 1000000.0D);
    Object localObject = a(new db(this.a.getLatitudeE6() / 1000000.0D, this.a.getLongitudeE6() / 1000000.0D));
    paramfw = new b(((b)localObject).b() - d1, ((b)localObject).a() + d1);
    localObject = new b(((b)localObject).b() + d1, ((b)localObject).a() - d1);
    paramfw = a(paramfw);
    db localdb = a((b)localObject);
    localObject = new Rect();
    ((Rect)localObject).left = ((int)(paramfw.b * 1000000.0D));
    ((Rect)localObject).top = ((int)(paramfw.a * 1000000.0D));
    ((Rect)localObject).right = ((int)(localdb.b * 1000000.0D));
    ((Rect)localObject).bottom = ((int)(localdb.a * 1000000.0D));
    AppMethodBeat.o(99594);
    return localObject;
  }

  public void a(double paramDouble)
  {
    AppMethodBeat.i(99589);
    if (paramDouble < 0.0D)
      AppMethodBeat.o(99589);
    while (true)
    {
      return;
      double d1 = paramDouble;
      if (paramDouble == 0.0D)
        d1 = 1.0E-010D;
      if ((this.e == null) || (this.e.a() == null))
      {
        AppMethodBeat.o(99589);
      }
      else
      {
        this.b = d1;
        this.c = ((float)ic.a(d1, this.e.a().a));
        this.P = true;
        AppMethodBeat.o(99589);
      }
    }
  }

  public void a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99588);
    if (paramGeoPoint == null)
    {
      AppMethodBeat.o(99588);
      return;
    }
    if (this.a == null)
      this.a = new GeoPoint(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
    while (true)
    {
      this.P = true;
      AppMethodBeat.o(99588);
      break;
      this.a.setLatitudeE6(paramGeoPoint.getLatitudeE6());
      this.a.setLongitudeE6(paramGeoPoint.getLongitudeE6());
    }
  }

  public void a(cr paramcr)
  {
    AppMethodBeat.i(99587);
    if (paramcr == null)
      AppMethodBeat.o(99587);
    while (true)
    {
      return;
      this.e = paramcr;
      db localdb = paramcr.a();
      if (localdb != null)
        a(ic.a(localdb));
      a(paramcr.b());
      d(paramcr.c());
      c(paramcr.d());
      d(paramcr.e());
      c(paramcr.f());
      a(paramcr.g());
      a_(paramcr.h());
      this.e = paramcr;
      this.P = true;
      AppMethodBeat.o(99587);
    }
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99590);
    if ((this.d == null) || (this.d.b() == null))
      AppMethodBeat.o(99590);
    while (true)
    {
      return;
      c();
      AppMethodBeat.o(99590);
    }
  }

  public void a(boolean paramBoolean)
  {
    this.O = paramBoolean;
    this.P = true;
  }

  public boolean a()
  {
    return this.O;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    AppMethodBeat.i(99591);
    if ((this.a == null) || (this.d == null) || (this.d.b() == null))
      AppMethodBeat.o(99591);
    while (true)
    {
      return bool;
      GeoPoint localGeoPoint = this.d.b().t().a(new DoublePoint(paramFloat1, paramFloat2));
      if (Math.hypot(localGeoPoint.getLatitudeE6() - this.a.getLatitudeE6(), localGeoPoint.getLongitudeE6() - this.a.getLongitudeE6()) <= this.c)
      {
        bool = true;
        AppMethodBeat.o(99591);
      }
      else
      {
        AppMethodBeat.o(99591);
      }
    }
  }

  public boolean a(fw paramfw, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void b()
  {
  }

  public void b(gj paramgj, fw paramfw)
  {
  }

  public void c()
  {
    AppMethodBeat.i(99592);
    if (((this.f > 0) && (!this.P)) || (this.d == null) || (this.d.b() == null))
    {
      AppMethodBeat.o(99592);
      return;
    }
    this.g.zIndex = ((int)this.N);
    this.g.borderColor = this.M;
    this.g.borderWidth = ((int)this.K);
    this.g.fillColor = this.L;
    this.g.radius = ((float)this.b);
    this.g.centerX = this.a.getLongitudeE6();
    this.g.centerY = this.a.getLatitudeE6();
    this.g.isVisible = this.O;
    this.g.level = this.Q;
    if (this.f == -1)
      this.f = this.d.b().a(this.g);
    while (true)
    {
      this.P = false;
      AppMethodBeat.o(99592);
      break;
      if (this.P)
        this.d.b().a(this.f, this.g);
    }
  }

  public void d()
  {
    AppMethodBeat.i(99593);
    if ((this.f != -1) && (this.d != null) && (this.d.b() != null))
    {
      this.d.b().d(this.f);
      this.f = -1;
    }
    AppMethodBeat.o(99593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hu
 * JD-Core Version:    0.6.2
 */