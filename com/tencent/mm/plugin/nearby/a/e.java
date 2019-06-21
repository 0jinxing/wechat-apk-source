package com.tencent.mm.plugin.nearby.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ayb;
import com.tencent.mm.protocal.protobuf.ayc;
import com.tencent.mm.protocal.protobuf.ayd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class e extends m
  implements k
{
  final b ehh;
  private f ehi;

  public e(String paramString)
  {
    AppMethodBeat.i(55371);
    b.a locala = new b.a();
    locala.fsJ = new ayc();
    locala.fsK = new ayd();
    locala.uri = "/cgi-bin/micromsg-bin/getroommember";
    locala.fsI = 377;
    locala.fsL = 184;
    locala.fsM = 1000000184;
    this.ehh = locala.acD();
    ((ayc)this.ehh.fsG.fsP).fLc = paramString;
    ab.d("MicroMsg.NetSceneLbsRoomGetMember", "Req: roomName:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(55371);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(55372);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(55372);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(55373);
    ab.d("MicroMsg.NetSceneLbsRoomGetMember", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    ayd localayd = (ayd)this.ehh.fsH.fsP;
    if (paramInt2 != 0)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(55373);
    }
    while (true)
    {
      return;
      paramq = new ArrayList();
      for (paramInt1 = 0; paramInt1 < localayd.vEh.size(); paramInt1++)
      {
        paramArrayOfByte = new h();
        paramArrayOfByte.username = ((ayb)localayd.vEh.get(paramInt1)).jBB;
        paramArrayOfByte.frW = ((ayb)localayd.vEh.get(paramInt1)).vXm;
        paramArrayOfByte.frV = ((ayb)localayd.vEh.get(paramInt1)).vXn;
        paramArrayOfByte.cB(true);
        paramq.add(paramArrayOfByte);
      }
      o.act().aa(paramq);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(55373);
    }
  }

  public final int getType()
  {
    return 377;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.a.e
 * JD-Core Version:    0.6.2
 */