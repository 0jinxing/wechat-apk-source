package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class z extends a
{
  public static final int CTRL_INDEX = 435;
  public static final String NAME = "adDataReport";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130372);
    AppBrandStatObject localAppBrandStatObject = com.tencent.mm.plugin.appbrand.a.wK(paramc.getAppId());
    if (localAppBrandStatObject != null);
    for (paramJSONObject = localAppBrandStatObject.scene + "," + localAppBrandStatObject.cst + "," + localAppBrandStatObject.cOq + "," + localAppBrandStatObject.cOr + "," + paramJSONObject.optString("adInfo"); ; paramJSONObject = paramJSONObject.optString("adInfo"))
    {
      AdReportCgiHelper.a(15175, paramJSONObject + "," + bo.gN(ah.getContext()), new z.1(this, paramc, paramInt));
      AppMethodBeat.o(130372);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.z
 * JD-Core Version:    0.6.2
 */