package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.btg;
import com.tencent.mm.protocal.protobuf.bth;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  private b ehh;
  private f ehi;

  public n(String paramString1, String paramString2)
  {
    AppMethodBeat.i(103944);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new btg();
    ((b.a)localObject).fsK = new bth();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/revokechatroomqrcode";
    ((b.a)localObject).fsI = 700;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (btg)this.ehh.fsG.fsP;
    ((btg)localObject).wVm = paramString1;
    ((btg)localObject).wVn = paramString2;
    AppMethodBeat.o(103944);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103945);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103945);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103946);
    ab.d("MicroMsg.RevokeChatRoomQRCodeRequest", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103946);
  }

  public final int getType()
  {
    return 700;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.n
 * JD-Core Version:    0.6.2
 */