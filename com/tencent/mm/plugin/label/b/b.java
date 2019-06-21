package com.tencent.mm.plugin.label.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.vm;
import com.tencent.mm.protocal.protobuf.vn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public String nHx;

  public b(String paramString)
  {
    AppMethodBeat.i(22524);
    this.nHx = null;
    b.a locala = new b.a();
    locala.fsJ = new vm();
    locala.fsK = new vn();
    locala.uri = "/cgi-bin/micromsg-bin/delcontactlabel";
    locala.fsI = 636;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nHx = paramString;
    AppMethodBeat.o(22524);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(22526);
    this.ehi = paramf;
    vm localvm = (vm)this.ehh.fsG.fsP;
    localvm.wcD = this.nHx;
    int i;
    if ((this.nHx != null) && (!bo.isNullOrNil(this.nHx)))
    {
      localvm.wcD = this.nHx;
      localvm.wcD = this.nHx;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(22526);
    }
    while (true)
    {
      return i;
      ab.e("MicroMsg.Label.NetSceneDelContactLabel", "cpan[doScene] label id list is null.");
      paramf.onSceneEnd(3, -1, "[doScene]empty label is list.", this);
      i = 0;
      AppMethodBeat.o(22526);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22525);
    ab.d("MicroMsg.Label.NetSceneDelContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(22525);
  }

  public final int getType()
  {
    return 636;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.b.b
 * JD-Core Version:    0.6.2
 */