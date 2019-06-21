package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fingerprint.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.soter.d.e;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends m
  implements k
{
  public d(int paramInt)
  {
    AppMethodBeat.i(41584);
    HashMap localHashMap = new HashMap();
    Object localObject = com.tencent.mm.plugin.soter.d.d.cvQ();
    String str = ((e)localObject).rOh;
    localObject = ((e)localObject).jSY;
    localHashMap.put("cpu_id", str);
    localHashMap.put("uid", localObject);
    localHashMap.put("soter_type", String.valueOf(paramInt));
    M(localHashMap);
    AppMethodBeat.o(41584);
  }

  public final int ZU()
  {
    return 1597;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(41586);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramString = (l)g.K(l.class);
    if (paramString.bxe())
      h.pYm.e(13686, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    label155: 
    while (true)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        paramString.hq(false);
        paramString.hr(false);
        ab.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi success!");
        AppMethodBeat.o(41586);
      }
      while (true)
      {
        return;
        if (!paramString.bxh())
          break label155;
        h.pYm.e(16994, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        break;
        ab.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi failed!");
        AppMethodBeat.o(41586);
      }
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(41585);
    if (paramInt == 0)
      if (paramJSONObject == null)
        break label63;
    label63: for (paramInt = paramJSONObject.optInt("clear_rsa_key_level", 0); ; paramInt = 0)
    {
      a.bwM();
      a.bwN();
      ((l)g.K(l.class)).bxv();
      AppMethodBeat.o(41585);
      while (true)
      {
        return;
        ab.e("MicroMsg.NetSceneTenpayCloseTouchPay", "do close fingerprint cgi failed!");
        AppMethodBeat.o(41585);
      }
    }
  }

  public final int bgI()
  {
    return 116;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/closetouchpay";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.c.d
 * JD-Core Version:    0.6.2
 */