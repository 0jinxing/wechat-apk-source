package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$26
  implements gm.a
{
  gh$26(gh paramgh, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99034);
    if (gh.a(this.d) != 0L)
      gh.b(this.d).nativeSetTileOverlayDataLevelRange(gh.a(this.d), this.a, this.b, this.c);
    AppMethodBeat.o(99034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.26
 * JD-Core Version:    0.6.2
 */