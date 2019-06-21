package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cgr;
import com.tencent.mm.protocal.protobuf.cgs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class h extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;

  public final void M(Map<String, String> paramMap)
  {
    if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
      paramMap.put("jsapi_reqkey", com.tencent.mm.pluginsdk.wallet.f.dlI());
    if (this.ehh == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).fsJ = new cgr();
      ((b.a)localObject1).fsK = new cgs();
      localObject2 = getUri();
      i = ZU();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).fsI = i;
      ((b.a)localObject1).fsL = 185;
      ((b.a)localObject1).fsM = 1000000185;
      this.ehh = ((b.a)localObject1).acD();
    }
    Object localObject2 = (cgr)this.ehh.fsG.fsP;
    ((cgr)localObject2).wxx = bgI();
    ((cgr)localObject2).wxy = 1;
    Object[] arrayOfObject = paramMap.keySet().toArray();
    Arrays.sort(arrayOfObject);
    Object localObject3 = new StringBuilder();
    int j = 0;
    Object localObject4;
    for (int i = 0; j < arrayOfObject.length; i = k)
    {
      localObject4 = arrayOfObject[j];
      localObject1 = (String)paramMap.get(localObject4);
      k = i;
      if (!bo.isNullOrNil((String)localObject1))
      {
        if (i != 0)
          ((StringBuilder)localObject3).append("&");
        ((StringBuilder)localObject3).append(localObject4);
        ((StringBuilder)localObject3).append("=");
        ((StringBuilder)localObject3).append((String)localObject1);
        k = 1;
      }
      j++;
    }
    localObject3 = TenpayUtil.signWith3Des(((StringBuilder)localObject3).toString());
    Object localObject1 = new StringBuilder();
    i = 0;
    int k = 0;
    if (k < arrayOfObject.length)
    {
      Object localObject5 = arrayOfObject[k];
      localObject4 = (String)paramMap.get(localObject5);
      if (bo.isNullOrNil((String)localObject4))
        break label415;
      if (i != 0)
        ((StringBuilder)localObject1).append("&");
      ((StringBuilder)localObject1).append(localObject5);
      ((StringBuilder)localObject1).append("=");
      ((StringBuilder)localObject1).append(com.tencent.mm.compatible.util.q.encode((String)localObject4));
      i = 1;
    }
    label415: 
    while (true)
    {
      k++;
      break;
      if (i != 0);
      for (paramMap = "&"; ; paramMap = "")
      {
        ((StringBuilder)localObject1).append(paramMap);
        ((StringBuilder)localObject1).append("WCPaySign");
        ((StringBuilder)localObject1).append("=");
        ((StringBuilder)localObject1).append((String)localObject3);
        paramMap = ((StringBuilder)localObject1).toString().getBytes();
        ((cgr)localObject2).wxz = new SKBuiltinBuffer_t().setBuffer(paramMap);
        return;
      }
    }
  }

  public int ZU()
  {
    return 385;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    this.ehi = paramf;
    return a(parame, this.ehh, this);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    ab.i("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + bgI() + ", errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    cgs localcgs = (cgs)((b)paramq).fsH.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0))
      if (localcgs.wxB == 0)
        paramq = aa.b(localcgs.wxA);
    label455: 
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramq);
        paramInt1 = localJSONObject.getInt("retcode");
        paramArrayOfByte = localcgs.wNf;
        paramq = paramArrayOfByte;
        if (bo.isNullOrNil(paramArrayOfByte))
          paramq = localJSONObject.optString("retmsg");
        i = localcgs.wNe;
        if ((paramInt1 == 0) && (i == 0))
        {
          a(paramInt1, paramq, localJSONObject);
          i = paramInt3;
          paramInt1 = paramInt2;
          if (paramInt1 != 0)
            ab.e("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + bgI() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
          this.ehi.onSceneEnd(paramInt1, i, paramString, this);
          ab.d("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + bgI() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
          return;
        }
        ab.i("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode tenpayErrType : ".concat(String.valueOf(i)));
        if (i != 0)
          break label455;
        i = -1000;
        ab.d("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode errMsg : ".concat(String.valueOf(paramq)));
        paramString = paramq;
        paramInt1 = 1000;
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneTenpayOfflineBase", paramString, "", new Object[0]);
        paramString = ah.getContext().getString(2131304763);
        i = 2;
        paramInt1 = 1000;
        continue;
      }
      paramString = localcgs.wxC;
      int i = 2;
      paramInt1 = 1000;
      continue;
      paramq = br.z(paramString, "e");
      paramInt1 = paramInt2;
      i = paramInt3;
      if (paramq != null)
      {
        ab.d("MicroMsg.NetSceneTenpayOfflineBase", "CDN error!");
        paramString = (String)paramq.get(".e.Content");
        paramInt1 = paramInt2;
        i = paramInt3;
      }
    }
  }

  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);

  public abstract int bgI();

  public final int getType()
  {
    return 385;
  }

  public String getUri()
  {
    return "/cgi-bin/micromsg-bin/tenpay";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.h
 * JD-Core Version:    0.6.2
 */