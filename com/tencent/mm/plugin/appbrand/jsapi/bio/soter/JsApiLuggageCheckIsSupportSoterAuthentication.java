package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class JsApiLuggageCheckIsSupportSoterAuthentication extends a
{
  public static final int CTRL_INDEX = 276;
  public static final String NAME = "checkIsSupportSoterAuthentication";
  private JsApiLuggageCheckIsSupportSoterAuthentication.GetIsSupportSoterTask hDl;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(73791);
    ab.i("MicroMsg.JsApiLuggageCheckIsSupportSoterAuthentication", "hy: subapp start do check is support soter authentication");
    this.hDl = new JsApiLuggageCheckIsSupportSoterAuthentication.GetIsSupportSoterTask(paramc, paramInt, this);
    h.bB(this.hDl);
    AppBrandMainProcessService.a(this.hDl);
    AppMethodBeat.o(73791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication
 * JD-Core Version:    0.6.2
 */