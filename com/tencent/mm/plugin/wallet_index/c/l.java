package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.auh;
import com.tencent.mm.protocal.protobuf.aui;
import com.tencent.mm.protocal.protobuf.cmo;
import com.tencent.mm.protocal.protobuf.cmp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class l extends u
{
  public String cwg;
  private b ehh;
  private f ehi;
  public int errCode;

  public l(int paramInt1, int paramInt2, String paramString, aui paramaui, auh paramauh)
  {
    AppMethodBeat.i(48192);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cmo();
    ((b.a)localObject).fsK = new cmp();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/boss/verifyandroidiappackage";
    ((b.a)localObject).fsI = 1306;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cmo)this.ehh.fsG.fsP;
    ((cmo)localObject).wlY = paramInt1;
    ((cmo)localObject).cHG = paramInt2;
    this.cwg = paramString;
    ((cmo)localObject).wme = paramaui;
    ((cmo)localObject).wmd = paramauh;
    AppMethodBeat.o(48192);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48194);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48194);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48193);
    ab.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "ErrType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg:" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(48193);
    }
    while (true)
    {
      return;
      paramq = (cmp)this.ehh.fsH.fsP;
      ab.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "business: errCode:" + paramq.cCJ + ",errMsg:" + paramq.cCK);
      paramInt2 = paramq.cCJ;
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(48193);
    }
  }

  public final int getType()
  {
    return 1306;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.l
 * JD-Core Version:    0.6.2
 */