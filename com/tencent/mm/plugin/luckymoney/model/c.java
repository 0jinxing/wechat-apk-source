package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.aoi;
import com.tencent.mm.protocal.protobuf.aoj;

public final class c extends a<aoj>
{
  public c(String paramString)
  {
    AppMethodBeat.i(42272);
    aoi localaoi = new aoi();
    b.a locala = new b.a();
    locala.fsJ = localaoi;
    locala.fsK = new aoj();
    locala.fsI = 2620;
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/getshowsource";
    localaoi.wsz = paramString;
    this.ehh = locala.acD();
    AppMethodBeat.o(42272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.c
 * JD-Core Version:    0.6.2
 */