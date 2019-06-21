package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.c;
import com.tencent.map.lib.f;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fl;
import com.tencent.tencentmap.mapsdk.maps.a.fv;
import com.tencent.tencentmap.mapsdk.maps.a.fw;
import com.tencent.tencentmap.mapsdk.maps.a.gg;
import com.tencent.tencentmap.mapsdk.maps.a.gk.a;
import com.tencent.tencentmap.mapsdk.maps.a.gs;
import com.tencent.tencentmap.mapsdk.maps.a.gs.b;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.im;
import com.tencent.tencentmap.mapsdk.maps.a.im.a;
import com.tencent.tencentmap.mapsdk.maps.a.iw;
import com.tencent.tencentmap.mapsdk.maps.a.ix;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import com.tencent.tencentmap.mapsdk.maps.a.ja;
import com.tencent.tencentmap.mapsdk.maps.a.jj;
import com.tencent.tencentmap.mapsdk.maps.a.jk;
import com.tencent.tencentmap.mapsdk.maps.a.lh.a;
import com.tencent.tencentmap.mapsdk.maps.a.ls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ar
  implements as, bw, ce, cg
{
  private gg a;
  private iz b;
  private Context c;
  private String d;
  private bi e;
  private jk f;
  private q g;
  private jj h;
  private final GeoPoint i;
  private final GeoPoint j;
  private int k;
  private int l;
  private int m;
  private int n;
  private byte[] o;
  private int p;
  private boolean q;
  private float r;
  private boolean s;
  private final ar.c t;
  private final ar.c u;
  private gk.a v;
  private im.a w;
  private fv x;

  public ar(int paramInt, ac paramac, ak paramak)
  {
    AppMethodBeat.i(100598);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.o = new byte[0];
    this.p = 0;
    this.q = false;
    this.r = 1.0F;
    this.s = false;
    this.t = new ar.c(this, false);
    this.u = new ar.c(this, true);
    this.v = new ar.1(this);
    this.w = new ar.2(this);
    this.x = new ar.4(this);
    this.c = paramac.getContext().getApplicationContext();
    this.r = SystemUtil.getDensity(this.c);
    if (this.a == null)
    {
      this.a = a.a(paramInt, this.c, paramak);
      this.b = ((iz)this.a.getVectorMapDelegate());
      this.b.a(this.c, paramak);
    }
    if (ic.t == null)
      ic.t = new aq(10);
    this.b.a(this);
    this.b.b().a(this.v);
    this.b.b().a(this.x);
    this.b.b().e(0, 0);
    a(false, false);
    if ((paramak != null) && (!StringUtil.isEmpty(paramak.h())))
      this.d = paramak.h();
    this.g = new q(this.c, this.d);
    this.h = new jj(this.c, this.b.b(), this.d);
    if (this.e == null)
      this.e = new bi(paramac, this.a);
    AppMethodBeat.o(100598);
  }

  private int a(dc paramdc, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100617);
    if (paramdc == null)
    {
      paramInt1 = -1;
      AppMethodBeat.o(100617);
    }
    label223: GeoPoint localGeoPoint;
    float f1;
    while (true)
    {
      return paramInt1;
      if ((paramdc.b == null) || (paramdc.a == null))
      {
        paramInt1 = -1;
        AppMethodBeat.o(100617);
      }
      else if ((this.b.T == 0) || (this.b.U == 0))
      {
        this.b.M = paramdc.a;
        this.b.N = paramdc.b;
        this.b.P = paramInt1;
        this.b.Q = paramInt2;
        this.b.R = paramInt3;
        this.b.S = paramInt4;
        this.b.w = parama;
        if (paramBoolean)
          this.b.a(this.u);
        while (true)
        {
          int i1 = SystemUtil.getWindowWidth(this.c);
          int i2 = SystemUtil.getWindowHeight(this.c);
          if ((paramInt1 + paramInt2 + this.k + this.m <= i1) && (paramInt3 + paramInt4 + this.l + this.n <= i2))
            break label223;
          paramInt1 = -1;
          AppMethodBeat.o(100617);
          break;
          this.b.a(this.t);
        }
        paramInt1 = 0;
        AppMethodBeat.o(100617);
      }
      else
      {
        this.b.a(null);
        localGeoPoint = new GeoPoint();
        f1 = a(paramInt1, paramInt2, paramInt3, paramInt4, paramdc.a, paramdc.b, localGeoPoint);
        if (f1 >= 0.0F)
          break;
        paramInt1 = (int)f1;
        AppMethodBeat.o(100617);
      }
    }
    paramInt2 = localGeoPoint.getLatitudeE6();
    paramInt1 = localGeoPoint.getLongitudeE6();
    if (!paramBoolean)
    {
      this.b.b().a(paramInt2, paramInt1);
      a(f1, false, paramLong, null);
      this.b.b().b(0.0F);
      this.b.b().a(0.0F);
    }
    while (true)
    {
      paramInt1 = 0;
      AppMethodBeat.o(100617);
      break;
      paramdc = new im(10000);
      paramdc.c(0.0F);
      paramdc.d(0.0F);
      paramdc.c(paramInt2, paramInt1);
      paramdc.a(f1);
      paramdc.a(this.w);
      paramdc.a(parama);
      paramdc.a(paramLong);
      this.b.b().a(paramdc);
    }
  }

  private int a(dc paramdc, int paramInt, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100615);
    if (paramdc == null)
    {
      paramInt = -1;
      AppMethodBeat.o(100615);
    }
    label198: GeoPoint localGeoPoint;
    float f1;
    while (true)
    {
      return paramInt;
      if ((paramdc.b == null) || (paramdc.a == null))
      {
        paramInt = -1;
        AppMethodBeat.o(100615);
      }
      else if ((this.b.T == 0) || (this.b.U == 0))
      {
        this.b.M = paramdc.a;
        this.b.N = paramdc.b;
        this.b.O = paramInt;
        this.b.w = parama;
        if (paramBoolean)
          this.b.a(this.u);
        while (true)
        {
          int i1 = SystemUtil.getWindowWidth(this.c);
          i2 = SystemUtil.getWindowHeight(this.c);
          if ((paramInt * 2 + this.k + this.m <= i1) && (paramInt * 2 + this.l + this.n <= i2))
            break label198;
          paramInt = -1;
          AppMethodBeat.o(100615);
          break;
          this.b.a(this.t);
        }
        paramInt = 0;
        AppMethodBeat.o(100615);
      }
      else
      {
        this.b.a(null);
        localGeoPoint = new GeoPoint();
        f1 = a(paramInt, paramInt, paramInt, paramInt, paramdc.a, paramdc.b, localGeoPoint);
        if (f1 >= 0.0F)
          break;
        paramInt = (int)f1;
        AppMethodBeat.o(100615);
      }
    }
    paramInt = localGeoPoint.getLatitudeE6();
    int i2 = localGeoPoint.getLongitudeE6();
    if (!paramBoolean)
    {
      this.b.b().a(paramInt, i2);
      a(f1, false, paramLong, null);
      this.b.b().b(0.0F);
      this.b.b().a(0.0F);
    }
    while (true)
    {
      paramInt = 0;
      AppMethodBeat.o(100615);
      break;
      paramdc = new im(10000);
      paramdc.c(0.0F);
      paramdc.d(0.0F);
      paramdc.c(paramInt, i2);
      paramdc.a(f1);
      paramdc.a(this.w);
      paramdc.a(parama);
      paramdc.a(paramLong);
      this.b.b().a(paramdc);
    }
  }

  private int a(List<bx> paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100618);
    fl localfl = (fl)this.b.b().u();
    if (localfl == null)
    {
      paramInt1 = -2147483648;
      AppMethodBeat.o(100618);
    }
    while (true)
    {
      return paramInt1;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        paramInt1 = -1;
        AppMethodBeat.o(100618);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          bx localbx = (bx)paramList.next();
          if ((localbx != null) && (localbx.a() != null))
            localArrayList.addAll(localbx.a());
        }
        if ((this.b.T == 0) || (this.b.U == 0))
        {
          int i1 = SystemUtil.getWindowWidth(this.c);
          int i2 = SystemUtil.getWindowHeight(this.c);
          if ((paramInt1 + paramInt2 > i1) || (paramInt3 + paramInt4 > i2))
          {
            paramInt1 = -1;
            AppMethodBeat.o(100618);
          }
          else
          {
            paramInt1 = 0;
            AppMethodBeat.o(100618);
          }
        }
        else if ((paramInt1 + paramInt2 > this.b.T) || (paramInt3 + paramInt4 > this.b.U))
        {
          paramInt1 = -1;
          AppMethodBeat.o(100618);
        }
        else
        {
          localfl.a(localArrayList, new Rect(paramInt1, paramInt3, paramInt2, paramInt4), new ar.3(this, paramBoolean, parama, paramLong));
          paramInt1 = 0;
          AppMethodBeat.o(100618);
        }
      }
    }
  }

  private GeoPoint a(DoublePoint paramDoublePoint, GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(100639);
    double d1 = 2.684355E+008F * this.r;
    double d2 = d1 / 2.0D;
    double d3 = d1 / 360.0D;
    d1 /= 6.283185307179586D;
    d3 = (paramDoublePoint.x - d2) / d3;
    d2 = Math.asin(1.0D - 2.0D / (Math.pow(2.718281828459045D, (paramDoublePoint.y - d2) / 0.5D / d1) + 1.0D)) * 180.0D / 3.141592653589793D;
    paramDoublePoint = paramGeoPoint;
    if (paramGeoPoint == null)
      paramDoublePoint = new GeoPoint(0, 0);
    paramDoublePoint.setLatitudeE6((int)(d2 * 1000000.0D));
    paramDoublePoint.setLongitudeE6((int)(1000000.0D * d3));
    AppMethodBeat.o(100639);
    return paramDoublePoint;
  }

  private void a(double paramDouble1, double paramDouble2, float paramFloat, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100613);
    if (this.b == null)
    {
      AppMethodBeat.o(100613);
      return;
    }
    int i1 = (int)(1000000.0D * paramDouble1);
    int i2 = (int)(1000000.0D * paramDouble2);
    int i3 = this.b.b().d();
    int i4 = this.b.b().b();
    if (paramFloat < i4)
      paramFloat = i4;
    while (true)
    {
      float f1 = paramFloat;
      if (paramFloat > i3)
        f1 = i3;
      paramDouble1 = 1.0D / Math.pow(2.0D, i3 - f1);
      if (!paramBoolean)
      {
        this.b.b().a(i1, i2);
        this.b.b().c((float)paramDouble1);
        AppMethodBeat.o(100613);
        break;
      }
      im localim = new im(10000);
      localim.c(i1, i2);
      localim.a(f1);
      localim.a(this.w);
      localim.a(parama);
      localim.a(paramLong);
      this.b.b().a(localim);
      AppMethodBeat.o(100613);
      break;
    }
  }

  private void a(double paramDouble1, double paramDouble2, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100614);
    if (this.b == null)
      AppMethodBeat.o(100614);
    while (true)
    {
      return;
      int i1 = (int)(paramDouble1 * 1000000.0D);
      int i2 = (int)(1000000.0D * paramDouble2);
      if (!paramBoolean)
      {
        this.b.b().a(i1, i2);
        AppMethodBeat.o(100614);
      }
      else
      {
        im localim = new im(10000);
        localim.c(i1, i2);
        localim.a(this.w);
        localim.a(parama);
        localim.a(paramLong);
        this.b.b().a(localim);
        AppMethodBeat.o(100614);
      }
    }
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100611);
    if (this.b == null)
      AppMethodBeat.o(100611);
    while (true)
    {
      return;
      if (paramFloat1 == 0.0F)
      {
        AppMethodBeat.o(100611);
      }
      else
      {
        if (!paramBoolean)
        {
          if (paramFloat1 < 0.0F);
          for (paramFloat1 = (float)(1.0D / Math.pow(2.0D, Math.abs(paramFloat1))); ; paramFloat1 = (float)(1.0D / Math.pow(0.5D, Math.abs(paramFloat1))))
          {
            this.b.b().a(paramFloat1, paramFloat2, paramFloat3, paramFloat2, paramFloat3, null);
            AppMethodBeat.o(100611);
            break;
          }
        }
        im localim = new im(10000);
        localim.b((int)paramFloat2, (int)paramFloat3);
        localim.b(paramFloat1);
        localim.a(this.w);
        localim.a(parama);
        localim.a(paramLong);
        this.b.b().a(localim);
        AppMethodBeat.o(100611);
      }
    }
  }

  private void a(float paramFloat1, float paramFloat2, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100608);
    if (this.b == null)
      AppMethodBeat.o(100608);
    while (true)
    {
      return;
      if ((paramFloat1 == 0.0F) && (paramFloat2 == 0.0F))
      {
        AppMethodBeat.o(100608);
      }
      else if (!paramBoolean)
      {
        this.b.b().c((int)paramFloat1, (int)paramFloat2);
        AppMethodBeat.o(100608);
      }
      else
      {
        im localim = new im(10000);
        localim.a((int)paramFloat1, (int)paramFloat2);
        localim.a(this.w);
        localim.a(parama);
        localim.a(paramLong);
        this.b.b().a(localim);
        AppMethodBeat.o(100608);
      }
    }
  }

  private void a(float paramFloat, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100609);
    if (this.b == null)
      AppMethodBeat.o(100609);
    while (true)
    {
      return;
      if (!paramBoolean)
      {
        int i1 = this.b.b().d();
        paramBoolean = this.b.E().a();
        int i2 = this.b.b().c();
        if (paramBoolean);
        for (int i3 = 22; ; i3 = 20)
        {
          paramFloat = Math.min(paramFloat, Math.min(i2, i3));
          double d1 = 1.0D / Math.pow(2.0D, i1 - paramFloat);
          this.b.b().a((float)d1);
          AppMethodBeat.o(100609);
          break;
        }
      }
      im localim = new im(10000);
      localim.a(paramFloat);
      localim.a(this.w);
      localim.a(parama);
      localim.a(paramLong);
      this.b.b().a(localim);
      AppMethodBeat.o(100609);
    }
  }

  private void a(cp paramcp, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100612);
    if (this.b == null)
      AppMethodBeat.o(100612);
    while (true)
    {
      return;
      if (paramcp == null)
      {
        AppMethodBeat.o(100612);
      }
      else
      {
        GeoPoint localGeoPoint = ic.a(paramcp.a);
        float f1 = paramcp.b;
        int i1 = this.b.b().d();
        int i2 = this.b.b().b();
        float f2 = f1;
        if (f1 < i2)
          f2 = i2;
        f1 = f2;
        if (f2 > i1)
          f1 = i1;
        if (!paramBoolean)
        {
          double d1 = 1.0D / Math.pow(2.0D, i1 - f1);
          if (localGeoPoint != null)
            this.b.b().a(localGeoPoint.getLatitudeE6(), localGeoPoint.getLongitudeE6());
          this.b.b().c((float)d1);
          this.b.b().b(paramcp.d);
          if (paramcp.c >= 0.0F)
            this.b.b().a(paramcp.c);
          AppMethodBeat.o(100612);
        }
        else
        {
          im localim = new im(10000);
          if (localGeoPoint != null)
            localim.c(localGeoPoint.getLatitudeE6(), localGeoPoint.getLongitudeE6());
          localim.a(f1);
          localim.c(paramcp.d);
          if (paramcp.c >= 0.0F)
            localim.d(paramcp.c);
          localim.a(this.w);
          localim.a(paramLong);
          localim.a(parama);
          this.b.b().a(localim);
          AppMethodBeat.o(100612);
        }
      }
    }
  }

  private void a(boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100606);
    if (!paramBoolean)
    {
      int i1 = this.b.b().h();
      this.b.b().b(i1 + 1);
      AppMethodBeat.o(100606);
    }
    while (true)
    {
      return;
      im localim = new im(10000);
      localim.b(1.0F);
      localim.a(this.w);
      localim.a(parama);
      localim.a(paramLong);
      this.b.b().a(localim);
      AppMethodBeat.o(100606);
    }
  }

  private void b(float paramFloat1, float paramFloat2, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100616);
    if (paramBoolean == true)
    {
      im localim = new im(10000);
      localim.c(paramFloat1);
      if (paramFloat2 >= 0.0F)
        localim.d(paramFloat2);
      localim.a(this.w);
      localim.a(parama);
      localim.a(paramLong);
      this.b.b().a(localim);
      AppMethodBeat.o(100616);
    }
    while (true)
    {
      return;
      this.b.b().b(paramFloat1);
      if (paramFloat2 >= 0.0F)
        this.b.b().a(paramFloat2);
      AppMethodBeat.o(100616);
    }
  }

  private void b(float paramFloat, boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100610);
    if (this.b == null)
      AppMethodBeat.o(100610);
    while (true)
    {
      return;
      if (paramFloat == 0.0F)
      {
        AppMethodBeat.o(100610);
      }
      else
      {
        if (!paramBoolean)
        {
          if (paramFloat < 0.0F);
          for (paramFloat = (float)(1.0D / Math.pow(2.0D, Math.abs(paramFloat))); ; paramFloat = (float)(1.0D / Math.pow(0.5D, Math.abs(paramFloat))))
          {
            float f1 = this.b.b().i();
            this.b.b().a(paramFloat * f1);
            AppMethodBeat.o(100610);
            break;
          }
        }
        im localim = new im(10000);
        localim.b(paramFloat);
        localim.a(this.w);
        localim.a(parama);
        localim.a(paramLong);
        this.b.b().a(localim);
        AppMethodBeat.o(100610);
      }
    }
  }

  private void b(boolean paramBoolean, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100607);
    if (!paramBoolean)
    {
      int i1 = this.b.b().h();
      this.b.b().b(i1 - 1);
      AppMethodBeat.o(100607);
    }
    while (true)
    {
      return;
      im localim = new im(10000);
      localim.b(-1.0F);
      localim.a(this.w);
      localim.a(parama);
      localim.a(paramLong);
      this.b.b().a(localim);
      AppMethodBeat.o(100607);
    }
  }

  public final double a(double paramDouble)
  {
    AppMethodBeat.i(100604);
    paramDouble = this.b.b().t().a(paramDouble);
    AppMethodBeat.o(100604);
    return paramDouble;
  }

  public final float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, db paramdb1, db paramdb2, GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(100638);
    int i1 = this.b.T;
    int i2 = this.b.U;
    if ((i1 == 0) || (i2 == 0) || (paramdb1 == null) || (paramdb2 == null))
    {
      f1 = -2.0F;
      AppMethodBeat.o(100638);
    }
    while (true)
    {
      return f1;
      if ((paramInt1 + paramInt2 + this.k + this.m <= i1) && (paramInt3 + paramInt4 + this.l + this.n <= i2))
        break;
      f1 = -1.0F;
      AppMethodBeat.o(100638);
    }
    Object localObject1 = ic.a(paramdb1);
    Object localObject2 = ic.a(paramdb2);
    int i3 = this.b.b().d();
    localObject1 = a((GeoPoint)localObject1, null);
    localObject2 = a((GeoPoint)localObject2, null);
    double d1 = ((DoublePoint)localObject2).x - ((DoublePoint)localObject1).x;
    double d2 = d1;
    if (d1 < 0.0D)
      d2 = Math.abs(d1);
    double d3 = ((DoublePoint)localObject2).y - ((DoublePoint)localObject1).y;
    d1 = d3;
    if (d3 < 0.0D)
      d1 = Math.abs(d3);
    int i4 = i1 - paramInt1 - paramInt2 - this.k - this.m;
    int i5 = i2 - paramInt3 - paramInt4 - this.l - this.n;
    int i6 = i4;
    if (i4 <= 0)
      i6 = 1;
    i4 = i5;
    if (i5 <= 0)
      i4 = 1;
    d2 = Math.max(d2 / i6, d1 / i4);
    float f1 = (float)(i3 - Math.log(d2) / Math.log(2.0D));
    float f2 = h();
    float f3 = i();
    if (f2 < f1)
    {
      d2 = Math.pow(2.0D, i3 - f2);
      f1 = f2;
    }
    while (true)
    {
      if (f3 > f1)
      {
        d2 = Math.pow(2.0D, i3 - f3);
        f1 = f3;
      }
      while (true)
      {
        double d4;
        double d5;
        if (paramGeoPoint != null)
        {
          paramdb1 = new db((paramdb1.a + paramdb2.a) / 2.0D, (paramdb1.b + paramdb2.b) / 2.0D);
          d3 = (paramInt2 - paramInt1) * d2 / 2.0D;
          d1 = (paramInt3 - paramInt4) * d2 / 2.0D;
          paramdb1 = a(ic.a(paramdb1), null);
          paramdb1.x = (d3 + paramdb1.x);
          paramdb1.y = (d1 + paramdb1.y);
          d4 = paramdb1.x;
          d5 = paramdb1.y;
          if (!this.s)
            break label806;
          paramInt1 = this.k - this.m;
          paramInt2 = this.l - this.n;
          f3 = (this.k - this.m) / (2.0F * i1) + 0.5F;
          if (f3 >= 0.25D)
            break label743;
          paramInt1 = (int)(-0.5D * i1);
          label569: f3 = (this.l - this.n) / (2.0F * i2) + 0.5F;
          if (f3 >= 0.25D)
            break label765;
          paramInt2 = (int)(-0.5D * i2);
          label610: double d6 = paramInt1 * d2 / 2.0D;
          double d7 = paramInt2 * d2 / 2.0D;
          paramdb1 = this.b.b().A().q();
          if (paramdb1 != null)
            break label787;
          d3 = 0.0D;
          d1 = 0.0D;
          label658: d3 = d4 - d6 + d3 * i1 * d2;
          d2 = d5 - d7 - d1 * i2 * d2;
        }
        for (d1 = d3; ; d1 = d4)
        {
          paramdb1 = a(new DoublePoint(d1, d2), null);
          paramGeoPoint.setLatitudeE6(paramdb1.getLatitudeE6());
          paramGeoPoint.setLongitudeE6(paramdb1.getLongitudeE6());
          AppMethodBeat.o(100638);
          break;
          label743: if (f3 <= 0.75D)
            break label569;
          paramInt1 = (int)(0.5D * i1);
          break label569;
          label765: if (f3 <= 0.75D)
            break label610;
          paramInt2 = (int)(0.5D * i2);
          break label610;
          label787: d3 = paramdb1.a();
          d1 = paramdb1.b();
          break label658;
          label806: d2 = d5;
        }
      }
    }
  }

  public final int a(ad paramad)
  {
    AppMethodBeat.i(100622);
    int i1;
    if (paramad == null)
    {
      i1 = -1;
      AppMethodBeat.o(100622);
    }
    while (true)
    {
      return i1;
      paramad = paramad.a();
      if (paramad == null)
      {
        i1 = -1;
        AppMethodBeat.o(100622);
      }
      else
      {
        switch (paramad.o)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
          while (true)
          {
            i1 = 0;
            AppMethodBeat.o(100622);
            break;
            a(false, 0L, null);
            continue;
            b(false, 0L, null);
            continue;
            a(paramad.p, paramad.q, false, 0L, null);
            continue;
            a(paramad.r, false, 0L, null);
            continue;
            b(paramad.s, false, 0L, null);
            continue;
            a(paramad.t, paramad.u.x, paramad.u.y, false, 0L, null);
            continue;
            a(paramad.v, false, 0L, null);
            continue;
            a(paramad.w.a, paramad.w.b, false, 0L, null);
            continue;
            a(paramad.x.a, paramad.x.b, paramad.y, false, 0L, null);
            continue;
            i1 = a(paramad.z, paramad.A, false, 0L, null);
            AppMethodBeat.o(100622);
            break;
            i1 = a(paramad.B, paramad.E, paramad.E, paramad.E, paramad.E, false, 0L, null);
            AppMethodBeat.o(100622);
            break;
            i1 = a(paramad.B, paramad.F, paramad.G, paramad.H, paramad.I, false, 0L, null);
            AppMethodBeat.o(100622);
            break;
            b(paramad.J, paramad.K, false, 0L, null);
          }
        case 13:
        }
        i1 = a(paramad.L, paramad.F, paramad.G, paramad.H, paramad.I, false, 0L, null);
        AppMethodBeat.o(100622);
      }
    }
  }

  public final int a(ad paramad, long paramLong, aj.a parama)
  {
    AppMethodBeat.i(100623);
    int i1;
    if (paramad == null)
    {
      i1 = -1;
      AppMethodBeat.o(100623);
    }
    while (true)
    {
      return i1;
      paramad = paramad.a();
      if (paramad == null)
      {
        i1 = -1;
        AppMethodBeat.o(100623);
      }
      else
      {
        if (paramLong < 0L)
          paramLong = 0L;
        label51: switch (paramad.o)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
          while (true)
          {
            i1 = 0;
            AppMethodBeat.o(100623);
            break;
            break label51;
            a(true, paramLong, parama);
            continue;
            b(true, paramLong, parama);
            continue;
            a(paramad.p, paramad.q, true, paramLong, parama);
            continue;
            a(paramad.r, true, paramLong, parama);
            continue;
            b(paramad.s, true, paramLong, parama);
            continue;
            a(paramad.t, paramad.u.x, paramad.u.y, true, paramLong, parama);
            continue;
            a(paramad.v, true, paramLong, parama);
            continue;
            a(paramad.w.a, paramad.w.b, true, paramLong, parama);
            continue;
            a(paramad.x.a, paramad.x.b, paramad.y, true, paramLong, parama);
            continue;
            i1 = a(paramad.z, paramad.A, true, paramLong, parama);
            AppMethodBeat.o(100623);
            break;
            i1 = a(paramad.B, paramad.E, paramad.E, paramad.E, paramad.E, true, paramLong, parama);
            AppMethodBeat.o(100623);
            break;
            i1 = a(paramad.B, paramad.F, paramad.G, paramad.H, paramad.I, true, paramLong, parama);
            AppMethodBeat.o(100623);
            break;
            b(paramad.J, paramad.K, true, paramLong, parama);
          }
        case 13:
        }
        i1 = a(paramad.L, paramad.F, paramad.G, paramad.H, paramad.I, true, paramLong, parama);
        AppMethodBeat.o(100623);
      }
    }
  }

  public final Point a(db paramdb)
  {
    Object localObject = null;
    AppMethodBeat.i(100603);
    if (this.b == null)
    {
      AppMethodBeat.o(100603);
      paramdb = localObject;
    }
    while (true)
    {
      return paramdb;
      paramdb = ic.a(paramdb);
      DoublePoint localDoublePoint = this.b.b().t().b(paramdb);
      if (localDoublePoint == null)
      {
        AppMethodBeat.o(100603);
        paramdb = localObject;
      }
      else
      {
        paramdb = new Point();
        paramdb.x = ((int)Math.round(localDoublePoint.x));
        paramdb.y = ((int)Math.round(localDoublePoint.y));
        AppMethodBeat.o(100603);
      }
    }
  }

  public final DoublePoint a(GeoPoint paramGeoPoint, DoublePoint paramDoublePoint)
  {
    AppMethodBeat.i(100637);
    double d1 = 2.684355E+008F * this.r;
    double d2 = d1 / 2.0D;
    double d3 = d1 / 360.0D;
    double d4 = d1 / 6.283185307179586D;
    double d5 = Math.min(Math.max(Math.sin(paramGeoPoint.getLatitudeE6() / 1000000.0D * 0.0174532925199433D), -0.9999D), 0.9999D);
    d1 = paramGeoPoint.getLongitudeE6() / 1000000.0D;
    d5 = Math.log((1.0D + d5) / (1.0D - d5));
    paramGeoPoint = paramDoublePoint;
    if (paramDoublePoint == null)
      paramGeoPoint = new DoublePoint();
    paramGeoPoint.set(d3 * d1 + d2, d4 * d5 * 0.5D + d2);
    AppMethodBeat.o(100637);
    return paramGeoPoint;
  }

  public final bi a()
  {
    return this.e;
  }

  public final db a(Point paramPoint)
  {
    AppMethodBeat.i(100602);
    if (paramPoint == null)
    {
      paramPoint = null;
      AppMethodBeat.o(100602);
    }
    while (true)
    {
      return paramPoint;
      paramPoint = new DoublePoint(paramPoint.x, paramPoint.y);
      paramPoint = ic.a(this.b.b().t().a(paramPoint));
      AppMethodBeat.o(100602);
    }
  }

  public final void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(100641);
    if (this.b == null)
      AppMethodBeat.o(100641);
    while (true)
    {
      return;
      this.s = true;
      this.b.b().a(paramFloat1, paramFloat2, 0, paramBoolean);
      AppMethodBeat.o(100641);
    }
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(100625);
    if (this.q)
      AppMethodBeat.o(100625);
    while (true)
    {
      return;
      int i1 = paramInt;
      if (this.g != null)
        i1 = this.g.a(paramInt);
      this.p = i1;
      this.b.b().a(i1);
      ic.a(true);
      AppMethodBeat.o(100625);
    }
  }

  public final void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100633);
    if ((paramInt1 == 0) || (paramInt2 == 0))
      AppMethodBeat.o(100633);
    while (true)
    {
      return;
      if (this.e != null)
        this.e.a(paramInt1, paramInt2);
      AppMethodBeat.o(100633);
    }
  }

  public final void a(Handler paramHandler, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(100634);
    this.b.a(paramHandler, paramConfig);
    AppMethodBeat.o(100634);
  }

  public final void a(aj.c paramc)
  {
    AppMethodBeat.i(100632);
    this.b.a(paramc);
    AppMethodBeat.o(100632);
  }

  public final void a(aj.f paramf)
  {
    AppMethodBeat.i(100644);
    this.b.a(paramf);
    AppMethodBeat.o(100644);
  }

  public final void a(aj.g paramg)
  {
    this.b.t = paramg;
  }

  public final void a(aj.h paramh)
  {
    this.b.m = paramh;
  }

  public final void a(aj.i parami)
  {
    this.b.q = parami;
  }

  public final void a(aj.j paramj)
  {
    this.b.p = paramj;
  }

  public final void a(aj.k paramk)
  {
    AppMethodBeat.i(100651);
    this.b.a(paramk);
    AppMethodBeat.o(100651);
  }

  public final void a(aj.l paraml)
  {
    this.b.s = paraml;
  }

  public final void a(bi.a parama)
  {
    AppMethodBeat.i(100599);
    this.e.a(parama);
    AppMethodBeat.o(100599);
  }

  public final void a(da paramda)
  {
    AppMethodBeat.i(100655);
    if ((this.b == null) || (this.b.o() == null))
      AppMethodBeat.o(100655);
    while (true)
    {
      return;
      this.b.o().a(paramda);
      AppMethodBeat.o(100655);
    }
  }

  public final void a(dn paramdn)
  {
    AppMethodBeat.i(100635);
    if (this.b == null)
      AppMethodBeat.o(100635);
    while (true)
    {
      return;
      this.b.a(paramdn);
      AppMethodBeat.o(100635);
    }
  }

  public final void a(lh.a parama, ak paramak)
  {
    AppMethodBeat.i(100600);
    this.e.a(parama, paramak);
    AppMethodBeat.o(100600);
  }

  public final void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(100657);
    if ((this.b == null) || (this.b.b() == null))
      AppMethodBeat.o(100657);
    while (true)
    {
      return;
      f localf = this.b.b();
      if (localf != null)
        localf.a(paramString1, paramString2);
      AppMethodBeat.o(100657);
    }
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100626);
    f localf = this.b.b();
    if (paramBoolean)
    {
      localf.a(true);
      AppMethodBeat.o(100626);
    }
    while (true)
    {
      return;
      localf.a(false);
      AppMethodBeat.o(100626);
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(100643);
    this.b.b().c(paramBoolean2);
    this.b.b().b(paramBoolean1);
    AppMethodBeat.o(100643);
  }

  public final q b()
  {
    return this.g;
  }

  public final String b(db paramdb)
  {
    String str = null;
    AppMethodBeat.i(100649);
    if ((this.b == null) || (paramdb == null))
    {
      AppMethodBeat.o(100649);
      paramdb = str;
    }
    while (true)
    {
      return paramdb;
      f localf = this.b.b();
      if (localf == null)
      {
        AppMethodBeat.o(100649);
        paramdb = str;
      }
      else
      {
        GeoPoint localGeoPoint = new GeoPoint();
        str = localf.c(localGeoPoint);
        paramdb.a = (localGeoPoint.getLatitudeE6() * 1.0D / 1000000.0D);
        paramdb.b = (localGeoPoint.getLongitudeE6() * 1.0D / 1000000.0D);
        AppMethodBeat.o(100649);
        paramdb = str;
      }
    }
  }

  public final void b(int paramInt)
  {
    AppMethodBeat.i(100646);
    if (this.b == null)
      AppMethodBeat.o(100646);
    while (true)
    {
      return;
      f localf = this.b.b();
      if (localf == null)
      {
        AppMethodBeat.o(100646);
      }
      else
      {
        localf.f(paramInt);
        AppMethodBeat.o(100646);
      }
    }
  }

  public final void b(dn paramdn)
  {
    AppMethodBeat.i(100636);
    if (this.b == null)
      AppMethodBeat.o(100636);
    while (true)
    {
      return;
      this.b.b(paramdn);
      AppMethodBeat.o(100636);
    }
  }

  public final void b(boolean paramBoolean)
  {
    AppMethodBeat.i(100627);
    this.q = paramBoolean;
    if (paramBoolean)
    {
      this.b.b().a(11);
      AppMethodBeat.o(100627);
    }
    while (true)
    {
      return;
      this.b.b().a(this.p);
      AppMethodBeat.o(100627);
    }
  }

  public final cw c(db paramdb)
  {
    AppMethodBeat.i(100650);
    GeoPoint localGeoPoint = new GeoPoint();
    c localc = l().b().d(localGeoPoint);
    if ((localc == null) || (localc.a == null) || (localc.b == null) || (localc.d == null) || (localc.d.length == 0) || (localc.c >= localc.d.length) || (localc.c == -1))
    {
      paramdb = null;
      AppMethodBeat.o(100650);
    }
    while (true)
    {
      return paramdb;
      if (paramdb != null)
      {
        paramdb.a = (localGeoPoint.getLatitudeE6() * 1.0D / 1000000.0D);
        paramdb.b = (localGeoPoint.getLongitudeE6() * 1.0D / 1000000.0D);
      }
      paramdb = new ArrayList();
      int i1 = localc.d.length;
      for (int i2 = 0; i2 < i1; i2++)
        paramdb.add(new cy(localc.d[i2]));
      paramdb = new cw(localc.a, localc.b, paramdb, localc.c);
      AppMethodBeat.o(100650);
    }
  }

  public final jj c()
  {
    return this.h;
  }

  public final void c(boolean paramBoolean)
  {
    AppMethodBeat.i(100642);
    this.a.setZOrderMediaOverlay(paramBoolean);
    AppMethodBeat.o(100642);
  }

  public final void d()
  {
    AppMethodBeat.i(100601);
    if (this.b != null)
    {
      this.b.b().b(this.x);
      this.b.A();
      this.b = null;
    }
    if (this.c != null)
      this.c = null;
    if (ic.t != null)
      ic.t.a();
    AppMethodBeat.o(100601);
  }

  public final void d(boolean paramBoolean)
  {
    AppMethodBeat.i(100645);
    if (this.h == null)
      AppMethodBeat.o(100645);
    while (true)
    {
      return;
      this.h.a(paramBoolean);
      AppMethodBeat.o(100645);
    }
  }

  public final do e()
  {
    AppMethodBeat.i(100605);
    Object localObject1 = new Point(0, this.b.U);
    Object localObject2 = new Point(this.b.T, this.b.U);
    Object localObject3 = new Point(0, 0);
    Object localObject4 = new Point(this.b.T, 0);
    localObject1 = a((Point)localObject1);
    localObject2 = a((Point)localObject2);
    localObject3 = a((Point)localObject3);
    localObject4 = a((Point)localObject4);
    localObject4 = new do((db)localObject1, (db)localObject2, (db)localObject3, (db)localObject4, dc.a().a((db)localObject1).a((db)localObject2).a((db)localObject3).a((db)localObject4).a());
    AppMethodBeat.o(100605);
    return localObject4;
  }

  public final void e(boolean paramBoolean)
  {
    AppMethodBeat.i(100652);
    if (this.b == null)
      AppMethodBeat.o(100652);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.b.L();
        AppMethodBeat.o(100652);
      }
      else
      {
        this.b.M();
        AppMethodBeat.o(100652);
      }
    }
  }

  public final gg f()
  {
    return this.a;
  }

  public final void f(boolean paramBoolean)
  {
    if (this.b != null)
      this.b.V = paramBoolean;
  }

  public final cp g()
  {
    AppMethodBeat.i(100619);
    Object localObject = ic.a(this.b.b().f());
    float f1 = this.b.b().q();
    float f2 = f1;
    if (f1 < 0.0F)
      f2 = f1 % 360.0F + 360.0F;
    float f3 = this.b.b().r();
    f1 = s();
    localObject = cp.a().a(f1).a((db)localObject).c(f2).b(f3).a();
    AppMethodBeat.o(100619);
    return localObject;
  }

  public final float h()
  {
    AppMethodBeat.i(100620);
    float f1 = this.b.b().c();
    AppMethodBeat.o(100620);
    return f1;
  }

  public final float i()
  {
    AppMethodBeat.i(100621);
    float f1 = this.b.b().b();
    AppMethodBeat.o(100621);
    return f1;
  }

  public final void j()
  {
    AppMethodBeat.i(100624);
    this.b.b().v();
    AppMethodBeat.o(100624);
  }

  public final boolean k()
  {
    AppMethodBeat.i(100628);
    boolean bool = this.b.b().g();
    AppMethodBeat.o(100628);
    return bool;
  }

  public final iz l()
  {
    return this.b;
  }

  public final Context m()
  {
    return this.c;
  }

  public final void n()
  {
  }

  public final void o()
  {
    AppMethodBeat.i(100629);
    this.a.e();
    if (this.e != null)
      this.e.f();
    AppMethodBeat.o(100629);
  }

  public final void p()
  {
    AppMethodBeat.i(100630);
    this.a.f();
    AppMethodBeat.o(100630);
  }

  public final void q()
  {
    AppMethodBeat.i(100631);
    this.a.g();
    if (this.f != null)
    {
      this.f.b();
      this.f = null;
    }
    if (this.e != null)
    {
      this.e.a();
      this.e = null;
    }
    AppMethodBeat.o(100631);
  }

  public final String r()
  {
    return "4.2.2";
  }

  public final float s()
  {
    AppMethodBeat.i(100640);
    float f1 = this.b.b().j();
    AppMethodBeat.o(100640);
    return f1;
  }

  public final void t()
  {
  }

  public final void u()
  {
  }

  public final int v()
  {
    int i1 = -1;
    AppMethodBeat.i(100647);
    if (this.b == null)
      AppMethodBeat.o(100647);
    while (true)
    {
      return i1;
      f localf = this.b.b();
      if (localf == null)
      {
        AppMethodBeat.o(100647);
      }
      else
      {
        i1 = localf.x();
        AppMethodBeat.o(100647);
      }
    }
  }

  public final String[] w()
  {
    String[] arrayOfString = null;
    AppMethodBeat.i(100648);
    if (this.b == null)
      AppMethodBeat.o(100648);
    while (true)
    {
      return arrayOfString;
      f localf = this.b.b();
      if (localf == null)
      {
        AppMethodBeat.o(100648);
      }
      else
      {
        arrayOfString = localf.y();
        AppMethodBeat.o(100648);
      }
    }
  }

  public final boolean x()
  {
    AppMethodBeat.i(100653);
    boolean bool;
    if (this.b == null)
    {
      bool = false;
      AppMethodBeat.o(100653);
    }
    while (true)
    {
      return bool;
      bool = this.b.N();
      AppMethodBeat.o(100653);
    }
  }

  public final boolean y()
  {
    AppMethodBeat.i(100654);
    boolean bool;
    if (this.b == null)
    {
      bool = false;
      AppMethodBeat.o(100654);
    }
    while (true)
    {
      return bool;
      bool = this.b.O();
      AppMethodBeat.o(100654);
    }
  }

  public final String z()
  {
    Object localObject1 = null;
    AppMethodBeat.i(100656);
    Object localObject2;
    if ((this.c == null) || (this.b == null))
    {
      AppMethodBeat.o(100656);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        if (!StringUtil.isEmpty(this.d));
        for (localObject2 = u.a(this.c, this.d); ; localObject2 = w.a(this.c))
        {
          localJSONObject.put("cfgVer", ((s)localObject2).b());
          int i1 = SystemUtil.getWindowWidth(this.c);
          int i2 = SystemUtil.getWindowHeight(this.c);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("{");
          localJSONObject.put("resolution", i1 + "," + i2 + "}");
          localJSONObject.put("density", this.r);
          localJSONObject.put("renderStatus", this.b.b().J());
          localJSONObject.put("renderError", this.b.b().K());
          localJSONObject.put("sdkver", "4.2.2.1");
          localObject2 = localJSONObject.toString();
          AppMethodBeat.o(100656);
          break;
        }
      }
      catch (JSONException localJSONException)
      {
        AppMethodBeat.o(100656);
        Object localObject3 = localObject1;
      }
    }
  }

  static class a
  {
    static gg a(int paramInt, Context paramContext, ak paramak)
    {
      AppMethodBeat.i(100596);
      switch (paramInt)
      {
      default:
        paramContext = new ja(paramContext, paramak);
        AppMethodBeat.o(100596);
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        return paramContext;
        paramContext = new ja(paramContext, paramak);
        AppMethodBeat.o(100596);
        continue;
        paramContext = new ix(paramContext, paramak);
        AppMethodBeat.o(100596);
        continue;
        paramContext = new iw(paramContext, paramak);
        AppMethodBeat.o(100596);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar
 * JD-Core Version:    0.6.2
 */