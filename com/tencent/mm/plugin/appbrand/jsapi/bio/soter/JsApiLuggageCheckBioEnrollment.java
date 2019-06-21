package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class JsApiLuggageCheckBioEnrollment extends a
{
  public static final int CTRL_INDEX = 344;
  public static final String NAME = "checkIsSoterEnrolledInDevice";
  private static Context hDj = null;
  private JsApiLuggageCheckBioEnrollment.GetIsEnrolledTask hDi;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(73783);
    hDj = paramc.getContext();
    ab.i("MicroMsg.JsApiLuggageCheckBioEnrollment", "hy: subapp start do check is enrolled");
    this.hDi = new JsApiLuggageCheckBioEnrollment.GetIsEnrolledTask(paramc, paramInt, d.AS(paramJSONObject.optString("checkAuthMode")), this);
    h.bB(this.hDi);
    AppBrandMainProcessService.a(this.hDi);
    AppMethodBeat.o(73783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment
 * JD-Core Version:    0.6.2
 */