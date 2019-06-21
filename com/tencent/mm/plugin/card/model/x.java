package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.agd;
import com.tencent.mm.protocal.protobuf.age;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class x extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private String ked;

  public x()
  {
    AppMethodBeat.i(87886);
    this.ked = "";
    b.a locala = new b.a();
    locala.fsJ = new agd();
    locala.fsK = new age();
    locala.uri = "/cgi-bin/micromsg-bin/getcardconfiginfo";
    locala.fsI = 692;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(87886);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(87887);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87887);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87888);
    ab.i("MicroMsg.NetSceneGetCardConfigInfo", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.ked = ((age)this.ehh.fsH.fsP).kdS;
      g.RP().Ry().set(282885, this.ked);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87888);
  }

  public final int getType()
  {
    return 692;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.x
 * JD-Core Version:    0.6.2
 */