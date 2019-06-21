package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.protocal.protobuf.axy;
import com.tencent.mm.protocal.protobuf.azw;
import com.tencent.mm.protocal.protobuf.cml;
import com.tencent.mm.protocal.protobuf.css;
import com.tencent.mm.protocal.protobuf.cst;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends m
  implements k
{
  public int cIv;
  com.tencent.mm.ai.b ehh;
  private f ehi;
  private int ufH;
  public b.g ufI;

  public c(Map<String, Object> paramMap, int paramInt)
  {
    AppMethodBeat.i(5711);
    this.cIv = -1;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new css();
    ((b.a)localObject1).fsK = new cst();
    ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/wxaapp/weappsearchguide";
    ((b.a)localObject1).fsI = 1866;
    this.ehh = ((b.a)localObject1).acD();
    this.ufH = paramInt;
    Object localObject2 = aa.abJ();
    localObject1 = (css)this.ehh.fsG.fsP;
    if (localObject2 != null)
    {
      ((css)localObject1).xpX = ((axy)localObject2).vRq;
      ((css)localObject1).xpY = ((axy)localObject2).vRp;
    }
    ((css)localObject1).xpZ = aa.bVP();
    ((css)localObject1).tZU = r.aLE();
    ((css)localObject1).cvF = aa.t(paramMap, "statSessionId");
    ((css)localObject1).scene = aa.d(paramMap, "scene", 0);
    paramMap = aa.t(paramMap, "extReqParams");
    if (!bo.isNullOrNil(paramMap))
      try
      {
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>(paramMap);
        Object localObject3 = new java/util/LinkedList;
        ((LinkedList)localObject3).<init>();
        ((css)localObject1).xqa = ((LinkedList)localObject3);
        for (paramInt = 0; paramInt < ((JSONArray)localObject2).length(); paramInt++)
        {
          JSONObject localJSONObject = ((JSONArray)localObject2).getJSONObject(paramInt);
          localObject3 = new com/tencent/mm/protocal/protobuf/cml;
          ((cml)localObject3).<init>();
          ((cml)localObject3).key = localJSONObject.optString("key", "");
          ((cml)localObject3).waD = localJSONObject.optLong("uintValue", 0L);
          ((cml)localObject3).waE = localJSONObject.optString("textValue", "");
          ((css)localObject1).xqa.push(localObject3);
        }
      }
      catch (Exception localException)
      {
      }
    ab.i("MicroMsg.NetSceneWeAppSearchGuide", "weappsearchguide req, version = %d, sessionId = %s, scene = %d, extParam = %s", new Object[] { Integer.valueOf(((css)localObject1).tZU), ((css)localObject1).cvF, Integer.valueOf(((css)localObject1).scene), paramMap });
    AppMethodBeat.o(5711);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(5712);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(5712);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(5713);
    ab.i("MicroMsg.NetSceneWeAppSearchGuide", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ufI = new b.g((cst)this.ehh.fsH.fsP, this.ufH);
    b.g localg = this.ufI;
    paramArrayOfByte = new azw();
    paramArrayOfByte.Scene = localg.scene;
    paramArrayOfByte.vOy = localg.cBF;
    paramArrayOfByte.wDF = localg.interval;
    paramArrayOfByte.wDE = localg.ufA;
    paramArrayOfByte.wDG = localg.ufH;
    paramq = null;
    try
    {
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      paramq = paramArrayOfByte;
      label143: if (paramq != null)
      {
        paramArrayOfByte = new File(com.tencent.mm.plugin.record.b.XZ(), b.g.Iv(localg.scene));
        if (!paramArrayOfByte.getParentFile().exists())
          paramArrayOfByte.getParentFile().mkdirs();
        if (paramArrayOfByte.exists())
          paramArrayOfByte.delete();
        com.tencent.mm.a.e.b(paramArrayOfByte.getAbsolutePath(), paramq, paramq.length);
        ab.i("MicroMsg.FTS.FTSWebViewLogic", "SearchGuideCacheObj saved, scene:%d", new Object[] { Integer.valueOf(localg.scene) });
      }
      while (true)
      {
        if (this.ehi != null)
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(5713);
        return;
        ab.w("MicroMsg.FTS.FTSWebViewLogic", "SearchGuideCacheObj toBytes fail, scene:%d!", new Object[] { Integer.valueOf(localg.scene) });
      }
    }
    catch (IOException paramArrayOfByte)
    {
      break label143;
    }
  }

  public final int getType()
  {
    return this.ehh.fsI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.c
 * JD-Core Version:    0.6.2
 */