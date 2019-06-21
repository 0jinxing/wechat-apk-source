package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class af extends ak
{
  long cvx;
  public String nYA;
  public int nYB;
  public LuckyMoneyEmojiSwitch nYC;
  public k nYn;
  public String nYz;
  String talker;

  public af(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    this(paramString1, paramInt1, paramInt2, paramString2, paramString3, "");
  }

  public af(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(42398);
    this.nYn = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("limit", String.valueOf(paramInt1));
    localHashMap.put("offset", String.valueOf(paramInt2));
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    localHashMap.put("ver", paramString3);
    localHashMap.put("processContent", paramString4);
    M(localHashMap);
    AppMethodBeat.o(42398);
  }

  public af(String paramString1, int paramInt, String paramString2, long paramLong, String paramString3, String paramString4)
  {
    AppMethodBeat.i(42397);
    this.nYn = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    localHashMap.put("limit", "11");
    localHashMap.put("offset", String.valueOf(paramInt));
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    localHashMap.put("befortTimestamp", String.valueOf(paramLong));
    localHashMap.put("ver", paramString3);
    localHashMap.put("processContent", paramString4);
    M(localHashMap);
    AppMethodBeat.o(42397);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42399);
    try
    {
      this.nYn = v.W(paramJSONObject);
      this.nYz = paramJSONObject.optString("processContent");
      this.nYC = LuckyMoneyEmojiSwitch.V(paramJSONObject);
      ab.i("MicroMsg.NetSceneLuckyMoneyDetail", "luckyMoneyEmojiSwitch:%s", new Object[] { this.nYC.toString() });
      this.nYA = paramJSONObject.optString("expression_md5");
      this.nYB = paramJSONObject.optInt("expression_type");
      ab.i("MicroMsg.NetSceneLuckyMoneyDetail", "expressionmd5:%s expressiontype:%s", new Object[] { this.nYA, Integer.valueOf(this.nYB) });
      g.RQ();
      paramInt = ((Integer)g.RP().Ry().get(ac.a.xWQ, Integer.valueOf(0))).intValue();
      int i = ((a)g.K(a.class)).a(a.a.lIS, 0);
      if ((bo.gW(paramInt, 1)) || (bo.gW(i, 1)))
      {
        if (this.nYC == null)
        {
          paramString = new com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEmojiSwitch;
          paramString.<init>();
          this.nYC = paramString;
        }
        this.nYC.nXp = 1;
        this.nYC.nXq = 1;
        this.nYC.nXr = 1;
        this.nYC.nXs = 1;
      }
      ab.i("MicroMsg.NetSceneLuckyMoneyDetail", "localSwitch() luckyMoneyEmojiSwitch:%s ", new Object[] { this.nYC.toString() });
      AppMethodBeat.o(42399);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
        AppMethodBeat.o(42399);
      }
    }
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/qrydetailwxhb";
  }

  public final int getType()
  {
    return 1585;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.af
 * JD-Core Version:    0.6.2
 */