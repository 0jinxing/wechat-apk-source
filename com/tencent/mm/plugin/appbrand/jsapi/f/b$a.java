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
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b$a extends n
{
  public b$a(m paramm, q paramq, u paramu, JSONObject paramJSONObject, int paramInt)
  {
    super(paramm, paramq, paramu, paramJSONObject, paramInt);
  }

  public final void C(Intent paramIntent)
  {
    AppMethodBeat.i(131120);
    ab.i("MicroMsg.JsApiSendRedPacket", "PrepareLuckyMoneyRequest.onResult ");
    if ((paramIntent == null) || (paramIntent.getStringExtra("sendId") == null))
    {
      ab.e("MicroMsg.JsApiSendRedPacket", "onResult data = [%s]", new Object[] { paramIntent });
      onError(-1, "fail:system error {{result data error or sendId is null}}");
      AppMethodBeat.o(131120);
    }
    while (true)
    {
      return;
      String str = paramIntent.getStringExtra("sendId");
      ab.i("MicroMsg.JsApiSendRedPacket", "PrepareLuckyMoneyRequest.onResult sendId = %s,share = %b", new Object[] { str, Boolean.valueOf(paramIntent.getBooleanExtra("result_share_msg", false)) });
      ab.i("MicroMsg.JsApiSendRedPacket", "GetLuckMoneyRequest.onResult");
      paramIntent = new HashMap();
      paramIntent.put("errCode", Integer.valueOf(0));
      paramIntent.put("redPacketId", str);
      w(paramIntent);
      AppMethodBeat.o(131120);
    }
  }

  public final boolean a(MMActivity paramMMActivity, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(131119);
    String str = paramJSONObject.optString("defaultWishingWord", null);
    paramJSONObject = paramJSONObject.optJSONArray("scope");
    boolean bool1;
    boolean bool2;
    if (paramJSONObject != null)
    {
      bool1 = paramJSONObject.toString().contains("friend");
      bool2 = paramJSONObject.toString().contains("public");
      if ((bool1) && (!bool2))
        break label127;
    }
    label127: for (int j = 1; ; j = 0)
    {
      i = j;
      if (bool2)
      {
        i = j;
        if (bool1)
          i = 2;
      }
      while (true)
      {
        ((a)g.K(a.class)).a(paramMMActivity, xT().getAppId(), i, str, paramInt);
        AppMethodBeat.o(131119);
        return true;
        ab.i("MicroMsg.JsApiSendRedPacket", "launch scope is nil");
      }
    }
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(131121);
    ab.i("MicroMsg.JsApiSendRedPacket", "onError errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    HashMap localHashMap = new HashMap();
    localHashMap.put("errCode", Integer.valueOf(paramInt));
    k(paramString, localHashMap);
    AppMethodBeat.o(131121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.f.b.a
 * JD-Core Version:    0.6.2
 */