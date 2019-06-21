package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.c.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class n extends p
  implements i
{
  private static int AgF = 0;
  protected Map<String, String> AgD = new HashMap();
  public int AgE = 0;
  private boolean AgG = false;
  public int AgH = 0;
  public int AgI = 0;
  public String AgJ = null;
  public JSONObject AgK = null;
  private boolean AgL = false;
  public int AgM = -1;
  protected int cQO;
  public RealnameGuideHelper oYc;
  private String oYd;
  private String oYe;
  private String oYf;
  private String oYg;
  private String oYh;
  public int tAz = 0;
  public String tqG;

  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (!this.AgG)
    {
      this.AgI = paramInt;
      this.AgJ = paramString;
      this.AgK = paramJSONObject;
      this.AgG = true;
      if (paramJSONObject != null)
        this.AgE = paramJSONObject.optInt("query_order_flag", 0);
    }
    Object localObject;
    if ((paramJSONObject != null) && (paramJSONObject.has("real_name_info")))
    {
      localObject = paramJSONObject.optJSONObject("real_name_info");
      this.oYd = ((JSONObject)localObject).optString("guide_flag");
      this.oYe = ((JSONObject)localObject).optString("guide_wording");
      this.oYf = ((JSONObject)localObject).optString("left_button_wording");
      this.oYg = ((JSONObject)localObject).optString("right_button_wording");
      this.oYh = ((JSONObject)localObject).optString("upload_credit_url");
    }
    for (int i = 1; ; i = 0)
    {
      JSONObject localJSONObject = null;
      int j = i;
      localObject = localJSONObject;
      if (paramJSONObject != null)
      {
        j = i;
        localObject = localJSONObject;
        if (paramJSONObject.has("set_pwd_info"))
        {
          localJSONObject = paramJSONObject.optJSONObject("set_pwd_info");
          localObject = new SetPwdInfo();
          ((SetPwdInfo)localObject).nZa = localJSONObject.optString("guide_wording");
          ((SetPwdInfo)localObject).nZb = localJSONObject.optString("left_button_wording");
          ((SetPwdInfo)localObject).nZc = localJSONObject.optString("right_button_wording");
          ((SetPwdInfo)localObject).twa = localJSONObject.optInt("send_pwd_msg");
          j = 1;
        }
      }
      if ((j != 0) && (("1".equals(this.oYd)) || ("2".equals(this.oYd)) || (localObject != null)))
      {
        this.oYc = new RealnameGuideHelper();
        this.oYc.a(this.oYd, (SetPwdInfo)localObject, this.oYe, this.oYf, this.oYg, this.oYh, this.cQO);
      }
      this.tqG = paramJSONObject.optString("forget_pwd_url", "");
      this.AgM = paramJSONObject.optInt("is_clear_failure", -1);
      ab.i("MicroMsg.NetSceneTenpayDelayQueryBase", "forget_pwd_url %s", new Object[] { this.tqG });
      this.AgL = true;
      super.a(paramInt, paramString, paramJSONObject);
      return;
    }
  }

  protected final void a(Orders paramOrders, Authen paramAuthen)
  {
    List localList = paramOrders.tAq;
    String str = null;
    if (localList.size() > 0)
      str = ((Orders.Commodity)localList.get(0)).cAa;
    a(paramOrders.czZ, str, paramAuthen.pGr.cIf, paramAuthen.pGr.cIb, paramAuthen.pbn, paramAuthen.pbo);
  }

  public void a(d paramd, JSONObject paramJSONObject)
  {
    ab.i("MicroMsg.NetSceneTenpayDelayQueryBase", "always callback: %s,%s", new Object[] { Integer.valueOf(paramd.errCode), paramd.aIm });
    super.a(paramd, paramJSONObject);
    if ((!this.AgL) && (!this.AgG))
    {
      this.AgH = paramd.errType;
      this.AgI = paramd.errCode;
      this.AgJ = paramd.aIm;
      if (paramJSONObject != null)
      {
        this.AgE = paramJSONObject.optInt("query_order_flag", 0);
        this.AgK = paramJSONObject;
      }
      this.AgG = true;
    }
  }

  protected final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    AgF += 1;
    this.AgD.put("req_key", paramString1);
    this.AgD.put("transaction_id", paramString2);
    this.AgD.put("pay_scene", String.valueOf(paramInt1));
    this.AgD.put("bank_type", paramString3);
    this.AgD.put("channel", String.valueOf(paramInt2));
    this.AgD.put("bind_serial", paramString4);
  }

  public boolean cNK()
  {
    return false;
  }

  public final boolean dOi()
  {
    return false;
  }

  public final Map<String, String> dOr()
  {
    return this.AgD;
  }

  public final boolean dOs()
  {
    boolean bool = true;
    if (this.AgE == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.tenpay.model.n
 * JD-Core Version:    0.6.2
 */