package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p extends m
{
  public String kBD;
  public long kCc;
  public int kCd;
  public int kCe;
  public int type;

  public p(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(40989);
    this.kBD = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bill_id", paramString);
    localHashMap.put("type", String.valueOf(paramInt));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    M(localHashMap);
    AppMethodBeat.o(40989);
  }

  public final int ZU()
  {
    return 1964;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(40990);
    this.kCd = paramJSONObject.optInt("total_num", 0);
    this.kCe = paramJSONObject.optInt("total_amt", 0);
    this.type = paramJSONObject.optInt("type", 0);
    this.kCc = paramJSONObject.optLong("from_timestamp", 0L);
    AppMethodBeat.o(40990);
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/f2frmrcvdrcd";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.p
 * JD-Core Version:    0.6.2
 */