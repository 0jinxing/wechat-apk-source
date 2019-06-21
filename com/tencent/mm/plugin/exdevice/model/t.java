package com.tencent.mm.plugin.exdevice.model;

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
import com.tencent.mm.protocal.protobuf.bup;
import com.tencent.mm.protocal.protobuf.buq;
import com.tencent.mm.sdk.platformtools.ab;

public final class t extends m
  implements k
{
  private b ehh;
  private f ehi;

  public t(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(19338);
    this.ehi = null;
    this.ehh = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bup();
    ((b.a)localObject).fsK = new buq();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/searchbleharddevice";
    ((b.a)localObject).fsI = 1706;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bup)this.ehh.fsG.fsP;
    ((bup)localObject).mac = paramString1;
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = "";
    ((bup)localObject).userName = paramString1;
    paramString1 = paramString3;
    if (paramString3 == null)
      paramString1 = "";
    ((bup)localObject).category = paramString1;
    AppMethodBeat.o(19338);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19340);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19340);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19339);
    ab.i("MicroMsg.exdevice.NetSceneSearchBLEHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19339);
  }

  public final buq boS()
  {
    return (buq)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 1706;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.t
 * JD-Core Version:    0.6.2
 */