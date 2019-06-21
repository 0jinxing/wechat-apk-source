package com.tencent.mm.plugin.profile.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.alo;
import com.tencent.mm.protocal.protobuf.alp;
import com.tencent.mm.protocal.protobuf.am;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  public String aIm;
  public final b ehh;
  private f ehi;
  public alp pkG;

  public a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(23281);
    ab.i("MicroMsg.NetSceneGetOpenUrl", "NetSceneGetOpenUrl username:%s ticket:%s climsgid:%s content:%s ", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    Object localObject = new b.a();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getopenurl";
    ((b.a)localObject).fsI = 913;
    ((b.a)localObject).fsJ = new alo();
    ((b.a)localObject).fsK = new alp();
    this.ehh = ((b.a)localObject).acD();
    localObject = (alo)this.ehh.fsG.fsP;
    ((alo)localObject).scene = 1;
    am localam = new am();
    localam.username = paramString1;
    localam.cxb = paramString2;
    localam.pkI = paramString3;
    localam.content = paramString4;
    ((alo)localObject).wqQ = localam;
    AppMethodBeat.o(23281);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(23282);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(23282);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23283);
    ab.d("MicroMsg.NetSceneGetOpenUrl", "onGYNetEnd:[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    this.aIm = paramString;
    AppMethodBeat.o(23283);
  }

  public final int getType()
  {
    return 913;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.b.a
 * JD-Core Version:    0.6.2
 */