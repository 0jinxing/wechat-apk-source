package com.tencent.mm.plugin.recharge.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.protocal.protobuf.akd;
import com.tencent.mm.protocal.protobuf.ake;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends m
  implements k
{
  public com.tencent.mm.ai.b ehh;
  private f ehi;
  public int fmR;
  public String gyD;
  public String pFP;
  public String pFQ;
  public MallRechargeProduct pFY;
  public List<MallRechargeProduct> pFZ;
  public String pGa;

  public d(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(44196);
    this.pFY = null;
    this.pFZ = null;
    this.pFQ = null;
    this.pFP = paramString1;
    this.fmR = paramInt;
    this.gyD = paramString5;
    this.pGa = paramString2;
    paramString5 = new b.a();
    paramString5.fsJ = new akd();
    paramString5.fsK = new ake();
    paramString5.uri = "/cgi-bin/micromsg-bin/getlatestpayproductinfo";
    paramString5.fsI = 497;
    paramString5.fsL = 229;
    paramString5.fsM = 1000000229;
    this.ehh = paramString5.acD();
    paramString5 = (akd)this.ehh.fsG.fsP;
    paramString5.wjV = paramString1;
    paramString5.wjW = paramString3;
    paramString5.wpE = paramString2;
    paramString5.wjX = paramString4;
    paramString5.wdB = c.cQT().acH(paramString1);
    ab.d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("funcId:%s, appId:%s, productId:%s, remark:%s", new Object[] { paramString1, paramString3, paramString2, paramString4 }));
    AppMethodBeat.o(44196);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44198);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44198);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44197);
    ab.d("MicroMsg.NetSceneGetLatestPayProductInfo", "errCode " + paramInt3 + ", errMsg " + paramString);
    paramArrayOfByte = (ake)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    ab.d("MicroMsg.NetSceneGetLatestPayProductInfo", "resp.OurterRemark " + paramArrayOfByte.wka);
    paramq = paramArrayOfByte.wka;
    this.pFQ = "";
    Object localObject;
    if (!bo.isNullOrNil(paramq))
    {
      localObject = paramq.split("&");
      if ((localObject != null) && (localObject.length > 0))
      {
        paramInt1 = 1;
        int i = 0;
        if (i < localObject.length)
        {
          paramq = localObject[i].split("=");
          int j = paramInt1;
          if (paramq.length == 2)
          {
            if (paramInt1 != 0)
              break label223;
            this.pFQ += " ";
          }
          while (true)
          {
            this.pFQ += paramq[1];
            j = paramInt1;
            i++;
            paramInt1 = j;
            break;
            label223: paramInt1 = 0;
          }
        }
      }
    }
    if (!bo.isNullOrNil(paramArrayOfByte.wpG));
    try
    {
      paramq = new org/json/JSONObject;
      paramq.<init>(paramArrayOfByte.wpG);
      this.pFZ = b.a(this.pFP, paramq.optJSONArray("product_info"));
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        localObject = paramArrayOfByte.wpF;
        ab.d("MicroMsg.NetSceneGetLatestPayProductInfo", "resp.Product ".concat(String.valueOf(localObject)));
        if (bo.isNullOrNil((String)localObject));
      }
    }
    catch (JSONException paramq)
    {
      try
      {
        paramq = this.pFP;
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>((String)localObject);
        this.pFY = b.e(paramq, localJSONObject);
        this.pFY.pFQ = this.pFQ;
        ab.d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("OutErrCode : %d ,OutErrMsg : %s , WxErrCode : %d , WxErrMsg : %s", new Object[] { Integer.valueOf(paramArrayOfByte.wjY), paramArrayOfByte.wjZ, Integer.valueOf(paramArrayOfByte.wkb), paramArrayOfByte.wkc }));
        paramInt1 = paramInt3;
        if (paramInt3 == 0)
        {
          if (paramArrayOfByte.wkb != 0)
            paramInt1 = paramArrayOfByte.wkb;
        }
        else
        {
          paramq = paramString;
          if (bo.isNullOrNil(paramString))
          {
            if (bo.isNullOrNil(paramArrayOfByte.wkc))
              break label517;
            paramq = paramArrayOfByte.wkc;
          }
          this.ehi.onSceneEnd(paramInt2, paramInt1, paramq, this);
          AppMethodBeat.o(44197);
          return;
          paramq = paramq;
          ab.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", paramq, "", new Object[0]);
        }
      }
      catch (JSONException paramq)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", paramq, "", new Object[0]);
          continue;
          paramInt1 = paramArrayOfByte.wjY;
          continue;
          label517: paramq = paramArrayOfByte.wjZ;
        }
      }
    }
  }

  public final int getType()
  {
    return 497;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.d
 * JD-Core Version:    0.6.2
 */