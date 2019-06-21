package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aea;
import com.tencent.mm.protocal.protobuf.aeb;
import com.tencent.mm.protocal.protobuf.auh;
import com.tencent.mm.protocal.protobuf.aui;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class f extends u
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  public int errCode;
  public auh tRe;
  public aui tRf;

  public f(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(48184);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aea();
    ((b.a)localObject).fsK = new aeb();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/boss/getandroidiappackage";
    ((b.a)localObject).fsI = 1130;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aea)this.ehh.fsG.fsP;
    ((aea)localObject).csB = paramString1;
    ((aea)localObject).wlY = paramInt1;
    ((aea)localObject).wlZ = Integer.parseInt(paramString2);
    ((aea)localObject).desc = paramString3;
    ((aea)localObject).count = paramInt2;
    ((aea)localObject).scene = 13;
    ((aea)localObject).wma = paramString4;
    ((aea)localObject).wmb = paramString5;
    ((aea)localObject).sign = paramString6;
    ((aea)localObject).wmc = paramString7;
    AppMethodBeat.o(48184);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(48186);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48186);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48185);
    ab.e("MicroMsg.NetSceneGetAndroidIapPackage", "ErrType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg:" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(48185);
    }
    while (true)
    {
      return;
      paramq = (aeb)this.ehh.fsH.fsP;
      ab.e("MicroMsg.NetSceneGetAndroidIapPackage", "business: errCode:" + paramq.cCJ + ",errMsg:" + paramq.cCK);
      paramInt2 = paramq.cCJ;
      paramString = paramq.cCK;
      if (paramInt2 == 0)
      {
        this.tRe = paramq.wmd;
        this.tRf = paramq.wme;
      }
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(48185);
    }
  }

  public final int getType()
  {
    return 1130;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.f
 * JD-Core Version:    0.6.2
 */