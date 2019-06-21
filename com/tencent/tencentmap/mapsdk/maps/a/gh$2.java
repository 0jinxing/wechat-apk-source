package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$2
  implements gm.a
{
  gh$2(gh paramgh)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99027);
    if (gh.a(this.a) != 0L)
      gh.b(this.a).nativeClearDownloadURLCache(gh.a(this.a));
    AppMethodBeat.o(99027);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.2
 * JD-Core Version:    0.6.2
 */