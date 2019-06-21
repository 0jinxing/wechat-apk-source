package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ad extends aa
{
  public String cRS;
  public int cRT;
  public int cRU;
  public int cRV;
  public String nSX;
  public String nWO;
  public as nXf;
  public String nXg;
  public String nYf;
  public String nYg;
  public int nYj;
  public String nYk;
  public String nYl;
  public int nYm;
  public int nYo;
  public String nYp;
  public String nYq;
  public int nYr;
  public String nYs;
  public String nYt;
  public String nYu;
  public String nYv;
  public String nYw;
  public long nYx;

  public ad(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(42393);
    this.nYr = 1;
    this.nYs = null;
    this.nYt = null;
    this.nYu = null;
    this.nYv = null;
    this.nYw = null;
    this.nYx = 0L;
    this.cRS = paramString2;
    this.nSX = paramString1;
    this.nYo = paramInt;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    localHashMap.put("way", String.valueOf(paramInt));
    localHashMap.put("channelId", "2");
    localHashMap.put("package", paramString3);
    g.RQ();
    long l = ((Long)g.RP().Ry().get(ac.a.xNB, Long.valueOf(0L))).longValue();
    if (l > 0L)
    {
      if (System.currentTimeMillis() >= l)
        break label206;
      localHashMap.put("agreeDuty", "0");
    }
    while (true)
    {
      M(localHashMap);
      AppMethodBeat.o(42393);
      return;
      label206: paramString1 = new StringBuilder();
      g.RQ();
      localHashMap.put("agreeDuty", (Integer)g.RP().Ry().get(ac.a.xNC, Integer.valueOf(1)));
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42394);
    this.nYp = paramJSONObject.optString("spidLogo");
    this.nYq = paramJSONObject.optString("spidWishing");
    this.nYf = paramJSONObject.optString("spidName");
    this.nYp = paramJSONObject.optString("spidLogo");
    this.cRU = paramJSONObject.optInt("hbStatus");
    this.cRV = paramJSONObject.optInt("receiveStatus");
    this.nWO = paramJSONObject.optString("statusMess");
    this.nYg = paramJSONObject.optString("hintMess");
    this.nXg = paramJSONObject.optString("watermark");
    this.nSX = paramJSONObject.optString("sendId");
    this.nYj = paramJSONObject.optInt("focusFlag");
    this.nYk = paramJSONObject.optString("focusWording");
    this.nYl = paramJSONObject.optString("focusAppidUserName");
    this.nYm = paramJSONObject.optInt("isFocus");
    this.cRT = paramJSONObject.optInt("hbType");
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
    this.nXf = v.Y(paramJSONObject.optJSONObject("operationTail"));
    AppMethodBeat.o(42394);
  }

  public final int bgG()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ad
 * JD-Core Version:    0.6.2
 */