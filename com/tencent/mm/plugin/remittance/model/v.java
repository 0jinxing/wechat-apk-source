package com.tencent.mm.plugin.remittance.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.g.a.fw.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.protocal.protobuf.rn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class v extends m
  implements i
{
  public String cAa;
  public String cBT;
  public String cEa;
  public a cMO;
  private int cQO;
  public String kBE;
  public String kDV;
  public int nUf;
  public int nZf;
  public String pOU;
  public fw pOV;
  public String pPA;
  public String pPB;
  public String pPC;
  public int pPD;
  public String pPE;
  public String pPF;
  public int pPG;
  public String pPH;
  public String pPI;
  public String pPJ;
  public String pPK;
  public int pPL;
  public rn pPM;
  public int pPl;
  public v.a pPm;
  public String pPn;
  public String pPo;
  public double pPp;
  public double pPq;
  public String pPr;
  public boolean pPs;
  public double pPt;
  public double pPu;
  public double pPv;
  public String pPw;
  public String pPx;
  public String pPy;
  public double pPz;
  public String username;

  public v(double paramDouble, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, int paramInt3, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, int paramInt4, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, fw paramfw, String paramString15, String paramString16, String paramString17, String paramString18, int paramInt5, String paramString19, int paramInt6)
  {
    AppMethodBeat.i(44772);
    this.cBT = null;
    this.pPl = 0;
    this.pPz = 0.0D;
    this.pPA = "";
    this.pPB = "";
    this.pOU = "";
    this.pOV = null;
    this.pPL = 0;
    this.username = "";
    ab.i("Micromsg.NetSceneTenpayRemittanceGen", "payScene: %s, channel: %s dynamicCodeUrl: %s mch_name: %s nickname: %s receiver_true_name %s placeorder_reserves: %s unpayType: %s cancel_outtradeno:%s cancel_reason:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt4), paramString11, paramString12, paramString13, paramString14, paramString18, String.valueOf(paramInt5), paramString19, Integer.valueOf(paramInt6) });
    this.pPz = paramDouble;
    this.cQO = paramInt1;
    this.username = paramString2;
    this.pOU = paramString11;
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("transfer_scene", String.valueOf(paramInt2));
    localHashMap.put("fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("receiver_name", paramString2);
    localHashMap.put("receiver_openid", paramString10);
    localHashMap.put("mask_truename", paramString3);
    localHashMap.put("mch_name", paramString12);
    localHashMap.put("nickname", paramString13);
    localHashMap.put("receiver_true_name", paramString14);
    if ((paramfw != null) && (paramfw.czT.czW == 1))
      paramString1 = "1";
    while (true)
    {
      localHashMap.put("dynamic_code_source", paramString1);
      localHashMap.put("input_name", paramString15);
      localHashMap.put("checkname_sign", paramString16);
      localHashMap.put("truename_extend", paramString17);
      localHashMap.put("placeorder_reserves", paramString18);
      localHashMap.put("cancel_outtradeno", paramString19);
      localHashMap.put("unpay_type", String.valueOf(paramInt5));
      localHashMap.put("cancel_reason", String.valueOf(paramInt6));
      this.pOV = paramfw;
      try
      {
        if ((this.cQO == 33) || (this.cQO == 32))
        {
          ab.d("Micromsg.NetSceneTenpayRemittanceGen", "f2f desc: %s, recvDesc: %s", new Object[] { paramString4, paramString8 });
          if (!bo.isNullOrNil(paramString4))
            localHashMap.put("f2f_payer_desc", q.encode(paramString4, "UTF-8"));
          if (!bo.isNullOrNil(paramString8))
            localHashMap.put("desc", q.encode(paramString8, "UTF-8"));
          if (!bo.isNullOrNil(paramString11))
            localHashMap.put("dynamic_code_url", q.encode(paramString11, "UTF-8"));
        }
        while (true)
        {
          localHashMap.put("transfer_qrcode_id", paramString9);
          if ((paramInt2 == 0) || (paramInt2 == 2))
          {
            g.RQ();
            l = ((Long)g.RP().Ry().get(147457, Long.valueOf(0L))).longValue();
            paramInt1 = 0;
            if ((0x10 & l) == 0L)
              break label854;
            paramInt1 = 2;
            localHashMap.put("delay_confirm_flag", String.valueOf(paramInt1));
            ab.d("Micromsg.NetSceneTenpayRemittanceGen", "delay flag: %d", new Object[] { Integer.valueOf(paramInt1) });
          }
          M(localHashMap);
          if ((this.cQO == 32) || (this.cQO == 33))
          {
            paramString1 = new HashMap();
            paramString1.put("channel", String.valueOf(paramInt4));
            ba(paramString1);
          }
          AppMethodBeat.o(44772);
          return;
          paramString1 = "0";
          break;
          if (!bo.isNullOrNil(paramString4))
            localHashMap.put("desc", q.encode(paramString4, "UTF-8"));
          if (bo.gW(paramInt3, 0))
          {
            if (!bo.isNullOrNil(paramString5))
              localHashMap.put("address_name", q.encode(paramString5, "UTF-8"));
            if (!bo.isNullOrNil(paramString6))
              localHashMap.put("phone_num", q.encode(paramString6, "UTF-8"));
            if (!bo.isNullOrNil(paramString7))
              localHashMap.put("address", q.encode(paramString7, "UTF-8"));
          }
        }
      }
      catch (UnsupportedEncodingException paramString1)
      {
        while (true)
        {
          long l;
          ab.e("Micromsg.NetSceneTenpayRemittanceGen", paramString1.getMessage(), new Object[] { paramString1 });
          continue;
          label854: if ((l & 0x20) != 0L)
            paramInt1 = 1;
        }
      }
    }
  }

  public final int ZU()
  {
    if ((this.cQO == 32) || (this.cQO == 33));
    for (int i = 1582; ; i = 1544)
      return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44773);
    ab.d("Micromsg.NetSceneTenpayRemittanceGen", "errCode " + paramInt + " errMsg: " + paramString);
    if ((paramInt != 0) && (paramInt != 2))
    {
      AppMethodBeat.o(44773);
      return;
    }
    label75: boolean bool;
    if (paramJSONObject.has("used_fee"))
    {
      this.pPv = paramJSONObject.optDouble("used_fee");
      this.cBT = paramJSONObject.optString("req_key");
      this.pPl = paramJSONObject.optInt("tansfering_num", 0);
      this.pPn = paramJSONObject.optString("transfer_interrupt_desc");
      this.pPo = paramJSONObject.optString("appmsgcontent");
      this.pPr = paramJSONObject.optString("transfer_interrupt_charge_desc");
      if (paramJSONObject.optInt("is_show_charge") != 1)
        break label895;
      bool = true;
      label145: this.pPs = bool;
      this.pPw = paramJSONObject.optString("receiver_true_name");
      this.pPx = paramJSONObject.optString("f2f_id", "");
      this.kBE = paramJSONObject.optString("trans_id", "");
      this.kDV = paramJSONObject.optString("extend_str", "");
      this.pPy = paramJSONObject.optString("receiver_open_id", "");
      this.nUf = paramJSONObject.optInt("amount", 0);
      this.cEa = paramJSONObject.optString("transfer_id", "");
      this.cAa = paramJSONObject.optString("transaction_id", "");
      this.pPC = paramJSONObject.optString("receiver_openid", "");
      if (bo.isNullOrNil(this.pPw))
        ab.e("Micromsg.NetSceneTenpayRemittanceGen", "receiver_true_name is null");
      if (!paramJSONObject.has("remain_fee"))
        break label901;
      this.pPt = paramJSONObject.optDouble("remain_fee");
      label302: if (!paramJSONObject.has("exceed_fee"))
        break label912;
      this.pPu = paramJSONObject.optDouble("exceed_fee");
      label323: if (!paramJSONObject.has("charge_fee"))
        break label923;
      this.pPp = paramJSONObject.optDouble("charge_fee");
      label344: if (!paramJSONObject.has("free_limit"))
        break label934;
      this.pPq = paramJSONObject.optDouble("free_limit");
    }
    while (true)
    {
      JSONObject localJSONObject;
      if (paramJSONObject.has("showmessage"))
      {
        ab.i("Micromsg.NetSceneTenpayRemittanceGen", "has alert item");
        a locala = new a();
        localJSONObject = paramJSONObject.optJSONObject("showmessage");
        locala.nZb = localJSONObject.optString("left_button_wording");
        locala.nZc = localJSONObject.optString("right_button_wording");
        locala.kCs = localJSONObject.optString("right_button_url");
        this.cMO = locala;
        this.cMO.cEh = paramString;
      }
      if (paramJSONObject.has("fee"))
        this.pPA = paramJSONObject.optString("fee");
      if (paramJSONObject.has("double_check_wording"))
      {
        ab.i("Micromsg.NetSceneTenpayRemittanceGen", "has fee, show alert");
        this.pPB = paramJSONObject.optString("double_check_wording");
      }
      if (paramJSONObject.has("zaitu_message"))
      {
        ab.i("Micromsg.NetSceneTenpayRemittanceGen", "has zaitu_message");
        paramString = new v.a();
        localJSONObject = paramJSONObject.optJSONObject("zaitu_message");
        paramString.cEh = localJSONObject.optString("wording");
        paramString.pPN = localJSONObject.optString("open_button");
        paramString.pPO = localJSONObject.optString("bill_url");
        ab.d("Micromsg.NetSceneTenpayRemittanceGen", "parseZaituMessage() wording:%s open_button:%s bill_url:%s", new Object[] { bo.nullAsNil(paramString.cEh), bo.nullAsNil(paramString.pPN), bo.nullAsNil(paramString.pPO) });
        this.pPm = paramString;
      }
      this.pPD = paramJSONObject.optInt("scan_scene", 0);
      this.pPE = paramJSONObject.optString("placeorder_suc_sign");
      this.pPF = paramJSONObject.optString("pay_suc_extend");
      if (TextUtils.isEmpty(this.pPo))
        ab.e("Micromsg.NetSceneTenpayRemittanceGen", "appmsgcontent is null");
      this.pPG = paramJSONObject.optInt("get_dynamic_code_flag", 0);
      this.pPH = paramJSONObject.optString("get_dynamic_code_sign", "");
      this.pPI = paramJSONObject.optString("get_dynamic_code_extend", "");
      this.pPJ = paramJSONObject.optString("show_paying_wording", "");
      this.pPK = paramJSONObject.optString("dynamic_code_spam_wording", "");
      this.pPL = paramJSONObject.optInt("need_checkname", 0);
      this.nZf = paramJSONObject.optInt("return_to_session", 0);
      ab.i("Micromsg.NetSceneTenpayRemittanceGen", "return_to_session:%s", new Object[] { Integer.valueOf(this.nZf) });
      paramString = paramJSONObject.optJSONObject("namemessage");
      if (paramString != null)
      {
        this.pPM = new rn();
        this.pPM.title = paramString.optString("title");
        this.pPM.pRD = paramString.optString("checkname_sign");
        this.pPM.pcw = paramString.optString("display_name");
        this.pPM.cEh = paramString.optString("wording");
        this.pPM.vYN = paramString.optInt("message_type", 0);
      }
      AppMethodBeat.o(44773);
      break;
      ab.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
      break label75;
      label895: bool = false;
      break label145;
      label901: ab.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
      break label302;
      label912: ab.e("Micromsg.NetSceneTenpayRemittanceGen", "exceed_fee is null");
      break label323;
      label923: ab.e("Micromsg.NetSceneTenpayRemittanceGen", "charge_fee is null");
      break label344;
      label934: ab.e("Micromsg.NetSceneTenpayRemittanceGen", "free_limit is null");
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final boolean cfq()
  {
    return true;
  }

  public final String getUri()
  {
    if ((this.cQO == 32) || (this.cQO == 33));
    for (String str = "/cgi-bin/mmpay-bin/f2fplaceorder"; ; str = "/cgi-bin/mmpay-bin/transferplaceorder")
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.v
 * JD-Core Version:    0.6.2
 */