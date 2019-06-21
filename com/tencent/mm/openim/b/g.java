package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ali;
import com.tencent.mm.protocal.protobuf.alj;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private final String geY;

  public g(String paramString)
  {
    AppMethodBeat.i(78852);
    b.a locala = new b.a();
    locala.fsJ = new ali();
    locala.fsK = new alj();
    locala.uri = "/cgi-bin/micromsg-bin/getopenimchatroomqrcode";
    locala.fsI = 890;
    this.ehh = locala.acD();
    this.geY = paramString;
    ((ali)this.ehh.fsG.fsP).gfa = paramString;
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomQRCode", "get roomname:%s", new Object[] { paramString });
    AppMethodBeat.o(78852);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78854);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78854);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78853);
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomQRCode", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geY });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78853);
  }

  public final int getType()
  {
    return 890;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.g
 * JD-Core Version:    0.6.2
 */