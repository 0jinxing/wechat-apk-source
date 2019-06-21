package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cik;
import com.tencent.mm.protocal.protobuf.cil;
import com.tencent.mm.sdk.platformtools.ab;

public final class p extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String username;

  public p(String paramString1, String paramString2)
  {
    AppMethodBeat.i(103950);
    b.a locala = new b.a();
    this.username = paramString2;
    cik localcik = new cik();
    localcik.vEf = paramString1;
    localcik.xhr = paramString2;
    locala.fsJ = localcik;
    locala.fsK = new cil();
    locala.uri = "/cgi-bin/micromsg-bin/transferchatroomowner";
    locala.fsI = 990;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(103950);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103952);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103952);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103951);
    ab.w("MicroMsg.NetSceneTransferChatRoomOwner", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103951);
  }

  public final int getType()
  {
    return 990;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.p
 * JD-Core Version:    0.6.2
 */