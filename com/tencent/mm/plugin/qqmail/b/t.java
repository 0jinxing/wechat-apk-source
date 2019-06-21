package com.tencent.mm.plugin.qqmail.b;

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
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class t extends m
  implements k
{
  public final boolean cPT;
  private b ehh;
  private f ehi;
  private String puC;

  public t(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(67985);
    this.puC = "";
    this.cPT = paramBoolean;
    this.puC = bo.nullAsNil(paramString);
    AppMethodBeat.o(67985);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(67986);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ad();
    ((b.a)localObject).fsK = new ae();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/switchpushmail";
    ((b.a)localObject).fsI = 129;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ad)this.ehh.fsG.fsP;
    if (this.cPT);
    for (int i = 1; ; i = 2)
    {
      ((ad)localObject).pvD = i;
      ((ad)localObject).pvE = this.puC;
      this.ehi = paramf;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(67986);
      return i;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67987);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ae)this.ehh.fsH.fsP;
      g.RP().Ry().set(17, Integer.valueOf(paramq.pvD));
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(67987);
  }

  public final boolean acI()
  {
    return true;
  }

  public final int getType()
  {
    return 24;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.t
 * JD-Core Version:    0.6.2
 */