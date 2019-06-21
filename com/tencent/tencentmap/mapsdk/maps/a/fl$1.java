package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

class fl$1
  implements gm.a
{
  fl$1(fl paramfl, List paramList, int paramInt1, int paramInt2, Rect paramRect, int paramInt3, fz paramfz, fl.a parama)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(98917);
    GeoPoint localGeoPoint1 = fl.a(this.h).p();
    float f1 = fl.a(this.h).i();
    paramGL10 = null;
    float f2 = 4.0F;
    float f3 = fl.a(this.h).o();
    Object localObject;
    GeoPoint localGeoPoint2;
    if (f2 >= f3)
    {
      this.h.a(f2);
      localObject = fl.a(this.h, this.a, this.h);
      localGeoPoint2 = new GeoPoint(((Rect)localObject).centerY(), ((Rect)localObject).centerX());
      this.h.a(localGeoPoint2);
      paramGL10 = new GeoPoint(((Rect)localObject).top, ((Rect)localObject).left);
      localObject = new GeoPoint(((Rect)localObject).bottom, ((Rect)localObject).right);
      paramGL10 = this.h.b(paramGL10);
      localObject = this.h.b((GeoPoint)localObject);
      Rect localRect = new Rect();
      localRect.left = ((int)Math.min(paramGL10.x, ((DoublePoint)localObject).x));
      localRect.right = ((int)Math.max(paramGL10.x, ((DoublePoint)localObject).x));
      localRect.top = ((int)Math.min(paramGL10.y, ((DoublePoint)localObject).y));
      localRect.bottom = ((int)Math.max(paramGL10.y, ((DoublePoint)localObject).y));
      if ((this.b < localRect.width()) || (this.c < localRect.height()))
        break label414;
      if (!fl.b(this.h))
        paramGL10 = fl.a(this.h, localGeoPoint2, this.d);
    }
    else
    {
      label293: f2 = Math.max(f3, f2);
      if (this.e != 60)
        this.f.a(this.e);
      this.h.a(localGeoPoint1);
      this.h.a(f1);
      if (this.g == null)
        break label428;
    }
    while (true)
    {
      try
      {
        this.g.a(f2, paramGL10, -1.0D);
        AppMethodBeat.o(98917);
        return;
        paramGL10 = localGeoPoint2;
        if (!fl.c(this.h))
          break label293;
        localObject = fl.a(this.h).q();
        paramGL10 = localGeoPoint2;
        if (localObject == null)
          break label293;
        paramGL10 = fl.a(this.h, localGeoPoint2, (gs.b)localObject);
        break label293;
        label414: f2 /= 1.01F;
        paramGL10 = localGeoPoint2;
      }
      catch (Exception paramGL10)
      {
      }
      label428: AppMethodBeat.o(98917);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fl.1
 * JD-Core Version:    0.6.2
 */