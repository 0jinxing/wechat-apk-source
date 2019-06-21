package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.tx;
import com.tencent.mm.protocal.protobuf.ty;

public final class a extends com.tencent.mm.ai.a<ty>
{
  public a(String paramString)
  {
    AppMethodBeat.i(42270);
    tx localtx = new tx();
    localtx.materialId = paramString;
    paramString = new b.a();
    paramString.fsJ = localtx;
    paramString.fsK = new ty();
    paramString.fsI = 2968;
    paramString.uri = "/cgi-bin/mmpay-bin/ftfhb/confirmshowsource";
    this.ehh = paramString.acD();
    AppMethodBeat.o(42270);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.a
 * JD-Core Version:    0.6.2
 */