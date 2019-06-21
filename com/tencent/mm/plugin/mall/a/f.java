package com.tencent.mm.plugin.mall.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.a;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.protocal.protobuf.aly;
import com.tencent.mm.protocal.protobuf.alz;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private String okO;
  public ArrayList<MallFunction> okP;
  public ArrayList<MallNews> okQ;
  public ArrayList<a> okR;
  public SparseArray<String> okS;
  public int okT;

  public f(int paramInt1, String paramString, int paramInt2)
  {
    this(paramInt1, paramString, null, null, paramInt2);
  }

  private f(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(43099);
    this.okP = null;
    this.okQ = null;
    this.okR = null;
    this.okS = null;
    this.okT = 0;
    this.okT = paramInt1;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new aly();
    ((b.a)localObject1).fsK = new alz();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/getpayfunctionlist";
    ((b.a)localObject1).fsI = 495;
    ((b.a)localObject1).fsL = 227;
    ((b.a)localObject1).fsM = 1000000227;
    this.ehh = ((b.a)localObject1).acD();
    aly localaly = (aly)this.ehh.fsG.fsP;
    localaly.wqY = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject2;
    if (!bo.isNullOrNil(paramString2))
    {
      localObject2 = (MallNews)c.cQT().tDE.get(paramString2);
      if ((localObject2 != null) && (!bo.isNullOrNil(((MallNews)localObject2).cxb)))
      {
        localObject1 = new ArrayList();
        ((List)localObject1).add(((MallNews)localObject2).cxb);
      }
    }
    while ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      localObject2 = ((List)localObject1).iterator();
      localObject1 = "";
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          bts localbts = new bts();
          localbts.alV(str);
          localLinkedList.add(localbts);
          localObject1 = (String)localObject1 + "; + " + str;
          continue;
          localObject1 = null;
          break;
          localObject1 = c.cQT().cQU();
          break;
        }
      ab.d("MicroMsg.NetSceneGetPayFunctionList", "post with list : ".concat(String.valueOf(localObject1)));
    }
    localaly.wra = localLinkedList;
    localaly.wqZ = localLinkedList.size();
    if (bo.isNullOrNil(paramString3));
    for (localaly.ndT = String.format("tpa_country=%s", new Object[] { Integer.valueOf(paramInt1) }); ; localaly.ndT = String.format("%s&tpa_country=%s", new Object[] { paramString3, Integer.valueOf(paramInt1) }))
    {
      localaly.wrb = paramInt2;
      this.okO = paramString2;
      ab.d("MicroMsg.NetSceneGetPayFunctionList", "telephonyNetIso " + paramString1 + " ExtInfo: " + localaly.ndT);
      AppMethodBeat.o(43099);
      return;
    }
  }

  public f(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(paramInt, paramString1, paramString3, String.format("appid=%s&funcid=%s&url=%s", new Object[] { paramString2, paramString3, URLEncoder.encode(paramString4, "ISO-8859-1").toString() }), 0);
    AppMethodBeat.i(43098);
    AppMethodBeat.o(43098);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(43101);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43101);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43100);
    ab.i("MicroMsg.NetSceneGetPayFunctionList", "errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (alz)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      ab.i("MicroMsg.NetSceneGetPayFunctionList", "resp.PayFunctionList wallet_regionL " + this.okT + " " + paramArrayOfByte.wrc);
    }
    try
    {
      if (!bo.isNullOrNil(paramArrayOfByte.wrc))
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramArrayOfByte.wrc);
        paramq = ((JSONObject)localObject1).optString("pay_func_list");
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>(paramq);
        this.okP = com.tencent.mm.plugin.wallet_core.model.mall.b.F((JSONArray)localObject2);
        String str = ((JSONObject)localObject1).optString("global_activity_list");
        localObject2 = ((JSONObject)localObject1).optString("pay_banner_list");
        localObject1 = ((JSONObject)localObject1).optString("type_info_list");
        r.cPN().b(this.okT, paramq, str, (String)localObject2, (String)localObject1, paramArrayOfByte.wre);
        j.bMV().ola.clear();
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(43100);
      return;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionList", paramq, "", new Object[0]);
    }
  }

  public final int getType()
  {
    return 495;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.f
 * JD-Core Version:    0.6.2
 */