package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.wallet_core.c.d;
import org.json.JSONObject;

public abstract class p extends m
  implements a
{
  private boolean AgO = false;
  public boolean AgP = false;
  public boolean AgQ;
  private String aIm = "";
  private int errCode = 0;
  public boolean pOZ = false;
  private ITenpaySave.RetryPayInfo tfe;
  public boolean tpw = false;

  public final void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.U(paramBoolean1, paramBoolean2);
  }

  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.errCode = paramInt;
    this.aIm = paramString;
  }

  public void a(d paramd, JSONObject paramJSONObject)
  {
    boolean bool = true;
    super.a(paramd, paramJSONObject);
    if ((paramJSONObject != null) && (paramJSONObject.optInt("can_pay_retry") == 1));
    while (true)
    {
      this.AgQ = bool;
      this.tfe = new ITenpaySave.RetryPayInfo();
      this.tfe.aA(paramJSONObject);
      return;
      bool = false;
    }
  }

  public final boolean cfq()
  {
    if (!this.pOZ);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean dOi()
  {
    return false;
  }

  public final void dOt()
  {
    reset();
    this.AgP = true;
    this.AgB = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.tenpay.model.p
 * JD-Core Version:    0.6.2
 */