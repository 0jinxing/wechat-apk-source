package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.cft;
import com.tencent.mm.protocal.protobuf.cfu;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends m
  implements k
{
  private b ehh;
  private f ehi;
  public boolean lSY;
  public boolean lSZ;

  public q(int paramInt)
  {
    AppMethodBeat.i(95);
    this.lSY = false;
    this.lSZ = false;
    b.a locala = new b.a();
    locala.fsJ = new cft();
    locala.fsK = new cfu();
    locala.uri = "/cgi-bin/micromsg-bin/switchopface";
    locala.fsI = 938;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((cft)this.ehh.fsG.fsP).OpCode = paramInt;
    AppMethodBeat.o(95);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(96);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(96);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(97);
    paramq = (cfu)((b)paramq).fsH.fsP;
    this.lSY = paramq.xeT;
    this.lSZ = paramq.xeU;
    ab.i("MicroMsg.NetSceneFaceSwitchOpFace", "hy: NetSceneFaceSwitchOpFace errType: %d, errCode: %d, errMsg: %s, hasBio: %b, isOpen: %b", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Boolean.valueOf(this.lSY), Boolean.valueOf(this.lSZ) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(97);
  }

  public final int getType()
  {
    return 938;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.q
 * JD-Core Version:    0.6.2
 */