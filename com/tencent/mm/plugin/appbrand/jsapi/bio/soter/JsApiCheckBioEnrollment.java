package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class JsApiCheckBioEnrollment extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 344;
  public static final String NAME = "checkIsSoterEnrolledInDevice";
  private JsApiCheckBioEnrollment.GetIsEnrolledTask hDb = null;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(3215);
    ab.i("MicroMsg.JsApiCheckBioEnrollment", "hy: subapp start do check is enrolled");
    this.hDb = new JsApiCheckBioEnrollment.GetIsEnrolledTask(paramc, paramInt, a.AS(paramJSONObject.optString("checkAuthMode")), this);
    h.bB(this.hDb);
    AppBrandMainProcessService.a(this.hDb);
    AppMethodBeat.o(3215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment
 * JD-Core Version:    0.6.2
 */