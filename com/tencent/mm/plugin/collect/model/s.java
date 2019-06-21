package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s extends m
{
  public String cuZ;
  public String desc;
  public String kCI;
  public double kCJ;

  public s(double paramDouble, String paramString1, String paramString2)
  {
    AppMethodBeat.i(40996);
    this.kCI = null;
    HashMap localHashMap = new HashMap();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localHashMap.put("fee", Math.round(100.0D * paramDouble));
      localHashMap.put("fee_type", paramString1);
      localHashMap.put("desc", URLEncoder.encode(paramString2, "UTF-8"));
      this.kCJ = paramDouble;
      this.cuZ = paramString1;
      this.desc = paramString2;
      M(localHashMap);
      AppMethodBeat.o(40996);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        ab.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", localUnsupportedEncodingException, "", new Object[0]);
    }
  }

  public final int ZU()
  {
    return 1623;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(40997);
    ab.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(40997);
    while (true)
    {
      return;
      this.kCI = paramJSONObject.optString("pay_url");
      AppMethodBeat.o(40997);
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/transfersetf2ffee";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.s
 * JD-Core Version:    0.6.2
 */