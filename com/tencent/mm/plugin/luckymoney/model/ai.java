package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ai extends ak
{
  public q nYQ;
  public List<String> nYR;
  public String nYS;
  public String nYT;
  public String nYz;

  public ai(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(42405);
    this.nYT = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("limit", String.valueOf(paramInt1));
    localHashMap.put("offset", String.valueOf(paramInt2));
    localHashMap.put("type", String.valueOf(paramInt3));
    localHashMap.put("year", paramString1);
    localHashMap.put("ver", paramString2);
    localHashMap.put("processContent", paramString3);
    M(localHashMap);
    AppMethodBeat.o(42405);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42406);
    try
    {
      q localq = new com/tencent/mm/plugin/luckymoney/model/q;
      localq.<init>();
      localq.nXH = paramJSONObject.optInt("recTotalNum");
      localq.nXI = paramJSONObject.optLong("recTotalAmount");
      localq.nXJ = paramJSONObject.optInt("sendTotalNum");
      localq.nXK = paramJSONObject.optLong("sendTotalAmount");
      localq.nXa = paramJSONObject.optInt("isContinue");
      localq.mLA = paramJSONObject.optInt("gameCount");
      JSONArray localJSONArray = paramJSONObject.optJSONArray("record");
      paramString = new java/util/LinkedList;
      paramString.<init>();
      if (localJSONArray != null)
        for (paramInt = 0; paramInt < localJSONArray.length(); paramInt++)
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(paramInt);
          r localr = new com/tencent/mm/plugin/luckymoney/model/r;
          localr.<init>();
          localr.nXL = localJSONObject.optString("sendName");
          localr.nWR = localJSONObject.optString("sendHeadImg");
          localr.nXM = localJSONObject.optLong("receiveAmount");
          localr.nXN = localJSONObject.optString("receiveTime");
          localr.cRT = localJSONObject.optInt("hbType");
          localr.nXO = localJSONObject.optString("sendTitle");
          localr.nXP = localJSONObject.optString("sendTime");
          localr.nWW = localJSONObject.optLong("totalAmount");
          localr.nXQ = localJSONObject.optLong("totalNum");
          localr.nWU = localJSONObject.optLong("recNum");
          localr.status = localJSONObject.optInt("status");
          localr.nXR = localJSONObject.optInt("thxCount");
          localr.nWX = localJSONObject.optString("receiveId");
          localr.nSX = localJSONObject.optString("sendId");
          localr.nXi = localJSONObject.optInt("hbKind");
          paramString.add(localr);
        }
      localq.nXj = paramString;
      this.nYQ = localq;
      paramString = new java/util/ArrayList;
      paramString.<init>();
      this.nYR = paramString;
      paramString = paramJSONObject.optString("years");
      if (!bo.isNullOrNil(paramString))
      {
        paramString = paramString.split("\\|");
        if (paramString != null)
          for (paramInt = 0; paramInt < paramString.length; paramInt++)
            this.nYR.add(paramString[paramInt]);
      }
      this.nYS = paramJSONObject.optString("recordYear");
      this.nYT = paramJSONObject.optString("clickedUrl");
      this.nYz = paramJSONObject.optString("processContent");
      AppMethodBeat.o(42406);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyNormalBase", paramString, "", new Object[0]);
        AppMethodBeat.o(42406);
      }
    }
  }

  public final boolean bLF()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.nYQ != null)
      if (this.nYQ.nXa != 1)
        break label26;
    label26: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/qrylistwxhb";
  }

  public final int getType()
  {
    return 1514;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ai
 * JD-Core Version:    0.6.2
 */