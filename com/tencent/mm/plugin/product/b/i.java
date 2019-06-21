package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.amq;
import com.tencent.mm.protocal.protobuf.amr;
import com.tencent.mm.protocal.protobuf.xd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i extends m
  implements k
{
  private b ehh;
  private f ehi;
  public String mUrl;
  public LinkedList<xd> phm;

  public i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(43991);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new amq();
    ((b.a)localObject).fsK = new amr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getproductdiscount";
    ((b.a)localObject).fsI = 579;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (amq)this.ehh.fsG.fsP;
    ((amq)localObject).vRN = paramString1;
    this.mUrl = paramString2;
    ((amq)localObject).Url = paramString2;
    AppMethodBeat.o(43991);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43993);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43993);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43992);
    paramArrayOfByte = (amr)((b)paramq).fsH.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.vKp == 0))
    {
      ab.d("MicroMsg.NetSceneMallGetProductDiscount", "resp.ProductInfo " + paramArrayOfByte.wrq);
      try
      {
        paramq = new org/json/JSONObject;
        paramq.<init>(paramArrayOfByte.wrq);
        paramq = paramq.optJSONArray("discount_list");
        if (paramq != null)
        {
          Object localObject = new java/util/LinkedList;
          ((LinkedList)localObject).<init>();
          this.phm = ((LinkedList)localObject);
          int i = paramq.length();
          for (paramInt1 = 0; paramInt1 < i; paramInt1++)
          {
            localObject = paramq.getJSONObject(paramInt1);
            xd localxd = new com/tencent/mm/protocal/protobuf/xd;
            localxd.<init>();
            localxd.Title = ((JSONObject)localObject).getString("title");
            localxd.vQt = ((JSONObject)localObject).getInt("fee");
            this.phm.add(localxd);
          }
        }
      }
      catch (Exception paramq)
      {
      }
    }
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.vKp != 0)
      {
        paramInt1 = paramArrayOfByte.vKp;
        paramq = paramArrayOfByte.vKq;
      }
    }
    ab.d("MicroMsg.NetSceneMallGetProductDiscount", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.ehi.onSceneEnd(paramInt2, paramInt1, paramq, this);
    AppMethodBeat.o(43992);
  }

  public final int getType()
  {
    return 579;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.i
 * JD-Core Version:    0.6.2
 */