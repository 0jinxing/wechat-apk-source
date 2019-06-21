package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ahe;
import com.tencent.mm.protocal.protobuf.ahf;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  public String chatroomName;
  private final b ehh;
  private f ehi;
  public String ehr;
  public int ehs;
  public int eht;
  public int status;

  public j(String paramString)
  {
    AppMethodBeat.i(103928);
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new ahe();
    locala.fsK = new ahf();
    locala.uri = "/cgi-bin/micromsg-bin/getchatroomupgradestatus";
    locala.fsI = 519;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.chatroomName = paramString;
    ((ahe)this.ehh.fsG.fsP).vEf = paramString;
    AppMethodBeat.o(103928);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103929);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103929);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103930);
    paramq = (ahf)this.ehh.fsH.fsP;
    ab.d("MicroMsg.NetSceneGetChatRoomUpgradeStatus", "NetSceneGetChatRoomUpgradeStatus onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.status = paramq.jBT;
    this.ehr = paramq.wnK;
    this.eht = paramq.wnL;
    this.ehr = paramq.wnK;
    this.ehs = paramq.wnJ;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103930);
  }

  public final int getType()
  {
    return 519;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.j
 * JD-Core Version:    0.6.2
 */