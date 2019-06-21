package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.protocal.protobuf.cko;
import com.tencent.mm.protocal.protobuf.ckp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.u;

public final class q extends m
  implements k
{
  public String chatroomName;
  public String ehC;
  public int ehD;
  public int ehE;
  private final b ehh;
  private f ehi;
  public String ehr;

  public q(String paramString)
  {
    AppMethodBeat.i(103953);
    this.ehi = null;
    this.chatroomName = null;
    this.ehr = null;
    this.ehC = null;
    this.ehD = 0;
    this.ehE = 0;
    b.a locala = new b.a();
    locala.fsJ = new cko();
    locala.fsK = new ckp();
    locala.uri = "/cgi-bin/micromsg-bin/upgradechatroom";
    locala.fsI = 482;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.chatroomName = paramString;
    ((cko)this.ehh.fsG.fsP).vEf = paramString;
    AppMethodBeat.o(103953);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103954);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103954);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103955);
    ckp localckp = (ckp)this.ehh.fsH.fsP;
    ab.d("MicroMsg.NetSceneUpgradeChatroom", "NetSceneUpgradeChatroom onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehC = localckp.wGj;
    if (!bo.isNullOrNil(this.ehC))
    {
      paramArrayOfByte = ((c)g.K(c.class)).XV().oa(this.chatroomName);
      paramq = paramArrayOfByte;
      if (paramArrayOfByte == null)
        paramq = new u();
      paramq.ib(r.Yz(), this.ehC);
      n.a(paramq);
    }
    this.ehr = localckp.wnK;
    this.ehD = localckp.wnJ;
    this.ehE = localckp.wnL;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103955);
  }

  public final int getType()
  {
    return 482;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.q
 * JD-Core Version:    0.6.2
 */