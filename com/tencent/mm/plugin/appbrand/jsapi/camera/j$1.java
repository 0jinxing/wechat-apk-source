package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import java.util.HashMap;

final class j$1 extends g.c
{
  j$1(j paramj, com.tencent.mm.plugin.appbrand.jsapi.e parame, e parame1, int paramInt)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126241);
    this.hCK.b(this.hHb);
    this.hCK.b(this.hHb);
    this.hCK.b(this.hHb);
    a locala = a.a.aDb();
    Integer localInteger = Integer.valueOf(this.hCN);
    if (locala.hGk.containsKey(localInteger))
      ((e)locala.hGk.remove(localInteger)).release();
    g.b(this.hCK.getAppId(), this);
    AppMethodBeat.o(126241);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.j.1
 * JD-Core Version:    0.6.2
 */