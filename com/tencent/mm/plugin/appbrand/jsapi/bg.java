package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class bg extends a<h>
{
  public static final int CTRL_INDEX = 406;
  public static final String NAME = "private_openUrl";

  private void a(h paramh, int paramInt, String paramString)
  {
    AppMethodBeat.i(73170);
    ab.e("MicroMsg.JsApiPrivateOpenUrl", "switchCallback msg:%s", new Object[] { paramString });
    if (paramh != null)
      paramh.M(paramInt, j(paramString, null));
    AppMethodBeat.o(73170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bg
 * JD-Core Version:    0.6.2
 */