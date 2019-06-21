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
import com.tencent.mm.protocal.protobuf.alq;
import com.tencent.mm.protocal.protobuf.alr;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  public String cHN;
  private final b ehh;
  private f ehi;

  public j(String paramString)
  {
    AppMethodBeat.i(78862);
    b.a locala = new b.a();
    locala.fsJ = new alq();
    locala.fsK = new alr();
    locala.uri = "/cgi-bin/micromsg-bin/getopenurl";
    locala.fsI = 913;
    this.ehh = locala.acD();
    ab.i("MicroMsg.NetSceneGetOpenIMUrl", "NetSceneGetOpenIMUrl username: %s", new Object[] { paramString });
    ((alq)this.ehh.fsG.fsP).userName = paramString;
    AppMethodBeat.o(78862);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78863);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78863);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78864);
    ab.i("MicroMsg.NetSceneGetOpenIMUrl", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78864);
    }
    while (true)
    {
      return;
      this.cHN = ((alr)this.ehh.fsH.fsP).cHN;
      ab.i("MicroMsg.NetSceneGetOpenIMUrl", "openUrl %s", new Object[] { this.cHN });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78864);
    }
  }

  public final int getType()
  {
    return 913;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.j
 * JD-Core Version:    0.6.2
 */