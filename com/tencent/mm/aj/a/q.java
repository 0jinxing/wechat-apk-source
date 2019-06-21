package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.afp;
import com.tencent.mm.protocal.protobuf.afq;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;

  public q(String paramString, Object paramObject)
  {
    AppMethodBeat.i(11621);
    b.a locala = new b.a();
    locala.fsJ = new afp();
    locala.fsK = new afq();
    locala.uri = "/cgi-bin/mmocbiz-bin/getbizchatmyuserinfo";
    locala.fsI = 1354;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((afp)this.ehh.fsG.fsP).vNb = paramString;
    this.data = paramObject;
    AppMethodBeat.o(11621);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11623);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11623);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11622);
    ab.d("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11622);
  }

  public final int getType()
  {
    return 1354;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.q
 * JD-Core Version:    0.6.2
 */