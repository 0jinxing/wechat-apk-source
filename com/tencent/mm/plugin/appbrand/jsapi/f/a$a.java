package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.luckymoney.appbrand.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import org.json.JSONObject;

public final class a$a extends n
{
  public a$a(m paramm, q paramq, u paramu, JSONObject paramJSONObject, int paramInt)
  {
    super(paramm, paramq, paramu, paramJSONObject, paramInt);
  }

  public final void C(Intent paramIntent)
  {
    AppMethodBeat.i(131116);
    ab.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.onResult");
    paramIntent = new HashMap();
    paramIntent.put("errCode", Integer.valueOf(0));
    w(paramIntent);
    AppMethodBeat.o(131116);
  }

  public final boolean a(MMActivity paramMMActivity, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(131115);
    String str = xT().getAppId();
    paramJSONObject = paramJSONObject.optString("redPacketId", null);
    if ((bo.isNullOrNil(str)) || (bo.isNullOrNil(paramJSONObject)))
    {
      ab.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.launch appId = [%s] sendId = [%s]", new Object[] { str, paramJSONObject });
      AppMethodBeat.o(131115);
    }
    while (true)
    {
      return bool;
      ((a)g.K(a.class)).a(paramMMActivity, paramJSONObject, str, paramInt);
      AppMethodBeat.o(131115);
      bool = true;
    }
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(131117);
    ab.i("MicroMsg.JsApiOpenRedPacket", "onError errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    HashMap localHashMap = new HashMap();
    localHashMap.put("errCode", Integer.valueOf(paramInt));
    k(paramString, localHashMap);
    AppMethodBeat.o(131117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.f.a.a
 * JD-Core Version:    0.6.2
 */