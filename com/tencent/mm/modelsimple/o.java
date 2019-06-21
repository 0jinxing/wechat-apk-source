package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ant;
import com.tencent.mm.protocal.protobuf.anu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class o extends m
  implements k
{
  private f ehi;
  public final b fmP;

  public o()
  {
    AppMethodBeat.i(16594);
    b.a locala = new b.a();
    locala.fsJ = new ant();
    locala.fsK = new anu();
    locala.uri = "/cgi-bin/micromsg-bin/getresourcecontrolinfo";
    locala.fsI = 725;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fmP = locala.acD();
    ((ant)this.fmP.fsG.fsP).jCt = 0;
    ab.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo type[%d], stack[%s]", new Object[] { Integer.valueOf(0), bo.dpG() });
    AppMethodBeat.o(16594);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16596);
    this.ehi = paramf;
    h.pYm.a(405L, 1L, 1L, true);
    int i = a(parame, this.fmP, this);
    AppMethodBeat.o(16596);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16595);
    ab.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      h.pYm.a(405L, 2L, 1L, true);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16595);
  }

  public final int getType()
  {
    return 725;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.o
 * JD-Core Version:    0.6.2
 */