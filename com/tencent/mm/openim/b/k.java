package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ava;
import com.tencent.mm.protocal.protobuf.avb;
import com.tencent.mm.protocal.protobuf.bgc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private final b ehh;
  private f ehi;
  private String geY;

  public k(String paramString, LinkedList<bgc> paramLinkedList)
  {
    AppMethodBeat.i(78865);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ava();
    ((b.a)localObject).fsK = new avb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/inviteopenimchatroommember";
    ((b.a)localObject).fsI = 887;
    this.ehh = ((b.a)localObject).acD();
    this.geY = paramString;
    localObject = (ava)this.ehh.fsG.fsP;
    ((ava)localObject).gfa = paramString;
    ((ava)localObject).vEN = paramLinkedList;
    ab.i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "roomname: %s, size:%d", new Object[] { paramString, Integer.valueOf(paramLinkedList.size()) });
    AppMethodBeat.o(78865);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78867);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78867);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78866);
    ab.i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geY });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78866);
  }

  public final int getType()
  {
    return 887;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.k
 * JD-Core Version:    0.6.2
 */