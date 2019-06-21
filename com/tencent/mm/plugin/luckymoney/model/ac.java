package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ac extends aa
{
  public int cRU;
  public int cRV;
  public long cSh;
  public int kCd;
  public String nSX;
  public RealnameGuideHelper nTN;
  public String nWO;
  public e nXd;
  public String nYf;
  public String nYg;
  public int nYh;
  public String nYi;
  public int nYj;
  public String nYk;
  public String nYl;
  public int nYm;
  public k nYn;

  public ac(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    AppMethodBeat.i(42391);
    this.nYn = null;
    this.nSX = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    localHashMap.put("way", String.valueOf(paramInt));
    localHashMap.put("channelId", "2");
    localHashMap.put("package", paramString3);
    localHashMap.put("sessionUserName", paramString4);
    M(localHashMap);
    AppMethodBeat.o(42391);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42392);
    this.nYf = paramJSONObject.optString("spidName");
    this.cRU = paramJSONObject.optInt("hbStatus");
    this.cRV = paramJSONObject.optInt("receiveStatus");
    this.nWO = paramJSONObject.optString("statusMess");
    this.nYg = paramJSONObject.optString("hintMess");
    this.cSh = paramJSONObject.optLong("amount");
    this.nYh = paramJSONObject.optInt("recNum");
    this.kCd = paramJSONObject.optInt("totalNum");
    this.nXd = new e();
    paramString = paramJSONObject.optJSONObject("atomicFunc");
    if (paramString != null)
    {
      this.nXd.erD = paramString.optInt("enable");
      this.nXd.nWz = paramString.optString("fissionContent");
      this.nXd.nWy = paramString.optString("fissionUrl");
    }
    this.nYj = paramJSONObject.optInt("focusFlag");
    this.nYk = paramJSONObject.optString("focusWording");
    this.nYl = paramJSONObject.optString("focusAppidUserName");
    this.nYm = paramJSONObject.optInt("isFocus");
    this.nYi = paramJSONObject.optString("smallHbButtonMess");
    try
    {
      this.nYn = v.W(paramJSONObject);
      this.nYn.nWR = paramJSONObject.optString("spidLogo");
      this.nYn.nWQ = paramJSONObject.optString("spidName");
      this.nYn.nSd = paramJSONObject.optString("spidWishing");
      if ((paramInt == 0) && (paramJSONObject.has("real_name_info")))
      {
        Object localObject = paramJSONObject.optJSONObject("real_name_info");
        if (localObject != null)
        {
          paramJSONObject = ((JSONObject)localObject).optString("guide_flag");
          String str1 = ((JSONObject)localObject).optString("guide_wording");
          String str2 = ((JSONObject)localObject).optString("left_button_wording");
          paramString = ((JSONObject)localObject).optString("right_button_wording");
          localObject = ((JSONObject)localObject).optString("upload_credit_url");
          this.nTN = new RealnameGuideHelper();
          this.nTN.a(paramJSONObject, str1, str2, paramString, (String)localObject, 1005);
        }
      }
      AppMethodBeat.o(42392);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.w("MicroMsg.NetSceneLuckyMoneyBusiBase", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
    }
  }

  public final int bgG()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ac
 * JD-Core Version:    0.6.2
 */