package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class NetSceneTenpayRemittanceQuery extends m
{
  public String desc;
  public double kCJ;
  public boolean nsL;
  private String pQe;
  public int pQf;
  private String pQg;
  public String pQh;
  public int pQi;
  public String pQj;
  public String pQk;
  public int pQl;
  public NetSceneTenpayRemittanceQuery.a pQm;
  public NetSceneTenpayRemittanceQuery.b pQn;
  public NetSceneTenpayRemittanceQuery.d pQo;
  public NetSceneTenpayRemittanceQuery.ResendMsgInfo pQp;
  public String pQq;
  public String pQr;
  public String pcJ;
  public int pcT;
  public String pcl;
  public int status;

  public NetSceneTenpayRemittanceQuery(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(44785);
    this.pQe = null;
    this.pQe = paramString1;
    this.pcT = paramInt1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("transfer_id", paramString2);
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    M(localHashMap);
    AppMethodBeat.o(44785);
  }

  private static NetSceneTenpayRemittanceQuery.c ak(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44787);
    NetSceneTenpayRemittanceQuery.c localc = new NetSceneTenpayRemittanceQuery.c();
    JSONObject localJSONObject = paramJSONObject;
    if (paramJSONObject == null)
      localJSONObject = new JSONObject();
    localc.type = localJSONObject.optInt("type");
    localc.url = localJSONObject.optString("url");
    localc.username = localJSONObject.optString("username");
    localc.pQw = localJSONObject.optString("pagepath");
    AppMethodBeat.o(44787);
    return localc;
  }

  public final int ZU()
  {
    return 1628;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44786);
    ab.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(44786);
    while (true)
    {
      return;
      this.pQf = paramJSONObject.optInt("pay_time");
      this.kCJ = (paramJSONObject.optDouble("fee") / 100.0D);
      this.pcl = paramJSONObject.optString("fee_type");
      this.status = paramJSONObject.optInt("trans_status");
      this.pQg = paramJSONObject.optString("trans_status_name");
      this.pQi = paramJSONObject.optInt("modify_time");
      this.nsL = paramJSONObject.optBoolean("is_payer");
      this.pcJ = paramJSONObject.optString("refund_bank_type");
      this.pQj = paramJSONObject.optString("status_desc");
      this.pQk = paramJSONObject.optString("status_supplementary");
      this.pQl = paramJSONObject.optInt("delay_confirm_flag");
      this.pQq = paramJSONObject.optString("banner_content");
      this.pQr = paramJSONObject.optString("banner_url");
      this.desc = paramJSONObject.optString("desc");
      Object localObject1 = paramJSONObject.optJSONObject("addr_info");
      Object localObject2 = new NetSceneTenpayRemittanceQuery.a();
      paramString = (String)localObject1;
      if (localObject1 == null)
        paramString = new JSONObject();
      ((NetSceneTenpayRemittanceQuery.a)localObject2).pQs = paramString.optString("address_name");
      ((NetSceneTenpayRemittanceQuery.a)localObject2).gyD = paramString.optString("phone_num");
      ((NetSceneTenpayRemittanceQuery.a)localObject2).fBg = paramString.optString("address");
      this.pQm = ((NetSceneTenpayRemittanceQuery.a)localObject2);
      localObject1 = paramJSONObject.optJSONObject("exposure_info");
      localObject2 = new NetSceneTenpayRemittanceQuery.b();
      paramString = (String)localObject1;
      if (localObject1 == null)
        paramString = new JSONObject();
      ((NetSceneTenpayRemittanceQuery.b)localObject2).cIY = paramString.optString("icon");
      ((NetSceneTenpayRemittanceQuery.b)localObject2).name = paramString.optString("name");
      ((NetSceneTenpayRemittanceQuery.b)localObject2).cEh = paramString.optString("wording");
      ((NetSceneTenpayRemittanceQuery.b)localObject2).pQt = paramString.optInt("is_show_btn");
      ((NetSceneTenpayRemittanceQuery.b)localObject2).pQu = paramString.optString("btn_wording");
      ((NetSceneTenpayRemittanceQuery.b)localObject2).pQv = ak(paramString.optJSONObject("jump_info"));
      this.pQn = ((NetSceneTenpayRemittanceQuery.b)localObject2);
      localObject1 = paramJSONObject.optJSONObject("text_info");
      localObject2 = new NetSceneTenpayRemittanceQuery.d();
      paramString = (String)localObject1;
      if (localObject1 == null)
        paramString = new JSONObject();
      ((NetSceneTenpayRemittanceQuery.d)localObject2).cEh = paramString.optString("wording");
      ((NetSceneTenpayRemittanceQuery.d)localObject2).pQv = ak(paramString.optJSONObject("jump_info"));
      this.pQo = ((NetSceneTenpayRemittanceQuery.d)localObject2);
      paramJSONObject = paramJSONObject.optJSONObject("resend_info");
      localObject1 = new NetSceneTenpayRemittanceQuery.ResendMsgInfo();
      paramString = paramJSONObject;
      if (paramJSONObject == null)
        paramString = new JSONObject();
      ((NetSceneTenpayRemittanceQuery.ResendMsgInfo)localObject1).title = paramString.optString("title");
      ((NetSceneTenpayRemittanceQuery.ResendMsgInfo)localObject1).pQx = paramString.optString("pic");
      ((NetSceneTenpayRemittanceQuery.ResendMsgInfo)localObject1).description = paramString.optString("description");
      ((NetSceneTenpayRemittanceQuery.ResendMsgInfo)localObject1).nZb = paramString.optString("left_button_wording");
      ((NetSceneTenpayRemittanceQuery.ResendMsgInfo)localObject1).nZc = paramString.optString("right_button_wording");
      this.pQp = ((NetSceneTenpayRemittanceQuery.ResendMsgInfo)localObject1);
      AppMethodBeat.o(44786);
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transferquery";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery
 * JD-Core Version:    0.6.2
 */