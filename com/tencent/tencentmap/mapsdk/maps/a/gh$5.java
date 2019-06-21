package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$5
  implements gm.a
{
  gh$5(gh paramgh)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99044);
    if (gh.a(this.a) != 0L)
      gh.b(this.a).nativeHideCompass(gh.a(this.a));
    AppMethodBeat.o(99044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.5
 * JD-Core Version:    0.6.2
 */