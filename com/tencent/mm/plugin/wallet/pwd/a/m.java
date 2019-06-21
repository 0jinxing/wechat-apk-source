package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m extends com.tencent.mm.wallet_core.tenpay.model.m
{
  private Map<String, String> oYG;
  public String token;

  public m(Authen paramAuthen, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(46193);
    this.token = null;
    this.oYG = new HashMap();
    this.oYG.put("flag", paramAuthen.bJt);
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
    }
    this.oYG.put("business_source", String.valueOf(paramInt));
    this.oYG.put("bank_type", paramAuthen.pbn);
    if (paramAuthen.twf > 0)
      this.oYG.put("cre_type", paramAuthen.twf);
    if (!bo.isNullOrNil(paramAuthen.twd))
      this.oYG.put("true_name", paramAuthen.twd);
    if (!bo.isNullOrNil(paramAuthen.twe))
      this.oYG.put("identify_card", paramAuthen.twe);
    this.oYG.put("mobile_no", paramAuthen.tuk);
    this.oYG.put("bank_card_id", paramAuthen.twg);
    if (!bo.isNullOrNil(paramAuthen.twh))
      this.oYG.put("cvv2", paramAuthen.twh);
    if (!bo.isNullOrNil(paramAuthen.twi))
      this.oYG.put("valid_thru", paramAuthen.twi);
    Map localMap = this.oYG;
    if (paramBoolean);
    for (paramAuthen = "1"; ; paramAuthen = "0")
    {
      localMap.put("new_card_reset_pwd", paramAuthen);
      M(this.oYG);
      AppMethodBeat.o(46193);
      return;
    }
  }

  public final int ZU()
  {
    return 469;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46195);
    if (paramJSONObject != null)
      this.token = paramJSONObject.optString("token");
    AppMethodBeat.o(46195);
  }

  public final boolean bXl()
  {
    AppMethodBeat.i(46194);
    super.bXl();
    this.oYG.put("is_repeat_send", "1");
    M(this.oYG);
    AppMethodBeat.o(46194);
    return true;
  }

  public final int bgI()
  {
    return 10;
  }

  public final String getToken()
  {
    return this.token;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdauthen";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.m
 * JD-Core Version:    0.6.2
 */