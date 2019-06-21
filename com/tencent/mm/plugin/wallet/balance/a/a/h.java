package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bkz;
import com.tencent.mm.protocal.protobuf.bla;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends a<bla>
{
  public int scene;

  public h(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(45234);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bkz();
    ((b.a)localObject).fsK = new bla();
    ((b.a)localObject).fsI = 1770;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/preaddplan";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    b localb = ((b.a)localObject).acD();
    localObject = (bkz)localb.fsG.fsP;
    ((bkz)localObject).scene = paramInt1;
    ((bkz)localObject).vES = paramInt2;
    this.ehh = localb;
    this.scene = paramInt1;
    ab.i("MicroMsg.CgiLqtPreAddPlan", "scene: %s, planId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(45234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.h
 * JD-Core Version:    0.6.2
 */