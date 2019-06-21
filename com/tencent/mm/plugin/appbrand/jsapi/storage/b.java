package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u;

public final class b extends u<h>
{
  public static final int CTRL_INDEX = 18;
  public static final String NAME = "clearStorageSync";

  private String b(h paramh, int paramInt)
  {
    AppMethodBeat.i(102025);
    JsApiClearStorageTask localJsApiClearStorageTask = new JsApiClearStorageTask();
    localJsApiClearStorageTask.appId = paramh.getAppId();
    localJsApiClearStorageTask.hXg = paramInt;
    AppBrandMainProcessService.b(localJsApiClearStorageTask);
    paramh = j("ok", null);
    AppMethodBeat.o(102025);
    return paramh;
  }

  private String c(h paramh, int paramInt)
  {
    AppMethodBeat.i(102026);
    f localf = f.gXv;
    f.F(paramInt, paramh.getAppId());
    paramh = j("ok", null);
    AppMethodBeat.o(102026);
    return paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.b
 * JD-Core Version:    0.6.2
 */