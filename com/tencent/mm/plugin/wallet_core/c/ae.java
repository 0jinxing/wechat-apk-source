package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bcj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONObject;

public final class ae extends m
{
  private long fRS;
  public String tuA;
  public String tuB;
  public String tuC;
  public String tuD;
  public String tuE;
  public int tuF;
  public int tuG;

  public ae()
  {
    AppMethodBeat.i(46557);
    M(null);
    AppMethodBeat.o(46557);
  }

  public static boolean a(boolean paramBoolean, com.tencent.mm.wallet_core.d.i parami)
  {
    AppMethodBeat.i(46559);
    g.RQ();
    long l = ((Long)g.RP().Ry().get(ac.a.xPO, Long.valueOf(0L))).longValue();
    if ((paramBoolean) || (l < System.currentTimeMillis()))
    {
      ab.i("MicroMsg.NetSceneTransferWording", "do scene: %d, force: %B", new Object[] { Long.valueOf(l), Boolean.valueOf(paramBoolean) });
      if (parami != null)
      {
        parami.a(new ae(), false, 1);
        AppMethodBeat.o(46559);
      }
    }
    for (paramBoolean = true; ; paramBoolean = false)
    {
      return paramBoolean;
      g.RQ();
      g.RO().eJo.a(new ae(), 0);
      break;
      ab.d("MicroMsg.NetSceneTransferWording", "not time");
      AppMethodBeat.o(46559);
    }
  }

  public final int ZU()
  {
    return 1992;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46558);
    ab.i("MicroMsg.NetSceneTransferWording", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    ab.d("MicroMsg.NetSceneTransferWording", "json: %s", new Object[] { paramJSONObject });
    this.tuA = paramJSONObject.optString("delay_confirm_wording");
    this.tuB = paramJSONObject.optString("delay_confirm_switch_wording");
    this.tuC = paramJSONObject.optString("delay_confirm_switch_remind_wording");
    this.tuD = paramJSONObject.optString("delay_confirm_desc_url");
    this.tuF = paramJSONObject.optInt("delay_confirm_desc_url_flag", 0);
    this.fRS = (paramJSONObject.optLong("expire_time", 0L) * 1000L);
    this.tuG = paramJSONObject.optInt("delay_confirm_switch_flag", 0);
    g.RQ();
    paramString = g.RP().Ry();
    if (!bo.isNullOrNil(this.tuA))
      paramString.set(ac.a.xPL, this.tuA);
    if (!bo.isNullOrNil(this.tuB))
      paramString.set(ac.a.xPM, this.tuB);
    if (!bo.isNullOrNil(this.tuC))
      paramString.set(ac.a.xPN, this.tuC);
    if (!bo.isNullOrNil(this.tuD));
    try
    {
      this.tuE = URLDecoder.decode(this.tuD, "UTF-8");
      if (!bo.isNullOrNil(this.tuE))
        paramString.set(ac.a.xPP, this.tuE);
      paramString.set(ac.a.xPQ, Integer.valueOf(this.tuF));
      paramString.set(ac.a.xPO, Long.valueOf(this.fRS));
      paramString.set(ac.a.xPR, Integer.valueOf(this.tuG));
      if (this.tuG == 0)
      {
        ab.i("MicroMsg.NetSceneTransferWording", "do reset oplog");
        paramJSONObject = new bcj();
        paramJSONObject.pXD = 0;
        ((j)g.K(j.class)).XL().c(new j.a(205, paramJSONObject));
        paramString.set(147457, Long.valueOf(((Long)paramString.get(147457, Long.valueOf(0L))).longValue() & 0xFFFFFFEF & 0xFFFFFFDF));
      }
      AppMethodBeat.o(46558);
      return;
    }
    catch (UnsupportedEncodingException paramJSONObject)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneTransferWording", paramJSONObject, "", new Object[0]);
    }
  }

  public final boolean bXm()
  {
    return false;
  }

  public final int bgI()
  {
    return 0;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/gettransferwording";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.ae
 * JD-Core Version:    0.6.2
 */