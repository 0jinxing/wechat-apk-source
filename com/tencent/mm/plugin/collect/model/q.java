package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q extends m
{
  public boolean foa;
  public String hwA;
  public boolean isRetry;
  public int kCD;
  public int kCE;
  public int kCF;
  public int kCG;
  public List<h> kCH;
  public long kCc;
  private int limit;

  public q(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(40991);
    this.foa = false;
    this.isRetry = false;
    this.kCH = new ArrayList();
    this.limit = paramInt2;
    this.kCE = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("direction_flag", "0");
    localHashMap.put("num", String.valueOf(paramInt2));
    localHashMap.put("choose_flag", String.valueOf(paramInt3));
    M(localHashMap);
    AppMethodBeat.o(40991);
  }

  public q(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(40992);
    this.foa = false;
    this.isRetry = false;
    this.kCH = new ArrayList();
    this.isRetry = true;
    this.limit = paramInt3;
    this.kCE = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("direction_flag", String.valueOf(paramInt2));
    localHashMap.put("num", String.valueOf(paramInt3));
    localHashMap.put("choose_flag", String.valueOf(paramInt4));
    localHashMap.put("try_num", String.valueOf(paramInt5));
    M(localHashMap);
    AppMethodBeat.o(40992);
  }

  public final int ZU()
  {
    return 1993;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(40993);
    ab.d("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "json: %s", new Object[] { paramJSONObject.toString() });
    this.kCD = paramJSONObject.optInt("choose_flag", 0);
    this.kCc = paramJSONObject.optLong("from_timestamp", -1L);
    this.kCF = paramJSONObject.optInt("finish_flag", 0);
    this.kCG = paramJSONObject.optInt("try_num", 0);
    this.hwA = paramJSONObject.optString("retmsg", "");
    paramString = paramJSONObject.optJSONArray("records");
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "empty records");
      if (this.kCF == 1)
      {
        ab.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "finish query");
        this.foa = true;
      }
      AppMethodBeat.o(40993);
      return;
    }
    paramInt = 0;
    while (paramInt < paramString.length())
      try
      {
        JSONObject localJSONObject = paramString.getJSONObject(paramInt);
        paramJSONObject = new com/tencent/mm/plugin/collect/model/h;
        paramJSONObject.<init>();
        paramJSONObject.type = localJSONObject.optInt("type", 0);
        paramJSONObject.kCc = localJSONObject.optLong("from_timestamp", 0L);
        paramJSONObject.kCd = localJSONObject.optInt("total_num", 0);
        paramJSONObject.kCe = localJSONObject.optInt("total_amt", 0);
        this.kCH.add(paramJSONObject);
        paramInt++;
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneTenpayF2fHistoryRecordList", paramJSONObject, "", new Object[0]);
      }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/f2frcvrcdhissta";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.q
 * JD-Core Version:    0.6.2
 */