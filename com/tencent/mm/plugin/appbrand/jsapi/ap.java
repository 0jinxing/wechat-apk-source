package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cwh;
import com.tencent.mm.protocal.protobuf.cwi;
import org.json.JSONObject;

public final class ap extends a
{
  public static final int CTRL_INDEX = 236;
  public static final String NAME = "getSetting";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(101946);
    paramJSONObject = new cwh();
    paramJSONObject.appId = paramc.getAppId();
    ((com.tencent.mm.plugin.appbrand.networking.a)paramc.B(com.tencent.mm.plugin.appbrand.networking.a.class)).a("/cgi-bin/mmbiz-bin/wxaapp_getauthinfo", paramJSONObject, cwi.class).c(new ap.1(this, paramc, paramInt));
    AppMethodBeat.o(101946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ap
 * JD-Core Version:    0.6.2
 */