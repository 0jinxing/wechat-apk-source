package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.azp;
import com.tencent.mm.protocal.protobuf.azq;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  public b ehh;
  private f ehi;

  public d(String paramString)
  {
    AppMethodBeat.i(13833);
    b.a locala = new b.a();
    locala.fsJ = new azp();
    locala.fsK = new azq();
    locala.uri = "/cgi-bin/mmbiz-bin/usrmsg/getallrecvtmpmsgoption";
    locala.fsI = 1031;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((azp)this.ehh.fsG.fsP).wxX = paramString;
    AppMethodBeat.o(13833);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(13835);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13835);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13834);
    ab.d("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13834);
  }

  public final int getType()
  {
    return 1031;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.d
 * JD-Core Version:    0.6.2
 */