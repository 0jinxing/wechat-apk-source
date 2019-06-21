package com.tencent.mm.plugin.topstory.a.c;

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
import com.tencent.mm.protocal.protobuf.cvb;
import com.tencent.mm.protocal.protobuf.cvc;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;
  public String nQB;
  private long sAZ;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65503);
    this.sAZ = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 2582;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchwebcomm";
    ((b.a)localObject).fsJ = new cvb();
    ((b.a)localObject).fsK = new cvc();
    this.ehh = ((b.a)localObject).acD();
    localObject = (cvb)this.ehh.fsG.fsP;
    ((cvb)localObject).xra = paramString2;
    ((cvb)localObject).nQB = paramString1;
    this.nQB = paramString1;
    AppMethodBeat.o(65503);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(65504);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(65504);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65505);
    ab.i("MicroMsg.TopStory.NetSceneSearchWebComm", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(System.currentTimeMillis() - this.sAZ) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(65505);
  }

  public final cvc cFs()
  {
    return (cvc)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 2582;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.a
 * JD-Core Version:    0.6.2
 */