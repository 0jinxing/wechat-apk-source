package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ahp;
import com.tencent.mm.protocal.protobuf.ahq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(String paramString)
  {
    AppMethodBeat.i(17895);
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
    AppMethodBeat.o(17895);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(17896);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(17896);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17897);
    ab.i("MicroMsg.NetSceneGetConnectInfo", "errType %d,  errCode %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ahq)this.ehh.fsH.fsP;
      d.ao(paramq.vIn.getBuffer().wR);
      ab.i("MicroMsg.NetSceneGetConnectInfo", "id:%s  hello:%s, ok:%s, PCName:%s, PCAcctName:%s, scene:%d", new Object[] { paramq.ID, paramq.vIW, paramq.vIX, paramq.vIP, paramq.vIQ, Integer.valueOf(paramq.Scene) });
      ab.i("MicroMsg.NetSceneGetConnectInfo", "resource:%s", new Object[] { paramq.wnV });
      paramq.vIn.getBuffer();
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(17897);
  }

  public final ahq aUU()
  {
    return (ahq)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 595;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.c.f
 * JD-Core Version:    0.6.2
 */