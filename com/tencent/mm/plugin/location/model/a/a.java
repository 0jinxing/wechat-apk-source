package com.tencent.mm.plugin.location.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.yy;
import com.tencent.mm.protocal.protobuf.yz;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  public final b ehh;
  private f ehi;
  private Runnable fPK;

  public a(String paramString)
  {
    AppMethodBeat.i(113409);
    b.a locala = new b.a();
    locala.fsJ = new yy();
    locala.fsK = new yz();
    locala.uri = "/cgi-bin/micromsg-bin/exittrackroom";
    locala.fsI = 491;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((yy)this.ehh.fsG.fsP).weu = paramString;
    ab.d("MicroMsg.NetSceneExitTrackRoom", "trackRoomId:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(113409);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(113410);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(113410);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113411);
    ab.d("MicroMsg.NetSceneExitTrackRoom", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.fPK != null)
      this.fPK.run();
    AppMethodBeat.o(113411);
  }

  public final int getType()
  {
    return 491;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.a.a
 * JD-Core Version:    0.6.2
 */