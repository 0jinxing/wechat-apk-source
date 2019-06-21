package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ahp;
import com.tencent.mm.protocal.protobuf.ahq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public e(String paramString)
  {
    AppMethodBeat.i(17658);
    ab.i("MicroMsg.NetSceneGetConnectInfo", "summerbak NetSceneGetConnectInfo init, url[%s], stack[%s]", new Object[] { paramString, bo.dpG() });
    b.a locala = new b.a();
    locala.fsJ = new ahp();
    locala.fsK = new ahq();
    locala.uri = "/cgi-bin/micromsg-bin/getconnectinfo";
    locala.fsL = 0;
    locala.fsM = 0;
    locala.fsI = 595;
    this.ehh = locala.acD();
    ((ahp)this.ehh.fsG.fsP).URL = paramString;
    AppMethodBeat.o(17658);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(17659);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(17659);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17660);
    ab.i("MicroMsg.NetSceneGetConnectInfo", "onGYNetEnd errType[%d], errCode[%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = aUk();
      d.ao(paramq.vIn.getBuffer().wR);
      ab.i("MicroMsg.NetSceneGetConnectInfo", "onGYNetEnd id[%s], hello[%s], ok[%s], PCName[%s], PCAcctName[%s], scene[%d], resource[%s]", new Object[] { paramq.ID, paramq.vIW, paramq.vIX, paramq.vIP, paramq.vIQ, Integer.valueOf(paramq.Scene), paramq.wnV });
      paramq.vIn.getBuffer();
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(17660);
  }

  public final ahq aUk()
  {
    return (ahq)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 595;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.e
 * JD-Core Version:    0.6.2
 */