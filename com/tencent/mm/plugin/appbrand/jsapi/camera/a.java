package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class a
{
  boolean hGi;
  boolean hGj;
  HashMap<Integer, e> hGk;

  private a()
  {
    AppMethodBeat.i(126239);
    this.hGi = true;
    this.hGj = true;
    this.hGk = new HashMap();
    AppMethodBeat.o(126239);
  }

  public final boolean aDa()
  {
    AppMethodBeat.i(126240);
    if (!this.hGi)
      ab.i("MicroMsg.AppBrandCameraMrg", "no camera permission");
    boolean bool = this.hGi;
    AppMethodBeat.o(126240);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.a
 * JD-Core Version:    0.6.2
 */