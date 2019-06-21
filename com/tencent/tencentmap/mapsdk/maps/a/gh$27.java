package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$27
  implements gm.a
{
  gh$27(gh paramgh, int paramInt)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99035);
    if (gh.a(this.b) != 0L)
      gh.b(this.b).nativeRemoveHeatTileOverlay(gh.a(this.b), this.a);
    AppMethodBeat.o(99035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.27
 * JD-Core Version:    0.6.2
 */