package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.qb;
import com.tencent.mm.protocal.protobuf.qc;
import com.tencent.mm.sdk.platformtools.g;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37655);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new qb();
    ((b.a)localObject).fsK = new qc();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo";
    ((b.a)localObject).fsI = 1210;
    this.ehh = ((b.a)localObject).acD();
    localObject = (qb)this.ehh.fsG.fsP;
    ((qb)localObject).vXf = paramString2;
    ((qb)localObject).vXe = paramString1;
    ((qb)localObject).vXg = g.dnY();
    AppMethodBeat.o(37655);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(37657);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(37657);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(37656);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(37656);
  }

  public final int getType()
  {
    return this.ehh.fsI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.a
 * JD-Core Version:    0.6.2
 */