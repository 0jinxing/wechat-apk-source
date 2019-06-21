package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

class fl$2
  implements gm.a
{
  fl$2(fl paramfl, List paramList1, List paramList2, int paramInt1, int paramInt2, Rect paramRect, int paramInt3, fz paramfz, fl.a parama)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(98918);
    GeoPoint localGeoPoint1 = fl.a(this.i).p();
    float f1 = fl.a(this.i).i();
    paramGL10 = null;
    float f2 = 4.0F;
    float f3 = fl.a(this.i).o();
    Object localObject;
    GeoPoint localGeoPoint2;
    if (f2 >= f3)
    {
      this.i.a(f2);
      localObject = fl.a(this.i, this.a, this.b, this.i);
      localGeoPoint2 = new GeoPoint(((Rect)localObject).centerY(), ((Rect)localObject).centerX());
      this.i.a(localGeoPoint2);
      paramGL10 = new GeoPoint(((Rect)localObject).top, ((Rect)localObject).left);
      localObject = new GeoPoint(((Rect)localObject).bottom, ((Rect)localObject).right);
      paramGL10 = this.i.b(paramGL10);
      DoublePoint localDoublePoint = this.i.b((GeoPoint)localObject);
      localObject = new Rect();
      ((Rect)localObject).left = ((int)Math.min(paramGL10.x, localDoublePoint.x));
      ((Rect)localObject).right = ((int)Math.max(paramGL10.x, localDoublePoint.x));
      ((Rect)localObject).top = ((int)Math.min(paramGL10.y, localDoublePoint.y));
      ((Rect)localObject).bottom = ((int)Math.max(paramGL10.y, localDoublePoint.y));
      if ((this.c < ((Rect)localObject).width()) || (this.d < ((Rect)localObject).height()))
        break label418;
      if (!fl.b(this.i))
        paramGL10 = fl.a(this.i, localGeoPoint2, this.e);
    }
    else
    {
      label297: f2 = Math.max(f3, f2);
      if (this.f != 60)
        this.g.a(this.f);
      this.i.a(localGeoPoint1);
      this.i.a(f1);
      if (this.h == null)
        break label432;
    }
    while (true)
    {
      try
      {
        this.h.a(f2, paramGL10, -1.0D);
        AppMethodBeat.o(98918);
        return;
        paramGL10 = localGeoPoint2;
        if (!fl.c(this.i))
          break label297;
        localObject = fl.a(this.i).q();
        paramGL10 = localGeoPoint2;
        if (localObject == null)
          break label297;
        paramGL10 = fl.a(this.i, localGeoPoint2, (gs.b)localObject);
        break label297;
        label418: f2 /= 1.01F;
        paramGL10 = localGeoPoint2;
      }
      catch (Exception paramGL10)
      {
      }
      label432: AppMethodBeat.o(98918);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fl.2
 * JD-Core Version:    0.6.2
 */