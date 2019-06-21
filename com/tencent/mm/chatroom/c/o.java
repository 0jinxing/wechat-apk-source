package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bxt;
import com.tencent.mm.protocal.protobuf.bxu;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public o(String paramString1, String paramString2)
  {
    AppMethodBeat.i(103947);
    b.a locala = new b.a();
    bxt localbxt = new bxt();
    localbxt.vEf = paramString1;
    localbxt.wny = paramString2;
    locala.fsJ = localbxt;
    locala.fsK = new bxu();
    locala.uri = "/cgi-bin/micromsg-bin/setchatroomannouncement";
    locala.fsI = 993;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(103947);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103949);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103949);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103948);
    ab.w("MicroMsg.NetSceneSetChatRoomAnnouncement", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103948);
  }

  public final int getType()
  {
    return 993;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.o
 * JD-Core Version:    0.6.2
 */