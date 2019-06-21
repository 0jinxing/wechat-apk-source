package com.tencent.mm.wallet_core.b.a;

import android.content.Context;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.atl;
import com.tencent.mm.protocal.protobuf.atm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.wallet_core.c.u;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class a extends u
{
  private b ehh;
  private f ehi;

  public final void M(Map<String, String> paramMap)
  {
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
    Object localObject1 = (atl)this.ehh.fsG.fsP;
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
    ab.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + ((atl)localObject1).wxx + ", req = " + localStringBuilder.toString());
    paramMap = localStringBuilder.toString().getBytes();
    ((atl)localObject1).wxz = new SKBuiltinBuffer_t().setBuffer(paramMap);
  }

  public final int a(e parame, f paramf)
  {
    this.ehi = paramf;
    return a(parame, this.ehh, this);
  }

  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);

  public abstract String bgF();

  public abstract int bgG();

  public boolean bgH()
  {
    return false;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    ab.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + bgG() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString + " " + getType());
    atm localatm = (atm)((b)paramq).fsH.fsP;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i = localatm.wxB;
      paramq = aa.b(localatm.wxA);
      if ((i == 0) && (!bo.isNullOrNil(paramq)))
        i = localatm.cvG;
    }
    while (true)
    {
      int j;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramq);
        j = localJSONObject.getInt("retcode");
        String str = localJSONObject.optString("retmsg");
        paramq = str;
        if (bo.isNullOrNil(str))
          paramq = localatm.errorMsg;
        if (((j == 0) && (i == 0)) || (bgH()))
        {
          a(j, paramq, localJSONObject);
          if (paramInt1 != 0)
            ab.e("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + bgG() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
          this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
          return;
        }
        if (i != 0)
          break label387;
        paramInt1 = -1000;
        paramString = paramq;
        paramInt2 = paramInt1;
        paramInt1 = 1000;
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MiroMsg.NetSceneTenpayH5TransferBase", paramString, "", new Object[0]);
        i = 2;
        j = 1000;
      }
      do
      {
        paramString = ah.getContext().getString(2131304763);
        paramInt1 = j;
        paramInt2 = i;
        break;
        paramString = localatm.wxC;
        paramInt2 = 2;
        paramInt1 = 1000;
        break;
        paramString = br.z(paramString, "e");
        j = paramInt1;
        i = paramInt2;
      }
      while (paramString == null);
      ab.d("MiroMsg.NetSceneTenpayH5TransferBase", "CDN error!");
      paramString = (String)paramString.get(".e.Content");
      continue;
      label387: paramInt1 = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.b.a.a
 * JD-Core Version:    0.6.2
 */