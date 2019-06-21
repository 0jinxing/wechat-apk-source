package com.tencent.mm.plugin.websearch.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bvi;
import com.tencent.mm.protocal.protobuf.bvj;
import com.tencent.mm.sdk.platformtools.ah;

public final class a extends com.tencent.mm.ai.a<bvj>
{
  b ehh;

  public a(String paramString)
  {
    AppMethodBeat.i(91363);
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 1944;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchlocalpage";
    ((b.a)localObject).fsJ = new bvi();
    ((b.a)localObject).fsK = new bvj();
    this.ehh = ((b.a)localObject).acD();
    this.ehh = this.ehh;
    localObject = (bvi)this.ehh.fsG.fsP;
    ((bvi)localObject).wWv = paramString;
    ((bvi)localObject).Scene = 25;
    ((bvi)localObject).luQ = com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext());
    ((bvi)localObject).wDI = com.tencent.mm.plugin.websearch.api.aa.abJ();
    AppMethodBeat.o(91363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.b.a
 * JD-Core Version:    0.6.2
 */