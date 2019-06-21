package com.tencent.mm.plugin.offline.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k extends m
{
  public static String oYq = "3";
  public String oYl;
  public String oYm;
  public String oYn;
  public String oYo;
  public String oYp;
  public String oYr;
  public int oYs;
  public String oYt;
  public String oYu;
  public String oYv;
  public int oYw;
  public String token;

  public k(Bankcard paramBankcard, String paramString, int paramInt)
  {
    AppMethodBeat.i(43401);
    this.oYl = "";
    this.oYm = "";
    this.token = "";
    this.oYn = "";
    this.oYo = "";
    this.oYp = "";
    this.oYr = "";
    this.oYs = 0;
    this.oYt = "";
    this.oYu = "";
    this.oYv = "";
    this.oYw = 20000;
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    localHashMap.put("device_id", com.tencent.mm.compatible.e.q.LM());
    localHashMap.put("weixin_ver", "0x" + Integer.toHexString(com.tencent.mm.protocal.d.vxo));
    localHashMap.put("bind_serialno", paramBankcard.field_bindSerial);
    localHashMap.put("bank_type", paramBankcard.field_bankcardType);
    localHashMap.put("card_tail", paramBankcard.field_bankcardTail);
    localHashMap.put("open_limitfee", String.valueOf(paramInt));
    this.oYw = paramInt;
    paramBankcard = com.tencent.mm.wallet_core.ui.e.getUsername();
    paramBankcard = ag.ck(ag.ck(paramBankcard) + ag.ck(com.tencent.mm.compatible.e.q.LM()));
    localHashMap.put("user_id", paramBankcard);
    paramString = com.tencent.mm.wallet_core.c.b.dNJ();
    com.tencent.mm.wallet_core.b.dNA();
    if (com.tencent.mm.wallet_core.b.dNC());
    for (paramInt = 1; ; paramInt = 0)
    {
      paramBankcard = paramString.eJ(paramBankcard, paramInt);
      com.tencent.mm.wallet_core.b.dNA();
      ab.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr %s %s", new Object[] { paramBankcard, Boolean.valueOf(com.tencent.mm.wallet_core.b.dNC()) });
      localHashMap.put("crt_csr", paramBankcard);
      localHashMap.put("type", oYq);
      localHashMap.put("version_number", oYq);
      M(localHashMap);
      AppMethodBeat.o(43401);
      return;
    }
  }

  public final int ZU()
  {
    return 565;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43403);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196630, "0");
    }
    paramq = new ArrayList();
    paramArrayOfByte = new IDKey();
    paramArrayOfByte.SetID(135);
    paramArrayOfByte.SetValue(1L);
    paramArrayOfByte.SetKey(11);
    paramString = new IDKey();
    paramString.SetID(135);
    paramString.SetValue(1L);
    if ((paramInt3 == 0) && (paramInt3 == 0))
      paramString.SetKey(9);
    while (true)
    {
      paramq.add(paramArrayOfByte);
      paramq.add(paramString);
      h.pYm.b(paramq, true);
      AppMethodBeat.o(43403);
      return;
      paramString.SetKey(10);
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43402);
    boolean bool;
    if (paramJSONObject != null)
    {
      this.oYm = paramJSONObject.optString("crt_crt");
      this.oYl = paramJSONObject.optString("cn");
      this.token = paramJSONObject.optString("token");
      this.oYn = paramJSONObject.optString("valid_end");
      this.oYo = paramJSONObject.optString("encrypt_str");
      this.oYp = paramJSONObject.optString("deviceid");
      if (!com.tencent.mm.wallet_core.c.b.dNJ().importCert(this.oYl, this.oYm))
        break label527;
      ab.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt success");
      this.oYr = paramJSONObject.optString("token_v2");
      this.oYs = paramJSONObject.optInt("algorithm_type");
      this.oYt = paramJSONObject.optString("card_list");
      this.oYu = paramJSONObject.optString("key_list");
      this.oYv = paramJSONObject.optString("token_pin");
      String str1 = paramJSONObject.optString("notice_url");
      String str2 = paramJSONObject.optString("auth_codes");
      paramInt = paramJSONObject.optInt("update_interval");
      paramString = paramJSONObject.optString("code_ver");
      int i = paramJSONObject.optInt("cipher_type", 0);
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196617, this.oYl);
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196626, this.oYn);
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196627, this.oYo);
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196628, this.oYp);
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196630, "1");
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196632, System.currentTimeMillis() / 1000L);
      a.r(this.token, this.oYr, this.oYt, this.oYu);
      a.AD(this.oYs);
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196647, this.oYv);
      a.Uh(str1);
      com.tencent.mm.plugin.offline.k.bXg();
      paramJSONObject = com.tencent.mm.plugin.offline.k.Ax(196617);
      com.tencent.mm.wallet_core.c.b.dNJ();
      com.tencent.mm.wallet_core.c.b.clearToken(paramJSONObject);
      com.tencent.mm.wallet_core.c.b.dNJ();
      paramJSONObject = this.oYl;
      if (i != 1)
        break label538;
      bool = true;
      label378: bool = com.tencent.mm.wallet_core.c.b.F(paramJSONObject, str2, bool);
      ab.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "offlinecreate isOk %s cn: %s", new Object[] { Boolean.valueOf(bool), this.oYl });
      if (bool)
        break label544;
      ab.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens failed!");
      paramJSONObject = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.b.dNJ();
      ab.e("MicroMsg.NetSceneTenpayWxOfflineCreate", com.tencent.mm.wallet_core.c.b.getLastError());
    }
    while (true)
    {
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.aT(196649, String.valueOf(paramInt));
      g.RQ();
      g.RP().Ry().set(ac.a.xIK, com.tencent.mm.compatible.e.q.LK());
      g.RQ();
      g.RP().Ry().set(ac.a.xIL, paramString);
      AppMethodBeat.o(43402);
      return;
      label527: ab.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt fail");
      break;
      label538: bool = false;
      break label378;
      label544: ab.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens success!");
    }
  }

  public final void a(com.tencent.mm.wallet_core.c.d paramd, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43404);
    com.tencent.mm.wallet_core.c.b.dNJ().dNK();
    AppMethodBeat.o(43404);
  }

  public final int bgI()
  {
    return 46;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlinecreate";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.k
 * JD-Core Version:    0.6.2
 */