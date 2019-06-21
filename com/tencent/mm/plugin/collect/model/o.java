package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.byd;
import com.tencent.mm.protocal.protobuf.bye;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  private f ehi;
  private b gme;
  private byd kCC;

  public o(String paramString)
  {
    AppMethodBeat.i(40986);
    b.a locala = new b.a();
    locala.fsJ = new byd();
    locala.fsK = new bye();
    locala.fsI = 304;
    locala.uri = "/cgi-bin/micromsg-bin/setpushsound";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.kCC = ((byd)this.gme.fsG.fsP);
    this.kCC.jCt = 3;
    this.kCC.wXD = paramString;
    ab.i("MicroMsg.NetSceneSetPushSound", "type: %d, sound: %s", new Object[] { Integer.valueOf(3), paramString });
    AppMethodBeat.o(40986);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40987);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40987);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40988);
    ab.i("MicroMsg.NetSceneSetPushSound", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40988);
  }

  public final int getType()
  {
    return 304;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.o
 * JD-Core Version:    0.6.2
 */