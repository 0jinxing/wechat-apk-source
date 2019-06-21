package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends a
{
  public int bJt;
  public int czE;
  public double kCJ;
  private String pQe;
  public int pQf;
  public String pcl;
  public int status;
  public int tUy;
  public int tUz;

  public e(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, 0);
  }

  public e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(48533);
    this.pQe = null;
    this.pQe = paramString1;
    this.czE = 1;
    this.bJt = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("receiver_name", paramString2);
    localHashMap.put("invalid_time", String.valueOf(paramInt1));
    M(localHashMap);
    AppMethodBeat.o(48533);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48534);
    ab.d("MicroMsg.NetScenePayURemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48534);
    while (true)
    {
      return;
      this.pQf = paramJSONObject.optInt("pay_time");
      this.kCJ = (paramJSONObject.optDouble("total_fee") / 100.0D);
      this.pcl = paramJSONObject.optString("fee_type");
      this.status = paramJSONObject.optInt("pay_status");
      this.tUy = paramJSONObject.optInt("refund_time");
      this.tUz = paramJSONObject.optInt("receive_time");
      AppMethodBeat.o(48534);
    }
  }

  public final int cOX()
  {
    return 25;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.a.e
 * JD-Core Version:    0.6.2
 */