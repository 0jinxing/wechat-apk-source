package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bcg;
import com.tencent.mm.protocal.protobuf.bch;
import com.tencent.mm.protocal.protobuf.bgc;
import com.tencent.mm.sdk.platformtools.ab;

public final class p extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String username;

  public p(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78878);
    b.a locala = new b.a();
    this.username = paramString2;
    bcg localbcg = new bcg();
    localbcg.gfa = paramString1;
    localbcg.wGM = new bgc();
    localbcg.wGM.userName = paramString2;
    locala.fsJ = localbcg;
    locala.fsK = new bch();
    locala.uri = "/cgi-bin/micromsg-bin/modopenimchatroomowner";
    locala.fsI = 811;
    this.ehh = locala.acD();
    AppMethodBeat.o(78878);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78879);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78879);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78880);
    ab.w("MicroMsg.NetSceneTransferOpenImChatRoomOwner", "errType = %s errCode = %s errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78880);
  }

  public final int getType()
  {
    return 811;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.p
 * JD-Core Version:    0.6.2
 */