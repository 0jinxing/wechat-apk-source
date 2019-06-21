package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$24
  implements gm.a
{
  gh$24(gh paramgh, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99032);
    if (gh.a(this.e) != 0L)
      gh.b(this.e).nativeSetViewport(gh.a(this.e), this.a, this.b, this.c, this.d);
    AppMethodBeat.o(99032);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.24
 * JD-Core Version:    0.6.2
 */