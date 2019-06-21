package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.f;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.u;

public final class l extends u<h>
{
  public static final int CTRL_INDEX = 98;
  public static final String NAME = "removeStorageSync";

  private static void b(h paramh, String paramString, int paramInt)
  {
    AppMethodBeat.i(102065);
    f localf = f.gXv;
    f.l(paramInt, paramh.getAppId(), paramString);
    AppMethodBeat.o(102065);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.l
 * JD-Core Version:    0.6.2
 */