package com.tencent.mm.plugin.wallet_core.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends m
{
  private Map<String, String> oYG;
  private Map<String, String> toe;
  public String token;
  public String tos;

  public a(Authen paramAuthen)
  {
    AppMethodBeat.i(46483);
    this.tos = null;
    this.token = null;
    this.oYG = new HashMap();
    this.toe = new HashMap();
    a(paramAuthen.pGr, this.oYG, this.toe);
    this.oYG.put("flag", paramAuthen.bJt);
    this.oYG.put("bank_type", paramAuthen.pbn);
    this.oYG.put("mobile_area", paramAuthen.twt);
    if (!bo.isNullOrNil(paramAuthen.twc))
      this.oYG.put("passwd", paramAuthen.twc);
    if (!bo.isNullOrNil(paramAuthen.token))
      this.oYG.put("token", paramAuthen.token);
    if (!bo.isNullOrNil(paramAuthen.tlk))
    {
      g.RQ();
      p localp = new p(bo.a((Integer)g.RP().Ry().get(9, null), 0));
      this.oYG.put("import_code", paramAuthen.tlk);
      this.oYG.put("qqid", localp.toString());
      if (paramAuthen.twf > 0)
        this.oYG.put("cre_type", paramAuthen.twf);
      this.oYG.put("bind_serailno", paramAuthen.pbo);
    }
    if (!bo.isNullOrNil(paramAuthen.twl))
    {
      this.oYG.put("first_name", paramAuthen.twl);
      this.oYG.put("last_name", paramAuthen.twm);
      this.oYG.put("country", paramAuthen.country);
      this.oYG.put("area", paramAuthen.duc);
      this.oYG.put("city", paramAuthen.dud);
      this.oYG.put("address", paramAuthen.fBg);
      this.oYG.put("phone_number", paramAuthen.nuN);
      this.oYG.put("zip_code", paramAuthen.gIO);
      this.oYG.put("email", paramAuthen.dtV);
      this.oYG.put("language", aa.dor());
    }
    if (!bo.isNullOrNil(paramAuthen.twd))
      this.oYG.put("true_name", paramAuthen.twd);
    if (!bo.isNullOrNil(paramAuthen.twe))
      this.oYG.put("identify_card", paramAuthen.twe);
    if (paramAuthen.twf > 0)
      this.oYG.put("cre_type", paramAuthen.twf);
    if (!bo.isNullOrNil(paramAuthen.tuk))
      this.oYG.put("mobile_no", paramAuthen.tuk);
    this.oYG.put("bank_card_id", paramAuthen.twg);
    if (!bo.isNullOrNil(paramAuthen.twh))
      this.oYG.put("cvv2", paramAuthen.twh);
    if (!bo.isNullOrNil(paramAuthen.twi))
      this.oYG.put("valid_thru", paramAuthen.twi);
    if ((paramAuthen.bJt == 1) || (paramAuthen.bJt == 2))
    {
      this.oYG.put("creid_renewal", String.valueOf(paramAuthen.twu));
      this.oYG.put("birth_date", paramAuthen.twv);
      this.oYG.put("cre_expire_date", paramAuthen.tww);
    }
    if (x.dNS())
    {
      this.toe.put("uuid_for_bindcard", x.dNU());
      this.toe.put("bindcard_scene", x.dNT());
    }
    M(this.oYG);
    ba(this.toe);
    AppMethodBeat.o(46483);
  }

  public final int ZU()
  {
    return 471;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46485);
    if (paramJSONObject != null)
    {
      this.tos = paramJSONObject.optString("req_key");
      this.token = paramJSONObject.optString("token");
    }
    AppMethodBeat.o(46485);
  }

  public final boolean bXl()
  {
    AppMethodBeat.i(46484);
    super.bXl();
    this.oYG.put("is_repeat_send", "1");
    M(this.oYG);
    AppMethodBeat.o(46484);
    return true;
  }

  public final int bgI()
  {
    return 12;
  }

  public final String getToken()
  {
    return this.token;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/bindauthen";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.a.a
 * JD-Core Version:    0.6.2
 */