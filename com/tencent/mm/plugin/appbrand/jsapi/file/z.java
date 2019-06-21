package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class z extends a
{
  private static final int CTRL_INDEX = 117;
  private static final String NAME = "removeSavedFile";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(102799);
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bo.isNullOrNil(paramJSONObject))
      paramJSONObject = "fail:invalid data";
    while (true)
    {
      paramc.M(paramInt, j(paramJSONObject, null));
      AppMethodBeat.o(102799);
      return;
      if (!paramc.asE().yi(paramJSONObject))
      {
        paramJSONObject = "fail not a store filePath";
      }
      else
      {
        paramJSONObject = paramc.asE().yf(paramJSONObject);
        switch (z.1.hJS[paramJSONObject.ordinal()])
        {
        default:
          paramJSONObject = "fail " + paramJSONObject.name();
          break;
        case 1:
          paramJSONObject = "ok";
          break;
        case 2:
          paramJSONObject = "fail:invalid data";
          break;
        case 3:
          paramJSONObject = "fail";
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.z
 * JD-Core Version:    0.6.2
 */