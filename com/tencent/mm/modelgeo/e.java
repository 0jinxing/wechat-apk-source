package com.tencent.mm.modelgeo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ady;
import com.tencent.mm.protocal.protobuf.adz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e extends m
  implements k
{
  private String cBF;
  public final b ehh;
  private f ehi;

  public e(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(78144);
    this.cBF = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ady();
    ((b.a)localObject).fsK = new adz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getaddress";
    ((b.a)localObject).fsI = 655;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ady)this.ehh.fsG.fsP;
    ((ady)localObject).vNI = paramDouble1;
    ((ady)localObject).vNH = paramDouble2;
    AppMethodBeat.o(78144);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78145);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78145);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78146);
    ab.d("MicroMsg.NetSceneGetAddress", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.cBF = ((adz)((b)paramq).fsH.fsP).wlX;
      ab.d("MicroMsg.NetSceneGetAddress", this.cBF);
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78146);
    }
    while (true)
    {
      return;
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78146);
    }
  }

  public final Addr agD()
  {
    Object localObject1 = null;
    int i = 0;
    AppMethodBeat.i(78147);
    if (bo.isNullOrNil(this.cBF))
      AppMethodBeat.o(78147);
    while (true)
    {
      return localObject1;
      Addr localAddr = new Addr();
      try
      {
        ab.d("MicroMsg.NetSceneGetAddress", "tofutest retJson: %s", new Object[] { this.cBF });
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(this.cBF);
        localAddr.fBq = ((JSONObject)localObject2).optString("request_id");
        localObject2 = ((JSONObject)localObject2).getJSONArray("results");
        localAddr.fBg = ((JSONArray)localObject2).getJSONObject(1).getString("address_name");
        Object localObject3 = ((JSONArray)localObject2).getJSONObject(0);
        localAddr.fBh = ((JSONObject)localObject3).getString("p");
        localAddr.fBi = ((JSONObject)localObject3).getString("c");
        localAddr.fBk = ((JSONObject)localObject3).getString("d");
        localAddr.fBl = "";
        localAddr.fBm = "";
        localAddr.fBn = "";
        while (true)
        {
          int j = ((JSONArray)localObject2).length();
          if (i < j)
            try
            {
              JSONObject localJSONObject = ((JSONArray)localObject2).getJSONObject(i);
              localObject3 = localJSONObject.getString("dtype");
              if ("ST".equals(localObject3))
                localAddr.fBm = localJSONObject.getString("name");
              while (true)
              {
                if ("FORMAT_ADDRESS".equals(localObject3))
                  localAddr.fBo = localJSONObject.getString("rough_address_name");
                label232: i++;
                break;
                if ("ST_NO".equals(localObject3))
                  localAddr.fBn = localJSONObject.getString("name");
              }
            }
            catch (Exception localException2)
            {
              break label232;
            }
        }
        if (!bo.isNullOrNil(localAddr.fBn))
          localAddr.fBm = "";
        AppMethodBeat.o(78147);
        localObject1 = localAddr;
      }
      catch (Exception localException1)
      {
        AppMethodBeat.o(78147);
      }
    }
  }

  public final int getType()
  {
    return 655;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.e
 * JD-Core Version:    0.6.2
 */