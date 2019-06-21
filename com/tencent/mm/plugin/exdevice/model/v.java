package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.bvt;
import com.tencent.mm.protocal.protobuf.bvu;
import com.tencent.mm.sdk.platformtools.ab;

public final class v extends m
  implements k
{
  public b ehh;
  private f ehi;

  public v(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(19344);
    this.ehi = null;
    this.ehh = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bvt();
    ((b.a)localObject).fsK = new bvu();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/searchwifiharddevice";
    ((b.a)localObject).fsI = 1270;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bvt)this.ehh.fsG.fsP;
    ((bvt)localObject).vLi = new asq();
    ((bvt)localObject).vLi.vIk = paramString1;
    ((bvt)localObject).vLi.jBE = paramString2;
    ((bvt)localObject).wWE = paramString3;
    AppMethodBeat.o(19344);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19346);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19346);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19345);
    ab.i("MicroMsg.exdevice.NetSceneSearchWiFiHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19345);
  }

  public final int getType()
  {
    return 1270;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.v
 * JD-Core Version:    0.6.2
 */