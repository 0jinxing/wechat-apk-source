package com.tencent.mm.plugin.luckymoney.model;

import android.content.Context;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.qq;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.atl;
import com.tencent.mm.protocal.protobuf.atm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.wallet_core.c.k;
import com.tencent.mm.wallet_core.c.u;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class z extends u
{
  b ehh;
  private f ehi;
  public k nYe;

  public final void M(Map<String, String> paramMap)
  {
    Object localObject1 = r.Yz();
    g.RQ();
    localObject1 = ((j)g.K(j.class)).XM().aoO((String)localObject1);
    if (localObject1 != null)
    {
      paramMap.put("province", ((ad)localObject1).dsj());
      paramMap.put("city", ((ad)localObject1).getCityCode());
    }
    if (this.ehh == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).fsJ = new atl();
      ((b.a)localObject1).fsK = new atm();
      ((b.a)localObject1).uri = bgF();
      ((b.a)localObject1).fsI = getType();
      ((b.a)localObject1).fsL = 0;
      ((b.a)localObject1).fsM = 0;
      this.ehh = ((b.a)localObject1).acD();
      this.ehh.ftb = true;
    }
    localObject1 = (atl)this.ehh.fsG.fsP;
    ((atl)localObject1).wxx = bgG();
    ((atl)localObject1).wxy = 1;
    Object[] arrayOfObject = paramMap.keySet().toArray();
    Arrays.sort(arrayOfObject);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int k;
    for (int j = 0; i < arrayOfObject.length; j = k)
    {
      Object localObject2 = arrayOfObject[i];
      String str = (String)paramMap.get(localObject2);
      k = j;
      if (!bo.isNullOrNil(str))
      {
        if (j != 0)
          localStringBuilder.append("&");
        localStringBuilder.append(localObject2);
        localStringBuilder.append("=");
        localStringBuilder.append(str);
        k = 1;
      }
      i++;
    }
    ab.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + ((atl)localObject1).wxx + ", req = " + localStringBuilder.toString());
    paramMap = localStringBuilder.toString().getBytes();
    ((atl)localObject1).wxz = new SKBuiltinBuffer_t().setBuffer(paramMap);
  }

  public final int a(e parame, f paramf)
  {
    this.ehi = paramf;
    return a(parame, this.ehh, this);
  }

  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);

  public final boolean bLD()
  {
    if (this.nYe == null);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final int bLE()
  {
    return bgG();
  }

  public abstract String bgF();

  public int bgG()
  {
    return -1;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    ab.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + bgG() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    paramq = (atm)((b)paramq).fsH.fsP;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i = paramq.wxB;
      String str = aa.b(paramq.wxA);
      if ((i == 0) && (!bo.isNullOrNil(str)))
      {
        i = paramq.cvG;
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(str);
          int j = localJSONObject.getInt("retcode");
          Object localObject = paramq.errorMsg;
          paramq = (q)localObject;
          if (bo.isNullOrNil((String)localObject))
            paramq = localJSONObject.optString("retmsg");
          this.nYe = k.aS(localJSONObject);
          if ((localJSONObject.has("showmess")) && (j != 268502454))
          {
            ab.i("MicroMsg.NetSceneLuckyMoneyBase", "has alert item");
            localObject = ao.a(null, localJSONObject);
            paramq = new com/tencent/mm/g/a/qq;
            paramq.<init>();
            paramq.cMN.cMO = ((com.tencent.mm.plugin.wallet_core.model.a)localObject);
            com.tencent.mm.sdk.b.a.xxA.m(paramq);
          }
          while (true)
          {
            ab.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + bgG() + ", tenpayErrType : " + i + ", resp = " + str);
            label282: if (paramInt1 != 0)
              ab.e("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + bgG() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
            this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
            return;
            if ((j != 0) || (i != 0))
              break;
            a(j, paramq, localJSONObject);
          }
        }
        catch (Exception paramString)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyBase", paramString, "", new Object[0]);
            paramString = ah.getContext().getString(2131304763);
            paramInt2 = 2;
            paramInt1 = 1000;
          }
        }
        if (i != 0)
          break label492;
      }
    }
    label492: for (paramInt1 = -1000; ; paramInt1 = i)
    {
      paramString = paramq;
      paramInt2 = paramInt1;
      paramInt1 = 1000;
      break;
      paramString = paramq.wxC;
      paramInt2 = 2;
      paramInt1 = 1000;
      break label282;
      paramString = br.z(paramString, "e");
      if (paramString != null)
      {
        ab.d("MicroMsg.NetSceneLuckyMoneyBase", "CDN error!");
        paramString = (String)paramString.get(".e.Content");
        break label282;
      }
      paramString = ah.getContext().getString(2131304763);
      break label282;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.z
 * JD-Core Version:    0.6.2
 */