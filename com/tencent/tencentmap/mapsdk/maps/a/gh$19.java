package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$19
  implements gm.a
{
  gh$19(gh paramgh, int paramInt, boolean paramBoolean)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99026);
    if (gh.a(this.c) != 0L)
      gh.b(this.c).nativeSetScaleLevel(gh.a(this.c), this.a, this.b);
    AppMethodBeat.o(99026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.19
 * JD-Core Version:    0.6.2
 */