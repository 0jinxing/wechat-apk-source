package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.b;
import com.tencent.xweb.util.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m extends h
{
  String cEW;
  public int oYA;
  int oYB;
  public String oYn;
  public String oYo;
  public String oYp;
  public String oYr;
  public int oYs;
  public String oYt;
  public String oYu;
  public String oYv;
  private String oYx;
  private int oYy;
  public String oYz;
  public String token;

  public m(String paramString, int paramInt)
  {
    this(paramString, paramInt, paramInt);
    AppMethodBeat.i(43407);
    AppMethodBeat.o(43407);
  }

  public m(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43408);
    this.token = "";
    this.oYn = "";
    this.oYo = "";
    this.oYp = "";
    this.oYr = "";
    this.oYs = 0;
    this.oYt = "";
    this.oYu = "";
    this.oYv = "";
    this.oYA = 0;
    this.oYB = 0;
    this.cEW = d.x(System.currentTimeMillis().getBytes());
    ab.v("MicroMsg.NetSceneTenpayWxOfflineGetToken", "scene %s stack %s ", new Object[] { Integer.valueOf(paramInt1), bo.dpG().toString() });
    Object localObject1 = com.tencent.mm.plugin.offline.c.a.getToken();
    com.tencent.mm.plugin.offline.k.bXg();
    String str = com.tencent.mm.plugin.offline.k.Ax(196628);
    Object localObject2 = str;
    if (TextUtils.isEmpty(str))
      localObject2 = q.LM();
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      paramString = (String)localObject2 + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000);
      localObject2 = new HashMap();
      ((Map)localObject2).put("token_src", paramString);
      com.tencent.mm.plugin.offline.k.bXg();
      str = com.tencent.mm.plugin.offline.k.Ax(196617);
      switch (paramInt2)
      {
      default:
        paramInt2 = 12;
        label303: com.tencent.mm.plugin.report.service.h.pYm.a(135L, paramInt2, 1L, true);
        localObject1 = new com.tencent.mm.g.b.a.a();
        ((com.tencent.mm.g.b.a.a)localObject1).ep(this.cEW);
        ((com.tencent.mm.g.b.a.a)localObject1).cTl = 1L;
        b.dNJ();
        if (b.isCertExist(str))
        {
          ((com.tencent.mm.g.b.a.a)localObject1).cTm = 1;
          b.dNJ();
          ((com.tencent.mm.g.b.a.a)localObject1).cTn = b.getLastError();
          ((com.tencent.mm.g.b.a.a)localObject1).ajK();
          localObject1 = new com.tencent.mm.g.b.a.a();
          ((com.tencent.mm.g.b.a.a)localObject1).ep(this.cEW);
          ((com.tencent.mm.g.b.a.a)localObject1).cTl = 3L;
          b.dNJ();
          paramString = b.genUserSig(str, paramString);
          if (bo.isNullOrNil(paramString))
          {
            ((com.tencent.mm.g.b.a.a)localObject1).cTm = 0;
            b.dNJ();
            ((com.tencent.mm.g.b.a.a)localObject1).cTn = b.getLastError();
            ((com.tencent.mm.g.b.a.a)localObject1).ajK();
            label448: ab.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().isCertExist(cn) true");
            if (!TextUtils.isEmpty(paramString))
              break label1011;
            ab.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken sign is empty!");
            com.tencent.mm.plugin.report.service.h.pYm.a(135L, 4L, 1L, true);
            label483: ((Map)localObject2).put("sign", paramString);
            ((Map)localObject2).put("cert_no", str);
            ((Map)localObject2).put("type", k.oYq);
            ((Map)localObject2).put("version_number", k.oYq);
            if (com.tencent.mm.plugin.offline.c.a.bYq() != 2)
              break label1022;
            ((Map)localObject2).put("last_token", com.tencent.mm.plugin.offline.c.a.bYr());
            label554: ab.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "inOfflineUI: %B", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.offline.k.oXK) });
            if (paramInt1 != 65281)
              break label1039;
            ((Map)localObject2).put("fetch_tag", "2");
          }
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      }
    }
    while (true)
    {
      paramInt2 = paramInt1;
      if (paramInt1 == 65281)
        paramInt2 = 3;
      ((Map)localObject2).put("scene", String.valueOf(paramInt2));
      M((Map)localObject2);
      AppMethodBeat.o(43408);
      return;
      paramString = (String)localObject2 + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000) + "&" + (String)localObject1;
      break;
      paramInt2 = 12;
      break label303;
      paramInt2 = 13;
      break label303;
      paramInt2 = 14;
      break label303;
      paramInt2 = 15;
      break label303;
      paramInt2 = 16;
      break label303;
      paramInt2 = 17;
      break label303;
      paramInt2 = 18;
      break label303;
      paramInt2 = 19;
      break label303;
      paramInt2 = 20;
      break label303;
      paramInt2 = 24;
      break label303;
      paramInt2 = 72;
      break label303;
      ((com.tencent.mm.g.b.a.a)localObject1).cTm = 1;
      b.dNJ();
      ((com.tencent.mm.g.b.a.a)localObject1).cTn = b.getLastError();
      ((com.tencent.mm.g.b.a.a)localObject1).ajK();
      break label448;
      paramString = new StringBuilder("NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().getLastError():");
      b.dNJ();
      ab.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", b.getLastError());
      ((com.tencent.mm.g.b.a.a)localObject1).cTm = 0;
      b.dNJ();
      ((com.tencent.mm.g.b.a.a)localObject1).cTn = b.getLastError();
      ((com.tencent.mm.g.b.a.a)localObject1).ajK();
      com.tencent.mm.plugin.report.service.h.pYm.a(135L, 6L, 1L, true);
      paramString = new com.tencent.mm.g.b.a.a();
      paramString.ep(this.cEW);
      paramString.cTl = 2L;
      g.RQ();
      localObject1 = (String)g.RP().Ry().get(ac.a.xIK, "");
      if ((localObject1 != null) && (((String)localObject1).equals(q.LK())))
      {
        ab.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is same between create and getToken");
        paramString.cTm = 1;
        b.dNJ();
        paramString.cTn = b.getLastError();
      }
      while (true)
      {
        paramString.ajK();
        ab.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().isCertExist return false! cn: ".concat(String.valueOf(str)));
        paramString = "";
        break;
        paramString.cTm = 0;
        b.dNJ();
        paramString.cTn = b.getLastError();
        ab.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is diff between create and getToken");
        com.tencent.mm.plugin.report.service.h.pYm.a(135L, 5L, 1L, true);
      }
      label1011: ab.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "sign is valid");
      break label483;
      label1022: ((Map)localObject2).put("last_token", com.tencent.mm.plugin.offline.c.a.getToken());
      break label554;
      label1039: if (com.tencent.mm.plugin.offline.k.oXK)
        ((Map)localObject2).put("fetch_tag", "1");
      else
        ((Map)localObject2).put("fetch_tag", "0");
    }
  }

  public final int ZU()
  {
    if (com.tencent.mm.plugin.offline.k.oXK);
    for (int i = 571; ; i = 1725)
      return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43409);
    ab.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      this.token = paramJSONObject.optString("token");
      this.oYn = paramJSONObject.optString("valid_end");
      this.oYo = paramJSONObject.optString("encrypt_str");
      this.oYp = paramJSONObject.optString("deviceid");
      this.oYr = paramJSONObject.optString("token_v2");
      this.oYs = paramJSONObject.optInt("algorithm_type");
      this.oYt = paramJSONObject.optString("card_list");
      this.oYu = paramJSONObject.optString("key_list");
      this.oYv = paramJSONObject.optString("token_pin");
      this.oYx = paramJSONObject.optString("auth_codes");
      this.oYy = paramJSONObject.optInt("update_interval");
      this.oYz = paramJSONObject.optString("code_ver");
      this.oYA = paramJSONObject.optInt("reget_token_num", 0);
      this.oYB = paramJSONObject.optInt("cipher_type", 0);
      if (this.oYA <= 0)
        break label229;
    }
    label229: for (com.tencent.mm.plugin.offline.k.oXL = this.oYA; ; com.tencent.mm.plugin.offline.k.oXL = 10)
    {
      ab.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "json: %s", new Object[] { paramJSONObject.toString() });
      AppMethodBeat.o(43409);
      return;
    }
  }

  public final boolean bXn()
  {
    AppMethodBeat.i(43410);
    ab.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "do save token");
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.k.aT(196626, this.oYn);
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.k.aT(196627, this.oYo);
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.k.aT(196628, this.oYp);
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.k.aT(196632, System.currentTimeMillis() / 1000L);
    com.tencent.mm.plugin.offline.c.a.r(this.token, this.oYr, this.oYt, this.oYu);
    com.tencent.mm.plugin.offline.c.a.AD(this.oYs);
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.k.aT(196647, this.oYv);
    com.tencent.mm.plugin.offline.k.bXg();
    Object localObject1 = com.tencent.mm.plugin.offline.k.Ax(196617);
    b.dNJ();
    b.clearToken((String)localObject1);
    b.dNJ();
    Object localObject2 = this.oYx;
    boolean bool;
    if (this.oYB == 1)
    {
      bool = true;
      bool = b.F((String)localObject1, (String)localObject2, bool);
      localObject2 = new com.tencent.mm.g.b.a.a();
      ((com.tencent.mm.g.b.a.a)localObject2).ep(this.cEW);
      ((com.tencent.mm.g.b.a.a)localObject2).cTl = 3L;
      if (bool)
        break label317;
      ((com.tencent.mm.g.b.a.a)localObject2).cTm = 0;
      b.dNJ();
      ((com.tencent.mm.g.b.a.a)localObject2).cTn = b.getLastError();
      ab.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens failed!");
      localObject1 = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      b.dNJ();
      ab.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", b.getLastError());
    }
    while (true)
    {
      ((com.tencent.mm.g.b.a.a)localObject2).ajK();
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196649, this.oYy);
      g.RQ();
      g.RP().Ry().set(ac.a.xIL, this.oYz);
      AppMethodBeat.o(43410);
      return bool;
      bool = false;
      break;
      label317: ((com.tencent.mm.g.b.a.a)localObject2).cTm = 1;
      b.dNJ();
      ((com.tencent.mm.g.b.a.a)localObject2).cTn = b.getLastError();
      ab.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens success!");
    }
  }

  public final int bgI()
  {
    if (com.tencent.mm.plugin.offline.k.oXK);
    for (int i = 52; ; i = 1725)
      return i;
  }

  public final String getUri()
  {
    if (com.tencent.mm.plugin.offline.k.oXK);
    for (String str = "/cgi-bin/mmpay-bin/tenpay/offlinegettoken"; ; str = "/cgi-bin/mmpay-bin/tenpay/offlinegettokenbackground")
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.m
 * JD-Core Version:    0.6.2
 */