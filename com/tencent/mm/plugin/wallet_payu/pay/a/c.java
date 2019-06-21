package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a
{
  public Orders pWy;
  private String tos;

  public c(String paramString)
  {
    this(paramString, 0);
  }

  public c(String paramString, int paramInt)
  {
    AppMethodBeat.i(48443);
    this.pWy = null;
    this.tos = null;
    this.tos = paramString;
    paramString = new HashMap();
    paramString.put("req_key", this.tos);
    paramString.put("query_scene", String.valueOf(paramInt));
    M(paramString);
    AppMethodBeat.o(48443);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48444);
    this.pWy = Orders.ap(paramJSONObject);
    if (this.pWy != null)
      this.pWy.czZ = this.tos;
    AppMethodBeat.o(48444);
  }

  public final int cOX()
  {
    return 8;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.a.c
 * JD-Core Version:    0.6.2
 */