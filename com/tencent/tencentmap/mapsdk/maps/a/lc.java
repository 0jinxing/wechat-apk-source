package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cs;
import com.tencent.tencentmap.mapsdk.a.db;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class lc
  implements lb
{
  static int b = 4;
  kn<Double, kx> a;
  double c;
  double d;
  private jx e;

  public lc(jx paramjx)
  {
    this.e = paramjx;
  }

  public List<kb> a(DoublePoint paramDoublePoint1, DoublePoint paramDoublePoint2, double paramDouble)
  {
    AppMethodBeat.i(100323);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int i = (int)(10.0D / paramDouble);
    double d1 = -Math.log(paramDouble) / Math.log(2.0D);
    paramDouble = (this.d - this.c) / 20.0D;
    paramDouble = (Math.pow(d1, b) / Math.pow(21.0D, b - 1) - 0.2D) * paramDouble + this.c;
    if (paramDouble < this.c)
      paramDouble = this.c;
    while (true)
    {
      if (this.a != null)
        this.a.b(ky.a(paramDoublePoint1.x, paramDoublePoint2.y, paramDoublePoint2.x, paramDoublePoint1.y)).a(new lc.1(this, paramDouble, i, localHashMap, localArrayList));
      AppMethodBeat.o(100323);
      return localArrayList;
    }
  }

  public void a(List<cs> paramList)
  {
    AppMethodBeat.i(100324);
    this.a = kn.a(22).b(32).a();
    this.c = 0.0D;
    this.d = 4.9E-324D;
    float[][] arrayOfFloat = new float[256][256];
    paramList = paramList.iterator();
    int j;
    while (paramList.hasNext())
    {
      Object localObject1 = (cs)paramList.next();
      Object localObject2 = ((cs)localObject1).b();
      localObject2 = new GeoPoint((int)(((db)localObject2).a * 1000000.0D), (int)(((db)localObject2).b * 1000000.0D));
      localObject2 = this.e.e().a((GeoPoint)localObject2);
      double d1 = ((cs)localObject1).a();
      this.a = this.a.a(Double.valueOf(d1), kx.a(((DoublePoint)localObject2).x, ((DoublePoint)localObject2).y));
      if (d1 > this.c)
        this.c = d1;
      i = (int)(((DoublePoint)localObject2).x / 1048576.0D);
      j = (int)(((DoublePoint)localObject2).y / 1048576.0D);
      localObject1 = arrayOfFloat[i];
      localObject1[j] = ((float)(d1 + localObject1[j]));
    }
    for (int i = 0; i < 256; i++)
      for (j = 0; j < 256; j++)
        if (arrayOfFloat[i][j] > this.d)
          this.d = arrayOfFloat[i][j];
    AppMethodBeat.o(100324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lc
 * JD-Core Version:    0.6.2
 */