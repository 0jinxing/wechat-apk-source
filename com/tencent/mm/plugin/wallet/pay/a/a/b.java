package com.tencent.mm.plugin.wallet.pay.a.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.tenpay.model.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class b extends n
{
  private Map<String, String> oYG;
  private Map<String, String> toe;
  public boolean tof;
  public Orders tog;
  public Authen toh;
  public String toi;
  public String toj;
  private String tok;
  public String token;
  public int tol;
  public String tom;
  public int ton;
  public JSONArray too;

  public b(Authen paramAuthen, Orders paramOrders)
  {
    this(paramAuthen, paramOrders, false);
  }

  public b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    this(paramAuthen, paramOrders, paramBoolean, (byte)0);
  }

  private b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean, byte paramByte)
  {
    AppMethodBeat.i(45921);
    this.tof = false;
    this.tog = null;
    this.token = null;
    this.toi = null;
    this.toj = null;
    this.tok = null;
    this.tol = 0;
    this.ton = 0;
    this.toh = paramAuthen;
    this.tog = paramOrders;
    if (paramAuthen == null)
    {
      paramAuthen = new IllegalArgumentException("authen == null");
      AppMethodBeat.o(45921);
      throw paramAuthen;
    }
    a(paramOrders, paramAuthen);
    if (paramAuthen.pGr == null)
    {
      paramAuthen = new IllegalArgumentException("authen.payInfo == null");
      AppMethodBeat.o(45921);
      throw paramAuthen;
    }
    ab.i("MicroMsg.NetSceneTenpayAuthen", "pay channel :" + paramAuthen.pGr.cIb);
    this.oYG = new HashMap();
    this.toe = new HashMap();
    boolean bool2;
    if ((!paramBoolean) && (!bo.isNullOrNil(this.toh.twc)))
    {
      bool2 = true;
      ab.i("MicroMsg.NetSceneTenpayAuthen", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool2) });
      a(paramAuthen.pGr, this.oYG, this.toe, bool2);
      if (!paramBoolean)
        break label645;
      this.oYG.put("brief_reg", "1");
      label237: this.tAz = paramOrders.tAz;
      this.oYG.put("default_favorcomposedid", paramAuthen.twn);
      this.oYG.put("favorcomposedid", paramAuthen.two);
      this.oYG.put("arrive_type", paramAuthen.twk);
      this.oYG.put("sms_flag", paramAuthen.twp);
      this.oYG.put("ban_sms_bind_serial", paramAuthen.twq);
      this.oYG.put("ban_sms_bank_type", paramAuthen.twr);
      this.oYG.put("busi_sms_flag", paramAuthen.tws);
      this.oYG.put("buttontype", paramAuthen.pGr.vwn);
      this.oYG.put("mobile_area", paramAuthen.twt);
      ab.i("MicroMsg.NetSceneTenpayAuthen", "buttontype %s not_support_retry %s, mobile area: %s", new Object[] { Integer.valueOf(paramAuthen.pGr.vwn), Integer.valueOf(this.tAz), paramAuthen.twt });
      switch (paramAuthen.bJt)
      {
      default:
        label488: aj(this.oYG);
        M(this.oYG);
        paramOrders = ((l)g.K(l.class)).bxy();
        if (paramOrders != null)
          this.toe.putAll(paramOrders);
        paramOrders = paramAuthen.pGr.vwp;
        if (paramAuthen.pGr.aPn)
        {
          paramByte = 2;
          label553: if (paramAuthen.pGr.tKd != 1)
            break label2073;
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    }
    label645: label2073: for (paramBoolean = bool1; ; paramBoolean = false)
    {
      com.tencent.mm.plugin.wallet.pay.a.b.r(paramOrders, paramByte, paramBoolean);
      if (x.dNS())
      {
        this.toe.put("uuid_for_bindcard", x.dNU());
        this.toe.put("bindcard_scene", x.dNT());
      }
      ba(this.toe);
      AppMethodBeat.o(45921);
      return;
      bool2 = false;
      break;
      this.oYG.put("passwd", paramAuthen.twc);
      break label237;
      this.oYG.put("flag", "1");
      this.oYG.put("bank_type", paramAuthen.pbn);
      this.oYG.put("true_name", paramAuthen.twd);
      this.oYG.put("identify_card", paramAuthen.twe);
      if (paramAuthen.twf > 0)
        this.oYG.put("cre_type", paramAuthen.twf);
      this.oYG.put("mobile_no", paramAuthen.tuk);
      this.oYG.put("bank_card_id", paramAuthen.twg);
      if (!bo.isNullOrNil(paramAuthen.twh))
        this.oYG.put("cvv2", paramAuthen.twh);
      if (!bo.isNullOrNil(paramAuthen.twi))
        this.oYG.put("valid_thru", paramAuthen.twi);
      this.oYG.put("creid_renewal", String.valueOf(paramAuthen.twu));
      this.oYG.put("birth_date", paramAuthen.twv);
      this.oYG.put("cre_expire_date", paramAuthen.tww);
      break label488;
      this.oYG.put("flag", "2");
      this.oYG.put("bank_type", paramAuthen.pbn);
      this.oYG.put("h_bind_serial", paramAuthen.pbo);
      this.oYG.put("card_tail", paramAuthen.twj);
      if (!bo.isNullOrNil(paramAuthen.twd))
        this.oYG.put("true_name", paramAuthen.twd);
      if (!bo.isNullOrNil(paramAuthen.twe))
        this.oYG.put("identify_card", paramAuthen.twe);
      this.oYG.put("cre_type", paramAuthen.twf);
      this.oYG.put("mobile_no", paramAuthen.tuk);
      this.oYG.put("bank_card_id", paramAuthen.twg);
      if (!bo.isNullOrNil(paramAuthen.twh))
        this.oYG.put("cvv2", paramAuthen.twh);
      if (!bo.isNullOrNil(paramAuthen.twi))
        this.oYG.put("valid_thru", paramAuthen.twi);
      this.oYG.put("creid_renewal", String.valueOf(paramAuthen.twu));
      this.oYG.put("birth_date", paramAuthen.twv);
      this.oYG.put("cre_expire_date", paramAuthen.tww);
      break label488;
      if (paramAuthen.twb == 1)
      {
        this.oYG.put("reset_flag", "1");
        if (!bo.isNullOrNil(paramAuthen.tuk))
          this.oYG.put("mobile_no", paramAuthen.tuk);
        if (!bo.isNullOrNil(paramAuthen.twh))
          this.oYG.put("cvv2", paramAuthen.twh);
        if (!bo.isNullOrNil(paramAuthen.twi))
          this.oYG.put("valid_thru", paramAuthen.twi);
      }
      this.oYG.put("flag", "3");
      this.oYG.put("bank_type", paramAuthen.pbn);
      this.oYG.put("bind_serial", paramAuthen.pbo);
      break label488;
      this.oYG.put("flag", "4");
      this.oYG.put("bank_type", paramAuthen.pbn);
      this.oYG.put("first_name", paramAuthen.twl);
      this.oYG.put("last_name", paramAuthen.twm);
      this.oYG.put("country", paramAuthen.country);
      this.oYG.put("area", paramAuthen.duc);
      this.oYG.put("city", paramAuthen.dud);
      this.oYG.put("address", paramAuthen.fBg);
      this.oYG.put("phone_number", paramAuthen.nuN);
      this.oYG.put("zip_code", paramAuthen.gIO);
      this.oYG.put("email", paramAuthen.dtV);
      this.oYG.put("bank_card_id", paramAuthen.twg);
      if (!bo.isNullOrNil(paramAuthen.twh))
        this.oYG.put("cvv2", paramAuthen.twh);
      if (bo.isNullOrNil(paramAuthen.twi))
        break label488;
      this.oYG.put("valid_thru", paramAuthen.twi);
      break label488;
      this.oYG.put("flag", "5");
      this.oYG.put("bank_type", paramAuthen.pbn);
      this.oYG.put("first_name", paramAuthen.twl);
      this.oYG.put("last_name", paramAuthen.twm);
      this.oYG.put("country", paramAuthen.country);
      this.oYG.put("area", paramAuthen.duc);
      this.oYG.put("city", paramAuthen.dud);
      this.oYG.put("address", paramAuthen.fBg);
      this.oYG.put("phone_number", paramAuthen.nuN);
      this.oYG.put("zip_code", paramAuthen.gIO);
      this.oYG.put("email", paramAuthen.dtV);
      this.oYG.put("bank_card_id", paramAuthen.twg);
      if (!bo.isNullOrNil(paramAuthen.twh))
        this.oYG.put("cvv2", paramAuthen.twh);
      if (!bo.isNullOrNil(paramAuthen.twi))
        this.oYG.put("valid_thru", paramAuthen.twi);
      this.oYG.put("h_bind_serial", paramAuthen.pbo);
      this.oYG.put("card_tail", paramAuthen.twj);
      break label488;
      if (paramAuthen.twb == 1)
      {
        this.oYG.put("reset_flag", "1");
        if (!bo.isNullOrNil(paramAuthen.twh))
          this.oYG.put("cvv2", paramAuthen.twh);
        if (!bo.isNullOrNil(paramAuthen.twi))
          this.oYG.put("valid_thru", paramAuthen.twi);
      }
      this.oYG.put("phone_number", paramAuthen.tuk);
      this.oYG.put("flag", "6");
      this.oYG.put("bank_type", paramAuthen.pbn);
      this.oYG.put("bind_serial", paramAuthen.pbo);
      break label488;
      paramByte = 1;
      break label553;
    }
  }

  public int ZU()
  {
    int i;
    if (this.toh.pGr.cIf == 11)
      i = 1610;
    while (true)
    {
      return i;
      if (this.toh.pGr.cIf == 21)
        i = 1605;
      else
        i = 461;
    }
  }

  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45923);
    super.a(paramInt, paramString, paramJSONObject);
    ab.i("MicroMsg.NetSceneTenpayAuthen", " errCode: " + paramInt + " errMsg :" + paramString);
    ab.d("MicroMsg.NetSceneTenpayAuthen", "banlance_mobile: %s", new Object[] { this.toi });
    this.tof = "1".equals(paramJSONObject.optString("is_free_sms"));
    this.token = paramJSONObject.optString("token");
    this.toi = paramJSONObject.optString("balance_mobile");
    this.toj = paramJSONObject.optString("balance_help_url");
    this.tok = paramJSONObject.optString("modify_mobile_url");
    paramString = paramJSONObject.optString("bind_serial");
    if (!bo.isNullOrNil(paramString))
      ab.i("MicroMsg.NetSceneTenpayAuthen", "Pay Success! saving bind_serial:".concat(String.valueOf(paramString)));
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.tpw = true;
      this.tog = Orders.a(paramJSONObject, this.tog);
      paramString = paramJSONObject.optJSONObject("verify_cre_tail_info");
      if (paramString != null)
      {
        this.tol = paramString.optInt("is_can_verify_tail", 0);
        this.tom = paramString.optString("verify_tail_wording");
      }
      this.ton = paramJSONObject.optInt("no_reset_mobile", 0);
      ab.i("MicroMsg.NetSceneTenpayAuthen", "pay_scene:" + this.toh.pGr.cIf);
      if (this.toh.pGr.cIf == 21)
      {
        this.too = paramJSONObject.optJSONArray("fetch_charge_show_info");
        g.RP().Ry().set(ac.a.xUg, paramJSONObject.optString("charge_rate_version"));
      }
      if ((paramInt != 0) || (this.toh.pGr.cIf != 39))
        break label394;
      ab.i("MicroMsg.NetSceneTenpayAuthen", "it's the sns scene, parse the sns pay data");
      com.tencent.mm.plugin.wallet_core.utils.b.aK(paramJSONObject);
    }
    while (true)
    {
      paramString = a.atm("PayProcess").iterator();
      while (paramString.hasNext())
        ((c)paramString.next()).mqu.putInt("key_is_clear_failure", this.AgM);
      this.tpw = false;
      break;
      label394: ab.i("MicroMsg.NetSceneTenpayAuthen", "it's not the sns scene or occurs error,  errCode:".concat(String.valueOf(paramInt)));
    }
    AppMethodBeat.o(45923);
  }

  public final void a(d paramd, JSONObject paramJSONObject)
  {
    int i = 2;
    AppMethodBeat.i(45924);
    super.a(paramd, paramJSONObject);
    if ((this.AfF == 0) && (this.AfG == 0))
    {
      if (this.tpw)
      {
        paramd = this.toh.pGr.vwp;
        if (this.toh.pGr.aPn);
        while (true)
        {
          com.tencent.mm.plugin.wallet.pay.a.b.dr(paramd, i);
          com.tencent.mm.plugin.wallet.pay.a.b.bz(this.toh.pGr.vwp, this.AfM);
          AppMethodBeat.o(45924);
          return;
          i = 1;
        }
      }
    }
    else
    {
      paramd = this.toh.pGr.vwp;
      if (!this.toh.pGr.aPn)
        break label148;
    }
    while (true)
    {
      com.tencent.mm.plugin.wallet.pay.a.b.dr(paramd, i);
      com.tencent.mm.plugin.wallet.pay.a.b.bz(this.toh.pGr.vwp, this.AfM);
      AppMethodBeat.o(45924);
      break;
      label148: i = 1;
    }
  }

  protected void aj(Map<String, String> paramMap)
  {
  }

  public final boolean bXl()
  {
    AppMethodBeat.i(45922);
    super.bXl();
    this.oYG.put("is_repeat_send", "1");
    M(this.oYG);
    AppMethodBeat.o(45922);
    return true;
  }

  public int bgI()
  {
    return 0;
  }

  public final boolean cNJ()
  {
    boolean bool = true;
    if (this.toh.pGr.tKd == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean cNK()
  {
    if ((this.toh.pGr.cIf == 11) || (this.toh.pGr.cIf == 21));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String getToken()
  {
    return this.token;
  }

  public String getUri()
  {
    String str;
    if (this.toh.pGr.cIf == 11)
      str = "/cgi-bin/mmpay-bin/tenpay/saveauthen";
    while (true)
    {
      return str;
      if (this.toh.pGr.cIf == 21)
        str = "/cgi-bin/mmpay-bin/tenpay/fetchauthen";
      else
        str = "/cgi-bin/mmpay-bin/tenpay/authen";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.a.b
 * JD-Core Version:    0.6.2
 */