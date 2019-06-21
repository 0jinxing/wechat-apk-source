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

public final class r extends m
{
  public boolean foa;
  public List<a> kCH;
  public long kCc;
  public int kCd;
  public int kCe;
  private int limit;
  public int type;

  public r(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    AppMethodBeat.i(40994);
    this.kCH = new ArrayList();
    this.foa = false;
    this.limit = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("last_bill_id", paramString);
    localHashMap.put("num", String.valueOf(paramInt2));
    M(localHashMap);
    AppMethodBeat.o(40994);
  }

  public final int ZU()
  {
    return 1963;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(40995);
    this.kCd = paramJSONObject.optInt("total_num");
    this.kCe = paramJSONObject.optInt("total_amt");
    this.kCc = paramJSONObject.optLong("from_timestamp", 0L);
    this.type = paramJSONObject.optInt("type", 0);
    paramString = paramJSONObject.optJSONArray("records");
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.i("MicroMsg.NetSceneTenpayF2fRecordList", "empty records");
      if (this.kCH.size() < this.limit)
      {
        ab.i("MicroMsg.NetSceneTenpayF2fRecordList", "finish query");
        this.foa = true;
      }
      AppMethodBeat.o(40995);
      return;
    }
    paramInt = 0;
    while (paramInt < paramString.length())
      try
      {
        paramJSONObject = paramString.getJSONObject(paramInt);
        a locala = new com/tencent/mm/plugin/collect/model/a;
        locala.<init>();
        locala.kBD = paramJSONObject.optString("bill_id");
        locala.kBE = paramJSONObject.optString("trans_id");
        locala.timestamp = paramJSONObject.optLong("timestamp", 0L);
        locala.desc = paramJSONObject.optString("desc");
        locala.cuY = paramJSONObject.optInt("fee", 0);
        this.kCH.add(locala);
        paramInt++;
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneTenpayF2fRecordList", paramJSONObject, "", new Object[0]);
      }
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/f2frcvdlist";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.r
 * JD-Core Version:    0.6.2
 */