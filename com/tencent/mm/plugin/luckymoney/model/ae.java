package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.asf;
import com.tencent.mm.protocal.protobuf.asg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class ae extends p
{
  public asg nYy;

  public ae(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(42395);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new asf();
    ((b.a)localObject).fsK = new asg();
    ((b.a)localObject).fsI = 2929;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/businesscallbackwxhb";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (asf)this.ehh.fsG.fsP;
    ((asf)localObject).nSX = paramString1;
    ((asf)localObject).kBE = paramString2;
    ((asf)localObject).nZe = paramString3;
    ab.i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "sendId: %s, %s", new Object[] { paramString1, paramString3 });
    AppMethodBeat.o(42395);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(42396);
    this.nYy = ((asg)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nYy.kCl), this.nYy.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(42396);
  }

  public final void f(q paramq)
  {
    paramq = (asg)((b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 2929;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.ae
 * JD-Core Version:    0.6.2
 */