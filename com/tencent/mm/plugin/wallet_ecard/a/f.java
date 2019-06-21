package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bne;
import com.tencent.mm.protocal.protobuf.bnf;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  public bnf tQn;

  public f(String paramString, int paramInt)
  {
    AppMethodBeat.i(48065);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bne();
    ((b.a)localObject).fsK = new bnf();
    ((b.a)localObject).fsI = 1988;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/qryecardbanklist4bind";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bne)this.ehh.fsG.fsP;
    ((bne)localObject).vKZ = paramString;
    ((bne)localObject).cHF = paramInt;
    ab.i("MicroMsg.NetSceneQryBankList4Bind", "cardType: %s, openScene: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(48065);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(48067);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48067);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(48066);
    ab.i("MicroMsg.NetSceneQryBankList4Bind", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.tQn = ((bnf)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQryBankList4Bind", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.tQn.kdT), this.tQn.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(48066);
  }

  public final int getType()
  {
    return 1988;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.f
 * JD-Core Version:    0.6.2
 */