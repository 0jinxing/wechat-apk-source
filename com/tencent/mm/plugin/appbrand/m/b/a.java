package com.tencent.mm.plugin.appbrand.m.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class a
{
  public com.tencent.mm.plugin.appbrand.m.d iqc;

  public final String aIW()
  {
    AppMethodBeat.i(102189);
    ab.i("MicroMsg.AppBrandNodeJSInstallHelper", "getNodeInjectJs");
    if (this.iqc == null)
    {
      localObject = new IllegalStateException("You had not called whenCreateJsRuntime!");
      AppMethodBeat.o(102189);
      throw ((Throwable)localObject);
    }
    Object localObject = com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/node_jsapi.js");
    AppMethodBeat.o(102189);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.b.a
 * JD-Core Version:    0.6.2
 */