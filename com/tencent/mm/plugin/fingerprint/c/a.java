package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.protocal.protobuf.ccq;
import com.tencent.mm.protocal.protobuf.ccr;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends com.tencent.mm.plugin.soter.b.d
  implements k
{
  public final b ehh;
  private f ehi;
  public String msn;
  public boolean mso;

  public a(int paramInt)
  {
    AppMethodBeat.i(41568);
    this.msn = "";
    this.mso = false;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new ccq();
    ((b.a)localObject1).fsK = new ccr();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/sotergetchallenge";
    ((b.a)localObject1).fsI = 1586;
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (ccq)this.ehh.fsG.fsP;
    Object localObject2 = com.tencent.mm.plugin.soter.d.d.cvQ();
    String str = ((com.tencent.mm.plugin.soter.d.e)localObject2).rOh;
    localObject2 = ((com.tencent.mm.plugin.soter.d.e)localObject2).jSY;
    ab.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: cpu_id: %s, uid: %s", new Object[] { str, localObject2 });
    ((ccq)localObject1).rOh = str;
    ((ccq)localObject1).jSY = ((String)localObject2);
    ((ccq)localObject1).scene = 0;
    ((ccq)localObject1).xbY = paramInt;
    ((ccq)localObject1).xbZ = 1;
    AppMethodBeat.o(41568);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(41569);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41569);
    return i;
  }

  public final void bxO()
  {
    AppMethodBeat.i(41571);
    ab.e("MicroMsg.NetSceneSoterGetPayChallenge", "hy: auth key expired");
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    AppMethodBeat.o(41571);
  }

  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41570);
    ab.d("MicroMsg.NetSceneSoterGetPayChallenge", "hy: onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramq = (ccr)((b)paramq).fsH.fsP;
      this.msn = paramq.msn;
      v.tCn.msn = this.msn;
      if (1 != paramq.xca)
        break label179;
      bool = true;
      this.mso = bool;
      if (1 != paramq.xca)
        break label185;
    }
    label179: label185: for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.NetSceneSoterGetPayChallenge", "get pay challenge needChangeAuthKey: %b", new Object[] { Boolean.valueOf(bool) });
      v.tCn.mso = this.mso;
      ab.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: challenge: %s, need auth key: %b", new Object[] { this.msn, Boolean.valueOf(this.mso) });
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(41570);
      return;
      bool = false;
      break;
    }
  }

  public final int getType()
  {
    return 1586;
  }

  public final void vL(int paramInt)
  {
    AppMethodBeat.i(41572);
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    AppMethodBeat.o(41572);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.c.a
 * JD-Core Version:    0.6.2
 */