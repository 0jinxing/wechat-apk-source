package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.protocal.protobuf.csj;
import com.tencent.mm.protocal.protobuf.nb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import com.tencent.mm.wallet_core.c.i;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class o extends m
  implements i
{
  public String AgN;
  public String appId;
  public int cIb;
  public String cwg;
  public String czZ;
  public String hwA;
  public int scene;
  public String tRb;
  public csj tRc;

  public o(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    AppMethodBeat.i(49176);
    this.tRc = new csj();
    this.scene = paramInt1;
    this.cIb = paramInt3;
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", URLEncoder.encode(paramString1));
    localHashMap.put("scene", String.valueOf(paramInt2));
    localHashMap.put("a8key_scene", String.valueOf(paramInt1));
    localHashMap.put("channel", String.valueOf(paramInt3));
    ab.d("MicroMsg.NetSceneTenpayNativeAuthen", "sourceType: %d, source: %s", new Object[] { Integer.valueOf(paramInt4), paramString2 });
    if (paramInt4 < 0)
    {
      ab.e("MicroMsg.NetSceneTenpayNativeAuthen", "illegal sourceType: %d, source: %s", new Object[] { Integer.valueOf(paramInt4), paramString2 });
      localHashMap.put("source_type", "0");
      localHashMap.put("source", "");
      M(localHashMap);
      paramString2 = com.tencent.mm.model.c.c.abi().ll("100456");
      if (paramString2.isValid())
        break label241;
      ab.w("MicroMsg.NetSceneTenpayNativeAuthen", "invalid abtest value");
      AppMethodBeat.o(49176);
    }
    while (true)
    {
      return;
      localHashMap.put("source_type", String.valueOf(paramInt4));
      localHashMap.put("source", paramString2);
      break;
      label241: if (bo.getInt((String)paramString2.dru().get("open"), 0) == 0)
      {
        ab.i("MicroMsg.NetSceneTenpayNativeAuthen", "abtest unopened");
        AppMethodBeat.o(49176);
      }
      else
      {
        try
        {
          paramString2 = new java/net/URI;
          paramString2.<init>(paramString1);
          paramString1 = paramString2.getQuery();
          if (!bo.isNullOrNil(paramString1))
          {
            paramString2 = paramString1.split("&");
            paramInt2 = paramString2.length;
            for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
              if (paramString2[paramInt1].contains("groupid"))
              {
                paramString1 = paramString2[paramInt1].split("=");
                if (paramString1.length == 2)
                {
                  paramInt3 = bo.getInt(paramString1[1], 0);
                  ab.d("MicroMsg.NetSceneTenpayNativeAuthen", "groupid: %s", new Object[] { Integer.valueOf(paramInt3) });
                  dNN().acF().fsO = paramInt3;
                }
              }
          }
          AppMethodBeat.o(49176);
        }
        catch (URISyntaxException paramString1)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneTenpayNativeAuthen", paramString1, "", new Object[0]);
          AppMethodBeat.o(49176);
        }
      }
    }
  }

  public int ZU()
  {
    return 1694;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49177);
    ab.i("MicroMsg.NetSceneTenpayNativeAuthen", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    ab.d("MicroMsg.NetSceneTenpayNativeAuthen", "json: %s", new Object[] { paramJSONObject.toString() });
    this.czZ = paramJSONObject.optString("reqkey");
    this.appId = paramJSONObject.optString("appid");
    this.tRb = paramJSONObject.optString("appsource");
    this.cwg = paramJSONObject.optString("productid");
    this.AgN = paramJSONObject.optString("retcode");
    this.hwA = paramJSONObject.optString("retmsg");
    paramString = paramJSONObject.optJSONObject("wallet_mix_sp_genprepay_resp");
    if (paramString != null)
    {
      this.tRc.xpI = paramString.optString("pay_gate_url");
      this.tRc.xpK = paramString.optBoolean("need_dialog");
      this.tRc.xpL = paramString.optString("dialog_text");
      paramString = paramString.optJSONObject("callback_retry_conf");
      if (paramString != null)
      {
        this.tRc.xpJ = new nb();
        this.tRc.xpJ.vRF = paramString.optInt("inteval_time");
        this.tRc.xpJ.vRG = paramString.optInt("max_count");
        this.tRc.xpJ.vRH = paramString.optString("default_wording");
      }
      ab.d("MicroMsg.NetSceneTenpayNativeAuthen", "pay_gate_url: %s, dialog_text: %s", new Object[] { this.tRc.xpI, this.tRc.xpL });
    }
    AppMethodBeat.o(49177);
  }

  public final int bgI()
  {
    return 127;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/payauthnative";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.tenpay.model.o
 * JD-Core Version:    0.6.2
 */