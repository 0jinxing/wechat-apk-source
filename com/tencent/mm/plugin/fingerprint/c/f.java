package com.tencent.mm.plugin.fingerprint.c;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f extends m
  implements k
{
  public f(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(41589);
    HashMap localHashMap = new HashMap();
    localHashMap.put("encrypted_open_info", URLEncoder.encode(paramString1));
    localHashMap.put("encrypted_rsa_sign", URLEncoder.encode(paramString2));
    localHashMap.put("passwd", paramString3);
    M(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("device_type", Build.MODEL);
    paramString1.put("open_scene", String.valueOf(paramInt));
    ba(paramString1);
    AppMethodBeat.o(41589);
  }

  public final int ZU()
  {
    return 1599;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(41590);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.i("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay success");
      e.hs(true);
      AppMethodBeat.o(41590);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay failed");
      AppMethodBeat.o(41590);
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
  }

  public final int bgI()
  {
    return 119;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/androidopentouch";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.c.f
 * JD-Core Version:    0.6.2
 */