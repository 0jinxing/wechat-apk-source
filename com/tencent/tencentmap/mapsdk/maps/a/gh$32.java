package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$32
  implements gm.a
{
  gh$32(gh paramgh, String paramString)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99041);
    gh.b(this.b).nativeUpdateMapResource(gh.a(this.b), this.a);
    AppMethodBeat.o(99041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.32
 * JD-Core Version:    0.6.2
 */