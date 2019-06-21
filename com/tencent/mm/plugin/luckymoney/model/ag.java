package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ag extends ak
{
  public String few;
  public int kCv;
  public String kCx;
  public String nRT;
  public String nRU;
  public String nSd;
  public as nXf;
  public String nYD;
  public boolean nYE;
  public int nYF;
  public String nYG;
  public as nYH;
  public as nYI;
  public as nYJ;
  public int nYK;
  public int nYL;
  public int nYM;
  public int nYN;
  public int nYO;
  public LinkedList<u> nYP;

  public ag(String paramString, int paramInt)
  {
    AppMethodBeat.i(42400);
    this.nYK = 0;
    this.nYL = 0;
    this.nYM = 0;
    this.nYN = 0;
    this.nYO = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", "8");
    localHashMap.put("ver", paramString);
    g.RQ();
    localHashMap.put("walletType", String.valueOf(g.RP().Ry().get(339975, null)));
    localHashMap.put("hasSource", String.valueOf(paramInt));
    M(localHashMap);
    AppMethodBeat.o(42400);
  }

  public ag(String paramString, int paramInt, byte paramByte)
  {
    AppMethodBeat.i(42401);
    this.nYK = 0;
    this.nYL = 0;
    this.nYM = 0;
    this.nYN = 0;
    this.nYO = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("ver", paramString);
    g.RQ();
    localHashMap.put("walletType", String.valueOf(g.RP().Ry().get(339975, null)));
    localHashMap.put("hasSource", String.valueOf(paramInt));
    M(localHashMap);
    AppMethodBeat.o(42401);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42402);
    if (paramInt == 0)
    {
      this.nYF = paramJSONObject.optInt("randomAmount");
      this.nYD = paramJSONObject.optString("randomWishing");
      this.kCx = paramJSONObject.optString("notice");
      this.nYG = paramJSONObject.optString("notice_url");
      boolean bool;
      if (paramJSONObject.optInt("hasCanShareHongBao") == 1)
        bool = true;
      while (true)
      {
        this.nYE = bool;
        this.kCv = paramJSONObject.optInt("currency");
        this.nRT = paramJSONObject.optString("currencyUint");
        this.nRU = paramJSONObject.optString("currencyWording");
        this.few = paramJSONObject.optString("unique_id");
        ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "currency=" + this.kCv + ";currencyUint=" + this.nRT + ";currencyWording=" + this.nRU + ";uniqueId=" + this.few);
        Object localObject = new i();
        ((i)localObject).nWH = paramJSONObject.optString("groupHint");
        ((i)localObject).nWI = paramJSONObject.optString("personalHint");
        ((i)localObject).nRR = (paramJSONObject.optLong("totalAmount", 200000L) / 100.0D);
        ((i)localObject).nRO = paramJSONObject.optInt("totalNum", 100);
        ((i)localObject).nRP = (paramJSONObject.optLong("perPersonMaxValue", 20000L) / 100.0D);
        ((i)localObject).nRS = (paramJSONObject.optLong("perGroupMaxValue", 20000L) / 100.0D);
        ((i)localObject).nRQ = (paramJSONObject.optLong("perMinValue", 1L) / 100.0D);
        ((i)localObject).nWJ = paramJSONObject.optInt("payShowBGFlag");
        ((i)localObject).kCv = this.kCv;
        ((i)localObject).nRT = this.nRT;
        ((i)localObject).nRU = this.nRU;
        ((i)localObject).nWK = paramJSONObject.optString("foreignFaqUrl");
        ((i)localObject).nWL = paramJSONObject.optString("foreignHongBaoName");
        ((i)localObject).nWM = paramJSONObject.optString("showSourceAndMac");
        ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "foreignFaqUrl: %s, foreignHongBaoName: %s", new Object[] { ((i)localObject).nWK, ((i)localObject).nWL });
        com.tencent.mm.plugin.luckymoney.b.a.bKN();
        paramString = com.tencent.mm.plugin.luckymoney.b.a.bKO();
        paramString.nSs = ((i)localObject);
        paramString.bLt();
        ab.i("MicroMsg.LuckyMoneyConfigManager", "setConfig maxTotalAmount:" + paramString.nSs.nRR + " maxTotalNum:" + paramString.nSs.nRO + " perGroupMaxValue:" + paramString.nSs.nRS + " perMinValue:" + paramString.nSs.nRQ + " perPersonMaxValue:" + paramString.nSs.nRP);
        try
        {
          localObject = new java/lang/String;
          ((String)localObject).<init>(paramString.nSs.toByteArray(), "ISO-8859-1");
          g.RQ();
          g.RP().Ry().set(356355, localObject);
          g.RQ();
          g.RP().Ry().dsb();
          this.nYH = v.Y(paramJSONObject.optJSONObject("operationHeader"));
          this.nXf = v.Y(paramJSONObject.optJSONObject("operationTail"));
          this.nYI = v.Y(paramJSONObject.optJSONObject("operationNext"));
          this.nYJ = v.Y(paramJSONObject.optJSONObject("operationMiddle"));
          paramInt = paramJSONObject.optInt("sceneSwitch");
          g.RQ();
          g.RP().Ry().set(ac.a.xJB, Integer.valueOf(paramInt));
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "sceneSwitch:".concat(String.valueOf(paramInt)));
          this.nYK = paramJSONObject.optInt("scenePicSwitch");
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "scenePicSwitch:" + this.nYK);
          this.nYM = paramJSONObject.optInt("enableYearHbExpression");
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "enableYearHbExpression:%s", new Object[] { Integer.valueOf(this.nYM) });
          this.nYL = paramJSONObject.optInt("enableSelfie");
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "enableSelfIe:" + this.nYL);
          this.nYN = paramJSONObject.optInt("enableNormalSelfie");
          this.nYO = paramJSONObject.optInt("enableNormalAllExpression");
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "enableNormalSelfie:%s enableNormalAllExpression:%s", new Object[] { Integer.valueOf(this.nYN), Integer.valueOf(this.nYO) });
          this.nSd = paramJSONObject.optString("wishing");
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "wishing: %s", new Object[] { this.nSd });
          paramJSONObject = paramJSONObject.optJSONArray("yearMess");
          if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
          {
            ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "yearMessJson length:" + paramJSONObject.length());
            this.nYP = new LinkedList();
            paramInt = 0;
            while (paramInt < paramJSONObject.length())
            {
              paramString = paramJSONObject.optJSONObject(paramInt);
              localObject = new u();
              ((u)localObject).nXX = paramString.optInt("yearAmount", 0);
              ((u)localObject).nXY = paramString.optString("yearWish");
              this.nYP.add(localObject);
              paramInt++;
              continue;
              bool = false;
            }
          }
        }
        catch (UnsupportedEncodingException paramString)
        {
          while (true)
            ab.w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + paramString.getLocalizedMessage());
        }
        catch (IOException paramString)
        {
          while (true)
            ab.w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + paramString.getLocalizedMessage());
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "yearMessJson is empty!");
          g.RQ();
          int i = ((Integer)g.RP().Ry().get(ac.a.xWQ, Integer.valueOf(0))).intValue();
          paramInt = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIS, 0);
          if ((bo.gW(i, 1)) || (bo.gW(paramInt, 1)))
          {
            this.nYN = 1;
            this.nYO = 1;
            this.nYL = 1;
            this.nYM = 1;
          }
          ab.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "localSwitch() enableNormalSelfie:%s enableNormalAllExpression:%s enableSelfie:%s enableYearHbExpression:%s", new Object[] { Integer.valueOf(this.nYN), Integer.valueOf(this.nYO), Integer.valueOf(this.nYL), Integer.valueOf(this.nYM) });
          AppMethodBeat.o(42402);
        }
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneLuckyMoneyGetConfig", "hongbao operation fail, errCode:" + paramInt + ", errMsg:" + paramString);
      AppMethodBeat.o(42402);
    }
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/operationwxhb";
  }

  public final int getType()
  {
    return 1554;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ag
 * JD-Core Version:    0.6.2
 */