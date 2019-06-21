package com.tencent.mm.plugin.recharge.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ama;
import com.tencent.mm.protocal.protobuf.amb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public String pFP;
  public ArrayList<MallRechargeProduct> pGb;
  public String pGc;
  public String pGd;
  public String pGe;
  public String pGf;

  public e(String paramString)
  {
    AppMethodBeat.i(44199);
    this.pGb = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ama();
    ((b.a)localObject).fsK = new amb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getpayfunctionproductlist";
    ((b.a)localObject).fsI = 496;
    ((b.a)localObject).fsL = 228;
    ((b.a)localObject).fsM = 1000000228;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ama)this.ehh.fsG.fsP;
    this.pFP = paramString;
    ((ama)localObject).wjV = paramString;
    AppMethodBeat.o(44199);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(44201);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44201);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44200);
    ab.d("MicroMsg.NetSceneGetPayFunctionProductList", "errType " + paramInt2 + ", errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (amb)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      paramArrayOfByte = paramq.wpG;
      ab.d("MicroMsg.NetSceneGetPayFunctionProductList", "resp.ProductList ".concat(String.valueOf(paramArrayOfByte)));
      if (bo.isNullOrNil(paramArrayOfByte));
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramArrayOfByte);
      this.pGb = b.a(this.pFP, localJSONObject.getJSONArray("pay_product_list"));
      if (bo.isNullOrNil(paramq.wrf));
    }
    catch (JSONException paramArrayOfByte)
    {
      try
      {
        paramArrayOfByte = new org/json/JSONObject;
        paramArrayOfByte.<init>(paramq.wrf);
        this.pGc = paramArrayOfByte.optString("balance_link");
        this.pGe = paramArrayOfByte.optString("recharge_link");
        this.pGd = paramArrayOfByte.optString("balance_wording");
        this.pGf = paramArrayOfByte.optString("recharge_wording");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(44200);
        return;
        paramArrayOfByte = paramArrayOfByte;
        ab.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", paramArrayOfByte, "", new Object[0]);
      }
      catch (JSONException paramq)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", paramq, "", new Object[0]);
      }
    }
  }

  public final int getType()
  {
    return 496;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.e
 * JD-Core Version:    0.6.2
 */