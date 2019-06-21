package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.element.l;
import com.tencent.map.lib.f;
import com.tencent.map.lib.mapstructure.Polygon2D;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.db;
import com.tencent.tencentmap.mapsdk.a.dk;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

public class ia extends hz
  implements j, ft
{
  Polygon2D a;
  private List<GeoPoint> b;
  private Rect c;
  private l d;
  private byte[] e;
  private ia.a f;
  private String g;
  private GeoPoint h;
  private Rect i;
  private f j;
  private boolean k;
  private boolean l;
  private dk m;

  public ia(iz paramiz, dk paramdk)
  {
    AppMethodBeat.i(99747);
    this.b = new ArrayList();
    this.e = new byte[0];
    this.f = new ia.a(null);
    this.h = new GeoPoint();
    this.i = new Rect();
    this.k = false;
    this.l = false;
    if ((paramiz == null) || (paramiz.b() == null))
      AppMethodBeat.o(99747);
    while (true)
    {
      return;
      this.a = new Polygon2D();
      this.a.polygonId = -1;
      this.m = paramdk;
      this.j = paramiz.b();
      if ((paramdk != null) && (!StringUtil.isEmpty(paramdk.g())))
        this.j.a(this);
      AppMethodBeat.o(99747);
    }
  }

  private int a(Rect paramRect, String paramString)
  {
    return 1;
  }

  private int a(String paramString, fw paramfw)
  {
    AppMethodBeat.i(99765);
    GeoPoint localGeoPoint1 = new GeoPoint(this.i.top, this.i.left);
    GeoPoint localGeoPoint2 = new GeoPoint(this.i.top, this.i.right);
    GeoPoint localGeoPoint3 = new GeoPoint(this.i.bottom, this.i.right);
    GeoPoint localGeoPoint4 = new GeoPoint(this.i.bottom, this.i.left);
    paramfw = a(new DoublePoint[] { paramfw.b(localGeoPoint1), paramfw.b(localGeoPoint2), paramfw.b(localGeoPoint3), paramfw.b(localGeoPoint4) });
    int n = a(new Rect((int)paramfw[0].x, (int)paramfw[0].y, (int)paramfw[1].x, (int)paramfw[1].y), paramString);
    AppMethodBeat.o(99765);
    return n;
  }

  private DoublePoint[] a(DoublePoint[] paramArrayOfDoublePoint)
  {
    AppMethodBeat.i(99764);
    int n = paramArrayOfDoublePoint.length;
    double d1 = paramArrayOfDoublePoint[0].x;
    double d2 = paramArrayOfDoublePoint[0].y;
    double d3 = paramArrayOfDoublePoint[0].x;
    double d4 = paramArrayOfDoublePoint[0].y;
    int i1 = 1;
    double d6;
    double d7;
    if (i1 < n)
    {
      double d5 = paramArrayOfDoublePoint[i1].x;
      d6 = paramArrayOfDoublePoint[i1].y;
      d7 = d1;
      if (d5 < d1)
        d7 = d5;
      if (d5 <= d3)
        break label176;
      d3 = d5;
    }
    label176: 
    while (true)
    {
      d1 = d2;
      if (d6 < d2)
        d1 = d6;
      if (d6 > d4)
        d4 = d6;
      while (true)
      {
        i1++;
        d2 = d1;
        d1 = d7;
        break;
        DoublePoint localDoublePoint = new DoublePoint(d1, d2);
        paramArrayOfDoublePoint = new DoublePoint(d3, d4);
        AppMethodBeat.o(99764);
        return new DoublePoint[] { localDoublePoint, paramArrayOfDoublePoint };
      }
    }
  }

  private void b(List<db> paramList)
  {
    AppMethodBeat.i(99750);
    if (paramList == null)
      AppMethodBeat.o(99750);
    while (true)
    {
      return;
      int n = paramList.size();
      if (n <= 0)
      {
        AppMethodBeat.o(99750);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        for (int i1 = 0; i1 < n; i1++)
        {
          Object localObject = (db)paramList.get(i1);
          if (localObject != null)
          {
            localObject = ic.a((db)localObject);
            if (localObject != null)
              localArrayList.add(localObject);
          }
        }
        a(localArrayList);
        AppMethodBeat.o(99750);
      }
    }
  }

  private boolean b(fw paramfw)
  {
    boolean bool = false;
    AppMethodBeat.i(99762);
    if (this.a == null)
      AppMethodBeat.o(99762);
    while (true)
    {
      return bool;
      Object localObject1 = f();
      Object localObject2 = new GeoPoint(((Rect)localObject1).top, ((Rect)localObject1).left);
      Object localObject3 = new GeoPoint(((Rect)localObject1).bottom, ((Rect)localObject1).right);
      Object localObject4 = new GeoPoint(((Rect)localObject1).bottom, ((Rect)localObject1).left);
      localObject1 = new GeoPoint(((Rect)localObject1).top, ((Rect)localObject1).right);
      localObject2 = paramfw.b((GeoPoint)localObject2);
      localObject3 = paramfw.b((GeoPoint)localObject3);
      localObject4 = paramfw.b((GeoPoint)localObject4);
      paramfw = a(new DoublePoint[] { localObject2, paramfw.b((GeoPoint)localObject1), localObject3, localObject4 });
      paramfw = new Rect((int)paramfw[0].x, (int)paramfw[0].y, (int)paramfw[1].x, (int)paramfw[1].y);
      if ((Math.abs(paramfw.width()) > 5) && (Math.abs(paramfw.height()) > 5))
      {
        AppMethodBeat.o(99762);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(99762);
      }
    }
  }

  private int[] b(int paramInt)
  {
    AppMethodBeat.i(99754);
    int n = Color.red(paramInt);
    int i1 = Color.green(paramInt);
    int i2 = Color.blue(paramInt);
    paramInt = Color.alpha(paramInt);
    AppMethodBeat.o(99754);
    return new int[] { n, i1, i2, paramInt };
  }

  private void c(fw paramfw)
  {
    AppMethodBeat.i(99763);
    if (this.j == null)
      AppMethodBeat.o(99763);
    while (true)
    {
      return;
      String str = this.m.g();
      if (StringUtil.isEmpty(str))
      {
        AppMethodBeat.o(99763);
        continue;
      }
      synchronized (this.e)
      {
        if (this.f == null)
        {
          ia.a locala = new com/tencent/tencentmap/mapsdk/maps/a/ia$a;
          locala.<init>(null);
          this.f = locala;
        }
        a(str, paramfw);
        AppMethodBeat.o(99763);
      }
    }
  }

  private void g()
  {
    AppMethodBeat.i(99755);
    if (this.j == null)
      AppMethodBeat.o(99755);
    while (true)
    {
      return;
      if ((this.a.polygonId >= 0) && (!this.P))
      {
        AppMethodBeat.o(99755);
      }
      else
      {
        if ((this.b != null) && (this.b.size() > 2))
          break;
        AppMethodBeat.o(99755);
      }
    }
    this.a.color = b(this.L);
    this.a.borderColor = b(this.M);
    this.a.borderWidth = this.K;
    this.a.polygonMode = 1;
    this.a.zIndex = D();
    this.a.level = E();
    int n = this.b.size();
    this.a.points = new Point[n];
    for (int i1 = 0; i1 < n; i1++)
    {
      GeoPoint localGeoPoint = (GeoPoint)this.b.get(i1);
      this.a.points[i1] = new Point(localGeoPoint.getLongitudeE6(), localGeoPoint.getLatitudeE6());
    }
    if (-1 == this.a.polygonId)
      this.a.polygonId = this.j.a(this.a);
    while (true)
    {
      this.j.a();
      this.P = false;
      AppMethodBeat.o(99755);
      break;
      if (this.P)
        this.j.b(this.a);
    }
  }

  public Rect a(fw paramfw)
  {
    AppMethodBeat.i(99760);
    Rect localRect = new Rect();
    new Rect();
    if (this.a != null)
      localRect = f();
    if (this.d != null)
    {
      paramfw = this.d.a(paramfw);
      localRect.left = Math.min(localRect.left, paramfw.left);
      localRect.top = Math.min(localRect.top, paramfw.top);
      localRect.right = Math.max(localRect.right, paramfw.right);
      localRect.bottom = Math.max(localRect.bottom, paramfw.bottom);
    }
    AppMethodBeat.o(99760);
    return localRect;
  }

  public void a(dk paramdk)
  {
    AppMethodBeat.i(99749);
    if (paramdk == null)
      AppMethodBeat.o(99749);
    while (true)
    {
      return;
      d(paramdk.d());
      c(paramdk.c());
      d(paramdk.b());
      c(paramdk.e());
      a(paramdk.f());
      a_(paramdk.h());
      b(paramdk.a());
      this.P = true;
      AppMethodBeat.o(99749);
    }
  }

  public void a(gj paramgj, fw paramfw, GL10 paramGL10)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(99759);
        if (this.j == null)
        {
          AppMethodBeat.o(99759);
          return;
        }
        if (!a())
        {
          this.j.c(this.a.polygonId);
          this.a.polygonId = -1;
          AppMethodBeat.o(99759);
          continue;
        }
      }
      finally
      {
      }
      if (StringUtil.isEmpty(this.m.g()))
      {
        c();
        AppMethodBeat.o(99759);
      }
      else if (!b(paramfw))
      {
        AppMethodBeat.o(99759);
      }
      else
      {
        a(paramGL10);
        if (this.d != null)
        {
          this.d.b(paramgj, paramfw);
          paramgj = new java/lang/StringBuilder;
          paramgj.<init>();
          this.g = this.d.f();
          if (!this.l)
          {
            this.j.d(this.d.f(), e());
            this.l = true;
          }
        }
        AppMethodBeat.o(99759);
      }
    }
  }

  public void a(gs.c paramc)
  {
    AppMethodBeat.i(99761);
    if (paramc == gs.c.a)
      AppMethodBeat.o(99761);
    while (true)
    {
      return;
      if (this.j != null)
        c(this.j.t());
      AppMethodBeat.o(99761);
    }
  }

  public void a(List<GeoPoint> paramList)
  {
    AppMethodBeat.i(99748);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      AppMethodBeat.o(99748);
      return;
    }
    label44: int i1;
    label53: GeoPoint localGeoPoint;
    if (this.b == null)
    {
      this.b = new ArrayList();
      int n = paramList.size();
      i1 = 0;
      if (i1 >= n)
        break label152;
      localGeoPoint = (GeoPoint)paramList.get(i1);
      if (localGeoPoint != null)
      {
        i2 = 0;
        label78: if (i2 >= i1)
          break label161;
        if (!localGeoPoint.equals((GeoPoint)paramList.get(i2)))
          break label146;
      }
    }
    label146: label152: label161: for (int i2 = 1; ; i2 = 0)
    {
      if (i2 == 0)
      {
        this.P = true;
        this.b.add(localGeoPoint);
      }
      i1++;
      break label53;
      this.b.clear();
      break label44;
      i2++;
      break label78;
      AppMethodBeat.o(99748);
      break;
    }
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99751);
    if (this.j == null)
      AppMethodBeat.o(99751);
    while (true)
    {
      return;
      if (!a())
      {
        this.j.c(this.a.polygonId);
        this.a.polygonId = -1;
        AppMethodBeat.o(99751);
      }
      else
      {
        c();
        AppMethodBeat.o(99751);
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(99752);
    if (this.j == null)
      AppMethodBeat.o(99752);
    while (true)
    {
      return;
      this.O = paramBoolean;
      this.j.a();
      AppMethodBeat.o(99752);
    }
  }

  public boolean a()
  {
    return this.O;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    return false;
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
    AppMethodBeat.i(99753);
    g();
    AppMethodBeat.o(99753);
  }

  public void d()
  {
    AppMethodBeat.i(99757);
    if (this.j == null)
      AppMethodBeat.o(99757);
    while (true)
    {
      return;
      this.j.b(this);
      if (this.a != null)
        this.j.c(this.a.polygonId);
      if (this.b != null)
      {
        this.b.clear();
        this.b = null;
      }
      synchronized (this.e)
      {
        if (this.f != null)
        {
          this.f.a();
          this.f = null;
        }
        if (this.d != null)
        {
          this.j.b(this.d);
          this.d = null;
        }
        this.k = false;
        AppMethodBeat.o(99757);
      }
    }
  }

  public int e()
  {
    if (this.a == null);
    for (int n = -1; ; n = this.a.polygonId)
      return n;
  }

  public Rect f()
  {
    AppMethodBeat.i(99758);
    Object localObject;
    if (this.c != null)
    {
      localObject = this.c;
      AppMethodBeat.o(99758);
    }
    while (true)
    {
      return localObject;
      if ((this.b == null) || (this.b.isEmpty()))
      {
        localObject = null;
        AppMethodBeat.o(99758);
      }
      else
      {
        localObject = (GeoPoint)this.b.get(0);
        int n = ((GeoPoint)localObject).getLatitudeE6();
        int i1 = ((GeoPoint)localObject).getLongitudeE6();
        int i2 = this.b.size();
        int i3 = 1;
        int i4 = n;
        int i5 = i1;
        int i6 = i1;
        for (i1 = i3; i1 < i2; i1++)
        {
          localObject = (GeoPoint)this.b.get(i1);
          i3 = ((GeoPoint)localObject).getLatitudeE6();
          int i7 = ((GeoPoint)localObject).getLongitudeE6();
          i6 = Math.min(i6, i7);
          i5 = Math.max(i5, i7);
          n = Math.max(n, i3);
          i4 = Math.min(i4, i3);
        }
        this.c = new Rect(i6, n, i5, i4);
        localObject = this.c;
        AppMethodBeat.o(99758);
      }
    }
  }

  public void z()
  {
    AppMethodBeat.i(99756);
    super.z();
    AppMethodBeat.o(99756);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ia
 * JD-Core Version:    0.6.2
 */