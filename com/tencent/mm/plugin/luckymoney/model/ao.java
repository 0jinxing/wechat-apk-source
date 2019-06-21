package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.protocal.protobuf.atm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ao extends ak
{
  public a cMO;
  public int kCd;
  public String nSX;
  public String nYX;
  public String nYY;
  public String nYZ;
  public String nZa;
  public String nZb;
  public String nZc;
  public String nZd;
  public String nZe;
  public int nZf;

  public ao(int paramInt1, long paramLong1, long paramLong2, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt3, String paramString7)
  {
    this(paramInt1, paramLong1, paramLong2, paramInt2, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt3, paramString7, "", 0, 0, "", "", 0);
  }

  public ao(int paramInt1, long paramLong1, long paramLong2, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt3, String paramString7, String paramString8, int paramInt4, int paramInt5, String paramString9, String paramString10, int paramInt6)
  {
    AppMethodBeat.i(42415);
    this.nZb = "";
    this.nZc = "";
    this.nZd = "";
    ab.i("MicroMsg.NetScenePrepareLuckyMoney", "NetScenePrepareLuckyMoney() uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", new Object[] { paramString8, Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), bo.nullAsNil(paramString9) });
    this.kCd = paramInt1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("totalNum", String.valueOf(paramInt1));
    localHashMap.put("totalAmount", String.valueOf(paramLong1));
    localHashMap.put("perValue", String.valueOf(paramLong2));
    localHashMap.put("hbType", String.valueOf(paramInt2));
    localHashMap.put("wishing", URLEncoder.encode(bo.nullAsNil(paramString1)));
    localHashMap.put("sendUserName", paramString5);
    if (!bo.isNullOrNil(paramString8))
      localHashMap.put("unique_id", paramString8);
    localHashMap.put("user_confirm_jump", String.valueOf(paramInt4));
    localHashMap.put("unpay_type", String.valueOf(paramInt5));
    localHashMap.put("cancel_sendid", paramString9);
    localHashMap.put("expression_md5", paramString10);
    localHashMap.put("expression_type", String.valueOf(paramInt6));
    if (!bo.isNullOrNil(paramString3))
      localHashMap.put("username", paramString3);
    if (!bo.isNullOrNil(paramString2))
    {
      localHashMap.put("headImg", URLEncoder.encode(paramString2));
      localHashMap.put("nickName", URLEncoder.encode(bo.nullAsNil(paramString6)));
      if (!bo.isNullOrNil(paramString4))
        localHashMap.put("receiveNickName", URLEncoder.encode(paramString4));
    }
    localHashMap.put("inWay", String.valueOf(paramInt3));
    if ((paramInt3 == 0) || (paramInt3 == 1) || (paramInt3 == 7))
      localHashMap.put("needSendToMySelf", "0");
    localHashMap.put("showSourceMac", URLEncoder.encode(paramString7));
    M(localHashMap);
    AppMethodBeat.o(42415);
  }

  public static a a(ao paramao, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42417);
    a locala = new a();
    locala.cEh = paramJSONObject.optString("retmsg");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("showmess");
    locala.nZb = localJSONObject.optString("left_button_wording");
    locala.nZc = localJSONObject.optString("right_button_wording");
    locala.kCs = localJSONObject.optString("right_button_url");
    if (paramao != null)
      paramao.nZf = paramJSONObject.optInt("return_to_session", 0);
    AppMethodBeat.o(42417);
    return locala;
  }

  public static boolean m(m paramm)
  {
    AppMethodBeat.i(42418);
    try
    {
      String str = aa.b(((atm)((b)paramm.ftl).fsH.fsP).wxA);
      paramm = new org/json/JSONObject;
      paramm.<init>(str);
      if (paramm.has("showmess"))
      {
        bool = bo.gW(paramm.optJSONObject("showmess").optInt("return_to_session", 0), 1);
        if (bool)
        {
          AppMethodBeat.o(42418);
          bool = true;
          return bool;
        }
      }
    }
    catch (Exception paramm)
    {
      while (true)
      {
        ab.i("MicroMsg.NetScenePrepareLuckyMoney", "ifReturnByReturnToSession() Exception：%s", new Object[] { paramm.getMessage() });
        AppMethodBeat.o(42418);
        boolean bool = false;
      }
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42416);
    this.nSX = paramJSONObject.optString("sendId");
    this.nYX = paramJSONObject.optString("reqkey");
    this.nYY = paramJSONObject.optString("sendMsgXml");
    this.nYZ = paramJSONObject.optString("guide_flag", "0");
    this.nZa = paramJSONObject.optString("guide_wording");
    this.nZb = paramJSONObject.optString("left_button_wording", "");
    this.nZc = paramJSONObject.optString("right_button_wording", "");
    this.nZd = paramJSONObject.optString("upload_credit_url", "");
    this.nZe = paramJSONObject.optString("id_sign", "");
    if (paramJSONObject.has("showmess"))
    {
      ab.i("MicroMsg.NetScenePrepareLuckyMoney", "has alert item");
      this.cMO = a(this, paramJSONObject);
    }
    AppMethodBeat.o(42416);
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/requestwxhb";
  }

  public final int getType()
  {
    return 1575;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ao
 * JD-Core Version:    0.6.2
 */