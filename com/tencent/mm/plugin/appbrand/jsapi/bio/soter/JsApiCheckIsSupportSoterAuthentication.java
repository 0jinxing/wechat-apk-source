package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class JsApiCheckIsSupportSoterAuthentication extends a
{
  public static final int CTRL_INDEX = 276;
  public static final String NAME = "checkIsSupportSoterAuthentication";
  private JsApiCheckIsSupportSoterAuthentication.GetIsSupportSoterTask hDf = null;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(3223);
    ab.i("MicroMsg.JsApiCheckIsSupportSoterAuthentication", "hy: subapp start do check is support soter authentication");
    this.hDf = new JsApiCheckIsSupportSoterAuthentication.GetIsSupportSoterTask(paramc, paramInt, this);
    h.bB(this.hDf);
    AppBrandMainProcessService.a(this.hDf);
    AppMethodBeat.o(3223);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication
 * JD-Core Version:    0.6.2
 */