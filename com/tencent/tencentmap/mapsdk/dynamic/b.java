package com.tencent.tencentmap.mapsdk.dynamic;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.dy;
import com.tencent.tencentmap.mapsdk.a.ea;
import com.tencent.tencentmap.mapsdk.a.ec;
import com.tencent.tencentmap.mapsdk.a.ei;
import com.tencent.tencentmap.mapsdk.map.IMapView;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;

public class b
{
  private TencentMapOptions a;

  public IMapView a(Context paramContext, TencentMapOptions paramTencentMapOptions)
  {
    AppMethodBeat.i(101277);
    int i = 0;
    this.a = paramTencentMapOptions;
    if (this.a != null)
      i = this.a.getMapType();
    switch (i)
    {
    default:
      paramContext = new ec(paramContext, this.a);
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(101277);
      return paramContext;
      dy.a("maptype", "glmapview");
      paramContext = new ec(paramContext, this.a);
      continue;
      paramContext = new ea(paramContext, this.a);
      dy.a("maptype", "texturemapview");
      continue;
      paramContext = new ei(paramContext, this.a);
      dy.a("maptype", "maprenderlayer");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.dynamic.b
 * JD-Core Version:    0.6.2
 */