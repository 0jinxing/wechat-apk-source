package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bng;
import com.tencent.mm.protocal.protobuf.bnh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class g extends p
{
  private b ehh;
  private f ehi;
  public bnh tQo;

  public g()
  {
    AppMethodBeat.i(48068);
    b.a locala = new b.a();
    locala.fsJ = new bng();
    locala.fsK = new bnh();
    locala.fsI = 2931;
    locala.uri = "/cgi-bin/mmpay-bin/qrycancelecarddesc";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bng)this.ehh.fsG.fsP).wQe = 1L;
    AppMethodBeat.o(48068);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48070);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48070);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48069);
    ab.i("MicroMsg.NetSceneQryECardLogout", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.tQo = ((bnh)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQryECardLogout", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.tQo.kdT), this.tQo.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(48069);
  }

  public final void f(q paramq)
  {
    paramq = (bnh)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2931;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.g
 * JD-Core Version:    0.6.2
 */