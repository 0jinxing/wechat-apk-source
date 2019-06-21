package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import org.json.JSONObject;

public final class JsApiOpenWeRunSetting extends a
{
  public static final int CTRL_INDEX = 228;
  public static final String NAME = "openWeRunSetting";
  private JsApiOpenWeRunSetting.OpenWeRunSetting hyr;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(130540);
    if (paramJSONObject != null)
      bool = paramJSONObject.optBoolean("checkSupport", true);
    this.hyr = new JsApiOpenWeRunSetting.OpenWeRunSetting(this, paramc, paramInt, bool);
    this.hyr.aBV();
    AppBrandMainProcessService.a(this.hyr);
    AppMethodBeat.o(130540);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting
 * JD-Core Version:    0.6.2
 */