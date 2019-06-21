package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bru;
import com.tencent.mm.protocal.protobuf.brv;
import com.tencent.mm.sdk.platformtools.ab;

public final class al extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private brv nYU;

  public al(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    AppMethodBeat.i(42409);
    ab.i("MicroMsg.NetSceneLuckyMoneyReport", "NetSceneLuckyMoneyReport() sendId:%s unique_id:%s reportType:%s sendUsername:%s recvUserName:%s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString3, paramString4 });
    b.a locala = new b.a();
    bru localbru = new bru();
    localbru.nSX = paramString1;
    localbru.wKQ = paramString2;
    localbru.cKB = paramInt;
    localbru.nXl = paramString3;
    localbru.wTV = paramString4;
    locala.fsJ = localbru;
    locala.fsK = new brv();
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/wxhbreport";
    locala.fsI = 2715;
    this.ehh = locala.acD();
    AppMethodBeat.o(42409);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(42410);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(42410);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42411);
    ab.w("MicroMsg.NetSceneLuckyMoneyReport", "errType = %s errCode = %s errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.nYU = ((brv)((b)paramq).fsH.fsP);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(42411);
  }

  public final int getType()
  {
    return 2715;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.al
 * JD-Core Version:    0.6.2
 */