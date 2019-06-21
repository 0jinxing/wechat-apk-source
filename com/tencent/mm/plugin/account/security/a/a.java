package com.tencent.mm.plugin.account.security.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.vz;
import com.tencent.mm.protocal.protobuf.wa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class a extends m
  implements k
{
  private String ceI;
  private b ehh;
  private f ehi;

  public a(String paramString)
  {
    AppMethodBeat.i(69826);
    this.ceI = paramString;
    b.a locala = new b.a();
    locala.fsJ = new vz();
    locala.fsK = new wa();
    locala.uri = "/cgi-bin/micromsg-bin/delsafedevice";
    locala.fsI = 362;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((vz)this.ehh.fsG.fsP).wcI = paramString;
    AppMethodBeat.o(69826);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(69828);
    int i;
    if (bo.isNullOrNil(this.ceI))
    {
      ab.e("MicroMsg.NetSceneDelSafeDevice", "null device id");
      i = -1;
      AppMethodBeat.o(69828);
    }
    while (true)
    {
      return i;
      this.ehi = paramf;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(69828);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(69827);
    ab.d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, errType= " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (wa)this.ehh.fsH.fsP;
      g.RP().Ry().set(64, Integer.valueOf(paramq.vCl));
      ab.d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, get safedevice state = " + paramq.vCl);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(69827);
  }

  public final int getType()
  {
    return 362;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.a.a
 * JD-Core Version:    0.6.2
 */