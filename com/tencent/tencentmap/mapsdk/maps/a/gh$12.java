package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$12
  implements gm.a
{
  gh$12(gh paramgh, int paramInt)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99019);
    if (gh.a(this.b) != 0L)
      gh.b(this.b).nativeSetIndoorFloor(gh.a(this.b), this.a);
    AppMethodBeat.o(99019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.12
 * JD-Core Version:    0.6.2
 */