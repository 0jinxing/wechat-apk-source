package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$8
  implements gm.a
{
  gh$8(gh paramgh, int paramInt1, int paramInt2)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99047);
    if (gh.a(this.c) != 0L)
      gh.b(this.c).nativeSetCompassPosition(gh.a(this.c), this.a, this.b);
    AppMethodBeat.o(99047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.8
 * JD-Core Version:    0.6.2
 */