package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class g extends p
{
  public boolean AgA;
  protected JSONObject Agx;
  public boolean Agy;
  public int Agz;

  public g(Map<String, String> paramMap)
  {
    AppMethodBeat.i(49173);
    this.Agy = false;
    this.Agz = 0;
    this.AgA = false;
    ab.i("MicroMsg.NetSceneDelayQueryOrder", "NetSceneDelayQueryOrder call");
    M(paramMap);
    AppMethodBeat.o(49173);
  }

  public final void K(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(49174);
    HashMap localHashMap = new HashMap();
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localHashMap.put("is_last_query", i);
      localHashMap.put("curr_query_count", String.valueOf(paramInt));
      aZ(localHashMap);
      AppMethodBeat.o(49174);
      return;
    }
  }

  public int ZU()
  {
    return 1525;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49175);
    super.a(paramInt, paramString, paramJSONObject);
    JSONObject localJSONObject1 = paramJSONObject;
    if (ae.gju);
    try
    {
      localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>("{\"retcode\":268447844,\"retmsg\":\"系统麻烦请稍后再试\",\"can_pay_retry\":1,\"show_retmsg_type\":1}");
      ab.i("MicroMsg.NetSceneDelayQueryOrder", "errCode = " + paramInt + "errMsg=" + paramString);
      this.Agx = localJSONObject1;
      if (localJSONObject1 != null)
      {
        ab.d("MicroMsg.NetSceneDelayQueryOrder", "ret json: %s", new Object[] { localJSONObject1.toString() });
        if (localJSONObject1.optInt("can_pay_retry") != 1)
          break label130;
      }
      label130: for (boolean bool = true; ; bool = false)
      {
        this.Agy = bool;
        this.Agz = localJSONObject1.optInt("show_retmsg_type");
        AppMethodBeat.o(49175);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        JSONObject localJSONObject2 = paramJSONObject;
    }
  }

  public final int bgI()
  {
    return 1525;
  }

  public final JSONObject dOp()
  {
    return this.Agx;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/payorderquery";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.tenpay.model.g
 * JD-Core Version:    0.6.2
 */