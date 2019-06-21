package com.tencent.mm.plugin.label.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.axj;
import com.tencent.mm.protocal.protobuf.cjp;
import com.tencent.mm.protocal.protobuf.cjq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private axj nHz;

  public e(int paramInt, String paramString)
  {
    AppMethodBeat.i(22533);
    this.nHz = null;
    b.a locala = new b.a();
    locala.fsJ = new cjp();
    locala.fsK = new cjq();
    locala.uri = "/cgi-bin/micromsg-bin/updatecontactlabel";
    locala.fsI = 637;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    if ((paramInt >= 0) && (!bo.isNullOrNil(paramString)))
    {
      this.nHz = new axj();
      this.nHz.wBr = paramInt;
      this.nHz.wBq = paramString;
    }
    AppMethodBeat.o(22533);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(22535);
    this.ehi = paramf;
    cjp localcjp = (cjp)this.ehh.fsG.fsP;
    int i;
    if (this.nHz != null)
    {
      localcjp.xii = this.nHz;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(22535);
    }
    while (true)
    {
      return i;
      ab.e("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[doScene] label pair is null.");
      paramf.onSceneEnd(3, -1, "[doScene]empty label pair.", this);
      i = 0;
      AppMethodBeat.o(22535);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22534);
    ab.d("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(22534);
  }

  public final int getType()
  {
    return 637;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.b.e
 * JD-Core Version:    0.6.2
 */