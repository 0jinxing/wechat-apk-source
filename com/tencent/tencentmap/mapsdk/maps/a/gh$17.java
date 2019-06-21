package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$17
  implements gm.a
{
  gh$17(gh paramgh, GeoPoint paramGeoPoint, boolean paramBoolean)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99024);
    if (gh.a(this.c) != 0L)
      gh.b(this.c).nativeSetCenter(gh.a(this.c), this.a, this.b);
    AppMethodBeat.o(99024);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.17
 * JD-Core Version:    0.6.2
 */