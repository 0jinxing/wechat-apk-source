package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$4
  implements gm.a
{
  gh$4(gh paramgh, String paramString)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99043);
    if (gh.a(this.b) != 0L)
      gh.b(this.b).nativeWriteMapDataBlock(gh.a(this.b), this.a, null);
    AppMethodBeat.o(99043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.4
 * JD-Core Version:    0.6.2
 */