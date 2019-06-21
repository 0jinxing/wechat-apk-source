package com.tencent.mm.plugin.appbrand.jsapi.u.a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import java.util.Map;

public final class b extends a
{
  private SurfaceTexture mSurfaceTexture;

  public b(Context paramContext, String paramString, Map<String, Object> paramMap)
  {
    super(paramContext, paramString, paramMap);
  }

  public final TencentMapOptions A(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(117350);
    TencentMapOptions localTencentMapOptions = super.A(paramMap);
    if (paramMap != null)
    {
      localObject = paramMap.get("surface");
      if (!(localObject instanceof SurfaceTexture));
    }
    for (Object localObject = (SurfaceTexture)localObject; ; localObject = null)
    {
      this.mSurfaceTexture = ((SurfaceTexture)localObject);
      if (this.mSurfaceTexture == null)
        ab.e("MicroMsg.SameLayerMapView", "mSurface is null, return");
      localTencentMapOptions.setExtSurface(new Surface(this.mSurfaceTexture));
      int i = f.a(paramMap, "width", 0);
      int j = f.a(paramMap, "height", 0);
      ab.i("MicroMsg.SameLayerMapView", "handler insert, position:[%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      localTencentMapOptions.setExtSurfaceDimension(i, j);
      localTencentMapOptions.setMapType(2);
      this.mSurfaceTexture.setDefaultBufferSize(i, j);
      AppMethodBeat.o(117350);
      return localTencentMapOptions;
    }
  }

  public final boolean aDU()
  {
    return true;
  }

  public final void onSizeChanged(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117352);
    if (this.mSurfaceTexture != null)
      this.mSurfaceTexture.setDefaultBufferSize(paramInt1, paramInt2);
    this.hMT.onSizeChanged(paramInt1, paramInt2, paramInt1, paramInt2);
    AppMethodBeat.o(117352);
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(117351);
    if (this.mSurfaceTexture == null)
      AppMethodBeat.o(117351);
    while (true)
    {
      return;
      if (this.hMT != null)
        this.hMT.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(117351);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.b
 * JD-Core Version:    0.6.2
 */