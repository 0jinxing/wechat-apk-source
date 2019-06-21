package com.tencent.mm.plugin.profile.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bxr;
import com.tencent.mm.protocal.protobuf.bxs;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  public b ehh;
  private f ehi;

  public c(String paramString, int paramInt)
  {
    AppMethodBeat.i(23287);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bxr();
    ((b.a)localObject).fsK = new bxs();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/setbrandflag";
    ((b.a)localObject).fsI = 1363;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bxr)this.ehh.fsG.fsP;
    ((bxr)localObject).vNb = paramString;
    ((bxr)localObject).wXA = paramInt;
    ((bxr)localObject).wXB = 4;
    AppMethodBeat.o(23287);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(23289);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneSetBrandFlag", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(23289);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23288);
    ab.d("MicroMsg.brandservice.NetSceneSetBrandFlag", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(23288);
  }

  public final int getType()
  {
    return 1363;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.b.c
 * JD-Core Version:    0.6.2
 */