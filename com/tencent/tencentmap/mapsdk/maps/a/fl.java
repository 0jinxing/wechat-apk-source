package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public class fl
  implements fw
{
  private gs a;
  private gh b;
  private gm c;

  public fl(fn paramfn)
  {
    AppMethodBeat.i(98919);
    this.c = ((gm)paramfn);
    this.a = paramfn.a().j();
    this.b = paramfn.f();
    AppMethodBeat.o(98919);
  }

  private Rect a(List<j> paramList, fw paramfw)
  {
    AppMethodBeat.i(98927);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramList = null;
      AppMethodBeat.o(98927);
      return paramList;
    }
    paramList = paramList.iterator();
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    label45: Rect localRect;
    int n;
    int i1;
    while (paramList.hasNext())
    {
      localRect = ((j)paramList.next()).a(paramfw);
      if (localRect != null)
      {
        n = m;
        if (m == 0)
          n = localRect.left;
        i1 = k;
        if (k == 0)
          i1 = localRect.right;
        k = j;
        if (j == 0)
          k = localRect.top;
        j = i;
        if (i == 0)
          j = localRect.bottom;
        m = n;
        if (localRect.left < n)
          m = localRect.left;
        n = i1;
        if (localRect.right > i1)
          n = localRect.right;
        i1 = k;
        if (localRect.top < k)
          i1 = localRect.top;
        if (localRect.bottom <= j)
          break label251;
      }
    }
    label251: for (i = localRect.bottom; ; i = j)
    {
      j = i1;
      k = n;
      break label45;
      paramList = new Rect(m, j, k, i);
      AppMethodBeat.o(98927);
      break;
    }
  }

  private Rect a(List<j> paramList, List<GeoPoint> paramList1, fw paramfw)
  {
    AppMethodBeat.i(98928);
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    Object localObject;
    if (paramList != null)
    {
      paramList = paramList.iterator();
      i = 0;
      j = 0;
      k = 0;
      m = 0;
      do
      {
        do
        {
          n = i;
          i1 = j;
          i2 = k;
          i3 = m;
          if (!paramList.hasNext())
            break;
          localObject = (j)paramList.next();
        }
        while (localObject == null);
        localObject = ((j)localObject).a(paramfw);
      }
      while (localObject == null);
      i1 = m;
      if (m == 0)
        i1 = ((Rect)localObject).left;
      i2 = k;
      if (k == 0)
        i2 = ((Rect)localObject).right;
      n = j;
      if (j == 0)
        n = ((Rect)localObject).top;
      j = i;
      if (i == 0)
        j = ((Rect)localObject).bottom;
      m = i1;
      if (((Rect)localObject).left < i1)
        m = ((Rect)localObject).left;
      k = i2;
      if (((Rect)localObject).right > i2)
        k = ((Rect)localObject).right;
      i2 = n;
      if (((Rect)localObject).top > n)
        i2 = ((Rect)localObject).top;
      if (((Rect)localObject).bottom >= j)
        break label490;
    }
    label483: label490: for (int i = ((Rect)localObject).bottom; ; i = j)
    {
      j = i2;
      break;
      n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      m = n;
      int i4 = i1;
      k = i2;
      int i5 = i3;
      if (paramList1 != null)
      {
        paramList = paramList1.iterator();
        j = i1;
        i = n;
        do
        {
          m = i;
          i4 = j;
          k = i2;
          i5 = i3;
          if (!paramList.hasNext())
            break;
          paramList1 = (GeoPoint)paramList.next();
        }
        while (paramList1 == null);
        k = i3;
        if (i3 == 0)
          k = paramList1.getLongitudeE6();
        n = i2;
        if (i2 == 0)
          n = paramList1.getLongitudeE6();
        i1 = j;
        if (j == 0)
          i1 = paramList1.getLatitudeE6();
        j = i;
        if (i == 0)
          j = paramList1.getLatitudeE6();
        i3 = k;
        if (paramList1.getLongitudeE6() < k)
          i3 = paramList1.getLongitudeE6();
        i2 = n;
        if (paramList1.getLongitudeE6() > n)
          i2 = paramList1.getLongitudeE6();
        n = i1;
        if (paramList1.getLatitudeE6() > i1)
          n = paramList1.getLatitudeE6();
        if (paramList1.getLatitudeE6() >= j)
          break label483;
      }
      for (i = paramList1.getLatitudeE6(); ; i = j)
      {
        j = n;
        break;
        paramList = new Rect(i5, i4, k, m);
        AppMethodBeat.o(98928);
        return paramList;
      }
    }
  }

  private GeoPoint a(GeoPoint paramGeoPoint, Rect paramRect)
  {
    Object localObject = null;
    AppMethodBeat.i(98931);
    if (paramGeoPoint == null)
    {
      AppMethodBeat.o(98931);
      paramGeoPoint = localObject;
    }
    while (true)
    {
      return paramGeoPoint;
      paramGeoPoint = b(paramGeoPoint);
      if ((paramGeoPoint != null) && (paramRect != null))
      {
        paramGeoPoint = a(new DoublePoint(paramGeoPoint.x - (paramRect.left - paramRect.right) * 0.5D, paramGeoPoint.y - (paramRect.top - paramRect.bottom) * 0.5D));
        AppMethodBeat.o(98931);
      }
      else
      {
        AppMethodBeat.o(98931);
        paramGeoPoint = localObject;
      }
    }
  }

  private GeoPoint a(GeoPoint paramGeoPoint, gs.b paramb)
  {
    AppMethodBeat.i(98932);
    if (paramGeoPoint == null)
    {
      paramGeoPoint = null;
      AppMethodBeat.o(98932);
    }
    while (true)
    {
      return paramGeoPoint;
      paramGeoPoint = b(paramGeoPoint);
      if ((paramGeoPoint != null) && (paramb != null))
      {
        double d1 = paramGeoPoint.x;
        double d2 = paramGeoPoint.y;
        paramGeoPoint = new Rect(this.c.g());
        int i = paramGeoPoint.width();
        int j = paramGeoPoint.height();
        float f1 = paramb.a() + 0.5F;
        float f2 = paramb.b() + 0.5F;
        double d3;
        if (f1 < 0.25D)
        {
          d3 = d1 + (0.25D - f1) * i;
          label113: if (f2 >= 0.25D)
            break label194;
          d1 = f2;
          d1 = d2 + j * (0.25D - d1);
        }
        while (true)
        {
          paramGeoPoint = a(new DoublePoint(d3, d1));
          AppMethodBeat.o(98932);
          break;
          d3 = d1;
          if (f1 <= 0.75D)
            break label113;
          d3 = d1 - (f1 - 0.75D) * i;
          break label113;
          label194: d1 = d2;
          if (f2 > 0.75D)
          {
            d1 = f2;
            d1 = d2 - j * (d1 - 0.75D);
          }
        }
      }
      paramGeoPoint = null;
      AppMethodBeat.o(98932);
    }
  }

  private boolean a()
  {
    boolean bool = false;
    AppMethodBeat.i(98929);
    gs.b localb = this.a.q();
    if (localb == null)
      AppMethodBeat.o(98929);
    while (true)
    {
      return bool;
      if ((localb.a() != 0.0F) || (localb.b() != 0.0F))
      {
        bool = true;
        AppMethodBeat.o(98929);
      }
      else
      {
        AppMethodBeat.o(98929);
      }
    }
  }

  private boolean b()
  {
    boolean bool = false;
    AppMethodBeat.i(98930);
    gs.b localb = this.a.q();
    if (localb == null)
      AppMethodBeat.o(98930);
    while (true)
    {
      return bool;
      if ((Math.abs(localb.a()) > 0.25D) || (Math.abs(localb.b()) > 0.25D))
      {
        bool = true;
        AppMethodBeat.o(98930);
      }
      else
      {
        AppMethodBeat.o(98930);
      }
    }
  }

  public double a(double paramDouble)
  {
    AppMethodBeat.i(98926);
    float f = this.a.j();
    double d = this.a.k();
    d = 40076000.0D / (Math.pow(2.0D, (float)(f + Math.log(d) / Math.log(2.0D))) * 256.0D);
    paramDouble = Math.cos(3.141592653589793D * paramDouble / 180.0D);
    AppMethodBeat.o(98926);
    return d * paramDouble;
  }

  public double a(Point paramPoint1, Point paramPoint2)
  {
    return 0.0D;
  }

  public GeoPoint a(DoublePoint paramDoublePoint)
  {
    AppMethodBeat.i(98924);
    byte[] arrayOfByte = this.a.r();
    float f1 = (float)paramDoublePoint.x;
    float f2 = (float)paramDoublePoint.y;
    paramDoublePoint = this.b.a(arrayOfByte, f1, f2);
    AppMethodBeat.o(98924);
    return paramDoublePoint;
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(98920);
    this.a.d(paramFloat);
    AppMethodBeat.o(98920);
  }

  public void a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(98921);
    this.a.a(paramGeoPoint);
    AppMethodBeat.o(98921);
  }

  public void a(List<j> paramList, Rect paramRect, fl.a parama)
  {
    AppMethodBeat.i(98922);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(98922);
    while (true)
    {
      return;
      Object localObject = new Rect(this.c.g());
      if (paramRect != null)
      {
        ((Rect)localObject).left += paramRect.left;
        ((Rect)localObject).right -= paramRect.right;
        ((Rect)localObject).top += paramRect.top;
        ((Rect)localObject).bottom -= paramRect.bottom;
      }
      int i = ((Rect)localObject).width();
      int j = ((Rect)localObject).height();
      localObject = this.c.a().g();
      int k = ((fz)localObject).f();
      this.c.a(new fl.1(this, paramList, i, j, paramRect, k, (fz)localObject, parama));
      if (k != 60)
      {
        ((fz)localObject).e();
        ((fz)localObject).g();
      }
      AppMethodBeat.o(98922);
    }
  }

  public void a(List<j> paramList, List<GeoPoint> paramList1, Rect paramRect, fl.a parama)
  {
    AppMethodBeat.i(98923);
    if (((paramList == null) || (paramList.isEmpty())) && ((paramList1 == null) || (paramList1.isEmpty())))
      AppMethodBeat.o(98923);
    while (true)
    {
      return;
      Object localObject = new Rect(this.c.g());
      if (paramRect != null)
      {
        ((Rect)localObject).left += paramRect.left;
        ((Rect)localObject).right -= paramRect.right;
        ((Rect)localObject).top += paramRect.top;
        ((Rect)localObject).bottom -= paramRect.bottom;
      }
      int i = ((Rect)localObject).width();
      int j = ((Rect)localObject).height();
      localObject = this.c.a().g();
      int k = ((fz)localObject).f();
      this.c.a(new fl.2(this, paramList, paramList1, i, j, paramRect, k, (fz)localObject, parama));
      if (k != 60)
      {
        ((fz)localObject).e();
        ((fz)localObject).g();
      }
      AppMethodBeat.o(98923);
    }
  }

  public DoublePoint b(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(98925);
    double d1 = paramGeoPoint.getLatitudeE6() / 1000000.0D;
    double d2 = paramGeoPoint.getLongitudeE6() / 1000000.0D;
    paramGeoPoint = this.a.r();
    paramGeoPoint = this.b.a(paramGeoPoint, d1, d2);
    paramGeoPoint = new DoublePoint(paramGeoPoint.x, paramGeoPoint.y);
    AppMethodBeat.o(98925);
    return paramGeoPoint;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fl
 * JD-Core Version:    0.6.2
 */