package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aq extends ak
{
  public String cRS;
  public int cRT;
  public int cRU;
  public int cRV;
  public int cdf;
  long cvx;
  public String ffP;
  public int msgType;
  public String nSX;
  public String nSd;
  public String nUk;
  public String nWO;
  public String nWR;
  public int nWZ;
  public as nXf;
  public String nXg;
  public String nXl;
  public String nYA;
  public int nYB;
  public int nYK;
  public int nYW;
  public int nYr;
  public String nYs;
  public String nYt;
  public String nYu;
  public String nYv;
  public String nYw;
  public long nYx;
  public String nZg;
  public long nZh;
  public long nZi;
  public int nZj;
  public int nZk;
  public String nZl;
  public au nZm;
  String talker;

  public aq(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(42421);
    this.nYr = 1;
    this.nYs = null;
    this.nYt = null;
    this.nYu = null;
    this.nYv = null;
    this.nYw = null;
    this.nYx = 0L;
    this.nYK = 0;
    this.nYW = 0;
    this.nZk = 0;
    this.msgType = 1;
    this.cdf = paramInt1;
    this.nSX = paramString1;
    this.cRS = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("msgType", "1");
    localHashMap.put("channelId", String.valueOf(paramInt1));
    localHashMap.put("sendId", paramString1);
    localHashMap.put("inWay", String.valueOf(paramInt2));
    localHashMap.put("ver", paramString3);
    g.RQ();
    long l = ((Long)g.RP().Ry().get(ac.a.xNB, Long.valueOf(0L))).longValue();
    if (l > 0L)
    {
      if (System.currentTimeMillis() >= l)
        break label241;
      localHashMap.put("agreeDuty", "0");
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramString2))
        localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
      M(localHashMap);
      AppMethodBeat.o(42421);
      return;
      label241: paramString1 = new StringBuilder();
      g.RQ();
      localHashMap.put("agreeDuty", (Integer)g.RP().Ry().get(ac.a.xNC, Integer.valueOf(1)));
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42422);
    this.nZg = paramJSONObject.optString("sendNick");
    this.nWR = paramJSONObject.optString("sendHeadImg");
    this.cRU = paramJSONObject.optInt("hbStatus");
    this.cRV = paramJSONObject.optInt("receiveStatus");
    this.nWO = paramJSONObject.optString("statusMess");
    this.nSd = paramJSONObject.optString("wishing");
    this.nWZ = paramJSONObject.optInt("isSender");
    this.nZh = paramJSONObject.optLong("sceneAmount");
    this.nZi = paramJSONObject.optLong("sceneRecTimeStamp");
    this.cRT = paramJSONObject.optInt("hbType");
    this.nXg = paramJSONObject.optString("watermark");
    this.nUk = paramJSONObject.optString("externMess");
    this.nXl = paramJSONObject.optString("sendUserName");
    if ((!bo.isNullOrNil(this.nXl)) && (bo.isNullOrNil(this.nZg)))
      this.nZg = ((b)g.K(b.class)).mJ(this.nXl);
    this.nXf = v.Y(paramJSONObject.optJSONObject("operationTail"));
    this.nYK = paramJSONObject.optInt("scenePicSwitch");
    paramString = paramJSONObject.optJSONObject("agree_duty");
    if (paramString != null)
    {
      this.nYs = paramString.optString("agreed_flag", "-1");
      this.nYt = paramString.optString("title", "");
      this.nYu = paramString.optString("service_protocol_wording", "");
      this.nYv = paramString.optString("service_protocol_url", "");
      this.nYw = paramString.optString("button_wording", "");
      this.nYx = paramString.optLong("delay_expired_time", 0L);
    }
    if (this.nYx > 0L)
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xNB, Long.valueOf(System.currentTimeMillis() + this.nYx * 1000L));
    }
    ab.i("MicroMsg.NetSceneReceiveLuckyMoney", "scenePicSwitch:" + this.nYK);
    this.nZj = paramJSONObject.optInt("preStrainFlag", 1);
    ab.i("MicroMsg.NetSceneReceiveLuckyMoney", "preStrainFlag:" + this.nZj);
    this.nYW = paramJSONObject.optInt("showYearExpression");
    ab.i("MicroMsg.NetSceneReceiveLuckyMoney", "showYearExpression:%s", new Object[] { Integer.valueOf(this.nYW) });
    this.nZk = paramJSONObject.optInt("showRecNormalExpression");
    ab.i("MicroMsg.NetSceneReceiveLuckyMoney", "showRecNormalExpression:%s", new Object[] { Integer.valueOf(this.nZk) });
    g.RQ();
    g.RP().Ry().set(ac.a.xNq, Integer.valueOf(this.nZj));
    this.nZl = paramJSONObject.optString("timingIdentifier");
    this.ffP = paramJSONObject.optString("effectResource");
    this.nYA = paramJSONObject.optString("expression_md5");
    this.nYB = paramJSONObject.optInt("expression_type");
    ab.i("MicroMsg.NetSceneReceiveLuckyMoney", "expressionmd5:%s expressiontype:%s", new Object[] { this.nYA, Integer.valueOf(this.nYB) });
    paramJSONObject = paramJSONObject.optJSONObject("showSourceRec");
    if (paramJSONObject == null)
      paramString = null;
    while (true)
    {
      this.nZm = paramString;
      g.RQ();
      paramInt = ((Integer)g.RP().Ry().get(ac.a.xWQ, Integer.valueOf(0))).intValue();
      int i = ((a)g.K(a.class)).a(a.a.lIS, 0);
      if ((bo.gW(paramInt, 1)) || (bo.gW(i, 1)))
      {
        this.nZk = 1;
        this.nYW = 1;
      }
      ab.i("MicroMsg.NetSceneReceiveLuckyMoney", "localSwitch() showRecNormalExpression:%s showYearExpression:%s", new Object[] { Integer.valueOf(this.nZk), Integer.valueOf(this.nYW) });
      AppMethodBeat.o(42422);
      return;
      paramString = new au();
      paramString.nZq = v.Z(paramJSONObject);
    }
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/receivewxhb";
  }

  public final int getType()
  {
    return 1581;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.aq
 * JD-Core Version:    0.6.2
 */