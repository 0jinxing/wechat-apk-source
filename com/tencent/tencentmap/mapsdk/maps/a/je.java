package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.element.MapPoi;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aj.k;
import com.tencent.tencentmap.mapsdk.a.db;
import com.tencent.tencentmap.mapsdk.a.dd;

public class je extends jb
{
  private MapPoi a;
  private iz b;

  public je(iz paramiz, MapPoi paramMapPoi)
  {
    this.a = paramMapPoi;
    this.b = paramiz;
  }

  public Rect a()
  {
    AppMethodBeat.i(100027);
    Object localObject = this.b.b().t().b(ic.a(new db(this.a.getLatitude(), this.a.getLongitude())));
    localObject = new Rect((int)(((DoublePoint)localObject).x - ic.s * 20.0F), (int)(((DoublePoint)localObject).y - ic.s * 20.0F), (int)(((DoublePoint)localObject).x + ic.s * 20.0F), (int)(((DoublePoint)localObject).y + ic.s * 20.0F));
    AppMethodBeat.o(100027);
    return localObject;
  }

  public String b()
  {
    AppMethodBeat.i(100028);
    String str = this.a.getPoiName();
    AppMethodBeat.o(100028);
    return str;
  }

  public void c()
  {
    AppMethodBeat.i(100029);
    if (this.b != null)
    {
      aj.k localk = this.b.u;
      if (localk != null)
      {
        dd localdd = new dd();
        localdd.e = new db(this.a.getLatitude(), this.a.getLongitude());
        localdd.d = this.a.getPoiName();
        localk.a(localdd);
      }
    }
    AppMethodBeat.o(100029);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.je
 * JD-Core Version:    0.6.2
 */