package com.tencent.mm.plugin.offline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n extends m
{
  public static String oYC = "";
  public static String oYj = "";
  private int kCl;
  private String kCm;
  public int oXZ;
  public String oYD;
  public String oYE;
  public String oYF;
  final Map<String, String> oYG;
  public String oYa;

  public n(String paramString, int paramInt)
  {
    AppMethodBeat.i(43411);
    this.kCl = -1;
    this.kCm = "";
    this.oXZ = -1;
    this.oYa = "";
    this.oYD = "";
    this.oYE = "";
    this.oYF = "";
    this.oYG = new HashMap();
    this.oYG.put("device_id", q.LM());
    this.oYG.put("timestamp", paramString);
    this.oYG.put("scene", String.valueOf(paramInt));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(q.LM());
    localStringBuilder.append("&");
    localStringBuilder.append(paramString);
    paramString = localStringBuilder.toString();
    this.oYG.put("sign", ag.ck(paramString));
    paramString = this.oYG;
    localStringBuilder = new StringBuilder();
    g.RQ();
    paramString.put("code_ver", g.RP().Ry().get(ac.a.xIL, ""));
    M(this.oYG);
    AppMethodBeat.o(43411);
  }

  public final int ZU()
  {
    return 568;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43412);
    if (paramJSONObject != null)
    {
      oYj = paramJSONObject.optString("limit_fee");
      oYC = paramJSONObject.optString("is_show_order_detail");
      String str1 = paramJSONObject.optString("pay_amount");
      paramString = paramJSONObject.optString("pay_number");
      String str2 = paramJSONObject.optString("card_logos");
      k.bXg();
      k.aT(196629, oYj);
      k.bXg();
      k.aT(196641, oYC);
      k.bXg();
      k.aT(196645, str1);
      k.bXg();
      k.aT(196646, paramString);
      a.Ui(str2);
      this.kCl = paramJSONObject.optInt("retcode");
      this.kCm = paramJSONObject.optString("retmsg");
      this.oXZ = paramJSONObject.optInt("wx_error_type");
      this.oYa = paramJSONObject.optString("wx_error_msg");
      this.oYD = paramJSONObject.optString("get_code_flag");
      this.oYE = paramJSONObject.optString("micropay_pause_flag");
      this.oYF = paramJSONObject.optString("micropay_pause_word");
    }
    AppMethodBeat.o(43412);
  }

  public final int bgI()
  {
    return 49;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlinequeryuser";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.n
 * JD-Core Version:    0.6.2
 */