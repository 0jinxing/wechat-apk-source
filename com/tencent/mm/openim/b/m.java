package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.btk;
import com.tencent.mm.protocal.protobuf.btl;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  private final b ehh;
  private f ehi;
  private final String geY;

  public m(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78868);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new btk();
    ((b.a)localObject).fsK = new btl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/revokeopenimchatroomqrcode";
    ((b.a)localObject).fsI = 772;
    this.ehh = ((b.a)localObject).acD();
    this.geY = paramString1;
    localObject = (btk)this.ehh.fsG.fsP;
    ((btk)localObject).geY = paramString1;
    ((btk)localObject).cGA = paramString2;
    ab.i("MicroMsg.Openim.NetSceneRevokeOpenIMChatRoomQRCode", "get roomname:%s, qrcode:%s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(78868);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78870);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78870);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78869);
    ab.i("MicroMsg.Openim.NetSceneRevokeOpenIMChatRoomQRCode", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geY });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78869);
  }

  public final int getType()
  {
    return 772;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.m
 * JD-Core Version:    0.6.2
 */