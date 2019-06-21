package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$16
  implements gm.a
{
  gh$16(gh paramgh, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99023);
    if (gh.a(this.d) != 0L)
      gh.b(this.d).nativeMoveBy(gh.a(this.d), this.a, this.b, this.c);
    AppMethodBeat.o(99023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.16
 * JD-Core Version:    0.6.2
 */