package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import org.json.JSONObject;

public final class e extends m
{
  public String title;
  public String tvB;
  public String tvC;
  public String tvD;
  public String tvE;
  public int tvF;
  public long tvG;

  public final int ZU()
  {
    return 1614;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46647);
    ab.i("MicroMsg.NetSceneRealnameGetDuty", "errCode=" + paramInt + ";errMsg=" + paramString);
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      this.tvB = paramJSONObject.optString("agreed_flag", "0");
      this.title = paramJSONObject.optString("title", "");
      this.tvC = paramJSONObject.optString("service_protocol_wording", "");
      this.tvD = paramJSONObject.optString("service_protocol_url", "");
      this.tvE = paramJSONObject.optString("button_wording", "");
      this.tvG = paramJSONObject.optLong("delay_expired_time", 0L);
      if (this.tvG > 0L)
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xNB, Long.valueOf(System.currentTimeMillis() + this.tvG * 1000L));
      }
    }
    AppMethodBeat.o(46647);
  }

  public final int bgI()
  {
    return 1614;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/realnamegetduty";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.e
 * JD-Core Version:    0.6.2
 */