package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.blg;
import com.tencent.mm.protocal.protobuf.blh;
import com.tencent.mm.protocal.protobuf.ha;

public final class i extends a<blh>
{
  public i(int paramInt1, ha paramha, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(45235);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new blg();
    ((b.a)localObject).fsK = new blh();
    ((b.a)localObject).fsI = 1324;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/preredeemfund";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    blg localblg = (blg)((b)localObject).fsG.fsP;
    localblg.wOi = paramInt1;
    if (paramha != null)
      localblg.wOj = 1;
    for (localblg.wOk = paramha; ; localblg.wOk = null)
    {
      localblg.wao = paramInt2;
      localblg.wOl = paramInt3;
      localblg.wOm = paramString;
      localblg.tgu = ab.cMM();
      this.ehh = ((b)localObject);
      AppMethodBeat.o(45235);
      return;
      localblg.wOj = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.i
 * JD-Core Version:    0.6.2
 */