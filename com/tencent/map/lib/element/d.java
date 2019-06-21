package com.tencent.map.lib.element;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fn;
import com.tencent.tencentmap.mapsdk.maps.a.fw;
import com.tencent.tencentmap.mapsdk.maps.a.gh;
import com.tencent.tencentmap.mapsdk.maps.a.gj;
import com.tencent.tencentmap.mapsdk.maps.a.hc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class d
  implements j
{
  private fn a;
  private e b;
  private int[] c;
  private int[] d;
  private int e;
  private GeoPoint f;
  private boolean g;
  private int h;
  private d.a i;
  private float j;
  private int k;

  public d(e parame)
  {
    AppMethodBeat.i(97863);
    this.g = true;
    this.h = -1;
    this.j = -1.0F;
    this.k = -1;
    a(parame);
    AppMethodBeat.o(97863);
  }

  private Rect a(List<GeoPoint> paramList)
  {
    AppMethodBeat.i(97874);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramList = null;
      AppMethodBeat.o(97874);
      return paramList;
    }
    GeoPoint localGeoPoint = (GeoPoint)paramList.get(0);
    int m = localGeoPoint.getLongitudeE6();
    int n = localGeoPoint.getLongitudeE6();
    int i1 = localGeoPoint.getLatitudeE6();
    int i2 = localGeoPoint.getLatitudeE6();
    int i3 = paramList.size();
    int i4 = 0;
    label72: int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    if (i4 < i3)
    {
      localGeoPoint = (GeoPoint)paramList.get(i4);
      i5 = n;
      i6 = m;
      if (localGeoPoint == null)
        break label221;
      i7 = localGeoPoint.getLatitudeE6();
      i6 = localGeoPoint.getLongitudeE6();
      if (i6 < m)
      {
        i8 = i6;
        i9 = n;
        label128: if (i7 >= i2)
          break label176;
        i2 = i7;
      }
    }
    while (true)
    {
      i4++;
      n = i9;
      m = i8;
      break label72;
      i9 = n;
      i8 = m;
      if (i6 <= n)
        break label128;
      i9 = i6;
      i8 = m;
      break label128;
      label176: i5 = i9;
      i6 = i8;
      if (i7 > i1)
      {
        i1 = i7;
        continue;
        paramList = new Rect(m, i1, n, i2);
        AppMethodBeat.o(97874);
        break;
      }
      label221: i9 = i5;
      i8 = i6;
    }
  }

  private void a(gj paramgj, fw paramfw)
  {
    AppMethodBeat.i(97875);
    if (this.b == null)
      AppMethodBeat.o(97875);
    List localList;
    ArrayList localArrayList1;
    int m;
    int[] arrayOfInt;
    int n;
    while (true)
    {
      return;
      if ((this.b.r != 2) && (this.b.r != 3))
      {
        AppMethodBeat.o(97875);
      }
      else
      {
        localList = this.b.q;
        if ((localList == null) || (localList.isEmpty()))
        {
          AppMethodBeat.o(97875);
        }
        else
        {
          localArrayList1 = this.b.a;
          if ((localArrayList1 == null) || (localArrayList1.size() < 2))
          {
            AppMethodBeat.o(97875);
          }
          else
          {
            m = localArrayList1.size();
            arrayOfInt = new int[m - 1];
            for (n = 0; n < m - 1; n++)
              arrayOfInt[n] = 0;
            n = hc.a(localArrayList1, arrayOfInt, paramfw);
            if (n > 0)
              break;
            AppMethodBeat.o(97875);
          }
        }
      }
    }
    paramfw = new ArrayList(n + m);
    ArrayList localArrayList2;
    int i1;
    GeoPoint localGeoPoint1;
    Object localObject;
    GeoPoint localGeoPoint2;
    if (this.b.r == 2)
    {
      localArrayList2 = new ArrayList(3);
      i1 = localList.size();
      for (n = 0; (n < m - 1) && (n < i1); n++)
      {
        localGeoPoint1 = new GeoPoint((GeoPoint)localArrayList1.get(n));
        localObject = new GeoPoint((GeoPoint)localList.get(n));
        localGeoPoint2 = new GeoPoint((GeoPoint)localArrayList1.get(n + 1));
        paramfw.add(localArrayList1.get(n));
        localArrayList2.clear();
        localArrayList2.add(localGeoPoint1);
        localArrayList2.add(localObject);
        localArrayList2.add(localGeoPoint2);
        if (arrayOfInt[n] > 0)
        {
          localObject = hc.a(localArrayList2, arrayOfInt[n]);
          if ((localObject != null) && (!((List)localObject).isEmpty()))
            paramfw.addAll((Collection)localObject);
        }
      }
      paramfw.add(localArrayList1.get(m - 1));
    }
    while (true)
    {
      if (this.h != -1)
        paramgj.a(this.h);
      this.b.b = paramfw;
      AppMethodBeat.o(97875);
      break;
      localArrayList2 = new ArrayList(4);
      i1 = 0;
      int i2 = localList.size();
      for (n = 0; (i1 < m - 1) && (n < i2); n += 2)
      {
        localGeoPoint2 = new GeoPoint((GeoPoint)localArrayList1.get(i1));
        localObject = new GeoPoint((GeoPoint)localList.get(n));
        localGeoPoint1 = new GeoPoint((GeoPoint)localList.get(n + 1));
        GeoPoint localGeoPoint3 = new GeoPoint((GeoPoint)localArrayList1.get(i1 + 1));
        paramfw.add(localArrayList1.get(i1));
        localArrayList2.clear();
        localArrayList2.add(localGeoPoint2);
        localArrayList2.add(localObject);
        localArrayList2.add(localGeoPoint1);
        localArrayList2.add(localGeoPoint3);
        if (arrayOfInt[i1] > 0)
        {
          localObject = hc.a(localArrayList2, arrayOfInt[i1]);
          if ((localObject != null) && (!((List)localObject).isEmpty()))
            paramfw.addAll((Collection)localObject);
        }
        i1++;
      }
      paramfw.add(localArrayList1.get(m - 1));
    }
  }

  public int A()
  {
    AppMethodBeat.i(97873);
    int m = this.b.c();
    AppMethodBeat.o(97873);
    return m;
  }

  public void B()
  {
    this.k = -1;
  }

  public Rect a(fw paramfw)
  {
    AppMethodBeat.i(97866);
    if ((this.b == null) || (this.b.b == null))
    {
      paramfw = null;
      AppMethodBeat.o(97866);
      return paramfw;
    }
    Iterator localIterator = this.b.b.iterator();
    int m = 2147483647;
    int n = 2147483647;
    int i1 = -2147483648;
    int i2 = -2147483648;
    label57: int i3;
    int i4;
    if (localIterator.hasNext())
    {
      paramfw = (GeoPoint)localIterator.next();
      i3 = paramfw.getLatitudeE6();
      i4 = paramfw.getLongitudeE6();
      if (i3 <= i2)
        break label175;
      i2 = i3;
    }
    label175: 
    while (true)
    {
      int i5 = n;
      if (i3 < n)
        i5 = i3;
      i3 = i1;
      if (i4 > i1)
        i3 = i4;
      if (i4 < m)
        m = i4;
      while (true)
      {
        n = i5;
        i1 = i3;
        break label57;
        paramfw = new Rect(m, i2, i1, n);
        AppMethodBeat.o(97866);
        break;
      }
    }
  }

  public ArrayList<GeoPoint> a()
  {
    return this.b.b;
  }

  public void a(float paramFloat)
  {
    this.b.j = paramFloat;
  }

  public final void a(int paramInt)
  {
    this.h = paramInt;
  }

  public void a(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(97868);
      d.a locala = new com/tencent/map/lib/element/d$a;
      locala.<init>();
      this.i = locala;
      this.i.a = paramInt1;
      this.i.b = paramInt2;
      AppMethodBeat.o(97868);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(int paramInt, GeoPoint paramGeoPoint)
  {
    this.e = paramInt;
    this.f = paramGeoPoint;
  }

  public void a(e parame)
  {
    try
    {
      AppMethodBeat.i(97870);
      if (parame == null)
      {
        parame = new java/lang/IllegalArgumentException;
        parame.<init>("LineOptions不能为空！");
        AppMethodBeat.o(97870);
        throw parame;
      }
    }
    finally
    {
    }
    if ((parame.b == null) || (parame.b.size() < 2))
    {
      parame = new java/lang/IllegalArgumentException;
      parame.<init>("LineOptions中点的个数不能小于2");
      AppMethodBeat.o(97870);
      throw parame;
    }
    if ((parame.c == null) || (parame.c.length <= 0))
    {
      parame = new java/lang/IllegalArgumentException;
      parame.<init>("参数startIndexes不能为空!");
      AppMethodBeat.o(97870);
      throw parame;
    }
    if ((parame.d == null) || (parame.d.length <= 0))
    {
      parame = new java/lang/IllegalArgumentException;
      parame.<init>("参数colors不能为空!");
      AppMethodBeat.o(97870);
      throw parame;
    }
    this.b = parame;
    this.c = parame.c;
    this.d = parame.d;
    this.h = -1;
    AppMethodBeat.o(97870);
  }

  public void a(boolean paramBoolean)
  {
    this.b.s = paramBoolean;
  }

  public boolean a(fw paramfw, float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(97865);
        if (this.a == null)
        {
          AppMethodBeat.o(97865);
          return bool;
        }
        paramfw = this.a.f().a(paramFloat1, paramFloat2);
        if ((paramfw != null) && (paramfw.itemId == s()))
        {
          bool = true;
          AppMethodBeat.o(97865);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(97865);
    }
  }

  public void b(gj paramgj, fw paramfw)
  {
    try
    {
      AppMethodBeat.i(97864);
      if (paramgj == null)
        AppMethodBeat.o(97864);
      while (true)
      {
        return;
        this.a = paramgj.b();
        float f1 = paramgj.d();
        if ((this.j == -1.0F) || (this.j != f1))
        {
          this.j = f1;
          a(paramgj, paramfw);
        }
        paramgj.a(this);
        AppMethodBeat.o(97864);
      }
    }
    finally
    {
    }
    throw paramgj;
  }

  public int[] b()
  {
    return this.c;
  }

  public int[] c()
  {
    return this.d;
  }

  public boolean d()
  {
    return this.b.h;
  }

  public int[] e()
  {
    return this.b.e;
  }

  public int[] f()
  {
    return this.b.f;
  }

  public float g()
  {
    return this.b.g;
  }

  public GeoPoint h()
  {
    return this.f;
  }

  public int i()
  {
    return this.e;
  }

  public boolean j()
  {
    return this.b.i;
  }

  public boolean k()
  {
    return this.b.l;
  }

  public boolean l()
  {
    return this.b.n;
  }

  public int m()
  {
    AppMethodBeat.i(97867);
    int m = this.b.a();
    AppMethodBeat.o(97867);
    return m;
  }

  public float n()
  {
    return this.b.j;
  }

  public float o()
  {
    if (this.b == null);
    for (float f1 = 1.0F; ; f1 = this.b.m)
      return f1;
  }

  public void p()
  {
    try
    {
      this.i = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public d.a q()
  {
    try
    {
      d.a locala = this.i;
      return locala;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String r()
  {
    AppMethodBeat.i(97869);
    String str;
    if ((this.b.d != null) && (this.b.d.length > 0))
      if (this.b.d[0] == 33)
      {
        str = "color_point_texture.png";
        AppMethodBeat.o(97869);
      }
    while (true)
    {
      return str;
      if (this.b.d[0] == 20)
      {
        str = "color_texture_line_v2.png";
        AppMethodBeat.o(97869);
      }
      else if (StringUtil.isEmpty(this.b.k))
      {
        str = "color_texture_flat_style.png";
        AppMethodBeat.o(97869);
      }
      else
      {
        str = this.b.k;
        AppMethodBeat.o(97869);
      }
    }
  }

  public final int s()
  {
    return this.h;
  }

  public boolean t()
  {
    return this.b.s;
  }

  public Rect u()
  {
    AppMethodBeat.i(97871);
    Object localObject = this.b.a;
    if ((localObject != null) && (!((ArrayList)localObject).isEmpty()) && (this.e >= 0) && (this.e < ((ArrayList)localObject).size()))
    {
      localObject = a(((ArrayList)localObject).subList(this.e, ((ArrayList)localObject).size()));
      if (localObject != null)
        this.b.t = ((Rect)localObject);
    }
    localObject = this.b.t;
    AppMethodBeat.o(97871);
    return localObject;
  }

  public int v()
  {
    return this.b.u;
  }

  public String w()
  {
    return this.b.v;
  }

  public float x()
  {
    AppMethodBeat.i(97872);
    float f1 = this.b.b();
    AppMethodBeat.o(97872);
    return f1;
  }

  public int[] y()
  {
    return new int[] { this.b.x, this.b.y };
  }

  public List<Integer> z()
  {
    return this.b.z;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.element.d
 * JD-Core Version:    0.6.2
 */