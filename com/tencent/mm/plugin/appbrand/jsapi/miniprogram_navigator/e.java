package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import org.json.JSONObject;

public class e extends u<h>
{
  public static final int CTRL_INDEX = 252;
  public static final String NAME = "navigateBackMiniProgram";

  public String a(h paramh, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(101981);
    JSONObject localJSONObject = paramJSONObject.optJSONObject("extraData");
    paramJSONObject = paramJSONObject.optJSONObject("privateExtraData");
    paramh.getRuntime().a(MiniProgramNavigationBackResult.a(localJSONObject, paramJSONObject));
    paramh = j("ok", null);
    AppMethodBeat.o(101981);
    return paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e
 * JD-Core Version:    0.6.2
 */