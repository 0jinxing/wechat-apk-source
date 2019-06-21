package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.protocal.protobuf.cvf;
import com.tencent.mm.protocal.protobuf.cvj;
import com.tencent.mm.protocal.protobuf.cvk;
import com.tencent.mm.protocal.protobuf.cxo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.LinkedList;
import org.json.JSONArray;

public final class e extends com.tencent.mm.plugin.websearch.api.b
  implements k
{
  private f ehi;
  private com.tencent.mm.ai.b fAT;
  s fpL;
  private cvk ufJ;

  public e(s params)
  {
    AppMethodBeat.i(5718);
    this.fpL = params;
    this.Kg = params.ctj;
    this.gOW = params.scene;
    this.tZt = params.cIv;
    Object localObject1;
    int i;
    if (!bo.isNullOrNil(params.ctj))
    {
      ab.i("MicroMsg.FTS.NetSceneWebSuggest", "Constructors: query=%s", new Object[] { params.ctj });
      localObject1 = new b.a();
      if ((params.scene == 201) || (params.tZI == 1))
        i = 1;
    }
    while (true)
    {
      if ((i != 0) && (r.aNV()))
      {
        ((b.a)localObject1).fsI = 1747;
        ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_weappsuggestion";
        ((b.a)localObject1).fsJ = new cvj();
        ((b.a)localObject1).fsK = new cvk();
        this.fAT = ((b.a)localObject1).acD();
        localObject1 = (cvj)this.fAT.fsG.fsP;
        ((cvj)localObject1).wkD = params.ctj;
        ((cvj)localObject1).vQd = params.businessType;
        ((cvj)localObject1).wCu = aa.HV(0);
        ((cvj)localObject1).wUr = params.tZw;
        ((cvj)localObject1).wDI = aa.abJ();
        ((cvj)localObject1).Scene = params.scene;
        ((cvj)localObject1).wCy = params.cvF;
        if (params.tZK == null);
      }
      try
      {
        Object localObject2 = new com/tencent/mm/bt/b;
        ((com.tencent.mm.bt.b)localObject2).<init>(params.tZK.toByteArray());
        ((cvj)localObject1).wCz = ((com.tencent.mm.bt.b)localObject2);
        label248: if (params.tZJ != null);
        try
        {
          localObject2 = new com/tencent/mm/bt/b;
          ((com.tencent.mm.bt.b)localObject2).<init>(params.tZJ.toByteArray());
          ((cvj)localObject1).wCA = ((com.tencent.mm.bt.b)localObject2);
          try
          {
            label278: localObject2 = new org/json/JSONArray;
            ((JSONArray)localObject2).<init>(params.tZB);
            Object localObject3 = new java/util/LinkedList;
            ((LinkedList)localObject3).<init>();
            ((cvj)localObject1).xrr = ((LinkedList)localObject3);
            i = 0;
            while (true)
              if (i < ((JSONArray)localObject2).length())
              {
                localObject3 = URLDecoder.decode(((JSONArray)localObject2).getString(i), "UTF-8");
                ((cvj)localObject1).xrr.add(localObject3);
                i++;
                continue;
                i = 0;
                break;
                ((b.a)localObject1).fsI = 1161;
                ((b.a)localObject1).uri = "/cgi-bin/mmsearch-bin/searchsuggestion";
              }
          }
          catch (Exception localException1)
          {
            ab.printErrStackTrace("MicroMsg.FTS.NetSceneWebSuggest", localException1, "decode json error", new Object[0]);
            i = params.businessType;
            if (((cvj)localObject1).wDI == null)
              break label473;
          }
          boolean bool = true;
          ab.i("MicroMsg.FTS.NetSceneWebSuggest", "businessTypeList is %d | contains location = %b | scene=%d | businessType=%d | isHomePage=%b | webViewId=%d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(params.scene), Integer.valueOf(params.businessType), Integer.valueOf(params.tZw), Integer.valueOf(params.cIv) });
          AppMethodBeat.o(5718);
          while (true)
          {
            return;
            label473: bool = false;
            break;
            ab.e("MicroMsg.FTS.NetSceneWebSuggest", "keyword is unavailable");
            AppMethodBeat.o(5718);
          }
        }
        catch (IOException localIOException)
        {
          break label278;
        }
      }
      catch (Exception localException2)
      {
        break label248;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(5720);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(5720);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(5719);
    ab.i("MicroMsg.FTS.NetSceneWebSuggest", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(5719);
    }
    while (true)
    {
      return;
      this.ufJ = ((cvk)this.fAT.fsH.fsP);
      if (this.ufJ != null)
        ab.v("MicroMsg.FTS.NetSceneWebSuggest", "return data\n%s", new Object[] { this.ufJ.vOy });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(5719);
    }
  }

  public final String abH()
  {
    if (this.ufJ != null);
    for (String str = this.ufJ.vOy; ; str = "")
      return str;
  }

  public final int getType()
  {
    return 1161;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.e
 * JD-Core Version:    0.6.2
 */