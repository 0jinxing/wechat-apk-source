package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.a;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class a extends d
{
  public static final int CTRL_INDEX = 517;
  public static final String NAME = "exitVoIPChat";

  public final void b(q paramq, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131384);
    com.tencent.luggage.g.d.i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "hy: invoke JsApiCloudVoiceExitVoIPChat");
    dU(false);
    paramJSONObject = paramq.getAppId();
    long l = bo.yz();
    j.kzW.a(new a.1(this, l, paramJSONObject, paramq, paramInt), j.a.kBf);
    AppMethodBeat.o(131384);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.j.a
 * JD-Core Version:    0.6.2
 */