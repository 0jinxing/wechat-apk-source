package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$33
  implements gm.a
{
  gh$33(gh paramgh, int paramInt, int[] paramArrayOfInt)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99042);
    gh.b(this.c).nativeSetTurnArrowStyle(gh.a(this.c), this.a, this.b[0], this.b[1]);
    AppMethodBeat.o(99042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.33
 * JD-Core Version:    0.6.2
 */