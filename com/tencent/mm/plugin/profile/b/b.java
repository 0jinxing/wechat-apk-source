package com.tencent.mm.plugin.profile.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.aqv;
import com.tencent.mm.protocal.protobuf.aqw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class b extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public String pkH;

  public b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(23284);
    this.pkH = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aqv();
    ((b.a)localObject).fsK = new aqw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getwburl";
    ((b.a)localObject).fsI = 205;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aqv)this.ehh.fsG.fsP;
    ((aqv)localObject).jBB = paramString2;
    aw.ZK();
    paramString2 = bo.nullAsNil((String)c.Ry().get(46, null));
    ((aqv)localObject).vHP = new SKBuiltinBuffer_t().setBuffer(bo.anf(paramString2));
    aw.ZK();
    String str = bo.nullAsNil((String)c.Ry().get(72, null));
    ((aqv)localObject).wlr = new SKBuiltinBuffer_t().setBuffer(bo.anf(str));
    ab.d("MicroMsg.NetSceneGetWeiboURL", "dkwt get weibo url with id=" + paramString1 + ", a2=" + paramString2 + " , newa2:" + str);
    AppMethodBeat.o(23284);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(23285);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(23285);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23286);
    ab.d("MicroMsg.NetSceneGetWeiboURL", "dkwt onGYNetEnd:[%d,%d] get weibo url result:[%s] ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), getURL() });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(23286);
  }

  public final int getType()
  {
    return 205;
  }

  public final String getURL()
  {
    return ((aqw)this.ehh.fsH.fsP).URL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.b.b
 * JD-Core Version:    0.6.2
 */