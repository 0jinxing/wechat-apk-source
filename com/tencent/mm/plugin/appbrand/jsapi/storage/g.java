package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.f;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import java.util.ArrayList;

public class g extends a<h>
{
  public static final int CTRL_INDEX = 113;
  public static final String NAME = "getStorageInfo";

  protected String u(c paramc)
  {
    AppMethodBeat.i(102042);
    paramc = paramc.getAppId();
    AppMethodBeat.o(102042);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.g
 * JD-Core Version:    0.6.2
 */