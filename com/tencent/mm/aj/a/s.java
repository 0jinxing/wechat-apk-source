package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aiv;
import com.tencent.mm.protocal.protobuf.aiw;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends m
  implements k
{
  public b ehh;
  private f ehi;

  public s(String paramString)
  {
    AppMethodBeat.i(11627);
    b.a locala = new b.a();
    locala.fsJ = new aiv();
    locala.fsK = new aiw();
    locala.uri = "/cgi-bin/mmocbiz-bin/getfavbizchatlist";
    locala.fsI = 1367;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((aiv)this.ehh.fsG.fsP).vNb = paramString;
    AppMethodBeat.o(11627);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11629);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneGetFavBizChatList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11629);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11628);
    ab.d("MicroMsg.brandservice.NetSceneGetFavBizChatList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11628);
  }

  public final int getType()
  {
    return 1367;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.s
 * JD-Core Version:    0.6.2
 */