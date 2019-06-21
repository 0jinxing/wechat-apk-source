package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$10
  implements gm.a
{
  gh$10(gh paramgh, Rect paramRect1, Rect paramRect2, boolean paramBoolean)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99017);
    if (gh.a(this.d) != 0L)
      gh.b(this.d).nativeZoomToSpan(gh.a(this.d), this.a, this.b, this.c);
    AppMethodBeat.o(99017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.10
 * JD-Core Version:    0.6.2
 */