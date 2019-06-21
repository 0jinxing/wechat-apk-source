package com.tencent.mm.openim.b;

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
import com.tencent.mm.protocal.protobuf.alk;
import com.tencent.mm.protocal.protobuf.all;
import com.tencent.mm.protocal.protobuf.bgf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private String geZ;
  private String gfa;
  public bgf gfb;
  private int ret;

  public h(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78855);
    b.a locala = new b.a();
    locala.fsJ = new alk();
    locala.fsK = new all();
    locala.uri = "/cgi-bin/micromsg-bin/getopenimcontact";
    locala.fsI = 881;
    this.ehh = locala.acD();
    this.geZ = paramString1;
    this.gfa = bo.bc(paramString2, "");
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMContact", "get openim username: %s, roomname: %s, ticket:%s", new Object[] { paramString1, this.gfa, paramString3 });
    paramString2 = (alk)this.ehh.fsG.fsP;
    paramString2.geZ = paramString1;
    paramString2.geY = this.gfa;
    paramString2.cxb = paramString3;
    AppMethodBeat.o(78855);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78856);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78856);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78857);
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geZ });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78857);
    }
    while (true)
    {
      return;
      paramq = (all)this.ehh.fsH.fsP;
      this.gfb = paramq.wqL;
      this.ret = s.a(paramq);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78857);
    }
  }

  public final int getType()
  {
    return 881;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.h
 * JD-Core Version:    0.6.2
 */