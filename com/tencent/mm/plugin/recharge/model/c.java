package com.tencent.mm.plugin.recharge.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.acf;
import com.tencent.mm.protocal.protobuf.acg;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  public String cFl;
  public b ehh;
  private f ehi;
  public String lcC;

  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(44193);
    this.cFl = paramString2;
    this.lcC = paramString3;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new acf();
    ((b.a)localObject).fsK = new acg();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/flowdatarechargepreinquery";
    ((b.a)localObject).fsI = 1555;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (acf)this.ehh.fsG.fsP;
    ((acf)localObject).wjV = paramString1;
    ((acf)localObject).vLs = paramString2;
    ((acf)localObject).pdB = paramString3;
    ((acf)localObject).wjW = paramString4;
    ((acf)localObject).wjX = paramString5;
    ((acf)localObject).wdB = com.tencent.mm.plugin.wallet_core.model.mall.c.cQT().acH(paramString1);
    AppMethodBeat.o(44193);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44195);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44195);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44194);
    ab.d("MicroMsg.NetSceneFlowDataRechargePreinQuery", "errCode " + paramInt3 + ", errMsg " + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44194);
  }

  public final int getType()
  {
    return 1555;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.c
 * JD-Core Version:    0.6.2
 */