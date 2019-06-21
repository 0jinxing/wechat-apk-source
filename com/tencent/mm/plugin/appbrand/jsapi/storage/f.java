package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.r;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;

public class f extends a<h>
{
  public static final int CTRL_INDEX = 17;
  public static final String NAME = "getStorage";

  protected String u(c paramc)
  {
    AppMethodBeat.i(102036);
    paramc = paramc.getAppId();
    AppMethodBeat.o(102036);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.f
 * JD-Core Version:    0.6.2
 */