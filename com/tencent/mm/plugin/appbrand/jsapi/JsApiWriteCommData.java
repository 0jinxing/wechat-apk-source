package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import org.json.JSONObject;

public final class JsApiWriteCommData extends a
{
  public static final int CTRL_INDEX = 445;
  public static final String NAME = "writeCommData";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(114340);
    AppBrandMainProcessService.a(new JsApiWriteCommData.WriteCommDataTask(this, paramc, paramInt, paramJSONObject));
    AppMethodBeat.o(114340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData
 * JD-Core Version:    0.6.2
 */