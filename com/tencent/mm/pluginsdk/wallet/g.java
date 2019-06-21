package com.tencent.mm.pluginsdk.wallet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mg;
import com.tencent.mm.g.a.mg.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import org.json.JSONObject;

public final class g
{
  public String appId;
  public String cId;
  public String cIe;
  public int cIf;
  public int cIg;
  public int cvS;
  public String czZ;
  public String extInfo;
  public String flp;
  public int foo;
  public String nonceStr;
  public String packageExt;
  public String partnerId;
  public String signType;
  public String timeStamp;
  public String url;
  public int vws;
  public int vwt;
  public int vwu;
  public String vwv;
  public int vww;
  public String vwx;
  public String vwy;
  public String vwz;

  public g()
  {
    this.vwu = 0;
    this.vww = 0;
  }

  public g(mg parammg)
  {
    AppMethodBeat.i(135774);
    this.vwu = 0;
    this.vww = 0;
    if ((parammg == null) || (parammg.cIc == null))
      AppMethodBeat.o(135774);
    while (true)
    {
      return;
      this.appId = parammg.cIc.appId;
      this.partnerId = parammg.cIc.partnerId;
      this.signType = parammg.cIc.signType;
      this.nonceStr = parammg.cIc.nonceStr;
      this.timeStamp = parammg.cIc.timeStamp;
      this.packageExt = parammg.cIc.packageExt;
      this.cId = parammg.cIc.cId;
      this.url = parammg.cIc.url;
      this.cIe = parammg.cIc.cIe;
      this.cIf = parammg.cIc.cIf;
      this.cvS = parammg.cIc.cvS;
      this.cIg = parammg.cIc.cIg;
      AppMethodBeat.o(135774);
    }
  }

  public g(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(135772);
    this.vwu = 0;
    this.vww = 0;
    this.appId = ((String)paramMap.get("appId"));
    this.partnerId = ((String)paramMap.get("partnerId"));
    this.signType = ((String)paramMap.get("signType"));
    this.nonceStr = ((String)paramMap.get("nonceStr"));
    this.timeStamp = ((String)paramMap.get("timeStamp"));
    this.packageExt = ((String)paramMap.get("package"));
    this.czZ = ((String)paramMap.get("reqKey"));
    this.vws = bo.getInt((String)paramMap.get("payScene"), 1);
    this.foo = bo.getInt((String)paramMap.get("businessScene"), 1);
    this.cId = ((String)paramMap.get("paySign"));
    this.url = ((String)paramMap.get("url"));
    this.cIe = ((String)paramMap.get("src_username"));
    this.cIf = bo.getInt((String)paramMap.get("scene"), 0);
    if (this.cIf == 0)
      this.cIf = bo.getInt((String)paramMap.get("pay_scene"), 0);
    this.cvS = bo.getInt((String)paramMap.get("pay_channel"), 0);
    this.extInfo = bo.nullAsNil((String)paramMap.get("ext_info"));
    this.vwv = bo.nullAsNil((String)paramMap.get("token"));
    this.vww = bo.getInt(bo.bc((String)paramMap.get("result_jump_mode"), "0"), 0);
    this.vwx = bo.nullAsNil((String)paramMap.get("key_appbrand_from_path"));
    this.vwy = bo.nullAsNil((String)paramMap.get("key_appbrand_from_username"));
    this.vwz = bo.nullAsNil((String)paramMap.get("key_appbrand_from_scene"));
    AppMethodBeat.o(135772);
  }

  public g(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(135773);
    this.vwu = 0;
    this.vww = 0;
    this.appId = paramJSONObject.optString("appId");
    this.partnerId = paramJSONObject.optString("partnerId");
    this.signType = paramJSONObject.optString("signType");
    this.nonceStr = paramJSONObject.optString("nonceStr");
    this.timeStamp = paramJSONObject.optString("timeStamp");
    this.packageExt = paramJSONObject.optString("package");
    this.czZ = paramJSONObject.optString("reqKey");
    this.vws = paramJSONObject.optInt("payScene", 1);
    this.foo = paramJSONObject.optInt("businessScene", 1);
    this.cId = paramJSONObject.optString("paySign");
    this.flp = paramJSONObject.optString("cookie");
    this.url = paramJSONObject.optString("url");
    this.cIe = paramJSONObject.optString("src_username");
    this.cIf = paramJSONObject.optInt("scene", 0);
    if (this.cIf == 0)
      this.cIf = paramJSONObject.optInt("pay_scene", 0);
    this.cvS = paramJSONObject.optInt("pay_channel", 0);
    this.extInfo = paramJSONObject.optString("ext_info", "");
    this.vwv = paramJSONObject.optString("token", "");
    this.vww = bo.getInt(paramJSONObject.optString("result_jump_mode", "0"), 0);
    this.vwu = paramJSONObject.optInt("pay_for_wallet_type", 0);
    this.vwx = bo.nullAsNil(paramJSONObject.optString("key_appbrand_from_path"));
    this.vwy = bo.nullAsNil(paramJSONObject.optString("key_appbrand_from_username"));
    this.vwz = bo.nullAsNil(paramJSONObject.optString("key_appbrand_from_scene"));
    AppMethodBeat.o(135773);
  }

  public static int gS(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 1037);
    while (true)
    {
      return paramInt1;
      if (paramInt2 > 0)
        paramInt1 = paramInt2;
    }
  }

  public static int gT(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135775);
    int i = gS(paramInt1, paramInt2);
    int j;
    if ((i == 1000) || (i == 1018) || (i == 1017) || (i == 1033))
      j = 0;
    while (true)
    {
      ab.i("MicroMsg.WalletJsapiData", "parsePayChannelByScene, scene: %s, rawScene: %s, resultChannel: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(j) });
      AppMethodBeat.o(135775);
      return j;
      if (i == 1019)
      {
        j = 1;
      }
      else if (i == 1010)
      {
        j = 5;
      }
      else if ((i == 1007) || (i == 1008))
      {
        j = 6;
      }
      else if (i == 1009)
      {
        j = 7;
      }
      else if ((i == 1035) || (i == 1020))
      {
        j = 8;
      }
      else if ((i == 1011) || (i == 1047) || (i == 1025))
      {
        j = 12;
      }
      else if ((i == 1012) || (i == 1032) || (i == 1048) || (i == 1050))
      {
        j = 13;
      }
      else if ((i == 1005) || (i == 1027) || (i == 1042) || (i == 1006))
      {
        j = 15;
      }
      else if ((i == 1024) || (i == 1021))
      {
        j = 16;
      }
      else if ((i == 1029) || (i == 1028))
      {
        j = 23;
      }
      else if ((i == 1013) || (i == 1031) || (i == 1049))
      {
        j = 24;
      }
      else if ((i == 1001) || (i == 1003))
      {
        j = 25;
      }
      else if ((i == 1045) || (i == 1046))
      {
        j = 26;
      }
      else if (i == 1022)
      {
        j = 27;
      }
      else if (i == 1023)
      {
        j = 28;
      }
      else if (i == 1026)
      {
        j = 29;
      }
      else if (i == 1039)
      {
        j = 30;
      }
      else if ((i == 1034) || (i == 1060))
      {
        j = 31;
      }
      else if ((i != 1014) && (i != 1043) && (i != 1044))
      {
        j = i;
        if (i != 1036);
      }
      else
      {
        j = 32;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.g
 * JD-Core Version:    0.6.2
 */