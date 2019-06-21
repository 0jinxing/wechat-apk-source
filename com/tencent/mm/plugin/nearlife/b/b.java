package com.tencent.mm.plugin.nearlife.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.axx;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.uv;
import com.tencent.mm.protocal.protobuf.uw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class b extends m
  implements k
{
  private com.tencent.mm.ai.b fsB;
  private f oRe;
  public String oRf;

  public b(String paramString1, String paramString2, String paramString3, axx paramaxx, int paramInt, LinkedList<bts> paramLinkedList, String paramString4)
  {
    AppMethodBeat.i(22924);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new uv();
    ((b.a)localObject).fsK = new uw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/createpoi";
    ((b.a)localObject).fsI = 650;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fsB = ((b.a)localObject).acD();
    localObject = bo.bc(paramString4, "");
    String str = bo.bc(null, "");
    paramString4 = (uv)this.fsB.fsG.fsP;
    paramString4.Name = paramString1;
    paramString4.wcl = paramString2;
    paramString4.wcn = paramaxx;
    paramString4.jBv = paramInt;
    if (paramLinkedList != null)
      paramString4.wco = paramLinkedList;
    paramString4.wcp = ((String)localObject);
    paramString4.wcq = str;
    paramString4.wcm = paramString3;
    ab.d("MicroMsg.NetSceneCreatePoi", "[req] name:%s, district:%s, Street: %s lat:%f, long:%f, count:%d, tel:%s, url:%s", new Object[] { paramString1, paramString2, paramString3, Float.valueOf(paramaxx.vRq), Float.valueOf(paramaxx.vRp), Integer.valueOf(paramInt), localObject, str });
    AppMethodBeat.o(22924);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(22925);
    this.oRe = paramf;
    int i = a(parame, this.fsB, this);
    AppMethodBeat.o(22925);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22926);
    ab.d("MicroMsg.NetSceneCreatePoi", "netId:%d, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (uw)this.fsB.fsH.fsP;
    if (this.fsB.fsH.vyl != 0)
    {
      this.oRe.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(22926);
    }
    while (true)
    {
      return;
      this.oRf = paramq.wcr;
      ab.d("MicroMsg.NetSceneCreatePoi", "poi:" + this.oRf);
      this.oRe.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(22926);
    }
  }

  public final int getType()
  {
    return 650;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.b.b
 * JD-Core Version:    0.6.2
 */