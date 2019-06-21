package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.f;
import com.tencent.mm.plugin.appbrand.appstorage.q;
import com.tencent.mm.plugin.appbrand.appstorage.r;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.u;

public final class o extends u<h>
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorageSync";

  private static String a(h paramh, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(102081);
    long l = System.currentTimeMillis();
    try
    {
      JsApiSetStorageTask localJsApiSetStorageTask = new com/tencent/mm/plugin/appbrand/jsapi/storage/JsApiSetStorageTask;
      localJsApiSetStorageTask.<init>();
      localJsApiSetStorageTask.appId = paramh.getAppId();
      localJsApiSetStorageTask.hXg = paramInt;
      localJsApiSetStorageTask.C(paramString1, paramString2, paramString3);
      if (AppBrandMainProcessService.b(localJsApiSetStorageTask))
      {
        paramString3 = localJsApiSetStorageTask.result;
        q.a(1, 1, r.by(paramString1, paramString2), 1, System.currentTimeMillis() - l, paramh);
        return paramh;
      }
      q.a(1, 1, r.by(paramString1, paramString2), 1, System.currentTimeMillis() - l, paramh);
      AppMethodBeat.o(102081);
      paramh = "fail";
    }
    finally
    {
      q.a(1, 1, r.by(paramString1, paramString2), 1, System.currentTimeMillis() - l, paramh);
      AppMethodBeat.o(102081);
    }
  }

  private static String b(h paramh, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(102082);
    long l = System.currentTimeMillis();
    try
    {
      f localf = f.gXv;
      paramString3 = p.a(f.b(paramInt, paramh.getAppId(), paramString1, paramString2, paramString3));
      return paramString3;
    }
    finally
    {
      q.a(2, 1, r.by(paramString1, paramString2), 1, System.currentTimeMillis() - l, paramh);
      AppMethodBeat.o(102082);
    }
    throw paramString3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.o
 * JD-Core Version:    0.6.2
 */