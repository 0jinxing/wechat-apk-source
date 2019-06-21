package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import java.util.Map;
import org.json.JSONObject;

public final class f extends c
{
  public f(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    super(paramAuthen, paramOrders, paramBoolean);
  }

  public final int ZU()
  {
    return 1259;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(45928);
    h.pYm.a(663L, 20L, 1L, false);
    int i = super.a(parame, paramf);
    AppMethodBeat.o(45928);
    return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45929);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
      h.pYm.a(663L, 21L, 1L, false);
    AppMethodBeat.o(45929);
  }

  protected final void aj(Map<String, String> paramMap)
  {
    AppMethodBeat.i(45927);
    paramMap.put("busi_scene", this.toh.pbn);
    AppMethodBeat.o(45927);
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/lqtpaybindauthen";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.a.f
 * JD-Core Version:    0.6.2
 */