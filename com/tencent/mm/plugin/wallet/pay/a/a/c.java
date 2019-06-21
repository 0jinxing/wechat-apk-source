package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import java.util.Map;
import org.json.JSONObject;

public class c extends b
{
  private boolean toq;

  public c(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders);
    this.toq = paramBoolean;
  }

  public int ZU()
  {
    return 1600;
  }

  public int a(e parame, f paramf)
  {
    AppMethodBeat.i(45925);
    int i = super.a(parame, paramf);
    AppMethodBeat.o(45925);
    return i;
  }

  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45926);
    super.a(paramInt, paramString, paramJSONObject);
    AppMethodBeat.o(45926);
  }

  protected void aj(Map<String, String> paramMap)
  {
  }

  public final int bgI()
  {
    return 120;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/banpaybindauthen";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.a.c
 * JD-Core Version:    0.6.2
 */