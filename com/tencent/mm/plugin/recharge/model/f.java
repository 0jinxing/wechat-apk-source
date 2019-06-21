package com.tencent.mm.plugin.recharge.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.protocal.protobuf.bip;
import com.tencent.mm.protocal.protobuf.biq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends m
  implements k
{
  public String aIm;
  public String appId;
  public int cmdId;
  public String desc;
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  public int errCode;
  public String gDV;
  public boolean pGg;
  public ArrayList<com.tencent.mm.plugin.wallet.a.q> pGh;
  public ArrayList<com.tencent.mm.plugin.wallet.a.q> pGi;
  public com.tencent.mm.plugin.wallet.a.e pGj;
  public com.tencent.mm.plugin.wallet.a.e pGk;
  public com.tencent.mm.plugin.wallet.a.e pGl;
  public com.tencent.mm.plugin.wallet.a.e pGm;
  public com.tencent.mm.plugin.wallet.a.e pGn;
  public p pGo;
  public List<a> pGp;
  public boolean pGq;

  public f(String paramString)
  {
    this(paramString, 0);
  }

  public f(String paramString, int paramInt)
  {
    AppMethodBeat.i(44202);
    this.gDV = "";
    this.appId = "";
    this.pGg = false;
    this.desc = "";
    this.errCode = 0;
    this.aIm = "";
    this.pGq = false;
    this.gDV = paramString;
    paramString = new b.a();
    paramString.fsJ = new bip();
    paramString.fsK = new biq();
    paramString.uri = "/cgi-bin/mmpay-bin/paychargeproxy";
    paramString.fsI = 1571;
    paramString.fsL = 0;
    paramString.fsM = 0;
    this.ehh = paramString.acD();
    paramString = (bip)this.ehh.fsG.fsP;
    paramString.wat = paramInt;
    this.cmdId = paramInt;
    ab.i("MicroMsg.NetScenePayChargeProxy", "cmdId: %d", new Object[] { Integer.valueOf(paramInt) });
    if (!bo.isNullOrNil(this.gDV))
    {
      ab.i("MicroMsg.NetScenePayChargeProxy", "hy: requesting phone num: %s", new Object[] { this.gDV });
      paramString.wMa = String.format("phone=%s", new Object[] { this.gDV });
    }
    AppMethodBeat.o(44202);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(44203);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44203);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44204);
    ab.i("MicroMsg.NetScenePayChargeProxy", "hy: NetScenePayChargeProxy end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.errCode = paramInt3;
    Object localObject1;
    Object localObject2;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (biq)((b)paramq).fsH.fsP;
      try
      {
        paramq = new org/json/JSONObject;
        paramq.<init>(paramArrayOfByte.wMb);
        ab.d("MicroMsg.NetScenePayChargeProxy", "tofutest: json: %s", new Object[] { paramq.toString() });
        this.appId = paramq.optString("appId");
        this.errCode = paramq.optInt("errCode", -1);
        this.aIm = paramq.optString("errMsg", ah.getContext().getString(2131304872));
        if (this.errCode < 0);
        for (this.pGg = true; ; this.pGg = false)
        {
          this.desc = paramq.optString("desc");
          paramArrayOfByte = paramq.optJSONArray("productList");
          if (paramArrayOfByte == null)
            break label555;
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          this.pGh = ((ArrayList)localObject1);
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          this.pGi = ((ArrayList)localObject1);
          for (paramInt1 = 0; ; paramInt1++)
          {
            if (paramInt1 >= paramArrayOfByte.length())
              break label565;
            localObject1 = paramArrayOfByte.getJSONObject(paramInt1);
            localObject2 = new com/tencent/mm/plugin/wallet/a/q;
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).<init>();
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).desc = ((JSONObject)localObject1).optString("desc", "");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).id = ((JSONObject)localObject1).optString("id", "");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).name = ((JSONObject)localObject1).optString("name", "");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).status = ((JSONObject)localObject1).optInt("status", 0);
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).url = ((JSONObject)localObject1).optString("url", "");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).type = ((JSONObject)localObject1).optInt("type");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).tnt = ((JSONObject)localObject1).optString("typeName");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).tnv = ((JSONObject)localObject1).optString("isColor", "0");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).tnw = ((JSONObject)localObject1).optString("colorCode", "0");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).tnx = ((JSONObject)localObject1).optInt("isReConfirm", 0);
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).tmN = ((JSONObject)localObject1).optString("weappID");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).fjD = ((JSONObject)localObject1).optString("weappPath");
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).tny = ((JSONObject)localObject1).optInt("isRecommend", 0);
            ((com.tencent.mm.plugin.wallet.a.q)localObject2).tnz = ((JSONObject)localObject1).optString("recommendId", "");
            if (((com.tencent.mm.plugin.wallet.a.q)localObject2).type != 1)
              break;
            this.pGh.add(localObject2);
          }
        }
      }
      catch (Exception paramq)
      {
        ab.e("MicroMsg.NetScenePayChargeProxy", "hy: exception occurred when parsing json: %s", new Object[] { paramq.toString() });
        this.pGg = true;
        this.aIm = ah.getContext().getString(2131304872);
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(44204);
      return;
      ((com.tencent.mm.plugin.wallet.a.q)localObject2).tnu = ((JSONObject)localObject1).optString("productAttr");
      this.pGi.add(localObject2);
      break;
      label555: this.pGh = null;
      this.pGi = null;
      label565: Object localObject3 = paramq.optJSONObject("weSim");
      label641: Object localObject4;
      if (localObject3 != null)
      {
        paramArrayOfByte = ((JSONObject)localObject3).optString("url");
        localObject1 = ((JSONObject)localObject3).optString("name");
        localObject2 = ((JSONObject)localObject3).optString("weappID");
        localObject3 = ((JSONObject)localObject3).optString("weappPath");
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.w("MicroMsg.NetScenePayChargeProxy", "tf: weSim is missing");
          this.pGm = null;
        }
      }
      else
      {
        localObject3 = paramq.optJSONObject("wxRemind");
        if (localObject3 != null)
        {
          paramArrayOfByte = ((JSONObject)localObject3).optString("url");
          localObject2 = ((JSONObject)localObject3).optString("name");
          localObject1 = ((JSONObject)localObject3).optString("weappID");
          localObject4 = ((JSONObject)localObject3).optString("weappPath");
          if (!bo.isNullOrNil((String)localObject2))
            break label1174;
          ab.w("MicroMsg.NetScenePayChargeProxy", "hy: remind unicom unnecessary element missing");
        }
        this.pGj = null;
        label717: localObject3 = paramq.optJSONObject("wxCard");
        if (localObject3 != null)
        {
          localObject2 = ((JSONObject)localObject3).optString("url");
          localObject1 = ((JSONObject)localObject3).optString("name");
          paramArrayOfByte = ((JSONObject)localObject3).optString("weappID");
          localObject3 = ((JSONObject)localObject3).optString("weappPath");
          if (!bo.isNullOrNil((String)localObject1))
            break label1229;
          ab.w("MicroMsg.NetScenePayChargeProxy", "hy: phone card necessary element missing");
        }
        this.pGk = null;
        label793: localObject3 = paramq.optJSONObject("wxWt");
        if (localObject3 != null)
        {
          localObject1 = ((JSONObject)localObject3).optString("url");
          localObject2 = ((JSONObject)localObject3).optString("name");
          paramArrayOfByte = ((JSONObject)localObject3).optString("weappID");
          localObject3 = ((JSONObject)localObject3).optString("weappPath");
          if (!bo.isNullOrNil((String)localObject2))
            break label1284;
          ab.w("MicroMsg.NetScenePayChargeProxy", "hy: phone hall necessary element missing");
        }
        this.pGl = null;
        label869: paramArrayOfByte = paramq.optJSONObject("banner");
        if (paramArrayOfByte == null)
          break label1339;
        localObject1 = new com/tencent/mm/plugin/wallet/a/p;
        ((p)localObject1).<init>();
        this.pGo = ((p)localObject1);
        this.pGo.id = paramArrayOfByte.getInt("id");
        this.pGo.name = paramArrayOfByte.optString("name");
        this.pGo.url = paramArrayOfByte.optString("url");
        this.pGo.tmN = paramArrayOfByte.optString("weappID");
        this.pGo.fjD = paramArrayOfByte.optString("weappPath");
        label974: localObject3 = paramq.optJSONObject("headEnter");
        if (localObject3 != null)
        {
          localObject1 = ((JSONObject)localObject3).optString("name");
          localObject2 = ((JSONObject)localObject3).optString("url");
          paramArrayOfByte = ((JSONObject)localObject3).optString("weappID");
          localObject4 = ((JSONObject)localObject3).optString("weappPath");
          if (!bo.isNullOrNil((String)localObject1))
            break label1347;
          ab.w("MicroMsg.NetScenePayChargeProxy", "tf: headEnter is missing");
        }
        this.pGn = null;
      }
      while (true)
      {
        paramq = paramq.optJSONArray("numberList");
        if (paramq == null)
          break label1534;
        if (bo.isNullOrNil(this.gDV))
          this.pGq = true;
        if (paramq.length() > 0)
          break label1402;
        ab.w("MicroMsg.NetScenePayChargeProxy", "number length is short! %s", new Object[] { Integer.valueOf(paramq.length()) });
        this.pGp = null;
        break;
        localObject4 = new com/tencent/mm/plugin/wallet/a/e;
        ((com.tencent.mm.plugin.wallet.a.e)localObject4).<init>();
        this.pGm = ((com.tencent.mm.plugin.wallet.a.e)localObject4);
        this.pGm.url = paramArrayOfByte;
        this.pGm.name = ((String)localObject1);
        this.pGm.tmN = ((String)localObject2);
        this.pGm.fjD = ((String)localObject3);
        break label641;
        label1174: localObject3 = new com/tencent/mm/plugin/wallet/a/e;
        ((com.tencent.mm.plugin.wallet.a.e)localObject3).<init>();
        this.pGj = ((com.tencent.mm.plugin.wallet.a.e)localObject3);
        this.pGj.url = paramArrayOfByte;
        this.pGj.name = ((String)localObject2);
        this.pGj.tmN = ((String)localObject1);
        this.pGj.fjD = ((String)localObject4);
        break label717;
        label1229: localObject4 = new com/tencent/mm/plugin/wallet/a/e;
        ((com.tencent.mm.plugin.wallet.a.e)localObject4).<init>();
        this.pGk = ((com.tencent.mm.plugin.wallet.a.e)localObject4);
        this.pGk.url = ((String)localObject2);
        this.pGk.name = ((String)localObject1);
        this.pGk.tmN = paramArrayOfByte;
        this.pGk.fjD = ((String)localObject3);
        break label793;
        label1284: localObject4 = new com/tencent/mm/plugin/wallet/a/e;
        ((com.tencent.mm.plugin.wallet.a.e)localObject4).<init>();
        this.pGl = ((com.tencent.mm.plugin.wallet.a.e)localObject4);
        this.pGl.url = ((String)localObject1);
        this.pGl.name = ((String)localObject2);
        this.pGl.tmN = paramArrayOfByte;
        this.pGl.fjD = ((String)localObject3);
        break label869;
        label1339: this.pGo = null;
        break label974;
        label1347: localObject3 = new com/tencent/mm/plugin/wallet/a/e;
        ((com.tencent.mm.plugin.wallet.a.e)localObject3).<init>();
        this.pGn = ((com.tencent.mm.plugin.wallet.a.e)localObject3);
        this.pGn.name = ((String)localObject1);
        this.pGn.url = ((String)localObject2);
        this.pGn.tmN = paramArrayOfByte;
        this.pGn.fjD = ((String)localObject4);
      }
      label1402: paramArrayOfByte = new java/util/ArrayList;
      paramArrayOfByte.<init>();
      this.pGp = paramArrayOfByte;
      for (paramInt1 = 0; paramInt1 < paramq.length(); paramInt1++)
      {
        localObject1 = paramq.optJSONObject(paramInt1);
        if (localObject1 != null)
        {
          paramArrayOfByte = ((JSONObject)localObject1).optString("number");
          localObject2 = ((JSONObject)localObject1).optString("desc");
          if (!bo.isNullOrNil(paramArrayOfByte))
          {
            localObject1 = new com/tencent/mm/plugin/recharge/model/a;
            ((a)localObject1).<init>(paramArrayOfByte, "", (String)localObject2, 2);
            this.pGp.add(localObject1);
          }
        }
      }
      ab.i("MicroMsg.NetScenePayChargeProxy", "number list: %s", new Object[] { Integer.valueOf(this.pGp.size()) });
      continue;
      label1534: this.pGp = null;
      ab.w("MicroMsg.NetScenePayChargeProxy", "empty numberList");
      continue;
      this.pGg = true;
      paramq = paramString;
      if (bo.isNullOrNil(paramString))
        paramq = ah.getContext().getString(2131304763);
      this.aIm = paramq;
      paramString = paramq;
    }
  }

  public final int getType()
  {
    return 1571;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.f
 * JD-Core Version:    0.6.2
 */