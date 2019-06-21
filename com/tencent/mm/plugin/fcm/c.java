package com.tencent.mm.plugin.fcm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.dd;
import com.tencent.mm.protocal.protobuf.de;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public c(String paramString)
  {
    AppMethodBeat.i(56438);
    b.a locala = new b.a();
    locala.fsJ = new dd();
    locala.fsK = new de();
    locala.uri = "/cgi-bin/micromsg-bin/androidfcmunreg";
    locala.fsI = 664;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((dd)this.ehh.fsG.fsP).vAK = paramString;
    AppMethodBeat.o(56438);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(56439);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(56439);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(56440);
    ab.i("MicroMsg.FCM.NetSceneFcmUnreg", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(56440);
  }

  public final int getType()
  {
    return 643;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fcm.c
 * JD-Core Version:    0.6.2
 */