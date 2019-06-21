package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.JNI;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class gh$6
  implements gm.a
{
  gh$6(gh paramgh, int paramInt1, String paramString, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt2, int paramInt3)
  {
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99045);
    if (gh.a(this.q) != 0L)
      gh.b(this.q).nativeUpdateMarkerInfo(gh.a(this.q), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    AppMethodBeat.o(99045);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gh.6
 * JD-Core Version:    0.6.2
 */