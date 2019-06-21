package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.openim.room.a.a;
import com.tencent.mm.protocal.protobuf.ale;
import com.tencent.mm.protocal.protobuf.alf;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private final String geY;

  public e(String paramString)
  {
    AppMethodBeat.i(78846);
    b.a locala = new b.a();
    locala.fsJ = new ale();
    locala.fsK = new alf();
    locala.uri = "/cgi-bin/micromsg-bin/getopenimchatroomcontact";
    locala.fsI = 407;
    this.ehh = locala.acD();
    this.geY = paramString;
    ((ale)this.ehh.fsG.fsP).gfa = paramString;
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "get roomname:%s", new Object[] { paramString });
    AppMethodBeat.o(78846);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78848);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78848);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78847);
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geY });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (alf)((b)paramq).fsH.fsP;
      if (paramq.wqG != null)
        a.b(paramq.wqG);
    }
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78847);
  }

  public final int getType()
  {
    return 407;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.e
 * JD-Core Version:    0.6.2
 */