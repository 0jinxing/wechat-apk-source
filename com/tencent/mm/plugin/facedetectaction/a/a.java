package com.tencent.mm.plugin.facedetectaction.a;

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
import com.tencent.mm.protocal.protobuf.air;
import com.tencent.mm.protocal.protobuf.ais;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;
  private air mbS;
  public ais mbT;

  public a(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(670);
    b.a locala = new b.a();
    locala.fsJ = new air();
    locala.fsK = new ais();
    locala.fsI = 2696;
    locala.uri = "/cgi-bin/mmpay-bin/getfacecheckaction";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.mbS = ((air)this.ehh.fsG.fsP);
    this.mbS.scene = paramInt;
    this.mbS.kKO = paramString1;
    this.mbS.woI = paramString2;
    ab.i("MicroMsg.NetSceneGetFaceCheckAction", "create GetFaceCheckAction, scene: %s, packageName: %s, packageSign: %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    AppMethodBeat.o(670);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(671);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(671);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(672);
    ab.i("MicroMsg.NetSceneGetFaceCheckAction", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mbT = ((ais)((b)paramq).fsH.fsP);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(672);
  }

  public final int getType()
  {
    return 2696;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.a.a
 * JD-Core Version:    0.6.2
 */