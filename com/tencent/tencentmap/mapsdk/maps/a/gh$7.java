package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$7
  implements gm.a
{
  gh$7(gh paramgh, boolean paramBoolean)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99046);
    if (gh.a(this.b) != 0L)
      gh.b(this.b).nativeSetCompassVisible(gh.a(this.b), this.a);
    AppMethodBeat.o(99046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.7
 * JD-Core Version:    0.6.2
 */