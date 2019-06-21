package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bnq;
import com.tencent.mm.protocal.protobuf.bnr;

public final class l extends a<bnr>
{
  private b gme;
  private bnq tfh;

  public l()
  {
    AppMethodBeat.i(45238);
    this.tfh = null;
    b.a locala = new b.a();
    locala.fsJ = new bnq();
    locala.fsK = new bnr();
    locala.fsI = 1211;
    locala.uri = "/cgi-bin/mmpay-bin/qryusrfunddetail";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.tfh = ((bnq)this.gme.fsG.fsP);
    this.tfh.time_stamp = ((int)System.currentTimeMillis());
    this.tfh.tgu = ab.cMM();
    this.ehh = locala.acD();
    AppMethodBeat.o(45238);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.l
 * JD-Core Version:    0.6.2
 */