package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.tx;
import com.tencent.mm.protocal.protobuf.ty;

public final class b extends a<ty>
{
  public b(String paramString)
  {
    AppMethodBeat.i(42271);
    tx localtx = new tx();
    localtx.materialId = paramString;
    paramString = new b.a();
    paramString.fsJ = localtx;
    paramString.fsK = new ty();
    paramString.fsI = 2665;
    paramString.uri = "/cgi-bin/mmpay-bin/ftfhb/deleteshowsource";
    this.ehh = paramString.acD();
    AppMethodBeat.o(42271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.b
 * JD-Core Version:    0.6.2
 */