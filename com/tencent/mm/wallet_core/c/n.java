package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n extends m
{
  private int Afx;
  private n.a Afy;
  public boolean cNi;

  public n(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(49064);
    this.Afx = 0;
    this.cNi = true;
    this.Afy = null;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    this.Afx = 1;
    aY(localHashMap1);
    localHashMap1.put("type", com.tencent.mm.compatible.util.q.encode("1"));
    localHashMap1.put("true_name", com.tencent.mm.compatible.util.q.encode(paramString2));
    localHashMap1.put("id_no", com.tencent.mm.compatible.util.q.encode(paramString1));
    localHashMap1.put("id_type", com.tencent.mm.compatible.util.q.encode(String.valueOf(paramInt)));
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(49064);
  }

  public n(String paramString1, String paramString2, n.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(49065);
    this.Afx = 0;
    this.cNi = true;
    this.Afy = null;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    this.cNi = paramBoolean;
    this.Afx = 2;
    aY(localHashMap1);
    localHashMap1.put("type", com.tencent.mm.compatible.util.q.encode("2"));
    localHashMap1.put("crt_sms", com.tencent.mm.compatible.util.q.encode(paramString1));
    localHashMap1.put("reqkey", com.tencent.mm.compatible.util.q.encode(paramString2));
    this.Afy = parama;
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(49065);
  }

  public n(String paramString1, String paramString2, String paramString3, n.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(49066);
    this.Afx = 0;
    this.cNi = true;
    this.Afy = null;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    this.Afx = 4;
    this.Afy = parama;
    this.cNi = paramBoolean;
    aY(localHashMap1);
    localHashMap1.put("type", com.tencent.mm.compatible.util.q.encode("4"));
    localHashMap1.put("id_type", com.tencent.mm.compatible.util.q.encode(paramString1));
    localHashMap1.put("cre_tail", com.tencent.mm.compatible.util.q.encode(paramString2));
    localHashMap1.put("reqkey", com.tencent.mm.compatible.util.q.encode(paramString3));
    M(localHashMap1);
    ba(localHashMap2);
    AppMethodBeat.o(49066);
  }

  private static void aY(Map<String, String> paramMap)
  {
    int i = 1;
    AppMethodBeat.i(49063);
    g.RQ();
    g.RN();
    String str1 = p.getString(a.QF());
    Object localObject1 = com.tencent.mm.compatible.e.q.getDeviceID(ah.getContext());
    Object localObject2 = new byte[16];
    Object localObject3 = w.dNR().getBytes();
    if (localObject3 != null)
    {
      localObject4 = localObject3;
      if (localObject3.length > 0);
    }
    else
    {
      localObject4 = System.currentTimeMillis().getBytes();
    }
    int j = 0;
    int k = 0;
    int m;
    do
    {
      localObject2[k] = ((byte)localObject4[j]);
      m = k + 1;
      j++;
      k = j;
      if (j >= localObject4.length)
        k = 0;
      j = k;
      k = m;
    }
    while (m < 16);
    localObject3 = new String((byte[])localObject2);
    Object localObject4 = ag.ck(str1 + (String)localObject1);
    String str2 = ag.ck(str1 + (String)localObject4 + new String((byte[])localObject2));
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGendigitalcert", "salt " + new String((byte[])localObject2));
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGendigitalcert", "crt_csr uin: %s: devideid: %s crt: %s", new Object[] { str1, localObject1, str2 });
    localObject1 = b.dNJ();
    com.tencent.mm.wallet_core.b.dNA();
    localObject2 = com.tencent.mm.model.c.c.abi().ll("100369");
    if ((((com.tencent.mm.storage.c)localObject2).isValid()) && ("1".equals(((com.tencent.mm.storage.c)localObject2).dru().get("open"))));
    for (k = 1; ; k = 0)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.TenPaySdkAbTest", "isCertOpen2048 %s", new Object[] { Integer.valueOf(k) });
      if (k > 0)
        k = 1;
      while (true)
      {
        if (k != 0)
        {
          k = i;
          localObject2 = ((b)localObject1).eJ(str2, k);
        }
        try
        {
          paramMap.put("sn_salt", com.tencent.mm.compatible.util.q.encode((String)localObject3));
          paramMap.put("crt_csr", com.tencent.mm.compatible.util.q.encode((String)localObject2));
          paramMap.put("crt_device_id", localObject4);
          paramMap.put("device_os", com.tencent.mm.protocal.d.eSg);
          paramMap.put("device_name", com.tencent.mm.protocal.d.vxl);
          AppMethodBeat.o(49063);
          return;
          k = 0;
          continue;
          k = 0;
        }
        catch (Exception paramMap)
        {
          while (true)
            AppMethodBeat.o(49063);
        }
      }
    }
  }

  public final int ZU()
  {
    return 1580;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49067);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGendigitalcert", "errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt), paramString });
    try
    {
      paramString = paramJSONObject.optString("crt_crt");
      paramJSONObject = paramJSONObject.optString("crt_no");
      h.pYm.a(414L, 0L, 1L, true);
      boolean bool = b.dNJ().importCert(paramJSONObject, paramString);
      ab.ato(paramJSONObject);
      if (bool)
      {
        h.pYm.a(414L, 1L, 1L, true);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt success");
      }
      while (this.Afx == 1)
      {
        h.pYm.e(13731, new Object[] { Integer.valueOf(3) });
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGendigitalcert", "_crt_crt %s _crt_no %s", new Object[] { ag.ck(paramString), paramJSONObject });
        AppMethodBeat.o(49067);
        return;
        h.pYm.a(414L, 2L, 1L, true);
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt fail");
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.NetSceneGendigitalcert", paramString, "", new Object[0]);
        AppMethodBeat.o(49067);
        continue;
        if (this.Afx == 2)
          h.pYm.e(13731, new Object[] { Integer.valueOf(7) });
      }
    }
  }

  public final void a(d paramd, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49068);
    b.dNJ().dNK();
    if (paramd.errCode != 0)
    {
      if (this.Afx != 1)
        break label85;
      h.pYm.e(13731, new Object[] { Integer.valueOf(4) });
    }
    while (true)
    {
      if ((this.Afy != null) && ((!this.cNi) || (paramd.errCode == 0)))
        this.Afy.cRX();
      AppMethodBeat.o(49068);
      return;
      label85: if (this.Afx == 2)
        h.pYm.e(13731, new Object[] { Integer.valueOf(8) });
    }
  }

  public final boolean bXm()
  {
    return this.cNi;
  }

  public final int bgI()
  {
    return 1580;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.n
 * JD-Core Version:    0.6.2
 */