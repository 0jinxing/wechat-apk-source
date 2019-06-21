package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.beu;
import com.tencent.mm.protocal.protobuf.bev;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class j extends m
  implements k
{
  private b ehh;
  public f ehi;
  private final int fhF;

  public j()
  {
    AppMethodBeat.i(36236);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new beu();
    ((b.a)localObject).fsK = new bev();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_checkgrant";
    ((b.a)localObject).fsI = 2842;
    this.fhF = -1216949095;
    this.ehh = ((b.a)localObject).acD();
    localObject = (beu)this.ehh.fsG.fsP;
    g.RQ();
    g.RN();
    ((beu)localObject).wIP = a.QF();
    ((beu)localObject).wIQ = -1216949095;
    ab.i("MicroMsg.NetSceneOauthCheckGrant", "init useruin:%d, bizuin:%d", new Object[] { Integer.valueOf(((beu)localObject).wIP), Integer.valueOf(((beu)localObject).wIQ) });
    AppMethodBeat.o(36236);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(36237);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36237);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36238);
    ab.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    ac.a locala;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bev)((b)paramq).fsH.fsP;
      ab.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd bizUin:%d, status:%d", new Object[] { Integer.valueOf(this.fhF), Integer.valueOf(paramq.status) });
      if (this.fhF == -1216949095)
      {
        g.RQ();
        paramArrayOfByte = g.RP().Ry();
        locala = ac.a.xLj;
        if (paramq.status != 1)
          break label180;
      }
    }
    label180: for (boolean bool = true; ; bool = false)
    {
      paramArrayOfByte.set(locala, Boolean.valueOf(bool));
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36238);
      return;
    }
  }

  public final int getType()
  {
    return 2842;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.j
 * JD-Core Version:    0.6.2
 */