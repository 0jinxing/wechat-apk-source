package com.tencent.mm.plugin.fingerprint.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends m
  implements k
{
  public String cBV;
  public String mrK;
  public String msr;

  public e(String paramString)
  {
    AppMethodBeat.i(41587);
    this.mrK = "";
    this.cBV = "";
    this.msr = "";
    HashMap localHashMap = new HashMap();
    if (TextUtils.isEmpty(paramString))
      ab.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is empty");
    while (true)
    {
      localHashMap.put("encrypted_cert_info", URLEncoder.encode(paramString));
      localHashMap.put("ver", "0x1.0");
      M(localHashMap);
      AppMethodBeat.o(41587);
      return;
      ab.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is not empty");
    }
  }

  public final int ZU()
  {
    return 1598;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(41588);
    if (paramJSONObject != null)
    {
      this.mrK = paramJSONObject.optString("encrypted_device_info");
      this.cBV = paramJSONObject.optString("encrypted_rsa_sign");
      this.msr = paramJSONObject.optString("cert");
      if (TextUtils.isEmpty(this.mrK))
      {
        ab.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is empty");
        if (!TextUtils.isEmpty(this.cBV))
          break label106;
        ab.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is empty");
        label73: if (!TextUtils.isEmpty(this.msr))
          break label116;
        ab.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is empty");
        AppMethodBeat.o(41588);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is not empty");
      break;
      label106: ab.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is not empty");
      break label73;
      label116: ab.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is not empty");
      AppMethodBeat.o(41588);
    }
  }

  public final int bgI()
  {
    return 118;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getopentouchcert";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.c.e
 * JD-Core Version:    0.6.2
 */